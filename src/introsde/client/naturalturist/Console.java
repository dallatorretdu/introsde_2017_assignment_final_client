package introsde.client.naturalturist;

import java.util.List;
import java.util.Scanner;

import introsde.client.naturalturist.wsdl.NaturalTuristImplService;
import introsde.client.naturalturist.wsdl.NaturalTuristWebService;
import introsde.client.naturalturist.wsdl.Park;
import introsde.client.naturalturist.wsdl.PlaceVisited;
import introsde.client.naturalturist.wsdl.Review;
import introsde.client.naturalturist.wsdl.Shed;
import introsde.client.naturalturist.wsdl.SuggestedItem;
import introsde.client.naturalturist.wsdl.Suggestion;
import introsde.client.naturalturist.wsdl.User;

public class Console {
	private static NaturalTuristWebService ws;
	private static Scanner scanner;
	private static User loggedUser;
	
	public static void main(String args[]){
		NaturalTuristImplService service = new NaturalTuristImplService();
        ws = service.getNaturalTuristImplPort();
        
		scanner = new Scanner(System.in);
		loggedUser = null;
		
		if(userWantsToRegister()) {
			loggedUser = registerAndLogInUser();
		}
		else {
			loggedUser = promptUserLogIn();
		}
		
		while(true) {
			System.out.println("$ 'search', 'visit', 'review', 'suggestion':");
			String choice=scanner.nextLine();
			if(choice.toLowerCase().contains("search")) {
				searchStuff();
			}
			else if(choice.toLowerCase().contains("visit")) {
				addRankedVisit();
			}
			else if(choice.toLowerCase().contains("review")) {
				addReview();
			}
			else if(choice.toLowerCase().contains("suggestion")) {
				getUserSuggestions();
			}
		}
		
	}

	private static void getUserSuggestions() {
		Suggestion suggestion = ws.getSuggestion(loggedUser.getId());
		System.out.println("     "+suggestion.getMessage());
		for (SuggestedItem item : suggestion.getSuggestedItems()) {
			System.out.println("      "+item.getReason());
			if(item.getPark() != null) {
				Park park = item.getPark();
				System.out.println("    PARK: " + park.getId() + " Name: " + park.getNome()+" - "+park.getSuperficie()+" hec., " + park.getProvincie()+ " -- " + park.getComuni());
			}
			else if(item.getShed() != null) {
				Shed shed = item.getShed();
				System.out.println("    SHED: " + shed.getId() + " Name: " + shed.getNome() + ", " + shed.getRegione()+ " -- " + shed.getComune());
			}
		}
	}

	private static void addReview() {
		System.out.println("$ 'park', 'shed':");
		String selection=scanner.nextLine();
		if(selection.toLowerCase().contains("park")) {
			System.out.println("$ Park ID:");
			Integer parkID=scanner.nextInt();
			scanner.nextLine();
			Review review = new Review();
			review.setIdPark(parkID);
			System.out.println("$ Vote? 0-5");
			review.setVote(scanner.nextInt());
			scanner.nextLine();
			System.out.println("$ Write a review:");
			review.setReview(scanner.nextLine());
			ws.postReview(loggedUser.getId(), review);
		}
		else if(selection.toLowerCase().contains("shed")) {
			System.out.println("$ Shed ID:");
			Integer shedID=scanner.nextInt();
			scanner.nextLine();
			Review review = new Review();
			review.setIdShed(shedID);
			System.out.println("$ Vote? 0-5");
			review.setVote(scanner.nextInt());
			scanner.nextLine();
			System.out.println("$ Write a review:");
			review.setReview(scanner.nextLine());
			ws.postReview(loggedUser.getId(), review);
		}
	}

	private static void addRankedVisit() {
		System.out.println("$ 'park', 'shed':");
		String selection=scanner.nextLine();
		if(selection.toLowerCase().contains("park")) {
			System.out.println("$ Park ID:");
			Integer parkID=scanner.nextInt();
			scanner.nextLine();
			PlaceVisited visit = new PlaceVisited();
			visit.setIdPark(parkID);
			System.out.println("$ Vote? +1 or -1");
			visit.setVote(((scanner.nextInt()>0) ? 1 : -1));
			scanner.nextLine();
			ws.addVote(loggedUser.getId(), visit);
		}
		else if(selection.toLowerCase().contains("shed")) {
			System.out.println("$ Shed ID:");
			Integer shedID=scanner.nextInt();
			scanner.nextLine();
			PlaceVisited visit = new PlaceVisited();
			visit.setIdShed(shedID);
			System.out.println("$ Vote? +1 or -1");
			visit.setVote(((scanner.nextInt()>0) ? 1 : -1));
			scanner.nextLine();
			ws.addVote(loggedUser.getId(), visit);
		}
	}

	private static void searchStuff() {
		System.out.println("$ 'park', 'shed', 'user':");
		String selection=scanner.nextLine();
		if(selection.toLowerCase().contains("park")) {
			System.out.println("Enter park name or ID to search:");		
			if(scanner.hasNextInt()) {
				Integer parkID = scanner.nextInt();
				scanner.nextLine();
				getParkAndReview(parkID);
			}
			else {
				String name = scanner.nextLine();
				searchParks(name);
			}
		}
		else if(selection.toLowerCase().contains("shed")) {
			System.out.println("Enter shed name or ID to search:");		
			if(scanner.hasNextInt()) {
				Integer shedID = scanner.nextInt();
				scanner.nextLine();
				getShedAndReview(shedID);
			}
			else {
				String name = scanner.nextLine();
				searchSheds(name);
			}
		}
		else if(selection.toLowerCase().contains("user")) {
			searchUser();
		}
	}

	private static void searchSheds(String name) {
		List<Shed> sheds = ws.searchSheds(name);
		System.out.println("Found "+sheds.size()+" results.");
		for (Shed shed : sheds) {
			System.out.println("    ID: " + shed.getId() + " Name: " + shed.getNome() + ", " + shed.getRegione()+ " -- " + shed.getComune());
		}
	}

	private static void searchParks(String name) {
		List<Park> parks = ws.searchParks(name);
		System.out.println("Found "+parks.size()+" results.");
		for (Park park : parks) {
			System.out.println("    ID: " + park.getId() + " Name: " + park.getNome()+" - "+park.getSuperficie()+" hectars, " + park.getProvincie()+ " -- " + park.getComuni());
		}
	}

	private static void getShedAndReview(Integer shedID) {
		Shed shed = ws.searchShed(shedID);
		System.out.println("     Name: "+shed.getNome()+", "+shed.getRegione()+", "+shed.getLocalita()+", "+shed.getComune()+" ALT:"+shed.getQuota()+"m");
		System.out.println("       Rated " + ws.getShedVote(shedID) );
		List<Review> reviews = ws.getShedReviews(shedID);
		for (Review review : reviews) {
			System.out.println("       REVIEW -"+review.getVote()+"- "+review.getReview());
		}
	}

	private static void getParkAndReview(Integer parkID) {
		Park park = ws.searchPark(parkID);
		System.out.println("     Name: "+park.getNome()+" - "+park.getSuperficie()+"hectare, "+park.getProvincie()+" -- "+park.getComuni());
		System.out.println("       Rated " + ws.getParkVote(parkID) );
		List<Review> reviews = ws.getParkReviews(parkID);
		for (Review review : reviews) {
			System.out.println("       REVIEW -"+review.getVote()+"- "+review.getReview());
		}
	}

	private static User registerAndLogInUser() {
		User user = new User();
		System.out.println("$Enter your username:");
		String username = scanner.nextLine();
		user.setUsername(username);
		System.out.println("$Enter your name:");
		String name = scanner.nextLine();
		user.setFirstName(name);
		
		Integer newUserID = ws.registerUser(user);
		System.out.println("$Do you like natural parks? [y/n]");
		boolean park = scanner.nextLine().toLowerCase().contains("y");
		System.out.println("$Do you like mountain sheds? [y/n]");
		boolean shed = scanner.nextLine().toLowerCase().contains("y");
		ws.setUserPreference(newUserID, park, shed);
		
		return logUserIn(newUserID);
	}

	private static User promptUserLogIn() {
		System.out.println("$Enter your username ID");
		Integer id = scanner.nextInt();
		scanner.nextLine();
		return logUserIn(id);
	}

	private static User logUserIn(Integer id) {
		User loggedUser;
		loggedUser = ws.searchUser(id);
		if(loggedUser == null || loggedUser.getId() != id) {
			System.out.println("Unable to log-in");
			System.exit(-1);
		}
		System.out.println("You are now logged as user "+loggedUser.getUsername()+" ID:"+loggedUser.getId());
		return loggedUser;
	}

	private static boolean userWantsToRegister() {
		String choice;
		while (true) {
			System.out.println("$'LogIn', 'Register' or 'search':");
			choice=scanner.nextLine();
			if (choice.toLowerCase().equals("login")) {
				return false;
			}
			else if (choice.toLowerCase().equals("register")) {
				return true;
			}
			else if (choice.toLowerCase().equals("search")) {
				searchUser();
			}
		}
	}

	private static void searchUser() {
		System.out.println("Enter username to search:");
		String name = scanner.nextLine();
		List<User> users = ws.searchUsers(name);
		System.out.println("Found "+users.size()+" results.");
		for (User user : users) {
			System.out.println("    ID: " + user.getId() + " Name: " + user.getFirstName() + " Username: " + user.getUsername());
		}
	}
}