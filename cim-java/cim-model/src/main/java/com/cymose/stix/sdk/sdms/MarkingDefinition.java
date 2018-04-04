package com.cymose.stix.sdk.sdms;

import com.cymose.stix.sdk.cdts.ExternalReference;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MarkingDefinition {
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

    public MarkingDefinition created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public MarkingDefinition createdByRef(String createdByRef) {
        this.createdByRef = createdByRef;
        return this;
    }

    public String getCreatedByRef() {
        return createdByRef;
    }

    public void setCreatedByRef(String createdByRef) {
        this.createdByRef = createdByRef;
    }

    public MarkingDefinition modified(OffsetDateTime modified) {
        this.modified = modified;
        return this;
    }

    public OffsetDateTime getModified() {
        return modified;
    }

    public void setModified(OffsetDateTime modified) {
        this.modified = modified;
    }

    public MarkingDefinition revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    public Boolean isRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public MarkingDefinition labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public MarkingDefinition addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<String>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public MarkingDefinition externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public MarkingDefinition addExternalReferencesItem(ExternalReference externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<ExternalReference>();
        }
        this.externalReferences.add(externalReferencesItem);
        return this;
    }

    public List<ExternalReference> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public MarkingDefinition objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public MarkingDefinition addObjectMarkingRefsItem(String objectMarkingRefsItem) {
        if (this.objectMarkingRefs == null) {
            this.objectMarkingRefs = new ArrayList<String>();
        }
        this.objectMarkingRefs.add(objectMarkingRefsItem);
        return this;
    }

    public List<String> getObjectMarkingRefs() {
        return objectMarkingRefs;
    }

    public void setObjectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
    }

    public MarkingDefinition granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public MarkingDefinition addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
        if (this.granularMarkings == null) {
            this.granularMarkings = new ArrayList<GranularMarking>();
        }
        this.granularMarkings.add(granularMarkingsItem);
        return this;
    }

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
        MarkingDefinition markingDefinition = (MarkingDefinition) o;
        return Objects.equals(this.created, markingDefinition.created) &&
                Objects.equals(this.createdByRef, markingDefinition.createdByRef) &&
                Objects.equals(this.modified, markingDefinition.modified) &&
                Objects.equals(this.revoked, markingDefinition.revoked) &&
                Objects.equals(this.labels, markingDefinition.labels) &&
                Objects.equals(this.externalReferences, markingDefinition.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, markingDefinition.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, markingDefinition.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkingDefinition {\n");

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

