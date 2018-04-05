package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class IPv4Address extends StixObservableCommonData
{
    @SerializedName("value")
    private String value = null;
    @SerializedName("resolves_to_refs")
    private List<StixObservableCommonData> resolvesToRef = null;
    @SerializedName("belongs_to_refs")
    private List<StixObservableCommonData> belongsToRef = null;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<StixObservableCommonData> getResolvesToRef() {
        return resolvesToRef;
    }

    public void setResolvesToRef(List<StixObservableCommonData> resolvesToRef) {
        this.resolvesToRef = resolvesToRef;
    }

    public List<StixObservableCommonData> getBelongsToRef() {
        return belongsToRef;
    }

    public void setBelongsToRef(List<StixObservableCommonData> belongsToRef) {
        this.belongsToRef = belongsToRef;
    }

    @Override
    public String toString() {
        return "IPv4Address{" +
                "value='" + value + '\'' +
                ", resolvesToRef=" + resolvesToRef +
                ", belongsToRef=" + belongsToRef +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), value, resolvesToRef, belongsToRef);
    }
}
