package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.List;

public class NetworkTraffic extends StixObservableCommonData
{

    @SerializedName("start")
    private OffsetDateTime start;
    @SerializedName("end")
    private OffsetDateTime end;
    @SerializedName("is_active")
    private boolean isActive;
    @SerializedName("src_ref")
    private StixObservableCommonData srcRef;
    @SerializedName("dst_ref")
    private StixObservableCommonData dstRef;
    @SerializedName("src_port")
    private int srcPort;
    @SerializedName("dst_port")
    private int dstPort;
    @SerializedName("protocols")
    private List protocols;
    @SerializedName("src_byte_count")
    private int srcByteCount;
    @SerializedName("dst_byte_count")
    private int dstByteCount;
    @SerializedName("src_packets")
    private int srcPackets;
    @SerializedName("dst_packets")
    private int dstPackets;
    @SerializedName("ipfix")
    private List ipfix;
    @SerializedName("src_payload_ref")
    private StixObservableCommonData srcPayloadRef;
    @SerializedName("dst_payload_ref")
    private StixObservableCommonData dstPayloadRef;
    @SerializedName("encapsulates_refs")
    private List<StixObservableCommonData> encapsulatesRefs;
    @SerializedName("encapsulated_by_ref")
    private StixObservableCommonData encapsulatedByRef;

}
