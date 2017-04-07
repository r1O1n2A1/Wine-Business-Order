
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payPalModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payPalModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payPalModel")
@XmlSeeAlso({
    Payer.class,
    Billing.class,
    Payee.class,
    PaymentCard.class,
    Incentive.class,
    PaymentOptions.class,
    Percentage.class,
    Links.class,
    ExternalFunding.class,
    Details.class,
    Credit.class,
    FundingInstrument.class,
    HyperSchema.class,
    PrivateLabelCard.class,
    Item.class,
    BankAccount.class,
    FundingOption.class,
    Phone.class,
    CarrierAccountToken.class,
    FundingSource.class,
    PotentialPayerInfo.class,
    ErrorDetails.class,
    ProcessorResponse.class,
    BankToken.class,
    AlternatePayment.class,
    RecipientBankingInstruction.class,
    InstallmentOption.class,
    Error.class,
    RedirectUrls.class,
    Measurement.class,
    CreditCardToken.class,
    DefinitionsLinkdescription.class,
    CreditFinancingOffered.class,
    CountryCode.class,
    Currency.class,
    CarrierAccount.class,
    RelatedResources.class,
    Card3DSecureInfo.class,
    InstallmentInfo.class,
    Amount.class,
    NameValuePair.class,
    BillingAgreementToken.class,
    FmfDetails.class,
    CurrencyConversion.class,
    PayerInfo.class,
    BaseAddress.class,
    ItemList.class,
    PayPalResource.class,
    CartBase.class
})
public class PayPalModel {


}
