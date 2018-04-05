package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class MACAddress extends StixObservableCommonData
{
    @SerializedName("value")
    private String value = null;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "IPv4Address{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), value);
    }

}
