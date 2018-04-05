package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

public class EmailMIME extends StixObservableCommonData
{
    @SerializedName("body")
    private String body;
    @SerializedName("body_raw_ref")
    private StixObservableCommonData bodyRawRef;
    @SerializedName("content_type")
    private String contentType;
    @SerializedName("content_type")
    private String contentDisposition;
}
