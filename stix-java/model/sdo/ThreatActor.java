package com.cymose.stix.sdk.model.sdo;

import com.cymose.stix.sdk.model.cdt.ExternalReference;
import com.cymose.stix.sdk.model.sdm.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ThreatActor {
    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("alias")

    private List<String> alias = null;

    @SerializedName("roles")

    private List<String> roles = null;

    @SerializedName("goals")

    private List<String> goals = null;

    @SerializedName("sophistication")
    private String sophistication = null;

    @SerializedName("resource_level")
    private String resourceLevel = null;

    @SerializedName("primary_motivation")
    private String primaryMotivation = null;

    @SerializedName("secondary_motivations")

    private List<String> secondaryMotivations = null;

    @SerializedName("personal_motivations")

    private List<String> personalMotivations = null;

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

    public ThreatActor name(String name) {
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

    public ThreatActor description(String description) {
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

    public ThreatActor alias(List<String> alias) {
        this.alias = alias;
        return this;
    }

    public ThreatActor addAliasItem(String aliasItem) {
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

    public ThreatActor roles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public ThreatActor addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<String>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * Get roles
     * @return roles
     **/

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public ThreatActor goals(List<String> goals) {
        this.goals = goals;
        return this;
    }

    public ThreatActor addGoalsItem(String goalsItem) {
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

    public ThreatActor sophistication(String sophistication) {
        this.sophistication = sophistication;
        return this;
    }

    /**
     * Get sophistication
     * @return sophistication
     **/

    public String getSophistication() {
        return sophistication;
    }

    public void setSophistication(String sophistication) {
        this.sophistication = sophistication;
    }

    public ThreatActor resourceLevel(String resourceLevel) {
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

    public ThreatActor primaryMotivation(String primaryMotivation) {
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

    public ThreatActor secondaryMotivations(List<String> secondaryMotivations) {
        this.secondaryMotivations = secondaryMotivations;
        return this;
    }

    public ThreatActor addSecondaryMotivationsItem(String secondaryMotivationsItem) {
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

    public ThreatActor personalMotivations(List<String> personalMotivations) {
        this.personalMotivations = personalMotivations;
        return this;
    }

    public ThreatActor addPersonalMotivationsItem(String personalMotivationsItem) {
        if (this.personalMotivations == null) {
            this.personalMotivations = new ArrayList<String>();
        }
        this.personalMotivations.add(personalMotivationsItem);
        return this;
    }

    /**
     * Get personalMotivations
     * @return personalMotivations
     **/

    public List<String> getPersonalMotivations() {
        return personalMotivations;
    }

    public void setPersonalMotivations(List<String> personalMotivations) {
        this.personalMotivations = personalMotivations;
    }

    public ThreatActor created(OffsetDateTime created) {
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

    public ThreatActor createdByRef(String createdByRef) {
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

    public ThreatActor modified(OffsetDateTime modified) {
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

    public ThreatActor revoked(Boolean revoked) {
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

    public ThreatActor labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ThreatActor addLabelsItem(String labelsItem) {
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

    public ThreatActor externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public ThreatActor addExternalReferencesItem(ExternalReference externalReferencesItem) {
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

    public ThreatActor objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public ThreatActor addObjectMarkingRefsItem(String objectMarkingRefsItem) {
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

    public ThreatActor granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public ThreatActor addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
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
        ThreatActor threatActor = (ThreatActor) o;
        return Objects.equals(this.name, threatActor.name) &&
                Objects.equals(this.description, threatActor.description) &&
                Objects.equals(this.alias, threatActor.alias) &&
                Objects.equals(this.roles, threatActor.roles) &&
                Objects.equals(this.goals, threatActor.goals) &&
                Objects.equals(this.sophistication, threatActor.sophistication) &&
                Objects.equals(this.resourceLevel, threatActor.resourceLevel) &&
                Objects.equals(this.primaryMotivation, threatActor.primaryMotivation) &&
                Objects.equals(this.secondaryMotivations, threatActor.secondaryMotivations) &&
                Objects.equals(this.personalMotivations, threatActor.personalMotivations) &&
                Objects.equals(this.created, threatActor.created) &&
                Objects.equals(this.createdByRef, threatActor.createdByRef) &&
                Objects.equals(this.modified, threatActor.modified) &&
                Objects.equals(this.revoked, threatActor.revoked) &&
                Objects.equals(this.labels, threatActor.labels) &&
                Objects.equals(this.externalReferences, threatActor.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, threatActor.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, threatActor.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, alias, roles, goals, sophistication, resourceLevel, primaryMotivation, secondaryMotivations, personalMotivations, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreatActor {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
        sb.append("    sophistication: ").append(toIndentedString(sophistication)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    primaryMotivation: ").append(toIndentedString(primaryMotivation)).append("\n");
        sb.append("    secondaryMotivations: ").append(toIndentedString(secondaryMotivations)).append("\n");
        sb.append("    personalMotivations: ").append(toIndentedString(personalMotivations)).append("\n");
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

