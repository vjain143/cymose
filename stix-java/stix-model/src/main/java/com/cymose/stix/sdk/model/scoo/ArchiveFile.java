package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

public class ArchiveFile extends File
{
    @SerializedName("contains_refs")
    private StixObservableCommonData containsRefs;
    @SerializedName("version")
    private String version;
    @SerializedName("comment")
    private String comment;
}
