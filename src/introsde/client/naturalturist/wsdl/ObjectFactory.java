
package introsde.client.naturalturist.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.client.naturalturist.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSuggestion_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getSuggestion");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "registerUserResponse");
    private final static QName _SearchParksResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchParksResponse");
    private final static QName _SearchShed_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchShed");
    private final static QName _SearchSheds_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchSheds");
    private final static QName _SearchPark_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchPark");
    private final static QName _SearchShedResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchShedResponse");
    private final static QName _SearchUsers_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchUsers");
    private final static QName _GetAllSheds_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getAllSheds");
    private final static QName _PostReviewResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "postReviewResponse");
    private final static QName _SearchUsersResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchUsersResponse");
    private final static QName _SetUserPreference_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "setUserPreference");
    private final static QName _GetParkVoteResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getParkVoteResponse");
    private final static QName _GetShedReviewsResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getShedReviewsResponse");
    private final static QName _GetParkVote_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getParkVote");
    private final static QName _GetParkReviews_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getParkReviews");
    private final static QName _SearchParkResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchParkResponse");
    private final static QName _SearchParks_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchParks");
    private final static QName _GetShedVote_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getShedVote");
    private final static QName _RegisterUser_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "registerUser");
    private final static QName _GetShedReviews_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getShedReviews");
    private final static QName _SearchUserResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchUserResponse");
    private final static QName _SearchUser_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchUser");
    private final static QName _GetShedVoteResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getShedVoteResponse");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getAllUsersResponse");
    private final static QName _GetUserReviews_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getUserReviews");
    private final static QName _GetAllParks_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getAllParks");
    private final static QName _GetUserReviewsResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getUserReviewsResponse");
    private final static QName _GetAllShedsResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getAllShedsResponse");
    private final static QName _AddVoteResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "addVoteResponse");
    private final static QName _GetParkReviewsResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getParkReviewsResponse");
    private final static QName _SetUserPreferenceResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "setUserPreferenceResponse");
    private final static QName _SearchShedsResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "searchShedsResponse");
    private final static QName _GetAllParksResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getAllParksResponse");
    private final static QName _GetSuggestionResponse_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getSuggestionResponse");
    private final static QName _PostReview_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "postReview");
    private final static QName _AddVote_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "addVote");
    private final static QName _GetAllUsers_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "getAllUsers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.client.naturalturist.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Park }
     * 
     */
    public Park createPark() {
        return new Park();
    }

    /**
     * Create an instance of {@link SearchParkResponse }
     * 
     */
    public SearchParkResponse createSearchParkResponse() {
        return new SearchParkResponse();
    }

    /**
     * Create an instance of {@link SearchParks }
     * 
     */
    public SearchParks createSearchParks() {
        return new SearchParks();
    }

    /**
     * Create an instance of {@link GetParkReviews }
     * 
     */
    public GetParkReviews createGetParkReviews() {
        return new GetParkReviews();
    }

    /**
     * Create an instance of {@link GetParkVote }
     * 
     */
    public GetParkVote createGetParkVote() {
        return new GetParkVote();
    }

    /**
     * Create an instance of {@link GetShedReviewsResponse }
     * 
     */
    public GetShedReviewsResponse createGetShedReviewsResponse() {
        return new GetShedReviewsResponse();
    }

    /**
     * Create an instance of {@link GetParkVoteResponse }
     * 
     */
    public GetParkVoteResponse createGetParkVoteResponse() {
        return new GetParkVoteResponse();
    }

    /**
     * Create an instance of {@link PostReviewResponse }
     * 
     */
    public PostReviewResponse createPostReviewResponse() {
        return new PostReviewResponse();
    }

    /**
     * Create an instance of {@link SearchUsersResponse }
     * 
     */
    public SearchUsersResponse createSearchUsersResponse() {
        return new SearchUsersResponse();
    }

    /**
     * Create an instance of {@link SetUserPreference }
     * 
     */
    public SetUserPreference createSetUserPreference() {
        return new SetUserPreference();
    }

    /**
     * Create an instance of {@link SearchUsers }
     * 
     */
    public SearchUsers createSearchUsers() {
        return new SearchUsers();
    }

    /**
     * Create an instance of {@link GetAllSheds }
     * 
     */
    public GetAllSheds createGetAllSheds() {
        return new GetAllSheds();
    }

    /**
     * Create an instance of {@link SearchShedResponse }
     * 
     */
    public SearchShedResponse createSearchShedResponse() {
        return new SearchShedResponse();
    }

    /**
     * Create an instance of {@link SearchPark }
     * 
     */
    public SearchPark createSearchPark() {
        return new SearchPark();
    }

    /**
     * Create an instance of {@link SearchParksResponse }
     * 
     */
    public SearchParksResponse createSearchParksResponse() {
        return new SearchParksResponse();
    }

    /**
     * Create an instance of {@link SearchShed }
     * 
     */
    public SearchShed createSearchShed() {
        return new SearchShed();
    }

    /**
     * Create an instance of {@link SearchSheds }
     * 
     */
    public SearchSheds createSearchSheds() {
        return new SearchSheds();
    }

    /**
     * Create an instance of {@link GetSuggestion }
     * 
     */
    public GetSuggestion createGetSuggestion() {
        return new GetSuggestion();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link AddVote }
     * 
     */
    public AddVote createAddVote() {
        return new AddVote();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetSuggestionResponse }
     * 
     */
    public GetSuggestionResponse createGetSuggestionResponse() {
        return new GetSuggestionResponse();
    }

    /**
     * Create an instance of {@link PostReview }
     * 
     */
    public PostReview createPostReview() {
        return new PostReview();
    }

    /**
     * Create an instance of {@link GetAllParksResponse }
     * 
     */
    public GetAllParksResponse createGetAllParksResponse() {
        return new GetAllParksResponse();
    }

    /**
     * Create an instance of {@link SearchShedsResponse }
     * 
     */
    public SearchShedsResponse createSearchShedsResponse() {
        return new SearchShedsResponse();
    }

    /**
     * Create an instance of {@link AddVoteResponse }
     * 
     */
    public AddVoteResponse createAddVoteResponse() {
        return new AddVoteResponse();
    }

    /**
     * Create an instance of {@link GetParkReviewsResponse }
     * 
     */
    public GetParkReviewsResponse createGetParkReviewsResponse() {
        return new GetParkReviewsResponse();
    }

    /**
     * Create an instance of {@link SetUserPreferenceResponse }
     * 
     */
    public SetUserPreferenceResponse createSetUserPreferenceResponse() {
        return new SetUserPreferenceResponse();
    }

    /**
     * Create an instance of {@link GetAllShedsResponse }
     * 
     */
    public GetAllShedsResponse createGetAllShedsResponse() {
        return new GetAllShedsResponse();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetUserReviews }
     * 
     */
    public GetUserReviews createGetUserReviews() {
        return new GetUserReviews();
    }

    /**
     * Create an instance of {@link GetAllParks }
     * 
     */
    public GetAllParks createGetAllParks() {
        return new GetAllParks();
    }

    /**
     * Create an instance of {@link GetUserReviewsResponse }
     * 
     */
    public GetUserReviewsResponse createGetUserReviewsResponse() {
        return new GetUserReviewsResponse();
    }

    /**
     * Create an instance of {@link SearchUser }
     * 
     */
    public SearchUser createSearchUser() {
        return new SearchUser();
    }

    /**
     * Create an instance of {@link GetShedVoteResponse }
     * 
     */
    public GetShedVoteResponse createGetShedVoteResponse() {
        return new GetShedVoteResponse();
    }

    /**
     * Create an instance of {@link GetShedReviews }
     * 
     */
    public GetShedReviews createGetShedReviews() {
        return new GetShedReviews();
    }

    /**
     * Create an instance of {@link SearchUserResponse }
     * 
     */
    public SearchUserResponse createSearchUserResponse() {
        return new SearchUserResponse();
    }

    /**
     * Create an instance of {@link GetShedVote }
     * 
     */
    public GetShedVote createGetShedVote() {
        return new GetShedVote();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link SuggestedItem }
     * 
     */
    public SuggestedItem createSuggestedItem() {
        return new SuggestedItem();
    }

    /**
     * Create an instance of {@link Suggestion }
     * 
     */
    public Suggestion createSuggestion() {
        return new Suggestion();
    }

    /**
     * Create an instance of {@link PlaceVisited }
     * 
     */
    public PlaceVisited createPlaceVisited() {
        return new PlaceVisited();
    }

    /**
     * Create an instance of {@link Review }
     * 
     */
    public Review createReview() {
        return new Review();
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Shed }
     * 
     */
    public Shed createShed() {
        return new Shed();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getSuggestion")
    public JAXBElement<GetSuggestion> createGetSuggestion(GetSuggestion value) {
        return new JAXBElement<GetSuggestion>(_GetSuggestion_QNAME, GetSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchParksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchParksResponse")
    public JAXBElement<SearchParksResponse> createSearchParksResponse(SearchParksResponse value) {
        return new JAXBElement<SearchParksResponse>(_SearchParksResponse_QNAME, SearchParksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchShed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchShed")
    public JAXBElement<SearchShed> createSearchShed(SearchShed value) {
        return new JAXBElement<SearchShed>(_SearchShed_QNAME, SearchShed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSheds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchSheds")
    public JAXBElement<SearchSheds> createSearchSheds(SearchSheds value) {
        return new JAXBElement<SearchSheds>(_SearchSheds_QNAME, SearchSheds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchPark")
    public JAXBElement<SearchPark> createSearchPark(SearchPark value) {
        return new JAXBElement<SearchPark>(_SearchPark_QNAME, SearchPark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchShedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchShedResponse")
    public JAXBElement<SearchShedResponse> createSearchShedResponse(SearchShedResponse value) {
        return new JAXBElement<SearchShedResponse>(_SearchShedResponse_QNAME, SearchShedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchUsers")
    public JAXBElement<SearchUsers> createSearchUsers(SearchUsers value) {
        return new JAXBElement<SearchUsers>(_SearchUsers_QNAME, SearchUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSheds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getAllSheds")
    public JAXBElement<GetAllSheds> createGetAllSheds(GetAllSheds value) {
        return new JAXBElement<GetAllSheds>(_GetAllSheds_QNAME, GetAllSheds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostReviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "postReviewResponse")
    public JAXBElement<PostReviewResponse> createPostReviewResponse(PostReviewResponse value) {
        return new JAXBElement<PostReviewResponse>(_PostReviewResponse_QNAME, PostReviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchUsersResponse")
    public JAXBElement<SearchUsersResponse> createSearchUsersResponse(SearchUsersResponse value) {
        return new JAXBElement<SearchUsersResponse>(_SearchUsersResponse_QNAME, SearchUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "setUserPreference")
    public JAXBElement<SetUserPreference> createSetUserPreference(SetUserPreference value) {
        return new JAXBElement<SetUserPreference>(_SetUserPreference_QNAME, SetUserPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkVoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getParkVoteResponse")
    public JAXBElement<GetParkVoteResponse> createGetParkVoteResponse(GetParkVoteResponse value) {
        return new JAXBElement<GetParkVoteResponse>(_GetParkVoteResponse_QNAME, GetParkVoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedReviewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getShedReviewsResponse")
    public JAXBElement<GetShedReviewsResponse> createGetShedReviewsResponse(GetShedReviewsResponse value) {
        return new JAXBElement<GetShedReviewsResponse>(_GetShedReviewsResponse_QNAME, GetShedReviewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkVote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getParkVote")
    public JAXBElement<GetParkVote> createGetParkVote(GetParkVote value) {
        return new JAXBElement<GetParkVote>(_GetParkVote_QNAME, GetParkVote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkReviews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getParkReviews")
    public JAXBElement<GetParkReviews> createGetParkReviews(GetParkReviews value) {
        return new JAXBElement<GetParkReviews>(_GetParkReviews_QNAME, GetParkReviews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchParkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchParkResponse")
    public JAXBElement<SearchParkResponse> createSearchParkResponse(SearchParkResponse value) {
        return new JAXBElement<SearchParkResponse>(_SearchParkResponse_QNAME, SearchParkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchParks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchParks")
    public JAXBElement<SearchParks> createSearchParks(SearchParks value) {
        return new JAXBElement<SearchParks>(_SearchParks_QNAME, SearchParks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedVote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getShedVote")
    public JAXBElement<GetShedVote> createGetShedVote(GetShedVote value) {
        return new JAXBElement<GetShedVote>(_GetShedVote_QNAME, GetShedVote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedReviews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getShedReviews")
    public JAXBElement<GetShedReviews> createGetShedReviews(GetShedReviews value) {
        return new JAXBElement<GetShedReviews>(_GetShedReviews_QNAME, GetShedReviews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchUserResponse")
    public JAXBElement<SearchUserResponse> createSearchUserResponse(SearchUserResponse value) {
        return new JAXBElement<SearchUserResponse>(_SearchUserResponse_QNAME, SearchUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchUser")
    public JAXBElement<SearchUser> createSearchUser(SearchUser value) {
        return new JAXBElement<SearchUser>(_SearchUser_QNAME, SearchUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedVoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getShedVoteResponse")
    public JAXBElement<GetShedVoteResponse> createGetShedVoteResponse(GetShedVoteResponse value) {
        return new JAXBElement<GetShedVoteResponse>(_GetShedVoteResponse_QNAME, GetShedVoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserReviews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getUserReviews")
    public JAXBElement<GetUserReviews> createGetUserReviews(GetUserReviews value) {
        return new JAXBElement<GetUserReviews>(_GetUserReviews_QNAME, GetUserReviews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllParks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getAllParks")
    public JAXBElement<GetAllParks> createGetAllParks(GetAllParks value) {
        return new JAXBElement<GetAllParks>(_GetAllParks_QNAME, GetAllParks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserReviewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getUserReviewsResponse")
    public JAXBElement<GetUserReviewsResponse> createGetUserReviewsResponse(GetUserReviewsResponse value) {
        return new JAXBElement<GetUserReviewsResponse>(_GetUserReviewsResponse_QNAME, GetUserReviewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllShedsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getAllShedsResponse")
    public JAXBElement<GetAllShedsResponse> createGetAllShedsResponse(GetAllShedsResponse value) {
        return new JAXBElement<GetAllShedsResponse>(_GetAllShedsResponse_QNAME, GetAllShedsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "addVoteResponse")
    public JAXBElement<AddVoteResponse> createAddVoteResponse(AddVoteResponse value) {
        return new JAXBElement<AddVoteResponse>(_AddVoteResponse_QNAME, AddVoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkReviewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getParkReviewsResponse")
    public JAXBElement<GetParkReviewsResponse> createGetParkReviewsResponse(GetParkReviewsResponse value) {
        return new JAXBElement<GetParkReviewsResponse>(_GetParkReviewsResponse_QNAME, GetParkReviewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserPreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "setUserPreferenceResponse")
    public JAXBElement<SetUserPreferenceResponse> createSetUserPreferenceResponse(SetUserPreferenceResponse value) {
        return new JAXBElement<SetUserPreferenceResponse>(_SetUserPreferenceResponse_QNAME, SetUserPreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchShedsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "searchShedsResponse")
    public JAXBElement<SearchShedsResponse> createSearchShedsResponse(SearchShedsResponse value) {
        return new JAXBElement<SearchShedsResponse>(_SearchShedsResponse_QNAME, SearchShedsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllParksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getAllParksResponse")
    public JAXBElement<GetAllParksResponse> createGetAllParksResponse(GetAllParksResponse value) {
        return new JAXBElement<GetAllParksResponse>(_GetAllParksResponse_QNAME, GetAllParksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getSuggestionResponse")
    public JAXBElement<GetSuggestionResponse> createGetSuggestionResponse(GetSuggestionResponse value) {
        return new JAXBElement<GetSuggestionResponse>(_GetSuggestionResponse_QNAME, GetSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostReview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "postReview")
    public JAXBElement<PostReview> createPostReview(PostReview value) {
        return new JAXBElement<PostReview>(_PostReview_QNAME, PostReview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "addVote")
    public JAXBElement<AddVote> createAddVote(AddVote value) {
        return new JAXBElement<AddVote>(_AddVote_QNAME, AddVote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.orchestrator.APP4.introsde/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

}
