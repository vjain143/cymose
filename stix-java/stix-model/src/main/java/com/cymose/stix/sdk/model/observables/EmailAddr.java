
package com.cymose.stix.sdk.model.observables;

import java.util.HashMap;
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
 * email-addr
 * <p>
 * The Email Address Object represents a single email address.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "value",
    "display_name",
    "belongs_to_ref"
})
public class EmailAddr extends CyberObservableCore {

    /**
     * The value of this property MUST be `email-addr`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `email-addr`.")
    private String type;
    /**
     * Specifies a single email address. This MUST not include the display name.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Specifies a single email address. This MUST not include the display name.")
    private String value;
    /**
     * Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application.
     * 
     */
    @JsonProperty("display_name")
    @JsonPropertyDescription("Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application.")
    private String displayName;
    /**
     * Specifies the user account that the email address belongs to, as a reference to a User Account Object.
     * 
     */
    @JsonProperty("belongs_to_ref")
    @JsonPropertyDescription("Specifies the user account that the email address belongs to, as a reference to a User Account Object.")
    private String belongsToRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `email-addr`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `email-addr`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies a single email address. This MUST not include the display name.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Specifies a single email address. This MUST not include the display name.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application.
     * 
     */
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application.
     * 
     */
    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Specifies the user account that the email address belongs to, as a reference to a User Account Object.
     * 
     */
    @JsonProperty("belongs_to_ref")
    public String getBelongsToRef() {
        return belongsToRef;
    }

    /**
     * Specifies the user account that the email address belongs to, as a reference to a User Account Object.
     * 
     */
    @JsonProperty("belongs_to_ref")
    public void setBelongsToRef(String belongsToRef) {
        this.belongsToRef = belongsToRef;
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
        return new ToStringBuilder(this).append("type", type).append("value", value).append("displayName", displayName).append("belongsToRef", belongsToRef).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(belongsToRef).append(additionalProperties).append(type).append(value).append(displayName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailAddr) == false) {
            return false;
        }
        EmailAddr rhs = ((EmailAddr) other);
        return new EqualsBuilder().append(belongsToRef, rhs.belongsToRef).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(value, rhs.value).append(displayName, rhs.displayName).isEquals();
    }

}
