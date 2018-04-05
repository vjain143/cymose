package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PDFFileExtension extends File
{
    @SerializedName("version")
    private String version;
    @SerializedName("is_optimized")
    private boolean isOptimized;
    @SerializedName("document_info_dict")
    private List documentInfoDict;
    @SerializedName("pdfid0")
    private String pdfid0;
    @SerializedName("pdfid1")
    private String pdfid1;
}
