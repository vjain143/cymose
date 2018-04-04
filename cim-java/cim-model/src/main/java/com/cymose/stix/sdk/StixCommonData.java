package com.cymose.stix.sdk;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class StixCommonData {
    @SerializedName("id")
    private String id = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("attributes")
    private StixCommonDataAttributes attributes = null;

    public StixCommonData id(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StixCommonData type(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StixCommonData attributes(StixCommonDataAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public StixCommonDataAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(StixCommonDataAttributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StixCommonData stixCommonData = (StixCommonData) o;
        return Objects.equals(this.id, stixCommonData.id) &&
                Objects.equals(this.type, stixCommonData.type) &&
                Objects.equals(this.attributes, stixCommonData.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StixCommonData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

