
package ch.fhnw.bank.client.soap.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.fhnw.bank.client.soap.jaxws package. 
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

    private final static QName _IsAccountActive_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "isAccountActive");
    private final static QName _TransferResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "transferResponse");
    private final static QName _DepositResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "depositResponse");
    private final static QName _CreateAccount_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "createAccount");
    private final static QName _Withdraw_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "withdraw");
    private final static QName _OverdrawException_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "OverdrawException");
    private final static QName _CreateAccountResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "createAccountResponse");
    private final static QName _WithdrawResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "withdrawResponse");
    private final static QName _GetAccountOwnerResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "getAccountOwnerResponse");
    private final static QName _CloseAccountResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "closeAccountResponse");
    private final static QName _Transfer_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "transfer");
    private final static QName _CloseAccount_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "closeAccount");
    private final static QName _GetAccountNumbersResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "getAccountNumbersResponse");
    private final static QName _IOException_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "IOException");
    private final static QName _GetAccountBalance_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "getAccountBalance");
    private final static QName _Deposit_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "deposit");
    private final static QName _GetAccountOwner_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "getAccountOwner");
    private final static QName _IsAccountActiveResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "isAccountActiveResponse");
    private final static QName _GetAccountNumbers_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "getAccountNumbers");
    private final static QName _InactiveException_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "InactiveException");
    private final static QName _GetAccountBalanceResponse_QNAME = new QName("http://soap.server.bank.fhnw.ch/", "getAccountBalanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.fhnw.bank.client.soap.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CloseAccountResponse }
     * 
     */
    public CloseAccountResponse createCloseAccountResponse() {
        return new CloseAccountResponse();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link CloseAccount }
     * 
     */
    public CloseAccount createCloseAccount() {
        return new CloseAccount();
    }

    /**
     * Create an instance of {@link GetAccountNumbersResponse }
     * 
     */
    public GetAccountNumbersResponse createGetAccountNumbersResponse() {
        return new GetAccountNumbersResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetAccountBalance }
     * 
     */
    public GetAccountBalance createGetAccountBalance() {
        return new GetAccountBalance();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link GetAccountOwner }
     * 
     */
    public GetAccountOwner createGetAccountOwner() {
        return new GetAccountOwner();
    }

    /**
     * Create an instance of {@link IsAccountActiveResponse }
     * 
     */
    public IsAccountActiveResponse createIsAccountActiveResponse() {
        return new IsAccountActiveResponse();
    }

    /**
     * Create an instance of {@link GetAccountNumbers }
     * 
     */
    public GetAccountNumbers createGetAccountNumbers() {
        return new GetAccountNumbers();
    }

    /**
     * Create an instance of {@link InactiveException }
     * 
     */
    public InactiveException createInactiveException() {
        return new InactiveException();
    }

    /**
     * Create an instance of {@link GetAccountBalanceResponse }
     * 
     */
    public GetAccountBalanceResponse createGetAccountBalanceResponse() {
        return new GetAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link IsAccountActive }
     * 
     */
    public IsAccountActive createIsAccountActive() {
        return new IsAccountActive();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link OverdrawException }
     * 
     */
    public OverdrawException createOverdrawException() {
        return new OverdrawException();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link GetAccountOwnerResponse }
     * 
     */
    public GetAccountOwnerResponse createGetAccountOwnerResponse() {
        return new GetAccountOwnerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAccountActive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "isAccountActive")
    public JAXBElement<IsAccountActive> createIsAccountActive(IsAccountActive value) {
        return new JAXBElement<IsAccountActive>(_IsAccountActive_QNAME, IsAccountActive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "transferResponse")
    public JAXBElement<TransferResponse> createTransferResponse(TransferResponse value) {
        return new JAXBElement<TransferResponse>(_TransferResponse_QNAME, TransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<CreateAccount>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverdrawException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "OverdrawException")
    public JAXBElement<OverdrawException> createOverdrawException(OverdrawException value) {
        return new JAXBElement<OverdrawException>(_OverdrawException_QNAME, OverdrawException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountOwnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "getAccountOwnerResponse")
    public JAXBElement<GetAccountOwnerResponse> createGetAccountOwnerResponse(GetAccountOwnerResponse value) {
        return new JAXBElement<GetAccountOwnerResponse>(_GetAccountOwnerResponse_QNAME, GetAccountOwnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "closeAccountResponse")
    public JAXBElement<CloseAccountResponse> createCloseAccountResponse(CloseAccountResponse value) {
        return new JAXBElement<CloseAccountResponse>(_CloseAccountResponse_QNAME, CloseAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "closeAccount")
    public JAXBElement<CloseAccount> createCloseAccount(CloseAccount value) {
        return new JAXBElement<CloseAccount>(_CloseAccount_QNAME, CloseAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "getAccountNumbersResponse")
    public JAXBElement<GetAccountNumbersResponse> createGetAccountNumbersResponse(GetAccountNumbersResponse value) {
        return new JAXBElement<GetAccountNumbersResponse>(_GetAccountNumbersResponse_QNAME, GetAccountNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "getAccountBalance")
    public JAXBElement<GetAccountBalance> createGetAccountBalance(GetAccountBalance value) {
        return new JAXBElement<GetAccountBalance>(_GetAccountBalance_QNAME, GetAccountBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountOwner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "getAccountOwner")
    public JAXBElement<GetAccountOwner> createGetAccountOwner(GetAccountOwner value) {
        return new JAXBElement<GetAccountOwner>(_GetAccountOwner_QNAME, GetAccountOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAccountActiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "isAccountActiveResponse")
    public JAXBElement<IsAccountActiveResponse> createIsAccountActiveResponse(IsAccountActiveResponse value) {
        return new JAXBElement<IsAccountActiveResponse>(_IsAccountActiveResponse_QNAME, IsAccountActiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "getAccountNumbers")
    public JAXBElement<GetAccountNumbers> createGetAccountNumbers(GetAccountNumbers value) {
        return new JAXBElement<GetAccountNumbers>(_GetAccountNumbers_QNAME, GetAccountNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InactiveException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "InactiveException")
    public JAXBElement<InactiveException> createInactiveException(InactiveException value) {
        return new JAXBElement<InactiveException>(_InactiveException_QNAME, InactiveException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.server.bank.fhnw.ch/", name = "getAccountBalanceResponse")
    public JAXBElement<GetAccountBalanceResponse> createGetAccountBalanceResponse(GetAccountBalanceResponse value) {
        return new JAXBElement<GetAccountBalanceResponse>(_GetAccountBalanceResponse_QNAME, GetAccountBalanceResponse.class, null, value);
    }

}
