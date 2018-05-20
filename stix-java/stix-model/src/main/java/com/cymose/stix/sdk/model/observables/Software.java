
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
 * software
 * <p>
 * The Software Object represents high-level properties associated with software, including software products.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "name",
    "cpe",
    "languages",
    "vendor",
    "version"
})
public class Software extends CyberObservableCore {

    /**
     * The value of this property MUST be `software`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `software`.")
    private String type;
    /**
     * Specifies the name of the software.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Specifies the name of the software.")
    private String name;
    /**
     * Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary.
     * 
     */
    @JsonProperty("cpe")
    @JsonPropertyDescription("Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary.")
    private String cpe;
    /**
     * Specifies the languages supported by the software. The value of each list member MUST be an ISO 639-2 language code.
     * 
     */
    @JsonProperty("languages")
    @JsonPropertyDescription("Specifies the languages supported by the software. The value of each list member MUST be an ISO 639-2 language code.")
    private List<String> languages = new ArrayList<String>();
    /**
     * Specifies the name of the vendor of the software.
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("Specifies the name of the vendor of the software.")
    private String vendor;
    /**
     * Specifies the version of the software.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Specifies the version of the software.")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `software`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `software`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies the name of the software.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the software.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary.
     * 
     */
    @JsonProperty("cpe")
    public String getCpe() {
        return cpe;
    }

    /**
     * Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary.
     * 
     */
    @JsonProperty("cpe")
    public void setCpe(String cpe) {
        this.cpe = cpe;
    }

    /**
     * Specifies the languages supported by the software. The value of each list member MUST be an ISO 639-2 language code.
     * 
     */
    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    /**
     * Specifies the languages supported by the software. The value of each list member MUST be an ISO 639-2 language code.
     * 
     */
    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    /**
     * Specifies the name of the vendor of the software.
     * 
     */
    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    /**
     * Specifies the name of the vendor of the software.
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * Specifies the version of the software.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Specifies the version of the software.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
        return new ToStringBuilder(this).append("type", type).append("name", name).append("cpe", cpe).append("languages", languages).append("vendor", vendor).append("version", version).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(languages).append(vendor).append(name).append(cpe).append(additionalProperties).append(type).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Software) == false) {
            return false;
        }
        Software rhs = ((Software) other);
        return new EqualsBuilder().append(languages, rhs.languages).append(vendor, rhs.vendor).append(name, rhs.name).append(cpe, rhs.cpe).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(version, rhs.version).isEquals();
    }

}
