
package com.cymose.stix.sdk.model.common;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * core
 * <p>
 * Common properties and behavior across all STIX Domain Objects and STIX Relationship Objects.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "created_by_ref",
    "labels",
    "created",
    "modified",
    "revoked",
    "external_references",
    "object_marking_refs",
    "granular_markings"
})
public class Core {

    /**
     * type
     * <p>
     * The type property identifies the type of STIX Object (SDO, Relationship Object, etc). The value of the type field MUST be one of the types defined by a STIX Object (e.g., indicator).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type property identifies the type of STIX Object (SDO, Relationship Object, etc). The value of the type field MUST be one of the types defined by a STIX Object (e.g., indicator).")
    private String type;
    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.")
    private String id;
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
     * The labels property specifies a set of classifications.
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("The labels property specifies a set of classifications.")
    private List<String> labels = new ArrayList<String>();
    /**
     * The created property represents the time at which the first version of this object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The created property represents the time at which the first version of this object was created. The timstamp value MUST be precise to the nearest millisecond.")
    private Object created;
    /**
     * The modified property represents the time that this particular version of the object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     * 
     */
    @JsonProperty("modified")
    @JsonPropertyDescription("The modified property represents the time that this particular version of the object was created. The timstamp value MUST be precise to the nearest millisecond.")
    private Object modified;
    /**
     * The revoked property indicates whether the object has been revoked.
     * 
     */
    @JsonProperty("revoked")
    @JsonPropertyDescription("The revoked property indicates whether the object has been revoked.")
    private Boolean revoked;
    /**
     * A list of external references which refers to non-STIX information.
     * 
     */
    @JsonProperty("external_references")
    @JsonPropertyDescription("A list of external references which refers to non-STIX information.")
    private List<ExternalReference> externalReferences = new ArrayList<ExternalReference>();
    /**
     * The list of marking-definition objects to be applied to this object.
     * 
     */
    @JsonProperty("object_marking_refs")
    @JsonPropertyDescription("The list of marking-definition objects to be applied to this object.")
    private List<String> objectMarkingRefs = new ArrayList<String>();
    /**
     * The set of granular markings that apply to this object.
     * 
     */
    @JsonProperty("granular_markings")
    @JsonPropertyDescription("The set of granular markings that apply to this object.")
    private List<GranularMarking> granularMarkings = new ArrayList<GranularMarking>();

    /**
     * type
     * <p>
     * The type property identifies the type of STIX Object (SDO, Relationship Object, etc). The value of the type field MUST be one of the types defined by a STIX Object (e.g., indicator).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * type
     * <p>
     * The type property identifies the type of STIX Object (SDO, Relationship Object, etc). The value of the type field MUST be one of the types defined by a STIX Object (e.g., indicator).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
     * The labels property specifies a set of classifications.
     * 
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * The labels property specifies a set of classifications.
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * The created property represents the time at which the first version of this object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public Object getCreated() {
        return created;
    }

    /**
     * The created property represents the time at which the first version of this object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public void setCreated(Object created) {
        this.created = created;
    }

    /**
     * The modified property represents the time that this particular version of the object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     * 
     */
    @JsonProperty("modified")
    public Object getModified() {
        return modified;
    }

    /**
     * The modified property represents the time that this particular version of the object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     * 
     */
    @JsonProperty("modified")
    public void setModified(Object modified) {
        this.modified = modified;
    }

    /**
     * The revoked property indicates whether the object has been revoked.
     * 
     */
    @JsonProperty("revoked")
    public Boolean getRevoked() {
        return revoked;
    }

    /**
     * The revoked property indicates whether the object has been revoked.
     * 
     */
    @JsonProperty("revoked")
    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
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
     * The list of marking-definition objects to be applied to this object.
     * 
     */
    @JsonProperty("object_marking_refs")
    public List<String> getObjectMarkingRefs() {
        return objectMarkingRefs;
    }

    /**
     * The list of marking-definition objects to be applied to this object.
     * 
     */
    @JsonProperty("object_marking_refs")
    public void setObjectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
    }

    /**
     * The set of granular markings that apply to this object.
     * 
     */
    @JsonProperty("granular_markings")
    public List<GranularMarking> getGranularMarkings() {
        return granularMarkings;
    }

    /**
     * The set of granular markings that apply to this object.
     * 
     */
    @JsonProperty("granular_markings")
    public void setGranularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("createdByRef", createdByRef).append("labels", labels).append("created", created).append("modified", modified).append("revoked", revoked).append("externalReferences", externalReferences).append("objectMarkingRefs", objectMarkingRefs).append("granularMarkings", granularMarkings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(externalReferences).append(created).append(granularMarkings).append(modified).append(createdByRef).append(id).append(objectMarkingRefs).append(type).append(revoked).append(labels).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Core) == false) {
            return false;
        }
        Core rhs = ((Core) other);
        return new EqualsBuilder().append(externalReferences, rhs.externalReferences).append(created, rhs.created).append(granularMarkings, rhs.granularMarkings).append(modified, rhs.modified).append(createdByRef, rhs.createdByRef).append(id, rhs.id).append(objectMarkingRefs, rhs.objectMarkingRefs).append(type, rhs.type).append(revoked, rhs.revoked).append(labels, rhs.labels).isEquals();
    }

}
