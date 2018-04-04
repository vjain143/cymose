package com.cymose.stix.sdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StixBundle {
    @SerializedName("type")
    private String type = null;
    @SerializedName("id")
    private String id = null;
    @SerializedName("spec_version")
    private String specVersion = null;
    @SerializedName("objects")
    private List<Object> objects = null;

    //FIXME
    public StixBundle() {
        this.setType("bundle");
    }

    public StixBundle type(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StixBundle id(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StixBundle specVersion(String specVersion) {
        this.specVersion = specVersion;
        return this;
    }

    public String getSpecVersion() {
        return specVersion;
    }

    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
    }

    public StixBundle objects(List<Object> objects) {
        this.objects = objects;
        return this;
    }

    public StixBundle addObjectsItem(Object objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<Object>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StixBundle stixBundle = (StixBundle) o;
        return Objects.equals(this.type, stixBundle.type) &&
                Objects.equals(this.id, stixBundle.id) &&
                Objects.equals(this.specVersion, stixBundle.specVersion) &&
                Objects.equals(this.objects, stixBundle.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, specVersion, objects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StixBundle {\n");

        sb.append("type: ").append(toIndentedString(type)).append("\n");
        sb.append("id: ").append(toIndentedString(id)).append("\n");
        sb.append("specVersion: ").append(toIndentedString(specVersion)).append("\n");
        sb.append("objects: ").append(toIndentedString(objects)).append("\n");
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

