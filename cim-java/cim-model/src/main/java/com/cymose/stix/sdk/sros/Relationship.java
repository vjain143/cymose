package com.cymose.stix.sdk.sros;

import com.cymose.stix.sdk.cdts.ExternalReference;
import com.cymose.stix.sdk.sdms.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Relationship {
    @SerializedName("relationship_type")
    private String relationshipType = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("source_ref")
    private String sourceRef = null;

    @SerializedName("target_ref")
    private String targetRef = null;

    @SerializedName("created")
    private OffsetDateTime created = null;

    @SerializedName("created_by_ref")
    private String createdByRef = "identity-id";

    @SerializedName("modified")
    private OffsetDateTime modified = null;

    @SerializedName("revoked")
    private Boolean revoked = false;

    @SerializedName("labels")
    private List<String> labels = null;

    @SerializedName("external_references")
    private List<ExternalReference> externalReferences = null;

    @SerializedName("object_marking_refs")
    private List<String> objectMarkingRefs = null;

    @SerializedName("granular_markings")
    private List<GranularMarking> granularMarkings = null;

    public Relationship relationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * Get relationshipType
     * @return relationshipType
     **/

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public Relationship description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Relationship sourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
        return this;
    }

    /**
     * Get sourceRef
     * @return sourceRef
     **/

    public String getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public Relationship targetRef(String targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    /**
     * Get targetRef
     * @return targetRef
     **/

    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    public Relationship created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     * @return created
     **/

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public Relationship createdByRef(String createdByRef) {
        this.createdByRef = createdByRef;
        return this;
    }

    /**
     * Get createdByRef
     * @return createdByRef
     **/

    public String getCreatedByRef() {
        return createdByRef;
    }

    public void setCreatedByRef(String createdByRef) {
        this.createdByRef = createdByRef;
    }

    public Relationship modified(OffsetDateTime modified) {
        this.modified = modified;
        return this;
    }

    /**
     * Get modified
     * @return modified
     **/

    public OffsetDateTime getModified() {
        return modified;
    }

    public void setModified(OffsetDateTime modified) {
        this.modified = modified;
    }

    public Relationship revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    /**
     * Get revoked
     * @return revoked
     **/

    public Boolean isRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public Relationship labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Relationship addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<String>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     **/

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Relationship externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public Relationship addExternalReferencesItem(ExternalReference externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<ExternalReference>();
        }
        this.externalReferences.add(externalReferencesItem);
        return this;
    }

    /**
     * Get externalReferences
     * @return externalReferences
     **/

    public List<ExternalReference> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public Relationship objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public Relationship addObjectMarkingRefsItem(String objectMarkingRefsItem) {
        if (this.objectMarkingRefs == null) {
            this.objectMarkingRefs = new ArrayList<String>();
        }
        this.objectMarkingRefs.add(objectMarkingRefsItem);
        return this;
    }

    /**
     * Get objectMarkingRefs
     * @return objectMarkingRefs
     **/

    public List<String> getObjectMarkingRefs() {
        return objectMarkingRefs;
    }

    public void setObjectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
    }

    public Relationship granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public Relationship addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
        if (this.granularMarkings == null) {
            this.granularMarkings = new ArrayList<GranularMarking>();
        }
        this.granularMarkings.add(granularMarkingsItem);
        return this;
    }

    /**
     * Get granularMarkings
     * @return granularMarkings
     **/

    public List<GranularMarking> getGranularMarkings() {
        return granularMarkings;
    }

    public void setGranularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Relationship relationship = (Relationship) o;
        return Objects.equals(this.relationshipType, relationship.relationshipType) &&
                Objects.equals(this.description, relationship.description) &&
                Objects.equals(this.sourceRef, relationship.sourceRef) &&
                Objects.equals(this.targetRef, relationship.targetRef) &&
                Objects.equals(this.created, relationship.created) &&
                Objects.equals(this.createdByRef, relationship.createdByRef) &&
                Objects.equals(this.modified, relationship.modified) &&
                Objects.equals(this.revoked, relationship.revoked) &&
                Objects.equals(this.labels, relationship.labels) &&
                Objects.equals(this.externalReferences, relationship.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, relationship.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, relationship.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationshipType, description, sourceRef, targetRef, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Relationship {\n");

        sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceRef: ").append(toIndentedString(sourceRef)).append("\n");
        sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    createdByRef: ").append(toIndentedString(createdByRef)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    objectMarkingRefs: ").append(toIndentedString(objectMarkingRefs)).append("\n");
        sb.append("    granularMarkings: ").append(toIndentedString(granularMarkings)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

