
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
 * windows-registry-key
 * <p>
 * The Registry Key Object represents the properties of a Windows registry key.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "key",
    "values",
    "modified",
    "creator_user_ref",
    "number_of_subkeys"
})
public class WindowsRegistryKey extends CyberObservableCore {

    /**
     * The value of this property MUST be `windows-registry-key`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `windows-registry-key`.")
    private String type;
    /**
     * Specifies the full registry key including the hive.
     * (Required)
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("Specifies the full registry key including the hive.")
    private String key;
    /**
     * Specifies the values found under the registry key.
     * 
     */
    @JsonProperty("values")
    @JsonPropertyDescription("Specifies the values found under the registry key.")
    private List<Value> values = new ArrayList<Value>();
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("modified")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String modified;
    /**
     * Specifies a reference to a user account, represented as a User Account Object, that created the registry key.
     * 
     */
    @JsonProperty("creator_user_ref")
    @JsonPropertyDescription("Specifies a reference to a user account, represented as a User Account Object, that created the registry key.")
    private String creatorUserRef;
    /**
     * Specifies the number of subkeys contained under the registry key.
     * 
     */
    @JsonProperty("number_of_subkeys")
    @JsonPropertyDescription("Specifies the number of subkeys contained under the registry key.")
    private Integer numberOfSubkeys;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `windows-registry-key`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `windows-registry-key`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies the full registry key including the hive.
     * (Required)
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Specifies the full registry key including the hive.
     * (Required)
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Specifies the values found under the registry key.
     * 
     */
    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    /**
     * Specifies the values found under the registry key.
     * 
     */
    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Specifies a reference to a user account, represented as a User Account Object, that created the registry key.
     * 
     */
    @JsonProperty("creator_user_ref")
    public String getCreatorUserRef() {
        return creatorUserRef;
    }

    /**
     * Specifies a reference to a user account, represented as a User Account Object, that created the registry key.
     * 
     */
    @JsonProperty("creator_user_ref")
    public void setCreatorUserRef(String creatorUserRef) {
        this.creatorUserRef = creatorUserRef;
    }

    /**
     * Specifies the number of subkeys contained under the registry key.
     * 
     */
    @JsonProperty("number_of_subkeys")
    public Integer getNumberOfSubkeys() {
        return numberOfSubkeys;
    }

    /**
     * Specifies the number of subkeys contained under the registry key.
     * 
     */
    @JsonProperty("number_of_subkeys")
    public void setNumberOfSubkeys(Integer numberOfSubkeys) {
        this.numberOfSubkeys = numberOfSubkeys;
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
        return new ToStringBuilder(this).append("type", type).append("key", key).append("values", values).append("modified", modified).append("creatorUserRef", creatorUserRef).append("numberOfSubkeys", numberOfSubkeys).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(creatorUserRef).append(values).append(modified).append(additionalProperties).append(type).append(numberOfSubkeys).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WindowsRegistryKey) == false) {
            return false;
        }
        WindowsRegistryKey rhs = ((WindowsRegistryKey) other);
        return new EqualsBuilder().append(creatorUserRef, rhs.creatorUserRef).append(values, rhs.values).append(modified, rhs.modified).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(numberOfSubkeys, rhs.numberOfSubkeys).append(key, rhs.key).isEquals();
    }

}
