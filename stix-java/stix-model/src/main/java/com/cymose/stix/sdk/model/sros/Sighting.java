package com.cymose.stix.sdk.model.sros;

import com.cymose.stix.sdk.model.cdts.ExternalReference;
import com.cymose.stix.sdk.model.sdms.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sighting {
    @SerializedName("first_seen")
    private OffsetDateTime firstSeen = null;

    @SerializedName("last_seen")
    private OffsetDateTime lastSeen = null;

    @SerializedName("count")
    private Integer count = null;

    @SerializedName("sighting_of_ref")
    private String sightingOfRef = null;

    @SerializedName("observed_data_refs")

    private List<String> observedDataRefs = null;

    @SerializedName("where_sighted_refs")

    private List<String> whereSightedRefs = null;

    @SerializedName("summary")
    private Boolean summary = null;

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

    public Sighting firstSeen(OffsetDateTime firstSeen) {
        this.firstSeen = firstSeen;
        return this;
    }

    /**
     * Get firstSeen
     * @return firstSeen
     **/

    public OffsetDateTime getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(OffsetDateTime firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Sighting lastSeen(OffsetDateTime lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    /**
     * Get lastSeen
     * @return lastSeen
     **/

    public OffsetDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(OffsetDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Sighting count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     **/

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Sighting sightingOfRef(String sightingOfRef) {
        this.sightingOfRef = sightingOfRef;
        return this;
    }

    /**
     * Get sightingOfRef
     * @return sightingOfRef
     **/

    public String getSightingOfRef() {
        return sightingOfRef;
    }

    public void setSightingOfRef(String sightingOfRef) {
        this.sightingOfRef = sightingOfRef;
    }

    public Sighting observedDataRefs(List<String> observedDataRefs) {
        this.observedDataRefs = observedDataRefs;
        return this;
    }

    public Sighting addObservedDataRefsItem(String observedDataRefsItem) {
        if (this.observedDataRefs == null) {
            this.observedDataRefs = new ArrayList<String>();
        }
        this.observedDataRefs.add(observedDataRefsItem);
        return this;
    }

    /**
     * Get observedDataRefs
     * @return observedDataRefs
     **/

    public List<String> getObservedDataRefs() {
        return observedDataRefs;
    }

    public void setObservedDataRefs(List<String> observedDataRefs) {
        this.observedDataRefs = observedDataRefs;
    }

    public Sighting whereSightedRefs(List<String> whereSightedRefs) {
        this.whereSightedRefs = whereSightedRefs;
        return this;
    }

    public Sighting addWhereSightedRefsItem(String whereSightedRefsItem) {
        if (this.whereSightedRefs == null) {
            this.whereSightedRefs = new ArrayList<String>();
        }
        this.whereSightedRefs.add(whereSightedRefsItem);
        return this;
    }

    /**
     * Get whereSightedRefs
     * @return whereSightedRefs
     **/

    public List<String> getWhereSightedRefs() {
        return whereSightedRefs;
    }

    public void setWhereSightedRefs(List<String> whereSightedRefs) {
        this.whereSightedRefs = whereSightedRefs;
    }

    public Sighting summary(Boolean summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     * @return summary
     **/

    public Boolean isSummary() {
        return summary;
    }

    public void setSummary(Boolean summary) {
        this.summary = summary;
    }

    public Sighting created(OffsetDateTime created) {
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

    public Sighting createdByRef(String createdByRef) {
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

    public Sighting modified(OffsetDateTime modified) {
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

    public Sighting revoked(Boolean revoked) {
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

    public Sighting labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Sighting addLabelsItem(String labelsItem) {
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

    public Sighting externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public Sighting addExternalReferencesItem(ExternalReference externalReferencesItem) {
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

    public Sighting objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public Sighting addObjectMarkingRefsItem(String objectMarkingRefsItem) {
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

    public Sighting granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public Sighting addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
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
        Sighting sighting = (Sighting) o;
        return Objects.equals(this.firstSeen, sighting.firstSeen) &&
                Objects.equals(this.lastSeen, sighting.lastSeen) &&
                Objects.equals(this.count, sighting.count) &&
                Objects.equals(this.sightingOfRef, sighting.sightingOfRef) &&
                Objects.equals(this.observedDataRefs, sighting.observedDataRefs) &&
                Objects.equals(this.whereSightedRefs, sighting.whereSightedRefs) &&
                Objects.equals(this.summary, sighting.summary) &&
                Objects.equals(this.created, sighting.created) &&
                Objects.equals(this.createdByRef, sighting.createdByRef) &&
                Objects.equals(this.modified, sighting.modified) &&
                Objects.equals(this.revoked, sighting.revoked) &&
                Objects.equals(this.labels, sighting.labels) &&
                Objects.equals(this.externalReferences, sighting.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, sighting.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, sighting.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSeen, lastSeen, count, sightingOfRef, observedDataRefs, whereSightedRefs, summary, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sighting {\n");

        sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
        sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    sightingOfRef: ").append(toIndentedString(sightingOfRef)).append("\n");
        sb.append("    observedDataRefs: ").append(toIndentedString(observedDataRefs)).append("\n");
        sb.append("    whereSightedRefs: ").append(toIndentedString(whereSightedRefs)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

