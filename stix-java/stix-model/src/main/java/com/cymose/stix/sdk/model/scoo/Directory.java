package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.List;
import java.util.Objects;

public class Directory extends StixObservableCommonData
{
    @SerializedName("path")
    private String path = null;
    @SerializedName("path_enc")
    private String pathEncoded = null;
    @SerializedName("created")
    private OffsetDateTime created = null;
    @SerializedName("modified")
    private OffsetDateTime modified = null;
    @SerializedName("accessed")
    private OffsetDateTime accessed = null;
    @SerializedName("contains_refs")
    private List<StixObservableCommonData> containsReferences = null;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPathEncoded() {
        return pathEncoded;
    }

    public void setPathEncoded(String pathEncoded) {
        this.pathEncoded = pathEncoded;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public OffsetDateTime getModified() {
        return modified;
    }

    public void setModified(OffsetDateTime modified) {
        this.modified = modified;
    }

    public OffsetDateTime getAccessed() {
        return accessed;
    }

    public void setAccessed(OffsetDateTime accessed) {
        this.accessed = accessed;
    }

    public List<StixObservableCommonData> getContainsReferences() {
        return containsReferences;
    }

    public void setContainsReferences(List<StixObservableCommonData> containsReferences) {
        this.containsReferences = containsReferences;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "path='" + path + '\'' +
                ", pathEncoded='" + pathEncoded + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", accessed=" + accessed +
                ", containsReferences=" + containsReferences +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), path, pathEncoded, created, modified, accessed, containsReferences);
    }
}
