
package ch.fhnw.bank.server.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2.4
 * 
 */
@XmlRootElement(name = "OverdrawException", namespace = "http://soap.server.bank.fhnw.ch/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdrawException", namespace = "http://soap.server.bank.fhnw.ch/")
public class OverdrawExceptionBean {

    private String message;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
