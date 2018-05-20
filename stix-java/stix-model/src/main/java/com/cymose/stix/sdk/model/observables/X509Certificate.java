
package com.cymose.stix.sdk.model.observables;

import java.util.HashMap;
import java.util.Map;

import com.cymose.stix.sdk.model.common.CyberObservableCore;
import com.cymose.stix.sdk.model.common.Hashes;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * x509-certificate
 * <p>
 * The X509 Certificate Object represents the properties of an X.509 certificate.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "is_self_signed",
    "hashes",
    "version",
    "serial_number",
    "signature_algorithm",
    "issuer",
    "validity_not_before",
    "validity_not_after",
    "subject",
    "subject_public_key_algorithm",
    "subject_public_key_modulus",
    "subject_public_key_exponent",
    "x509_v3_extensions"
})
public class X509Certificate extends CyberObservableCore {

    /**
     * The value of this property MUST be `x509-certificate`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `x509-certificate`.")
    private String type;
    /**
     * Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies.
     * 
     */
    @JsonProperty("is_self_signed")
    @JsonPropertyDescription("Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies.")
    private Boolean isSelfSigned;
    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    @JsonPropertyDescription("A dictionary captures a set of key/value pairs")
    private Hashes hashes;
    /**
     * Specifies the version of the encoded certificate.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Specifies the version of the encoded certificate.")
    private String version;
    /**
     * Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority.
     * 
     */
    @JsonProperty("serial_number")
    @JsonPropertyDescription("Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority.")
    private String serialNumber;
    /**
     * Specifies the name of the algorithm used to sign the certificate.
     * 
     */
    @JsonProperty("signature_algorithm")
    @JsonPropertyDescription("Specifies the name of the algorithm used to sign the certificate.")
    private String signatureAlgorithm;
    /**
     * Specifies the name of the Certificate Authority that issued the certificate.
     * 
     */
    @JsonProperty("issuer")
    @JsonPropertyDescription("Specifies the name of the Certificate Authority that issued the certificate.")
    private String issuer;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("validity_not_before")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String validityNotBefore;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("validity_not_after")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String validityNotAfter;
    /**
     * Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate.")
    private String subject;
    /**
     * Specifies the name of the algorithm with which to encrypt data being sent to the subject.
     * 
     */
    @JsonProperty("subject_public_key_algorithm")
    @JsonPropertyDescription("Specifies the name of the algorithm with which to encrypt data being sent to the subject.")
    private String subjectPublicKeyAlgorithm;
    /**
     * Specifies the modulus portion of the subject’s public RSA key.
     * 
     */
    @JsonProperty("subject_public_key_modulus")
    @JsonPropertyDescription("Specifies the modulus portion of the subject\u2019s public RSA key.")
    private String subjectPublicKeyModulus;
    /**
     * Specifies the exponent portion of the subject’s public RSA key, as an integer.
     * 
     */
    @JsonProperty("subject_public_key_exponent")
    @JsonPropertyDescription("Specifies the exponent portion of the subject\u2019s public RSA key, as an integer.")
    private Integer subjectPublicKeyExponent;
    @JsonProperty("x509_v3_extensions")
    private X509V3Extensions x509V3Extensions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `x509-certificate`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `x509-certificate`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies.
     * 
     */
    @JsonProperty("is_self_signed")
    public Boolean getIsSelfSigned() {
        return isSelfSigned;
    }

    /**
     * Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies.
     * 
     */
    @JsonProperty("is_self_signed")
    public void setIsSelfSigned(Boolean isSelfSigned) {
        this.isSelfSigned = isSelfSigned;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    public Hashes getHashes() {
        return hashes;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    public void setHashes(Hashes hashes) {
        this.hashes = hashes;
    }

    /**
     * Specifies the version of the encoded certificate.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Specifies the version of the encoded certificate.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority.
     * 
     */
    @JsonProperty("serial_number")
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority.
     * 
     */
    @JsonProperty("serial_number")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Specifies the name of the algorithm used to sign the certificate.
     * 
     */
    @JsonProperty("signature_algorithm")
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Specifies the name of the algorithm used to sign the certificate.
     * 
     */
    @JsonProperty("signature_algorithm")
    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * Specifies the name of the Certificate Authority that issued the certificate.
     * 
     */
    @JsonProperty("issuer")
    public String getIssuer() {
        return issuer;
    }

    /**
     * Specifies the name of the Certificate Authority that issued the certificate.
     * 
     */
    @JsonProperty("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("validity_not_before")
    public String getValidityNotBefore() {
        return validityNotBefore;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("validity_not_before")
    public void setValidityNotBefore(String validityNotBefore) {
        this.validityNotBefore = validityNotBefore;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("validity_not_after")
    public String getValidityNotAfter() {
        return validityNotAfter;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("validity_not_after")
    public void setValidityNotAfter(String validityNotAfter) {
        this.validityNotAfter = validityNotAfter;
    }

    /**
     * Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate.
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Specifies the name of the algorithm with which to encrypt data being sent to the subject.
     * 
     */
    @JsonProperty("subject_public_key_algorithm")
    public String getSubjectPublicKeyAlgorithm() {
        return subjectPublicKeyAlgorithm;
    }

    /**
     * Specifies the name of the algorithm with which to encrypt data being sent to the subject.
     * 
     */
    @JsonProperty("subject_public_key_algorithm")
    public void setSubjectPublicKeyAlgorithm(String subjectPublicKeyAlgorithm) {
        this.subjectPublicKeyAlgorithm = subjectPublicKeyAlgorithm;
    }

    /**
     * Specifies the modulus portion of the subject’s public RSA key.
     * 
     */
    @JsonProperty("subject_public_key_modulus")
    public String getSubjectPublicKeyModulus() {
        return subjectPublicKeyModulus;
    }

    /**
     * Specifies the modulus portion of the subject’s public RSA key.
     * 
     */
    @JsonProperty("subject_public_key_modulus")
    public void setSubjectPublicKeyModulus(String subjectPublicKeyModulus) {
        this.subjectPublicKeyModulus = subjectPublicKeyModulus;
    }

    /**
     * Specifies the exponent portion of the subject’s public RSA key, as an integer.
     * 
     */
    @JsonProperty("subject_public_key_exponent")
    public Integer getSubjectPublicKeyExponent() {
        return subjectPublicKeyExponent;
    }

    /**
     * Specifies the exponent portion of the subject’s public RSA key, as an integer.
     * 
     */
    @JsonProperty("subject_public_key_exponent")
    public void setSubjectPublicKeyExponent(Integer subjectPublicKeyExponent) {
        this.subjectPublicKeyExponent = subjectPublicKeyExponent;
    }

    @JsonProperty("x509_v3_extensions")
    public X509V3Extensions getX509V3Extensions() {
        return x509V3Extensions;
    }

    @JsonProperty("x509_v3_extensions")
    public void setX509V3Extensions(X509V3Extensions x509V3Extensions) {
        this.x509V3Extensions = x509V3Extensions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("isSelfSigned", isSelfSigned).append("hashes", hashes).append("version", version).append("serialNumber", serialNumber).append("signatureAlgorithm", signatureAlgorithm).append("issuer", issuer).append("validityNotBefore", validityNotBefore).append("validityNotAfter", validityNotAfter).append("subject", subject).append("subjectPublicKeyAlgorithm", subjectPublicKeyAlgorithm).append("subjectPublicKeyModulus", subjectPublicKeyModulus).append("subjectPublicKeyExponent", subjectPublicKeyExponent).append("x509V3Extensions", x509V3Extensions).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subjectPublicKeyExponent).append(serialNumber).append(subject).append(validityNotBefore).append(type).append(version).append(signatureAlgorithm).append(issuer).append(subjectPublicKeyAlgorithm).append(isSelfSigned).append(subjectPublicKeyModulus).append(x509V3Extensions).append(hashes).append(additionalProperties).append(validityNotAfter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof X509Certificate) == false) {
            return false;
        }
        X509Certificate rhs = ((X509Certificate) other);
        return new EqualsBuilder().append(subjectPublicKeyExponent, rhs.subjectPublicKeyExponent).append(serialNumber, rhs.serialNumber).append(subject, rhs.subject).append(validityNotBefore, rhs.validityNotBefore).append(type, rhs.type).append(version, rhs.version).append(signatureAlgorithm, rhs.signatureAlgorithm).append(issuer, rhs.issuer).append(subjectPublicKeyAlgorithm, rhs.subjectPublicKeyAlgorithm).append(isSelfSigned, rhs.isSelfSigned).append(subjectPublicKeyModulus, rhs.subjectPublicKeyModulus).append(x509V3Extensions, rhs.x509V3Extensions).append(hashes, rhs.hashes).append(additionalProperties, rhs.additionalProperties).append(validityNotAfter, rhs.validityNotAfter).isEquals();
    }

}
