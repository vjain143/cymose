package com.cymose.stix.sdk.sdos;

import com.cymose.stix.sdk.cdts.ExternalReference;
import com.cymose.stix.sdk.sdms.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Campaign {
    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("aliases")

    private List<String> aliases = null;

    @SerializedName("first_seen")
    private OffsetDateTime firstSeen = null;

    @SerializedName("last_seen")
    private OffsetDateTime lastSeen = null;

    @SerializedName("objective")
    private String objective = null;

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

    public Campaign name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Campaign description(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Campaign aliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public Campaign addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<String>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Campaign firstSeen(OffsetDateTime firstSeen) {
        this.firstSeen = firstSeen;
        return this;
    }

    public OffsetDateTime getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(OffsetDateTime firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Campaign lastSeen(OffsetDateTime lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    public OffsetDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(OffsetDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Campaign objective(String objective) {
        this.objective = objective;
        return this;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Campaign created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public Campaign createdByRef(String createdByRef) {
        this.createdByRef = createdByRef;
        return this;
    }

    public String getCreatedByRef() {
        return createdByRef;
    }

    public void setCreatedByRef(String createdByRef) {
        this.createdByRef = createdByRef;
    }

    public Campaign modified(OffsetDateTime modified) {
        this.modified = modified;
        return this;
    }

    public OffsetDateTime getModified() {
        return modified;
    }

    public void setModified(OffsetDateTime modified) {
        this.modified = modified;
    }

    public Campaign revoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    public Boolean isRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public Campaign labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Campaign addLabelsItem(String labelsItem) {
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

    public Campaign externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public Campaign addExternalReferencesItem(ExternalReference externalReferencesItem) {
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

    public Campaign objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public Campaign addObjectMarkingRefsItem(String objectMarkingRefsItem) {
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

    public Campaign granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public Campaign addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
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
        Campaign campaign = (Campaign) o;
        return Objects.equals(this.name, campaign.name) &&
                Objects.equals(this.description, campaign.description) &&
                Objects.equals(this.aliases, campaign.aliases) &&
                Objects.equals(this.firstSeen, campaign.firstSeen) &&
                Objects.equals(this.lastSeen, campaign.lastSeen) &&
                Objects.equals(this.objective, campaign.objective) &&
                Objects.equals(this.created, campaign.created) &&
                Objects.equals(this.createdByRef, campaign.createdByRef) &&
                Objects.equals(this.modified, campaign.modified) &&
                Objects.equals(this.revoked, campaign.revoked) &&
                Objects.equals(this.labels, campaign.labels) &&
                Objects.equals(this.externalReferences, campaign.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, campaign.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, campaign.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, aliases, firstSeen, lastSeen, objective, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Campaign {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
        sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
        sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
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

