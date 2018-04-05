package com.cymose.stix.sdk.model.sdo;

import com.cymose.stix.sdk.model.StixCommonData;
import com.cymose.stix.sdk.model.cdt.ExternalReference;
import com.cymose.stix.sdk.model.cdt.KillChainPhase;
import com.cymose.stix.sdk.model.sdm.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Indicator extends StixCommonData {
    @SerializedName("name")
    private String name = null;
    @SerializedName("description")
    private String description = null;
    @SerializedName("pattern")
    private String pattern = null;
    @SerializedName("valid_from")
    private OffsetDateTime validFrom = null;
    @SerializedName("valid_until")
    private OffsetDateTime validUntil = null;
    @SerializedName("kill_chain_phases")
    private List<KillChainPhase> killChainPhases = null;
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

    public Indicator() {
        this.setType("indicator");
    }

    public Indicator name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Indicator description(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Indicator pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Indicator validFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public OffsetDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public Indicator validUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public OffsetDateTime getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public Indicator killChainPhases(List<KillChainPhase> killChainPhases) {
        this.killChainPhases = killChainPhases;
        return this;
    }

    public Indicator addKillChainPhasesItem(KillChainPhase killChainPhasesItem) {
        if (this.killChainPhases == null) {
            this.killChainPhases = new ArrayList<KillChainPhase>();
        }
        this.killChainPhases.add(killChainPhasesItem);
        return this;
    }

    public List<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }

    public void setKillChainPhases(List<KillChainPhase> killChainPhases) {
        this.killChainPhases = killChainPhases;
    }

    public Indicator created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public Indicator createdByRef(String createdByRef) {
        this.createdByRef = createdByRef;
        return this;
    }

    public String getCreatedByRef() {
        return createdByRef;
    }

    public void setCreatedByRef(String createdByRef) {
        this.createdByRef = createdByRef;
    }

    public Indicator modified(OffsetDateTime modified) {
        this.modified = modified;
        return this;
    }

    public OffsetDateTime getModified() {
        return modified;
    }

    public void setModified(OffsetDateTime modified) {
        this.modified = modified;
    }

    public Indicator revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    public Boolean isRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public Indicator labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Indicator addLabelsItem(String labelsItem) {
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

    public Indicator externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public Indicator addExternalReferencesItem(ExternalReference externalReferencesItem) {
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

    public Indicator objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public Indicator addObjectMarkingRefsItem(String objectMarkingRefsItem) {
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

    public Indicator granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public Indicator addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
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
        Indicator indicator = (Indicator) o;
        return Objects.equals(this.name, indicator.name) &&
                Objects.equals(this.description, indicator.description) &&
                Objects.equals(this.pattern, indicator.pattern) &&
                Objects.equals(this.validFrom, indicator.validFrom) &&
                Objects.equals(this.validUntil, indicator.validUntil) &&
                Objects.equals(this.killChainPhases, indicator.killChainPhases) &&
                Objects.equals(this.created, indicator.created) &&
                Objects.equals(this.createdByRef, indicator.createdByRef) &&
                Objects.equals(this.modified, indicator.modified) &&
                Objects.equals(this.revoked, indicator.revoked) &&
                Objects.equals(this.labels, indicator.labels) &&
                Objects.equals(this.externalReferences, indicator.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, indicator.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, indicator.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, pattern, validFrom, validUntil, killChainPhases, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Indicator {\n");
        sb.append("name: ").append(toIndentedString(name)).append("\n");
        sb.append("description: ").append(toIndentedString(description)).append("\n");
        sb.append("pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("killChainPhases: ").append(toIndentedString(killChainPhases)).append("\n");
        sb.append("created: ").append(toIndentedString(created)).append("\n");
        sb.append("createdByRef: ").append(toIndentedString(createdByRef)).append("\n");
        sb.append("modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("revoked: ").append(toIndentedString(revoked)).append("\n");
        sb.append("labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("objectMarkingRefs: ").append(toIndentedString(objectMarkingRefs)).append("\n");
        sb.append("granularMarkings: ").append(toIndentedString(granularMarkings)).append("\n");
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

