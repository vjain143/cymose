package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NTFSFile extends File
{
    @SerializedName("hashes")
    private String sid;
    @SerializedName("hashes")
    private List<AlternateDataStreamType> alternate_data_streams;
}
