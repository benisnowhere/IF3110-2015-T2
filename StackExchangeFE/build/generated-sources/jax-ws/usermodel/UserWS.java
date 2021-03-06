
package usermodel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserWS", targetNamespace = "http://UserModel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserWS {


    /**
     * 
     * @param password
     * @param name
     * @param email
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://UserModel/", className = "usermodel.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://UserModel/", className = "usermodel.RegisterResponse")
    @Action(input = "http://UserModel/UserWS/registerRequest", output = "http://UserModel/UserWS/registerResponse")
    public int register(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param uid
     * @return
     *     returns usermodel.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserByUID", targetNamespace = "http://UserModel/", className = "usermodel.GetUserByUID")
    @ResponseWrapper(localName = "getUserByUIDResponse", targetNamespace = "http://UserModel/", className = "usermodel.GetUserByUIDResponse")
    @Action(input = "http://UserModel/UserWS/getUserByUIDRequest", output = "http://UserModel/UserWS/getUserByUIDResponse")
    public User getUserByUID(
        @WebParam(name = "uid", targetNamespace = "")
        int uid);

}
