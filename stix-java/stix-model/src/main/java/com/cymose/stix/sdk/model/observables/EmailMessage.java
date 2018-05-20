
package com.cymose.stix.sdk.model.observables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cymose.stix.sdk.model.common.CyberObservableCore;
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
 * email-message
 * <p>
 * The Email Message Object represents an instance of an email message.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "date",
    "content_type",
    "from_ref",
    "sender_ref",
    "to_refs",
    "cc_refs",
    "bcc_refs",
    "subject",
    "received_lines",
    "additional_header_fields",
    "raw_email_ref"
})
public class EmailMessage extends CyberObservableCore {

    /**
     * The value of this property MUST be `email-message`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `email-message`.")
    private String type;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String date;
    /**
     * Specifies the value of the 'Content-Type' header of the email message.
     * 
     */
    @JsonProperty("content_type")
    @JsonPropertyDescription("Specifies the value of the 'Content-Type' header of the email message.")
    private String contentType;
    /**
     * Specifies the value of the 'From:' header of the email message.
     * 
     */
    @JsonProperty("from_ref")
    @JsonPropertyDescription("Specifies the value of the 'From:' header of the email message.")
    private String fromRef;
    /**
     * Specifies the value of the 'From' field of the email message
     * 
     */
    @JsonProperty("sender_ref")
    @JsonPropertyDescription("Specifies the value of the 'From' field of the email message")
    private String senderRef;
    /**
     * Specifies the mailboxes that are 'To:' recipients of the email message
     * 
     */
    @JsonProperty("to_refs")
    @JsonPropertyDescription("Specifies the mailboxes that are 'To:' recipients of the email message")
    private List<String> toRefs = new ArrayList<String>();
    /**
     * Specifies the mailboxes that are 'CC:' recipients of the email message
     * 
     */
    @JsonProperty("cc_refs")
    @JsonPropertyDescription("Specifies the mailboxes that are 'CC:' recipients of the email message")
    private List<String> ccRefs = new ArrayList<String>();
    /**
     * Specifies the mailboxes that are 'BCC:' recipients of the email message.
     * 
     */
    @JsonProperty("bcc_refs")
    @JsonPropertyDescription("Specifies the mailboxes that are 'BCC:' recipients of the email message.")
    private List<String> bccRefs = new ArrayList<String>();
    /**
     * Specifies the subject of the email message.
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("Specifies the subject of the email message.")
    private String subject;
    /**
     * Specifies one or more Received header fields that may be included in the email headers.
     * 
     */
    @JsonProperty("received_lines")
    @JsonPropertyDescription("Specifies one or more Received header fields that may be included in the email headers.")
    private List<String> receivedLines = new ArrayList<String>();
    /**
     * Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.
     * 
     */
    @JsonProperty("additional_header_fields")
    @JsonPropertyDescription("Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.")
    private AdditionalHeaderFields additionalHeaderFields;
    /**
     * Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact Object.
     * 
     */
    @JsonProperty("raw_email_ref")
    @JsonPropertyDescription("Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact Object.")
    private String rawEmailRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `email-message`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `email-message`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Specifies the value of the 'Content-Type' header of the email message.
     * 
     */
    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Specifies the value of the 'Content-Type' header of the email message.
     * 
     */
    @JsonProperty("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Specifies the value of the 'From:' header of the email message.
     * 
     */
    @JsonProperty("from_ref")
    public String getFromRef() {
        return fromRef;
    }

    /**
     * Specifies the value of the 'From:' header of the email message.
     * 
     */
    @JsonProperty("from_ref")
    public void setFromRef(String fromRef) {
        this.fromRef = fromRef;
    }

    /**
     * Specifies the value of the 'From' field of the email message
     * 
     */
    @JsonProperty("sender_ref")
    public String getSenderRef() {
        return senderRef;
    }

    /**
     * Specifies the value of the 'From' field of the email message
     * 
     */
    @JsonProperty("sender_ref")
    public void setSenderRef(String senderRef) {
        this.senderRef = senderRef;
    }

    /**
     * Specifies the mailboxes that are 'To:' recipients of the email message
     * 
     */
    @JsonProperty("to_refs")
    public List<String> getToRefs() {
        return toRefs;
    }

    /**
     * Specifies the mailboxes that are 'To:' recipients of the email message
     * 
     */
    @JsonProperty("to_refs")
    public void setToRefs(List<String> toRefs) {
        this.toRefs = toRefs;
    }

    /**
     * Specifies the mailboxes that are 'CC:' recipients of the email message
     * 
     */
    @JsonProperty("cc_refs")
    public List<String> getCcRefs() {
        return ccRefs;
    }

    /**
     * Specifies the mailboxes that are 'CC:' recipients of the email message
     * 
     */
    @JsonProperty("cc_refs")
    public void setCcRefs(List<String> ccRefs) {
        this.ccRefs = ccRefs;
    }

    /**
     * Specifies the mailboxes that are 'BCC:' recipients of the email message.
     * 
     */
    @JsonProperty("bcc_refs")
    public List<String> getBccRefs() {
        return bccRefs;
    }

    /**
     * Specifies the mailboxes that are 'BCC:' recipients of the email message.
     * 
     */
    @JsonProperty("bcc_refs")
    public void setBccRefs(List<String> bccRefs) {
        this.bccRefs = bccRefs;
    }

    /**
     * Specifies the subject of the email message.
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * Specifies the subject of the email message.
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Specifies one or more Received header fields that may be included in the email headers.
     * 
     */
    @JsonProperty("received_lines")
    public List<String> getReceivedLines() {
        return receivedLines;
    }

    /**
     * Specifies one or more Received header fields that may be included in the email headers.
     * 
     */
    @JsonProperty("received_lines")
    public void setReceivedLines(List<String> receivedLines) {
        this.receivedLines = receivedLines;
    }

    /**
     * Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.
     * 
     */
    @JsonProperty("additional_header_fields")
    public AdditionalHeaderFields getAdditionalHeaderFields() {
        return additionalHeaderFields;
    }

    /**
     * Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.
     * 
     */
    @JsonProperty("additional_header_fields")
    public void setAdditionalHeaderFields(AdditionalHeaderFields additionalHeaderFields) {
        this.additionalHeaderFields = additionalHeaderFields;
    }

    /**
     * Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact Object.
     * 
     */
    @JsonProperty("raw_email_ref")
    public String getRawEmailRef() {
        return rawEmailRef;
    }

    /**
     * Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact Object.
     * 
     */
    @JsonProperty("raw_email_ref")
    public void setRawEmailRef(String rawEmailRef) {
        this.rawEmailRef = rawEmailRef;
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
        return new ToStringBuilder(this).append("type", type).append("date", date).append("contentType", contentType).append("fromRef", fromRef).append("senderRef", senderRef).append("toRefs", toRefs).append("ccRefs", ccRefs).append("bccRefs", bccRefs).append("subject", subject).append("receivedLines", receivedLines).append("additionalHeaderFields", additionalHeaderFields).append("rawEmailRef", rawEmailRef).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(subject).append(additionalHeaderFields).append(ccRefs).append(type).append(rawEmailRef).append(toRefs).append(bccRefs).append(receivedLines).append(senderRef).append(fromRef).append(additionalProperties).append(contentType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailMessage) == false) {
            return false;
        }
        EmailMessage rhs = ((EmailMessage) other);
        return new EqualsBuilder().append(date, rhs.date).append(subject, rhs.subject).append(additionalHeaderFields, rhs.additionalHeaderFields).append(ccRefs, rhs.ccRefs).append(type, rhs.type).append(rawEmailRef, rhs.rawEmailRef).append(toRefs, rhs.toRefs).append(bccRefs, rhs.bccRefs).append(receivedLines, rhs.receivedLines).append(senderRef, rhs.senderRef).append(fromRef, rhs.fromRef).append(additionalProperties, rhs.additionalProperties).append(contentType, rhs.contentType).isEquals();
    }

}
