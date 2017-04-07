
package fr.afcepf.wine.paypal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.wine.paypal package. 
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

    private final static QName _PayPalRESTException_QNAME = new QName("http://paypal.wine.afcepf.fr", "PayPalRESTException");
    private final static QName _CheckoutPaypal_QNAME = new QName("http://paypal.wine.afcepf.fr", "checkoutPaypal");
    private final static QName _RetrievePaymentResponse_QNAME = new QName("http://paypal.wine.afcepf.fr", "retrievePaymentResponse");
    private final static QName _CheckoutPaypalResponse_QNAME = new QName("http://paypal.wine.afcepf.fr", "checkoutPaypalResponse");
    private final static QName _RetrievePayment_QNAME = new QName("http://paypal.wine.afcepf.fr", "retrievePayment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.wine.paypal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckoutPaypal }
     * 
     */
    public CheckoutPaypal createCheckoutPaypal() {
        return new CheckoutPaypal();
    }

    /**
     * Create an instance of {@link CheckoutPaypal.DetailsPayment }
     * 
     */
    public CheckoutPaypal.DetailsPayment createCheckoutPaypalDetailsPayment() {
        return new CheckoutPaypal.DetailsPayment();
    }

    /**
     * Create an instance of {@link RetrievePaymentResponse }
     * 
     */
    public RetrievePaymentResponse createRetrievePaymentResponse() {
        return new RetrievePaymentResponse();
    }

    /**
     * Create an instance of {@link RetrievePayment }
     * 
     */
    public RetrievePayment createRetrievePayment() {
        return new RetrievePayment();
    }

    /**
     * Create an instance of {@link CheckoutPaypalResponse }
     * 
     */
    public CheckoutPaypalResponse createCheckoutPaypalResponse() {
        return new CheckoutPaypalResponse();
    }

    /**
     * Create an instance of {@link PayPalRESTException }
     * 
     */
    public PayPalRESTException createPayPalRESTException() {
        return new PayPalRESTException();
    }

    /**
     * Create an instance of {@link PayPalModel }
     * 
     */
    public PayPalModel createPayPalModel() {
        return new PayPalModel();
    }

    /**
     * Create an instance of {@link Payer }
     * 
     */
    public Payer createPayer() {
        return new Payer();
    }

    /**
     * Create an instance of {@link Billing }
     * 
     */
    public Billing createBilling() {
        return new Billing();
    }

    /**
     * Create an instance of {@link Payee }
     * 
     */
    public Payee createPayee() {
        return new Payee();
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link PaymentCard }
     * 
     */
    public PaymentCard createPaymentCard() {
        return new PaymentCard();
    }

    /**
     * Create an instance of {@link Incentive }
     * 
     */
    public Incentive createIncentive() {
        return new Incentive();
    }

    /**
     * Create an instance of {@link PaymentInstruction }
     * 
     */
    public PaymentInstruction createPaymentInstruction() {
        return new PaymentInstruction();
    }

    /**
     * Create an instance of {@link PaymentOptions }
     * 
     */
    public PaymentOptions createPaymentOptions() {
        return new PaymentOptions();
    }

    /**
     * Create an instance of {@link Percentage }
     * 
     */
    public Percentage createPercentage() {
        return new Percentage();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link Links }
     * 
     */
    public Links createLinks() {
        return new Links();
    }

    /**
     * Create an instance of {@link ExternalFunding }
     * 
     */
    public ExternalFunding createExternalFunding() {
        return new ExternalFunding();
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link Credit }
     * 
     */
    public Credit createCredit() {
        return new Credit();
    }

    /**
     * Create an instance of {@link FundingInstrument }
     * 
     */
    public FundingInstrument createFundingInstrument() {
        return new FundingInstrument();
    }

    /**
     * Create an instance of {@link HyperSchema }
     * 
     */
    public HyperSchema createHyperSchema() {
        return new HyperSchema();
    }

    /**
     * Create an instance of {@link PrivateLabelCard }
     * 
     */
    public PrivateLabelCard createPrivateLabelCard() {
        return new PrivateLabelCard();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ExtendedBankAccount }
     * 
     */
    public ExtendedBankAccount createExtendedBankAccount() {
        return new ExtendedBankAccount();
    }

    /**
     * Create an instance of {@link BaseAddress }
     * 
     */
    public BaseAddress createBaseAddress() {
        return new BaseAddress();
    }

    /**
     * Create an instance of {@link Capture }
     * 
     */
    public Capture createCapture() {
        return new Capture();
    }

    /**
     * Create an instance of {@link FundingOption }
     * 
     */
    public FundingOption createFundingOption() {
        return new FundingOption();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link CarrierAccountToken }
     * 
     */
    public CarrierAccountToken createCarrierAccountToken() {
        return new CarrierAccountToken();
    }

    /**
     * Create an instance of {@link FundingSource }
     * 
     */
    public FundingSource createFundingSource() {
        return new FundingSource();
    }

    /**
     * Create an instance of {@link PotentialPayerInfo }
     * 
     */
    public PotentialPayerInfo createPotentialPayerInfo() {
        return new PotentialPayerInfo();
    }

    /**
     * Create an instance of {@link ErrorDetails }
     * 
     */
    public ErrorDetails createErrorDetails() {
        return new ErrorDetails();
    }

    /**
     * Create an instance of {@link ProcessorResponse }
     * 
     */
    public ProcessorResponse createProcessorResponse() {
        return new ProcessorResponse();
    }

    /**
     * Create an instance of {@link Refund }
     * 
     */
    public Refund createRefund() {
        return new Refund();
    }

    /**
     * Create an instance of {@link BankToken }
     * 
     */
    public BankToken createBankToken() {
        return new BankToken();
    }

    /**
     * Create an instance of {@link AlternatePayment }
     * 
     */
    public AlternatePayment createAlternatePayment() {
        return new AlternatePayment();
    }

    /**
     * Create an instance of {@link RecipientBankingInstruction }
     * 
     */
    public RecipientBankingInstruction createRecipientBankingInstruction() {
        return new RecipientBankingInstruction();
    }

    /**
     * Create an instance of {@link InstallmentOption }
     * 
     */
    public InstallmentOption createInstallmentOption() {
        return new InstallmentOption();
    }

    /**
     * Create an instance of {@link CartBase }
     * 
     */
    public CartBase createCartBase() {
        return new CartBase();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link RedirectUrls }
     * 
     */
    public RedirectUrls createRedirectUrls() {
        return new RedirectUrls();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link CreditCardToken }
     * 
     */
    public CreditCardToken createCreditCardToken() {
        return new CreditCardToken();
    }

    /**
     * Create an instance of {@link DefinitionsLinkdescription }
     * 
     */
    public DefinitionsLinkdescription createDefinitionsLinkdescription() {
        return new DefinitionsLinkdescription();
    }

    /**
     * Create an instance of {@link CreditFinancingOffered }
     * 
     */
    public CreditFinancingOffered createCreditFinancingOffered() {
        return new CreditFinancingOffered();
    }

    /**
     * Create an instance of {@link CountryCode }
     * 
     */
    public CountryCode createCountryCode() {
        return new CountryCode();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link CarrierAccount }
     * 
     */
    public CarrierAccount createCarrierAccount() {
        return new CarrierAccount();
    }

    /**
     * Create an instance of {@link RelatedResources }
     * 
     */
    public RelatedResources createRelatedResources() {
        return new RelatedResources();
    }

    /**
     * Create an instance of {@link Card3DSecureInfo }
     * 
     */
    public Card3DSecureInfo createCard3DSecureInfo() {
        return new Card3DSecureInfo();
    }

    /**
     * Create an instance of {@link InstallmentInfo }
     * 
     */
    public InstallmentInfo createInstallmentInfo() {
        return new InstallmentInfo();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link BillingAgreementToken }
     * 
     */
    public BillingAgreementToken createBillingAgreementToken() {
        return new BillingAgreementToken();
    }

    /**
     * Create an instance of {@link FmfDetails }
     * 
     */
    public FmfDetails createFmfDetails() {
        return new FmfDetails();
    }

    /**
     * Create an instance of {@link CurrencyConversion }
     * 
     */
    public CurrencyConversion createCurrencyConversion() {
        return new CurrencyConversion();
    }

    /**
     * Create an instance of {@link TransactionBase }
     * 
     */
    public TransactionBase createTransactionBase() {
        return new TransactionBase();
    }

    /**
     * Create an instance of {@link Sale }
     * 
     */
    public Sale createSale() {
        return new Sale();
    }

    /**
     * Create an instance of {@link PayerInfo }
     * 
     */
    public PayerInfo createPayerInfo() {
        return new PayerInfo();
    }

    /**
     * Create an instance of {@link ShippingAddress }
     * 
     */
    public ShippingAddress createShippingAddress() {
        return new ShippingAddress();
    }

    /**
     * Create an instance of {@link ItemList }
     * 
     */
    public ItemList createItemList() {
        return new ItemList();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link CheckoutPaypal.DetailsPayment.Entry }
     * 
     */
    public CheckoutPaypal.DetailsPayment.Entry createCheckoutPaypalDetailsPaymentEntry() {
        return new CheckoutPaypal.DetailsPayment.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayPalRESTException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "PayPalRESTException")
    public JAXBElement<PayPalRESTException> createPayPalRESTException(PayPalRESTException value) {
        return new JAXBElement<PayPalRESTException>(_PayPalRESTException_QNAME, PayPalRESTException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutPaypal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "checkoutPaypal")
    public JAXBElement<CheckoutPaypal> createCheckoutPaypal(CheckoutPaypal value) {
        return new JAXBElement<CheckoutPaypal>(_CheckoutPaypal_QNAME, CheckoutPaypal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "retrievePaymentResponse")
    public JAXBElement<RetrievePaymentResponse> createRetrievePaymentResponse(RetrievePaymentResponse value) {
        return new JAXBElement<RetrievePaymentResponse>(_RetrievePaymentResponse_QNAME, RetrievePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutPaypalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "checkoutPaypalResponse")
    public JAXBElement<CheckoutPaypalResponse> createCheckoutPaypalResponse(CheckoutPaypalResponse value) {
        return new JAXBElement<CheckoutPaypalResponse>(_CheckoutPaypalResponse_QNAME, CheckoutPaypalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "retrievePayment")
    public JAXBElement<RetrievePayment> createRetrievePayment(RetrievePayment value) {
        return new JAXBElement<RetrievePayment>(_RetrievePayment_QNAME, RetrievePayment.class, null, value);
    }

}
