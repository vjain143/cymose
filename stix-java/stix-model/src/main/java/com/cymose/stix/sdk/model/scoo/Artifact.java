package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Artifact extends StixObservableCommonData
{
    @SerializedName("mime_type")
    private String mimeType = null;

    @SerializedName("payload_bin")
    private String payloadBin = null;

    @SerializedName("url")
    private String url = null;

    @SerializedName("hashes")
    private List hashes = null;

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getPayloadBin() {
        return payloadBin;
    }

    public void setPayloadBin(String payloadBin) {
        this.payloadBin = payloadBin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List getHashes() {
        return hashes;
    }

    public void setHashes(List hashes) {
        this.hashes = hashes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mimeType,payloadBin,url,hashes);
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "mimeType='" + mimeType + '\'' +
                ", payloadBin='" + payloadBin + '\'' +
                ", url='" + url + '\'' +
                ", hashes=" + hashes +
                '}';
    }
}
