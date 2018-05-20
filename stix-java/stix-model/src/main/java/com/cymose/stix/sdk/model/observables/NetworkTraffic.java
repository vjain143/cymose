
package com.cymose.stix.sdk.model.observables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cymose.stix.sdk.model.common.CyberObservableCore;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * network-traffic
 * <p>
 * The Network Traffic Object represents arbitrary network traffic that originates from a source and is addressed to a destination.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "extensions",
    "start",
    "end",
    "src_ref",
    "dst_ref",
    "src_port",
    "dst_port",
    "protocols",
    "src_byte_count",
    "dst_byte_count",
    "src_packets",
    "dst_packets",
    "ipfix",
    "src_payload_ref",
    "dst_payload_ref",
    "encapsulates_refs",
    "encapsulated_by_ref"
})
public class NetworkTraffic extends CyberObservableCore {

    /**
     * The value of this property MUST be `network-traffic`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `network-traffic`.")
    private String type;
    @JsonProperty("extensions")
    private com.cymose.stix.sdk.model.common.Extensions extensions;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("start")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String start;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("end")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String end;
    /**
     * Specifies the source of the network traffic, as a reference to one or more Observable Objects.
     * 
     */
    @JsonProperty("src_ref")
    @JsonPropertyDescription("Specifies the source of the network traffic, as a reference to one or more Observable Objects.")
    private String srcRef;
    /**
     * Specifies the destination of the network traffic, as a reference to one or more Observable Objects.
     * 
     */
    @JsonProperty("dst_ref")
    @JsonPropertyDescription("Specifies the destination of the network traffic, as a reference to one or more Observable Objects.")
    private String dstRef;
    /**
     * Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     * 
     */
    @JsonProperty("src_port")
    @JsonPropertyDescription("Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.")
    private Integer srcPort;
    /**
     * Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     * 
     */
    @JsonProperty("dst_port")
    @JsonPropertyDescription("Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.")
    private Integer dstPort;
    /**
     * Specifies the protocols observed in the network traffic, along with their corresponding state.
     * (Required)
     * 
     */
    @JsonProperty("protocols")
    @JsonPropertyDescription("Specifies the protocols observed in the network traffic, along with their corresponding state.")
    private List<String> protocols = new ArrayList<String>();
    /**
     * Specifies the number of bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("src_byte_count")
    @JsonPropertyDescription("Specifies the number of bytes sent from the source to the destination.")
    private Integer srcByteCount;
    /**
     * Specifies the number of bytes sent from the destination to the source.
     * 
     */
    @JsonProperty("dst_byte_count")
    @JsonPropertyDescription("Specifies the number of bytes sent from the destination to the source.")
    private Integer dstByteCount;
    /**
     * Specifies the number of packets sent from the source to the destination.
     * 
     */
    @JsonProperty("src_packets")
    @JsonPropertyDescription("Specifies the number of packets sent from the source to the destination.")
    private Integer srcPackets;
    /**
     * Specifies the number of packets sent destination to the source.
     * 
     */
    @JsonProperty("dst_packets")
    @JsonPropertyDescription("Specifies the number of packets sent destination to the source.")
    private Integer dstPackets;
    @JsonProperty("ipfix")
    private Ipfix ipfix;
    /**
     * Specifies the bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("src_payload_ref")
    @JsonPropertyDescription("Specifies the bytes sent from the source to the destination.")
    private String srcPayloadRef;
    /**
     * Specifies the bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("dst_payload_ref")
    @JsonPropertyDescription("Specifies the bytes sent from the source to the destination.")
    private String dstPayloadRef;
    /**
     * Links to other network-traffic objects encapsulated by a network-traffic.
     * 
     */
    @JsonProperty("encapsulates_refs")
    @JsonPropertyDescription("Links to other network-traffic objects encapsulated by a network-traffic.")
    private List<String> encapsulatesRefs = new ArrayList<String>();
    /**
     * Links to another network-traffic object which encapsulates this object.
     * 
     */
    @JsonProperty("encapsulated_by_ref")
    @JsonPropertyDescription("Links to another network-traffic object which encapsulates this object.")
    private String encapsulatedByRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `network-traffic`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `network-traffic`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("extensions")
    public com.cymose.stix.sdk.model.common.Extensions getExtensions() {
        return extensions;
    }

    @JsonProperty("extensions")
    public void setExtensions(com.cymose.stix.sdk.model.common.Extensions extensions) {
        this.extensions = extensions;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * Specifies the source of the network traffic, as a reference to one or more Observable Objects.
     * 
     */
    @JsonProperty("src_ref")
    public String getSrcRef() {
        return srcRef;
    }

    /**
     * Specifies the source of the network traffic, as a reference to one or more Observable Objects.
     * 
     */
    @JsonProperty("src_ref")
    public void setSrcRef(String srcRef) {
        this.srcRef = srcRef;
    }

    /**
     * Specifies the destination of the network traffic, as a reference to one or more Observable Objects.
     * 
     */
    @JsonProperty("dst_ref")
    public String getDstRef() {
        return dstRef;
    }

    /**
     * Specifies the destination of the network traffic, as a reference to one or more Observable Objects.
     * 
     */
    @JsonProperty("dst_ref")
    public void setDstRef(String dstRef) {
        this.dstRef = dstRef;
    }

    /**
     * Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     * 
     */
    @JsonProperty("src_port")
    public Integer getSrcPort() {
        return srcPort;
    }

    /**
     * Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     * 
     */
    @JsonProperty("src_port")
    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    /**
     * Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     * 
     */
    @JsonProperty("dst_port")
    public Integer getDstPort() {
        return dstPort;
    }

    /**
     * Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     * 
     */
    @JsonProperty("dst_port")
    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    /**
     * Specifies the protocols observed in the network traffic, along with their corresponding state.
     * (Required)
     * 
     */
    @JsonProperty("protocols")
    public List<String> getProtocols() {
        return protocols;
    }

    /**
     * Specifies the protocols observed in the network traffic, along with their corresponding state.
     * (Required)
     * 
     */
    @JsonProperty("protocols")
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    /**
     * Specifies the number of bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("src_byte_count")
    public Integer getSrcByteCount() {
        return srcByteCount;
    }

    /**
     * Specifies the number of bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("src_byte_count")
    public void setSrcByteCount(Integer srcByteCount) {
        this.srcByteCount = srcByteCount;
    }

    /**
     * Specifies the number of bytes sent from the destination to the source.
     * 
     */
    @JsonProperty("dst_byte_count")
    public Integer getDstByteCount() {
        return dstByteCount;
    }

    /**
     * Specifies the number of bytes sent from the destination to the source.
     * 
     */
    @JsonProperty("dst_byte_count")
    public void setDstByteCount(Integer dstByteCount) {
        this.dstByteCount = dstByteCount;
    }

    /**
     * Specifies the number of packets sent from the source to the destination.
     * 
     */
    @JsonProperty("src_packets")
    public Integer getSrcPackets() {
        return srcPackets;
    }

    /**
     * Specifies the number of packets sent from the source to the destination.
     * 
     */
    @JsonProperty("src_packets")
    public void setSrcPackets(Integer srcPackets) {
        this.srcPackets = srcPackets;
    }

    /**
     * Specifies the number of packets sent destination to the source.
     * 
     */
    @JsonProperty("dst_packets")
    public Integer getDstPackets() {
        return dstPackets;
    }

    /**
     * Specifies the number of packets sent destination to the source.
     * 
     */
    @JsonProperty("dst_packets")
    public void setDstPackets(Integer dstPackets) {
        this.dstPackets = dstPackets;
    }

    @JsonProperty("ipfix")
    public Ipfix getIpfix() {
        return ipfix;
    }

    @JsonProperty("ipfix")
    public void setIpfix(Ipfix ipfix) {
        this.ipfix = ipfix;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("src_payload_ref")
    public String getSrcPayloadRef() {
        return srcPayloadRef;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("src_payload_ref")
    public void setSrcPayloadRef(String srcPayloadRef) {
        this.srcPayloadRef = srcPayloadRef;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("dst_payload_ref")
    public String getDstPayloadRef() {
        return dstPayloadRef;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     * 
     */
    @JsonProperty("dst_payload_ref")
    public void setDstPayloadRef(String dstPayloadRef) {
        this.dstPayloadRef = dstPayloadRef;
    }

    /**
     * Links to other network-traffic objects encapsulated by a network-traffic.
     * 
     */
    @JsonProperty("encapsulates_refs")
    public List<String> getEncapsulatesRefs() {
        return encapsulatesRefs;
    }

    /**
     * Links to other network-traffic objects encapsulated by a network-traffic.
     * 
     */
    @JsonProperty("encapsulates_refs")
    public void setEncapsulatesRefs(List<String> encapsulatesRefs) {
        this.encapsulatesRefs = encapsulatesRefs;
    }

    /**
     * Links to another network-traffic object which encapsulates this object.
     * 
     */
    @JsonProperty("encapsulated_by_ref")
    public String getEncapsulatedByRef() {
        return encapsulatedByRef;
    }

    /**
     * Links to another network-traffic object which encapsulates this object.
     * 
     */
    @JsonProperty("encapsulated_by_ref")
    public void setEncapsulatedByRef(String encapsulatedByRef) {
        this.encapsulatedByRef = encapsulatedByRef;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("extensions", extensions).append("start", start).append("end", end).append("srcRef", srcRef).append("dstRef", dstRef).append("srcPort", srcPort).append("dstPort", dstPort).append("protocols", protocols).append("srcByteCount", srcByteCount).append("dstByteCount", dstByteCount).append("srcPackets", srcPackets).append("dstPackets", dstPackets).append("ipfix", ipfix).append("srcPayloadRef", srcPayloadRef).append("dstPayloadRef", dstPayloadRef).append("encapsulatesRefs", encapsulatesRefs).append("encapsulatedByRef", encapsulatedByRef).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dstRef).append(srcPayloadRef).append(start).append(encapsulatedByRef).append(dstByteCount).append(srcPort).append(type).append(srcByteCount).append(srcPackets).append(extensions).append(dstPackets).append(ipfix).append(dstPort).append(dstPayloadRef).append(end).append(additionalProperties).append(protocols).append(srcRef).append(encapsulatesRefs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkTraffic) == false) {
            return false;
        }
        NetworkTraffic rhs = ((NetworkTraffic) other);
        return new EqualsBuilder().append(dstRef, rhs.dstRef).append(srcPayloadRef, rhs.srcPayloadRef).append(start, rhs.start).append(encapsulatedByRef, rhs.encapsulatedByRef).append(dstByteCount, rhs.dstByteCount).append(srcPort, rhs.srcPort).append(type, rhs.type).append(srcByteCount, rhs.srcByteCount).append(srcPackets, rhs.srcPackets).append(extensions, rhs.extensions).append(dstPackets, rhs.dstPackets).append(ipfix, rhs.ipfix).append(dstPort, rhs.dstPort).append(dstPayloadRef, rhs.dstPayloadRef).append(end, rhs.end).append(additionalProperties, rhs.additionalProperties).append(protocols, rhs.protocols).append(srcRef, rhs.srcRef).append(encapsulatesRefs, rhs.encapsulatesRefs).isEquals();
    }

}
