package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmailAddress extends StixObservableCommonData
{
    @SerializedName("value")
    private String value = null;
    @SerializedName("display_name")
    private String displayName = null;
    @SerializedName("belongs_to_refs")
    private StixObservableCommonData belongsToRef = null;
}
