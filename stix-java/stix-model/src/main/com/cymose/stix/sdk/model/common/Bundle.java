
package com.cymose.stix.sdk.model.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * bundle
 * <p>
 * A Bundle is a collection of arbitrary STIX Objects and Marking Definitions grouped together in a single container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "spec_version",
    "objects"
})
public class Bundle {

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of this object, which MUST be the literal `bundle`.")
    private Bundle.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Object id;
    /**
     * The version of the STIX specification used to represent the content in this bundle.
     * (Required)
     * 
     */
    @JsonProperty("spec_version")
    @JsonPropertyDescription("The version of the STIX specification used to represent the content in this bundle.")
    private Bundle.SpecVersion specVersion;
    /**
     * Specifies a set of one or more STIX Objects.
     * 
     */
    @JsonProperty("objects")
    @JsonPropertyDescription("Specifies a set of one or more STIX Objects.")
    private List<Object> objects = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Bundle.Type getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Bundle.Type type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * The version of the STIX specification used to represent the content in this bundle.
     * (Required)
     * 
     */
    @JsonProperty("spec_version")
    public Bundle.SpecVersion getSpecVersion() {
        return specVersion;
    }

    /**
     * The version of the STIX specification used to represent the content in this bundle.
     * (Required)
     * 
     */
    @JsonProperty("spec_version")
    public void setSpecVersion(Bundle.SpecVersion specVersion) {
        this.specVersion = specVersion;
    }

    /**
     * Specifies a set of one or more STIX Objects.
     * 
     */
    @JsonProperty("objects")
    public List<Object> getObjects() {
        return objects;
    }

    /**
     * Specifies a set of one or more STIX Objects.
     * 
     */
    @JsonProperty("objects")
    public void setObjects(List<Object> objects) {
        this.objects = objects;
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
        return new ToStringBuilder(this).append("type", type).append("id", id).append("specVersion", specVersion).append("objects", objects).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(specVersion).append(id).append(additionalProperties).append(type).append(objects).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bundle) == false) {
            return false;
        }
        Bundle rhs = ((Bundle) other);
        return new EqualsBuilder().append(specVersion, rhs.specVersion).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(objects, rhs.objects).isEquals();
    }

    public enum SpecVersion {

        _2_0("2.0");
        private final String value;
        private final static Map<String, Bundle.SpecVersion> CONSTANTS = new HashMap<String, Bundle.SpecVersion>();

        static {
            for (Bundle.SpecVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SpecVersion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Bundle.SpecVersion fromValue(String value) {
            Bundle.SpecVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Type {

        BUNDLE("bundle");
        private final String value;
        private final static Map<String, Bundle.Type> CONSTANTS = new HashMap<String, Bundle.Type>();

        static {
            for (Bundle.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Bundle.Type fromValue(String value) {
            Bundle.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
