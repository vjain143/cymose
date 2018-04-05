package com.cymose.stix.sdk.model.sdo;

import com.cymose.stix.sdk.model.cdt.ExternalReference;
import com.cymose.stix.sdk.model.sdm.GranularMarking;
import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Identity {
    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("identity_class")
    private String identityClass = null;

    @SerializedName("sectors")

    private List<String> sectors = null;

    @SerializedName("contact_information")
    private String contactInformation = null;

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

    public Identity name(String name) {
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

    public Identity description(String description) {
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

    public Identity identityClass(String identityClass) {
        this.identityClass = identityClass;
        return this;
    }

    /**
     * Get identityClass
     * @return identityClass
     **/

    public String getIdentityClass() {
        return identityClass;
    }

    public void setIdentityClass(String identityClass) {
        this.identityClass = identityClass;
    }

    public Identity sectors(List<String> sectors) {
        this.sectors = sectors;
        return this;
    }

    public Identity addSectorsItem(String sectorsItem) {
        if (this.sectors == null) {
            this.sectors = new ArrayList<String>();
        }
        this.sectors.add(sectorsItem);
        return this;
    }

    /**
     * Get sectors
     * @return sectors
     **/

    public List<String> getSectors() {
        return sectors;
    }

    public void setSectors(List<String> sectors) {
        this.sectors = sectors;
    }

    public Identity contactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    /**
     * Get contactInformation
     * @return contactInformation
     **/

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Identity created(OffsetDateTime created) {
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

    public Identity createdByRef(String createdByRef) {
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

    public Identity modified(OffsetDateTime modified) {
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

    public Identity revoked(Boolean revoked) {
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

    public Identity labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Identity addLabelsItem(String labelsItem) {
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

    public Identity externalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public Identity addExternalReferencesItem(ExternalReference externalReferencesItem) {
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

    public Identity objectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
        return this;
    }

    public Identity addObjectMarkingRefsItem(String objectMarkingRefsItem) {
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

    public Identity granularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
        return this;
    }

    public Identity addGranularMarkingsItem(GranularMarking granularMarkingsItem) {
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
        Identity identity = (Identity) o;
        return Objects.equals(this.name, identity.name) &&
                Objects.equals(this.description, identity.description) &&
                Objects.equals(this.identityClass, identity.identityClass) &&
                Objects.equals(this.sectors, identity.sectors) &&
                Objects.equals(this.contactInformation, identity.contactInformation) &&
                Objects.equals(this.created, identity.created) &&
                Objects.equals(this.createdByRef, identity.createdByRef) &&
                Objects.equals(this.modified, identity.modified) &&
                Objects.equals(this.revoked, identity.revoked) &&
                Objects.equals(this.labels, identity.labels) &&
                Objects.equals(this.externalReferences, identity.externalReferences) &&
                Objects.equals(this.objectMarkingRefs, identity.objectMarkingRefs) &&
                Objects.equals(this.granularMarkings, identity.granularMarkings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, identityClass, sectors, contactInformation, created, createdByRef, modified, revoked, labels, externalReferences, objectMarkingRefs, granularMarkings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Identity {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    identityClass: ").append(toIndentedString(identityClass)).append("\n");
        sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
        sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
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

