package com.cymose.stix.sdk.cdts;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class ExternalReference {
    @SerializedName("external_id")
    private String externalId = null;

    @SerializedName("source_name")
    private String sourceName = null;

    @SerializedName("url")
    private String url = null;

    //FIXME

    public ExternalReference externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public ExternalReference sourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public ExternalReference url(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalReference externalReference = (ExternalReference) o;
        return Objects.equals(this.externalId, externalReference.externalId) &&
                Objects.equals(this.sourceName, externalReference.sourceName) &&
                Objects.equals(this.url, externalReference.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, sourceName, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalReference {\n");
        sb.append("externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

