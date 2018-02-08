
package introsde.client.naturalturist.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NaturalTuristImplService", targetNamespace = "http://soap.orchestrator.APP4.introsde/", wsdlLocation = "http://introsde-final-orchestrator1.herokuapp.com/naturalturist?wsdl")
public class NaturalTuristImplService
    extends Service
{

    private final static URL NATURALTURISTIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException NATURALTURISTIMPLSERVICE_EXCEPTION;
    private final static QName NATURALTURISTIMPLSERVICE_QNAME = new QName("http://soap.orchestrator.APP4.introsde/", "NaturalTuristImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://introsde-final-orchestrator1.herokuapp.com/naturalturist?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NATURALTURISTIMPLSERVICE_WSDL_LOCATION = url;
        NATURALTURISTIMPLSERVICE_EXCEPTION = e;
    }

    public NaturalTuristImplService() {
        super(__getWsdlLocation(), NATURALTURISTIMPLSERVICE_QNAME);
    }

    public NaturalTuristImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NATURALTURISTIMPLSERVICE_QNAME, features);
    }

    public NaturalTuristImplService(URL wsdlLocation) {
        super(wsdlLocation, NATURALTURISTIMPLSERVICE_QNAME);
    }

    public NaturalTuristImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NATURALTURISTIMPLSERVICE_QNAME, features);
    }

    public NaturalTuristImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NaturalTuristImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NaturalTuristWebService
     */
    @WebEndpoint(name = "NaturalTuristImplPort")
    public NaturalTuristWebService getNaturalTuristImplPort() {
        return super.getPort(new QName("http://soap.orchestrator.APP4.introsde/", "NaturalTuristImplPort"), NaturalTuristWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NaturalTuristWebService
     */
    @WebEndpoint(name = "NaturalTuristImplPort")
    public NaturalTuristWebService getNaturalTuristImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.orchestrator.APP4.introsde/", "NaturalTuristImplPort"), NaturalTuristWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NATURALTURISTIMPLSERVICE_EXCEPTION!= null) {
            throw NATURALTURISTIMPLSERVICE_EXCEPTION;
        }
        return NATURALTURISTIMPLSERVICE_WSDL_LOCATION;
    }

}
