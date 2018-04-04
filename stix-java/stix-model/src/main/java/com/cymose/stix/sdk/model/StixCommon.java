package com.cymose.stix.sdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class StixCommon {
    @SerializedName("data")
    private StixCommonData data = null;

    public StixCommon data(StixCommonData data) {
        this.data = data;
        return this;
    }

    public StixCommonData getData() {
        return data;
    }

    public void setData(StixCommonData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StixCommon stixCommon = (StixCommon) o;
        return Objects.equals(this.data, stixCommon.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StixCommon {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

