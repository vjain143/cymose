package com.cymose.stix.sdk.model.sdm;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GranularMarking {
    @SerializedName("marking_ref")
    private String markingRef = null;

    @SerializedName("selectors")
    private List<String> selectors = null;

    public GranularMarking markingRef(String markingRef) {
        this.markingRef = markingRef;
        return this;
    }

    public String getMarkingRef() {
        return markingRef;
    }

    public void setMarkingRef(String markingRef) {
        this.markingRef = markingRef;
    }

    public GranularMarking selectors(List<String> selectors) {
        this.selectors = selectors;
        return this;
    }

    public GranularMarking addSelectorsItem(String selectorsItem) {
        if (this.selectors == null) {
            this.selectors = new ArrayList<String>();
        }
        this.selectors.add(selectorsItem);
        return this;
    }

    public List<String> getSelectors() {
        return selectors;
    }

    public void setSelectors(List<String> selectors) {
        this.selectors = selectors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GranularMarking granularMarking = (GranularMarking) o;
        return Objects.equals(this.markingRef, granularMarking.markingRef) &&
                Objects.equals(this.selectors, granularMarking.selectors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markingRef, selectors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GranularMarking {\n");

        sb.append("markingRef: ").append(toIndentedString(markingRef)).append("\n");
        sb.append("selectors: ").append(toIndentedString(selectors)).append("\n");
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

