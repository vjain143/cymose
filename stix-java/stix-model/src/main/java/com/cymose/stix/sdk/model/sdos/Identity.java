
package com.cymose.stix.sdk.model.sdos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cymose.stix.sdk.model.common.Core;
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
 * identity
 * <p>
 * Identities can represent actual individuals, organizations, or groups (e.g., ACME, Inc.) as well as classes of individuals, organizations, or groups.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "labels",
    "name",
    "description",
    "identity_class",
    "sectors",
    "contact_information"
})
public class Identity extends Core {

    /**
     * The type of this object, which MUST be the literal `identity`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `identity`.")
    private String type;
    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * The list of roles that this Identity performs (e.g., CEO, Domain Administrators, Doctors, Hospital, or Retailer). No open vocabulary is yet defined for this property.
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("The list of roles that this Identity performs (e.g., CEO, Domain Administrators, Doctors, Hospital, or Retailer). No open vocabulary is yet defined for this property.")
    private List<String> labels = new ArrayList<String>();
    /**
     * The name of this Identity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this Identity.")
    private String name;
    /**
     * A description that provides more details and context about the Identity.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that provides more details and context about the Identity.")
    private String description;
    /**
     * The type of entity that this Identity describes, e.g., an individual or organization. Open Vocab - identity-class-ov
     * (Required)
     * 
     */
    @JsonProperty("identity_class")
    @JsonPropertyDescription("The type of entity that this Identity describes, e.g., an individual or organization. Open Vocab - identity-class-ov")
    private String identityClass;
    /**
     * The list of sectors that this Identity belongs to. Open Vocab - industry-sector-ov
     * 
     */
    @JsonProperty("sectors")
    @JsonPropertyDescription("The list of sectors that this Identity belongs to. Open Vocab - industry-sector-ov")
    private List<String> sectors = new ArrayList<String>();
    /**
     * The contact information (e-mail, phone number, etc.) for this Identity.
     * 
     */
    @JsonProperty("contact_information")
    @JsonPropertyDescription("The contact information (e-mail, phone number, etc.) for this Identity.")
    private String contactInformation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `identity`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `identity`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * id
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The list of roles that this Identity performs (e.g., CEO, Domain Administrators, Doctors, Hospital, or Retailer). No open vocabulary is yet defined for this property.
     * 
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * The list of roles that this Identity performs (e.g., CEO, Domain Administrators, Doctors, Hospital, or Retailer). No open vocabulary is yet defined for this property.
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * The name of this Identity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this Identity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Identity.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Identity.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The type of entity that this Identity describes, e.g., an individual or organization. Open Vocab - identity-class-ov
     * (Required)
     * 
     */
    @JsonProperty("identity_class")
    public String getIdentityClass() {
        return identityClass;
    }

    /**
     * The type of entity that this Identity describes, e.g., an individual or organization. Open Vocab - identity-class-ov
     * (Required)
     * 
     */
    @JsonProperty("identity_class")
    public void setIdentityClass(String identityClass) {
        this.identityClass = identityClass;
    }

    /**
     * The list of sectors that this Identity belongs to. Open Vocab - industry-sector-ov
     * 
     */
    @JsonProperty("sectors")
    public List<String> getSectors() {
        return sectors;
    }

    /**
     * The list of sectors that this Identity belongs to. Open Vocab - industry-sector-ov
     * 
     */
    @JsonProperty("sectors")
    public void setSectors(List<String> sectors) {
        this.sectors = sectors;
    }

    /**
     * The contact information (e-mail, phone number, etc.) for this Identity.
     * 
     */
    @JsonProperty("contact_information")
    public String getContactInformation() {
        return contactInformation;
    }

    /**
     * The contact information (e-mail, phone number, etc.) for this Identity.
     * 
     */
    @JsonProperty("contact_information")
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("labels", labels).append("name", name).append("description", description).append("identityClass", identityClass).append("sectors", sectors).append("contactInformation", contactInformation).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sectors).append(identityClass).append(contactInformation).append(name).append(description).append(id).append(additionalProperties).append(type).append(labels).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identity) == false) {
            return false;
        }
        Identity rhs = ((Identity) other);
        return new EqualsBuilder().append(sectors, rhs.sectors).append(identityClass, rhs.identityClass).append(contactInformation, rhs.contactInformation).append(name, rhs.name).append(description, rhs.description).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(labels, rhs.labels).isEquals();
    }

}
