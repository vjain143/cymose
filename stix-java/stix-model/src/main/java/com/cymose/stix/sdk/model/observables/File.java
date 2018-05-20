
package com.cymose.stix.sdk.model.observables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.cymose.stix.sdk.model.common.Hashes;
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
 * file
 * <p>
 * The File Object represents the properties of a file.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "extensions",
    "hashes",
    "size",
    "name",
    "name_enc",
    "magic_number_hex",
    "mime_type",
    "created",
    "modified",
    "accessed",
    "parent_directory_ref",
    "contains_refs",
    "content_ref"
})
public class File {

    /**
     * The value of this property MUST be `file`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `file`.")
    private String type;
    @JsonProperty("extensions")
    private Extensions extensions;
    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    @JsonPropertyDescription("A dictionary captures a set of key/value pairs")
    private Hashes hashes;
    /**
     * Specifies the size of the file, in bytes, as a non-negative integer.
     * 
     */
    @JsonProperty("size")
    @JsonPropertyDescription("Specifies the size of the file, in bytes, as a non-negative integer.")
    private Integer size;
    /**
     * Specifies the name of the file.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Specifies the name of the file.")
    private String name;
    /**
     * Specifies the observed encoding for the name of the file.
     * 
     */
    @JsonProperty("name_enc")
    @JsonPropertyDescription("Specifies the observed encoding for the name of the file.")
    private String nameEnc;
    /**
     * hex
     * <p>
     * The hex data type encodes an array of octets (8-bit bytes) as hexadecimal. The string MUST consist of an even number of hexadecimal characters, which are the digits '0' through '9' and the letters 'a' through 'f'.  In order to allow pattern matching on custom objects, all properties that use the hex type, the property name MUST end with '_hex'.
     * 
     */
    @JsonProperty("magic_number_hex")
    @JsonPropertyDescription("The hex data type encodes an array of octets (8-bit bytes) as hexadecimal. The string MUST consist of an even number of hexadecimal characters, which are the digits '0' through '9' and the letters 'a' through 'f'.  In order to allow pattern matching on custom objects, all properties that use the hex type, the property name MUST end with '_hex'.")
    private String magicNumberHex;
    /**
     * Specifies the MIME type name specified for the file, e.g., 'application/msword'.
     * 
     */
    @JsonProperty("mime_type")
    @JsonPropertyDescription("Specifies the MIME type name specified for the file, e.g., 'application/msword'.")
    private String mimeType;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String created;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("modified")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String modified;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("accessed")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String accessed;
    /**
     * Specifies the parent directory of the file, as a reference to a Directory Object.
     * 
     */
    @JsonProperty("parent_directory_ref")
    @JsonPropertyDescription("Specifies the parent directory of the file, as a reference to a Directory Object.")
    private String parentDirectoryRef;
    /**
     * Specifies a list of references to other Observable Objects contained within the file.
     * 
     */
    @JsonProperty("contains_refs")
    @JsonPropertyDescription("Specifies a list of references to other Observable Objects contained within the file.")
    private List<String> containsRefs = new ArrayList<String>();
    /**
     * Specifies the content of the file, represented as an Artifact Object.
     * 
     */
    @JsonProperty("content_ref")
    @JsonPropertyDescription("Specifies the content of the file, represented as an Artifact Object.")
    private String contentRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `file`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `file`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("extensions")
    public Extensions getExtensions() {
        return extensions;
    }

    @JsonProperty("extensions")
    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    public Hashes getHashes() {
        return hashes;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("hashes")
    public void setHashes(Hashes hashes) {
        this.hashes = hashes;
    }

    /**
     * Specifies the size of the file, in bytes, as a non-negative integer.
     * 
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * Specifies the size of the file, in bytes, as a non-negative integer.
     * 
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Specifies the name of the file.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the file.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the observed encoding for the name of the file.
     * 
     */
    @JsonProperty("name_enc")
    public String getNameEnc() {
        return nameEnc;
    }

    /**
     * Specifies the observed encoding for the name of the file.
     * 
     */
    @JsonProperty("name_enc")
    public void setNameEnc(String nameEnc) {
        this.nameEnc = nameEnc;
    }

    /**
     * hex
     * <p>
     * The hex data type encodes an array of octets (8-bit bytes) as hexadecimal. The string MUST consist of an even number of hexadecimal characters, which are the digits '0' through '9' and the letters 'a' through 'f'.  In order to allow pattern matching on custom objects, all properties that use the hex type, the property name MUST end with '_hex'.
     * 
     */
    @JsonProperty("magic_number_hex")
    public String getMagicNumberHex() {
        return magicNumberHex;
    }

    /**
     * hex
     * <p>
     * The hex data type encodes an array of octets (8-bit bytes) as hexadecimal. The string MUST consist of an even number of hexadecimal characters, which are the digits '0' through '9' and the letters 'a' through 'f'.  In order to allow pattern matching on custom objects, all properties that use the hex type, the property name MUST end with '_hex'.
     * 
     */
    @JsonProperty("magic_number_hex")
    public void setMagicNumberHex(String magicNumberHex) {
        this.magicNumberHex = magicNumberHex;
    }

    /**
     * Specifies the MIME type name specified for the file, e.g., 'application/msword'.
     * 
     */
    @JsonProperty("mime_type")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Specifies the MIME type name specified for the file, e.g., 'application/msword'.
     * 
     */
    @JsonProperty("mime_type")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("accessed")
    public String getAccessed() {
        return accessed;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("accessed")
    public void setAccessed(String accessed) {
        this.accessed = accessed;
    }

    /**
     * Specifies the parent directory of the file, as a reference to a Directory Object.
     * 
     */
    @JsonProperty("parent_directory_ref")
    public String getParentDirectoryRef() {
        return parentDirectoryRef;
    }

    /**
     * Specifies the parent directory of the file, as a reference to a Directory Object.
     * 
     */
    @JsonProperty("parent_directory_ref")
    public void setParentDirectoryRef(String parentDirectoryRef) {
        this.parentDirectoryRef = parentDirectoryRef;
    }

    /**
     * Specifies a list of references to other Observable Objects contained within the file.
     * 
     */
    @JsonProperty("contains_refs")
    public List<String> getContainsRefs() {
        return containsRefs;
    }

    /**
     * Specifies a list of references to other Observable Objects contained within the file.
     * 
     */
    @JsonProperty("contains_refs")
    public void setContainsRefs(List<String> containsRefs) {
        this.containsRefs = containsRefs;
    }

    /**
     * Specifies the content of the file, represented as an Artifact Object.
     * 
     */
    @JsonProperty("content_ref")
    public String getContentRef() {
        return contentRef;
    }

    /**
     * Specifies the content of the file, represented as an Artifact Object.
     * 
     */
    @JsonProperty("content_ref")
    public void setContentRef(String contentRef) {
        this.contentRef = contentRef;
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
        return new ToStringBuilder(this).append("type", type).append("extensions", extensions).append("hashes", hashes).append("size", size).append("name", name).append("nameEnc", nameEnc).append("magicNumberHex", magicNumberHex).append("mimeType", mimeType).append("created", created).append("modified", modified).append("accessed", accessed).append("parentDirectoryRef", parentDirectoryRef).append("containsRefs", containsRefs).append("contentRef", contentRef).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containsRefs).append(created).append(mimeType).append(type).append(accessed).append(nameEnc).append(magicNumberHex).append(extensions).append(parentDirectoryRef).append(size).append(hashes).append(name).append(modified).append(additionalProperties).append(contentRef).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof File) == false) {
            return false;
        }
        File rhs = ((File) other);
        return new EqualsBuilder().append(containsRefs, rhs.containsRefs).append(created, rhs.created).append(mimeType, rhs.mimeType).append(type, rhs.type).append(accessed, rhs.accessed).append(nameEnc, rhs.nameEnc).append(magicNumberHex, rhs.magicNumberHex).append(extensions, rhs.extensions).append(parentDirectoryRef, rhs.parentDirectoryRef).append(size, rhs.size).append(hashes, rhs.hashes).append(name, rhs.name).append(modified, rhs.modified).append(additionalProperties, rhs.additionalProperties).append(contentRef, rhs.contentRef).isEquals();
    }

}
