
package com.cymose.stix.sdk.model.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * marking-definition
 * <p>
 * The marking-definition object represents a specific marking.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "created_by_ref",
    "created",
    "external_references",
    "object_marking_refs",
    "granular_markings"
})
public class MarkingDefinition {

    /**
     * The type of this object, which MUST be the literal `marking-definition`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `marking-definition`.")
    private MarkingDefinition.Type type;
    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     * 
     */
    @JsonProperty("created_by_ref")
    @JsonPropertyDescription("Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.")
    private String createdByRef;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String created;
    /**
     * A list of external references which refers to non-STIX information.
     * 
     */
    @JsonProperty("external_references")
    @JsonPropertyDescription("A list of external references which refers to non-STIX information.")
    private List<ExternalReference> externalReferences = new ArrayList<ExternalReference>();
    /**
     * The object_marking_refs property specifies a list of IDs of marking-definition objects that apply to this Marking Definition.
     * 
     */
    @JsonProperty("object_marking_refs")
    @JsonPropertyDescription("The object_marking_refs property specifies a list of IDs of marking-definition objects that apply to this Marking Definition.")
    private List<Object> objectMarkingRefs = new ArrayList<Object>();
    /**
     * The granular_markings property specifies a list of granular markings applied to this object.
     * 
     */
    @JsonProperty("granular_markings")
    @JsonPropertyDescription("The granular_markings property specifies a list of granular markings applied to this object.")
    private List<GranularMarking> granularMarkings = new ArrayList<GranularMarking>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `marking-definition`.
     * 
     */
    @JsonProperty("type")
    public MarkingDefinition.Type getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `marking-definition`.
     * 
     */
    @JsonProperty("type")
    public void setType(MarkingDefinition.Type type) {
        this.type = type;
    }

    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     * 
     */
    @JsonProperty("created_by_ref")
    public String getCreatedByRef() {
        return createdByRef;
    }

    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     * 
     */
    @JsonProperty("created_by_ref")
    public void setCreatedByRef(String createdByRef) {
        this.createdByRef = createdByRef;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * A list of external references which refers to non-STIX information.
     * 
     */
    @JsonProperty("external_references")
    public List<ExternalReference> getExternalReferences() {
        return externalReferences;
    }

    /**
     * A list of external references which refers to non-STIX information.
     * 
     */
    @JsonProperty("external_references")
    public void setExternalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    /**
     * The object_marking_refs property specifies a list of IDs of marking-definition objects that apply to this Marking Definition.
     * 
     */
    @JsonProperty("object_marking_refs")
    public List<Object> getObjectMarkingRefs() {
        return objectMarkingRefs;
    }

    /**
     * The object_marking_refs property specifies a list of IDs of marking-definition objects that apply to this Marking Definition.
     * 
     */
    @JsonProperty("object_marking_refs")
    public void setObjectMarkingRefs(List<Object> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
    }

    /**
     * The granular_markings property specifies a list of granular markings applied to this object.
     * 
     */
    @JsonProperty("granular_markings")
    public List<GranularMarking> getGranularMarkings() {
        return granularMarkings;
    }

    /**
     * The granular_markings property specifies a list of granular markings applied to this object.
     * 
     */
    @JsonProperty("granular_markings")
    public void setGranularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
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
        return new ToStringBuilder(this).append("type", type).append("createdByRef", createdByRef).append("created", created).append("externalReferences", externalReferences).append("objectMarkingRefs", objectMarkingRefs).append("granularMarkings", granularMarkings).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(externalReferences).append(created).append(granularMarkings).append(createdByRef).append(objectMarkingRefs).append(additionalProperties).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarkingDefinition) == false) {
            return false;
        }
        MarkingDefinition rhs = ((MarkingDefinition) other);
        return new EqualsBuilder().append(externalReferences, rhs.externalReferences).append(created, rhs.created).append(granularMarkings, rhs.granularMarkings).append(createdByRef, rhs.createdByRef).append(objectMarkingRefs, rhs.objectMarkingRefs).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).isEquals();
    }

    public enum Type {

        MARKING_DEFINITION("marking-definition");
        private final String value;
        private final static Map<String, MarkingDefinition.Type> CONSTANTS = new HashMap<String, MarkingDefinition.Type>();

        static {
            for (MarkingDefinition.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MarkingDefinition.Type fromValue(String value) {
            MarkingDefinition.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
