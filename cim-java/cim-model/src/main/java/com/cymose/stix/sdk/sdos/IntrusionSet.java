package com.cymose.stix.sdk.sdos;

import com.cymose.stix.sdk.cdts.ExternalReference;
import com.cymose.stix.sdk.sdms.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntrusionSet {
    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("alias")

    private List<String> alias = null;

    @SerializedName("first_seen")
    private OffsetDateTime firstSeen = null;

    @SerializedName("last_seen")
    private OffsetDateTime lastSeen = null;

    @SerializedName("goals")
    private List<String> goals = null;

    @SerializedName("primary_motivation")
    private String primaryMotivation = null;

    @SerializedName("secondary_motivations")
    private List<String> secondaryMotivations = null;

    @SerializedName("resource_level")
    private String resourceLevel = null;

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

    public IntrusionSet name(String name) {
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

    public IntrusionSet description(String description) {
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

    public IntrusionSet alias(List<String> alias) {
        this.alias = alias;
        return this;
    }

    public IntrusionSet addAliasItem(String aliasItem) {
        if (this.alias == null) {
            this.alias = new ArrayList<String>();
        }
        this.alias.add(aliasItem);
        return this;
    }

    /**
     * Get alias
     * @return alias
     **/

    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public IntrusionSet firstSeen(OffsetDateTime firstSeen) {
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

    public IntrusionSet lastSeen(OffsetDateTime lastSeen) {
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

    public IntrusionSet goals(List<String> goals) {
        this.goals = goals;
        return this;
    }

    public IntrusionSet addGoalsItem(String goalsItem) {
        if (this.goals == null) {
            this.goals = new ArrayList<String>();
        }
        this.goals.add(goalsItem);
        return this;
    }

    /**
     * Get goals
     * @return goals
     **/

    public List<String> getGoals() {
        return goals;
    }

    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    public IntrusionSet primaryMotivation(String primaryMotivation) {
        this.primaryMotivation = primaryMotivation;
        return this;
    }

    /**
     * Get primaryMotivation
     * @return primaryMotivation
     **/

    public String getPrimaryMotivation() {
        return primaryMotivation;
    }

    public void setPrimaryMotivation(String primaryMotivation) {
        this.primaryMotivation = primaryMotivation;
    }

    public IntrusionSet secondaryMotivations(List<String> secondaryMotivations) {
        this.secondaryMotivations = secondaryMotivations;
        return this;
    }

    public IntrusionSet addSecondaryMotivationsItem(String secondaryMotivationsItem) {
        if (this.secondaryMotivations == null) {
            this.secondaryMotivations = new ArrayList<String>();
        }
        this.secondaryMotivations.add(secondaryMotivationsItem);
        return this;
    }

    /**
     * Get secondaryMotivations
     * @return secondaryMotivations
     **/

    public List<String> getSecondaryMotivations() {
        return secondaryMotivations;
    }

    public void setSecondaryMotivations(List<String> secondaryMotivations) {
        this.secondaryMotivations = secondaryMotivations;
    }

    public IntrusionSet resourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * Get resourceLevel
     * @return resourceLevel
     **/

    public String getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public IntrusionSet created(OffsetDateTime created) {
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

    public IntrusionSet createdByRef(String createdByRef) {
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

    public IntrusionSet modified(OffsetDateTime modified) {
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

    public IntrusionSet revoked(Boolean revoked) {
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

    public IntrusionSet labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public IntrusionSet addLabelsItem(String labelsItem) {
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

    public IntrusionSet externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public IntrusionSet addExternalReferencesItem(ExternalReference externalReferencesItem) {
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

    public IntrusionSet objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public IntrusionSet addObjectMarkingRefsItem(String objectMarkingRefsItem) {
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

    public IntrusionSet granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public IntrusionSet addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
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
        IntrusionSet intrusionSet = (IntrusionSet) o;
        return Objects.equals(this.name, intrusionSet.name) &&
                Objects.equals(this.description, intrusionSet.description) &&
                Objects.equals(this.alias, intrusionSet.alias) &&
                Objects.equals(this.firstSeen, intrusionSet.firstSeen) &&
                Objects.equals(this.lastSeen, intrusionSet.lastSeen) &&
                Objects.equals(this.goals, intrusionSet.goals) &&
                Objects.equals(this.primaryMotivation, intrusionSet.primaryMotivation) &&
                Objects.equals(this.secondaryMotivations, intrusionSet.secondaryMotivations) &&
                Objects.equals(this.resourceLevel, intrusionSet.resourceLevel) &&
                Objects.equals(this.created, intrusionSet.created) &&
                Objects.equals(this.createdByRef, intrusionSet.createdByRef) &&
                Objects.equals(this.modified, intrusionSet.modified) &&
                Objects.equals(this.revoked, intrusionSet.revoked) &&
                Objects.equals(this.labels, intrusionSet.labels) &&
                Objects.equals(this.externalReferences, intrusionSet.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, intrusionSet.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, intrusionSet.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, alias, firstSeen, lastSeen, goals, primaryMotivation, secondaryMotivations, resourceLevel, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntrusionSet {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
        sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
        sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
        sb.append("    primaryMotivation: ").append(toIndentedString(primaryMotivation)).append("\n");
        sb.append("    secondaryMotivations: ").append(toIndentedString(secondaryMotivations)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
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

