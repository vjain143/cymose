
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
 * directory
 * <p>
 * The Directory Object represents the properties common to a file system directory.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "path",
    "path_enc",
    "created",
    "modified",
    "accessed",
    "contains_refs"
})
public class Directory extends CyberObservableCore {

    /**
     * The value of this property MUST be `directory`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `directory`.")
    private String type;
    /**
     * Specifies the path, as originally observed, to the directory on the file system.
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Specifies the path, as originally observed, to the directory on the file system.")
    private String path;
    /**
     * Specifies the observed encoding for the path.
     * 
     */
    @JsonProperty("path_enc")
    @JsonPropertyDescription("Specifies the observed encoding for the path.")
    private String pathEnc;
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
     * Specifies a list of references to other File and/or Directory Objects contained within the directory.
     * 
     */
    @JsonProperty("contains_refs")
    @JsonPropertyDescription("Specifies a list of references to other File and/or Directory Objects contained within the directory.")
    private List<String> containsRefs = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `directory`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `directory`.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies the path, as originally observed, to the directory on the file system.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Specifies the path, as originally observed, to the directory on the file system.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Specifies the observed encoding for the path.
     * 
     */
    @JsonProperty("path_enc")
    public String getPathEnc() {
        return pathEnc;
    }

    /**
     * Specifies the observed encoding for the path.
     * 
     */
    @JsonProperty("path_enc")
    public void setPathEnc(String pathEnc) {
        this.pathEnc = pathEnc;
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
     * Specifies a list of references to other File and/or Directory Objects contained within the directory.
     * 
     */
    @JsonProperty("contains_refs")
    public List<String> getContainsRefs() {
        return containsRefs;
    }

    /**
     * Specifies a list of references to other File and/or Directory Objects contained within the directory.
     * 
     */
    @JsonProperty("contains_refs")
    public void setContainsRefs(List<String> containsRefs) {
        this.containsRefs = containsRefs;
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
        return new ToStringBuilder(this).append("type", type).append("path", path).append("pathEnc", pathEnc).append("created", created).append("modified", modified).append("accessed", accessed).append("containsRefs", containsRefs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(containsRefs).append(created).append(pathEnc).append(modified).append(additionalProperties).append(type).append(accessed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Directory) == false) {
            return false;
        }
        Directory rhs = ((Directory) other);
        return new EqualsBuilder().append(path, rhs.path).append(containsRefs, rhs.containsRefs).append(created, rhs.created).append(pathEnc, rhs.pathEnc).append(modified, rhs.modified).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(accessed, rhs.accessed).isEquals();
    }

}
