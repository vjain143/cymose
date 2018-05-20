
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
 * report
 * <p>
 * Reports are collections of threat intelligence focused on one or more topics, such as a description of a threat actor, malware, or attack technique, including context and related details.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "labels",
    "name",
    "description",
    "published",
    "object_refs"
})
public class Report extends Core {

    /**
     * The type of this object, which MUST be the literal `report`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `report`.")
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
     * This field is an Open Vocabulary that specifies the primary subject of this report. The suggested values for this field are in report-label-ov.
     * (Required)
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("This field is an Open Vocabulary that specifies the primary subject of this report. The suggested values for this field are in report-label-ov.")
    private List<String> labels = new ArrayList<String>();
    /**
     * The name used to identify the Report.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name used to identify the Report.")
    private String name;
    /**
     * A description that provides more details and context about Report.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description that provides more details and context about Report.")
    private String description;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("published")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String published;
    /**
     * Specifies the STIX Objects that are referred to by this Report.
     * (Required)
     * 
     */
    @JsonProperty("object_refs")
    @JsonPropertyDescription("Specifies the STIX Objects that are referred to by this Report.")
    private List<String> objectRefs = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `report`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `report`.
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
     * This field is an Open Vocabulary that specifies the primary subject of this report. The suggested values for this field are in report-label-ov.
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * This field is an Open Vocabulary that specifies the primary subject of this report. The suggested values for this field are in report-label-ov.
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * The name used to identify the Report.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Report.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about Report.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about Report.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("published")
    public String getPublished() {
        return published;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     * 
     */
    @JsonProperty("published")
    public void setPublished(String published) {
        this.published = published;
    }

    /**
     * Specifies the STIX Objects that are referred to by this Report.
     * (Required)
     * 
     */
    @JsonProperty("object_refs")
    public List<String> getObjectRefs() {
        return objectRefs;
    }

    /**
     * Specifies the STIX Objects that are referred to by this Report.
     * (Required)
     * 
     */
    @JsonProperty("object_refs")
    public void setObjectRefs(List<String> objectRefs) {
        this.objectRefs = objectRefs;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("labels", labels).append("name", name).append("description", description).append("published", published).append("objectRefs", objectRefs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(objectRefs).append(id).append(published).append(additionalProperties).append(type).append(labels).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Report) == false) {
            return false;
        }
        Report rhs = ((Report) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(objectRefs, rhs.objectRefs).append(id, rhs.id).append(published, rhs.published).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(labels, rhs.labels).isEquals();
    }

}
