package com.cymose.stix.sdk.model.cdt;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class KillChainPhase {
    @SerializedName("kill_chain_name")
    private String killChainName = null;

    @SerializedName("phase_name")
    private String phaseName = null;

    public KillChainPhase killChainName(String killChainName) {
        this.killChainName = killChainName;
        return this;
    }

    public String getKillChainName() {
        return killChainName;
    }

    public void setKillChainName(String killChainName) {
        this.killChainName = killChainName;
    }

    public KillChainPhase phaseName(String phaseName) {
        this.phaseName = phaseName;
        return this;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillChainPhase killChainPhase = (KillChainPhase) o;
        return Objects.equals(this.killChainName, killChainPhase.killChainName) &&
                Objects.equals(this.phaseName, killChainPhase.phaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(killChainName, phaseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillChainPhase {\n");
        sb.append("killChainName: ").append(toIndentedString(killChainName)).append("\n");
        sb.append("phaseName: ").append(toIndentedString(phaseName)).append("\n");
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

