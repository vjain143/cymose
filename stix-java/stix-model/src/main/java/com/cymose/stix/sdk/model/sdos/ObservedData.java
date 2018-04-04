package com.cymose.stix.sdk.model.sdos;

import com.cymose.stix.sdk.model.cdts.ExternalReference;
import com.cymose.stix.sdk.model.sdms.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObservedData {
    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("first_observed")
    private OffsetDateTime firstObserved = null;

    @SerializedName("last_observed")
    private OffsetDateTime lastObserved = null;

    @SerializedName("number_observed")
    private Integer numberObserved = null;

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

    public ObservedData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObservedData description(String description) {
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

    public ObservedData firstObserved(OffsetDateTime firstObserved) {
        this.firstObserved = firstObserved;
        return this;
    }

    /**
     * Get firstObserved
     * @return firstObserved
     **/

    public OffsetDateTime getFirstObserved() {
        return firstObserved;
    }

    public void setFirstObserved(OffsetDateTime firstObserved) {
        this.firstObserved = firstObserved;
    }

    public ObservedData lastObserved(OffsetDateTime lastObserved) {
        this.lastObserved = lastObserved;
        return this;
    }

    /**
     * Get lastObserved
     * @return lastObserved
     **/

    public OffsetDateTime getLastObserved() {
        return lastObserved;
    }

    public void setLastObserved(OffsetDateTime lastObserved) {
        this.lastObserved = lastObserved;
    }

    public ObservedData numberObserved(Integer numberObserved) {
        this.numberObserved = numberObserved;
        return this;
    }

    /**
     * Get numberObserved
     * @return numberObserved
     **/

    public Integer getNumberObserved() {
        return numberObserved;
    }

    public void setNumberObserved(Integer numberObserved) {
        this.numberObserved = numberObserved;
    }

    public ObservedData created(OffsetDateTime created) {
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

    public ObservedData createdByRef(String createdByRef) {
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

    public ObservedData modified(OffsetDateTime modified) {
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

    public ObservedData revoked(Boolean revoked) {
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

    public ObservedData labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ObservedData addLabelsItem(String labelsItem) {
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

    public ObservedData externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public ObservedData addExternalReferencesItem(ExternalReference externalReferencesItem) {
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

    public ObservedData objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public ObservedData addObjectMarkingRefsItem(String objectMarkingRefsItem) {
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

    public ObservedData granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public ObservedData addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
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
        ObservedData observedData = (ObservedData) o;
        return Objects.equals(this.name, observedData.name) &&
                Objects.equals(this.description, observedData.description) &&
                Objects.equals(this.firstObserved, observedData.firstObserved) &&
                Objects.equals(this.lastObserved, observedData.lastObserved) &&
                Objects.equals(this.numberObserved, observedData.numberObserved) &&
                Objects.equals(this.created, observedData.created) &&
                Objects.equals(this.createdByRef, observedData.createdByRef) &&
                Objects.equals(this.modified, observedData.modified) &&
                Objects.equals(this.revoked, observedData.revoked) &&
                Objects.equals(this.labels, observedData.labels) &&
                Objects.equals(this.externalReferences, observedData.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, observedData.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, observedData.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, firstObserved, lastObserved, numberObserved, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObservedData {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    firstObserved: ").append(toIndentedString(firstObserved)).append("\n");
        sb.append("    lastObserved: ").append(toIndentedString(lastObserved)).append("\n");
        sb.append("    numberObserved: ").append(toIndentedString(numberObserved)).append("\n");
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

