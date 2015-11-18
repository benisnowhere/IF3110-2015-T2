
package AnswerWS;

import java.util.List;
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
@WebService(name = "AnswerWS", targetNamespace = "http://AnswerModel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnswerWS {


    /**
     * 
     * @param qid
     * @return
     *     returns java.util.List<AnswerWS.Answer>
     */
    @WebMethod
    @WebResult(name = "Answer", targetNamespace = "")
    @RequestWrapper(localName = "getAnswerByQID", targetNamespace = "http://AnswerModel/", className = "AnswerWS.GetAnswerByQID")
    @ResponseWrapper(localName = "getAnswerByQIDResponse", targetNamespace = "http://AnswerModel/", className = "AnswerWS.GetAnswerByQIDResponse")
    @Action(input = "http://AnswerModel/AnswerWS/getAnswerByQIDRequest", output = "http://AnswerModel/AnswerWS/getAnswerByQIDResponse")
    public List<Answer> getAnswerByQID(
        @WebParam(name = "qid", targetNamespace = "")
        int qid);

}
