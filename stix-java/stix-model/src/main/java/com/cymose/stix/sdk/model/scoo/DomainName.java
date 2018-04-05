package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DomainName extends StixObservableCommonData
{
    @SerializedName("value")
    private String value = null;
    @SerializedName("resolves_to_refs")
    private List<StixObservableCommonData> resolvesToRef = null;
}
