package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RasterImageFileExtension extends File
{
    @SerializedName("image_height")
    private String imageHeight;
    @SerializedName("image_width")
    private String imageWidth;
    @SerializedName("bits_per_pixel")
    private String bitsPerPixel;
    @SerializedName("image_compression_algorithm")
    private String imageCompressionAlgorithm;
    @SerializedName("exif_tags")
    private List exifTags;
}
