package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.Map;
import java.util.Objects;

public class StixObservableCommonData {

    @SerializedName("type")
    private String type = null;

    @SerializedName("extensions")//MAP
    private Map extensions = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map getExtensions() {
        return extensions;
    }

    public void setExtensions(Map extensions) {
        this.extensions = extensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StixObservableCommonData stixCommonData = (StixObservableCommonData) o;
        return Objects.equals(this.type, stixCommonData.type) &&
                Objects.equals(extensions, stixCommonData.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, type, extensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StixObservableCommonData {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(extensions)).append("\n");
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

