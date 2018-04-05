package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.List;

public class EmailMessage extends StixObservableCommonData
{
    @SerializedName("is_multipart")
    private boolean isMultipart;
    @SerializedName("date")
    private OffsetDateTime date;
    @SerializedName("content_type")
    private  String contentType;
    @SerializedName("from_ref")
    private StixObservableCommonData fromRef = null;
    @SerializedName("sender_ref")
    private StixObservableCommonData senderRef = null;
    @SerializedName("to_refs")
    private List<StixObservableCommonData> toReferences = null;
    @SerializedName("cc_refs")
    private List<StixObservableCommonData> ccReferences = null;
    @SerializedName("bcc_refs")
    private List<StixObservableCommonData> bccReferences = null;
    @SerializedName("subject")
    private  String subject;
    @SerializedName("received_lines")
    private List<String> receivedLines;

    /**
     * dictionary
     */
    @SerializedName("additional_header_fields")
    private List additionalHeaderFields = null;
    @SerializedName("body")
    private String body;

    @SerializedName("body_multipart")
    private List<EmailMIME> bodyMultipart;

    @SerializedName("raw_email_ref")
    private StixObservableCommonData rawEmailRef = null;
}
