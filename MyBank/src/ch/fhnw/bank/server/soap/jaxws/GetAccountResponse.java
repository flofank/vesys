
package ch.fhnw.bank.server.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAccountResponse", namespace = "http://soap.server.bank.fhnw.ch/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountResponse", namespace = "http://soap.server.bank.fhnw.ch/")
public class GetAccountResponse {

    @XmlElement(name = "return", namespace = "")
    private ch.fhnw.bank.server.ServerAccount _return;

    /**
     * 
     * @return
     *     returns ServerAccount
     */
    public ch.fhnw.bank.server.ServerAccount getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ch.fhnw.bank.server.ServerAccount _return) {
        this._return = _return;
    }

}
