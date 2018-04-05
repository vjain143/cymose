package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;
import org.threeten.bp.OffsetDateTime;

import java.util.List;

public class File
{
    @SerializedName("hashes")
    private List hashes;
    @SerializedName("size")
    private int size;
    @SerializedName("name")
    private String name;
    @SerializedName("name_enc")
    private String nameEnc;
    @SerializedName("magic_number_hex")
    private List magicNumberHex;
    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("created")
    private OffsetDateTime created = null;
    @SerializedName("modified")
    private OffsetDateTime modified = null;
    @SerializedName("accessed")
    private OffsetDateTime accessed = null;

    @SerializedName("parent_directory_ref")
    private StixObservableCommonData parentDirectoryRef;
    @SerializedName("is_encrypted")
    private boolean isEncrypted;
    @SerializedName("encryption_algorithm")
    private String encryptionAlgorithm;
    @SerializedName("decryption_key")
    private String decryptionKey;
    @SerializedName("contains_refs")
    private List<StixObservableCommonData> containsReferences = null;
    @SerializedName("content_refs")
    private StixObservableCommonData contentReferences = null;
}
