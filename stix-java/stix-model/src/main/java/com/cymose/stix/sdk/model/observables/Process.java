
package com.cymose.stix.sdk.model.observables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cymose.stix.sdk.model.common.CyberObservableCore;
import com.cymose.stix.sdk.model.common.Extensions;
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
 * process
 * <p>
 * The Process Object represents common properties of an instance of a computer program as executed on an operating system.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "extensions",
    "is_hidden",
    "pid",
    "name",
    "created",
    "cwd",
    "arguments",
    "command_line",
    "environment_variables",
    "opened_connection_refs",
    "creator_user_ref",
    "binary_ref",
    "parent_ref",
    "child_refs"
})
public class Process extends CyberObservableCore {

    /**
     * The value of this property MUST be `process`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `process`.")
    private String type;
    @JsonProperty("extensions")
    private Extensions extensions;
    /**
     * Specifies whether the process is hidden.
     * 
     */
    @JsonProperty("is_hidden")
    @JsonPropertyDescription("Specifies whether the process is hidden.")
    private Boolean isHidden;
    /**
     * Specifies the Process ID, or PID, of the process.
     * 
     */
    @JsonProperty("pid")
    @JsonPropertyDescription("Specifies the Process ID, or PID, of the process.")
    private Integer pid;
    /**
     * Specifies the name of the process.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Specifies the name of the process.")
    private String name;
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
     * Specifies the current working directory of the process.
     * 
     */
    @JsonProperty("cwd")
    @JsonPropertyDescription("Specifies the current working directory of the process.")
    private String cwd;
    /**
     * Specifies the list of arguments used in executing the process.
     * 
     */
    @JsonProperty("arguments")
    @JsonPropertyDescription("Specifies the list of arguments used in executing the process.")
    private List<String> arguments = new ArrayList<String>();
    /**
     * Specifies the full command line used in executing the process, including the process name (depending on the operating system).
     * 
     */
    @JsonProperty("command_line")
    @JsonPropertyDescription("Specifies the full command line used in executing the process, including the process name (depending on the operating system).")
    private String commandLine;
    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("environment_variables")
    @JsonPropertyDescription("A dictionary captures a set of key/value pairs")
    private Extensions environmentVariables;
    /**
     * Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic Objects.
     * 
     */
    @JsonProperty("opened_connection_refs")
    @JsonPropertyDescription("Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic Objects.")
    private List<String> openedConnectionRefs = new ArrayList<String>();
    /**
     * Specifies the user that created the process, as a reference to a User Account Object.
     * 
     */
    @JsonProperty("creator_user_ref")
    @JsonPropertyDescription("Specifies the user that created the process, as a reference to a User Account Object.")
    private String creatorUserRef;
    /**
     * Specifies the executable binary that was executed as the process, as a reference to a File Object.
     * 
     */
    @JsonProperty("binary_ref")
    @JsonPropertyDescription("Specifies the executable binary that was executed as the process, as a reference to a File Object.")
    private String binaryRef;
    /**
     * Specifies the other process that spawned (i.e. is the parent of) this one, as represented by a Process Object.
     * 
     */
    @JsonProperty("parent_ref")
    @JsonPropertyDescription("Specifies the other process that spawned (i.e. is the parent of) this one, as represented by a Process Object.")
    private String parentRef;
    /**
     * Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process Objects.
     * 
     */
    @JsonProperty("child_refs")
    @JsonPropertyDescription("Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process Objects.")
    private List<String> childRefs = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `process`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `process`.
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
     * Specifies whether the process is hidden.
     * 
     */
    @JsonProperty("is_hidden")
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Specifies whether the process is hidden.
     * 
     */
    @JsonProperty("is_hidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Specifies the Process ID, or PID, of the process.
     * 
     */
    @JsonProperty("pid")
    public Integer getPid() {
        return pid;
    }

    /**
     * Specifies the Process ID, or PID, of the process.
     * 
     */
    @JsonProperty("pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Specifies the name of the process.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the process.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
     * Specifies the current working directory of the process.
     * 
     */
    @JsonProperty("cwd")
    public String getCwd() {
        return cwd;
    }

    /**
     * Specifies the current working directory of the process.
     * 
     */
    @JsonProperty("cwd")
    public void setCwd(String cwd) {
        this.cwd = cwd;
    }

    /**
     * Specifies the list of arguments used in executing the process.
     * 
     */
    @JsonProperty("arguments")
    public List<String> getArguments() {
        return arguments;
    }

    /**
     * Specifies the list of arguments used in executing the process.
     * 
     */
    @JsonProperty("arguments")
    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    /**
     * Specifies the full command line used in executing the process, including the process name (depending on the operating system).
     * 
     */
    @JsonProperty("command_line")
    public String getCommandLine() {
        return commandLine;
    }

    /**
     * Specifies the full command line used in executing the process, including the process name (depending on the operating system).
     * 
     */
    @JsonProperty("command_line")
    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("environment_variables")
    public Extensions getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @JsonProperty("environment_variables")
    public void setEnvironmentVariables(Extensions environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic Objects.
     * 
     */
    @JsonProperty("opened_connection_refs")
    public List<String> getOpenedConnectionRefs() {
        return openedConnectionRefs;
    }

    /**
     * Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic Objects.
     * 
     */
    @JsonProperty("opened_connection_refs")
    public void setOpenedConnectionRefs(List<String> openedConnectionRefs) {
        this.openedConnectionRefs = openedConnectionRefs;
    }

    /**
     * Specifies the user that created the process, as a reference to a User Account Object.
     * 
     */
    @JsonProperty("creator_user_ref")
    public String getCreatorUserRef() {
        return creatorUserRef;
    }

    /**
     * Specifies the user that created the process, as a reference to a User Account Object.
     * 
     */
    @JsonProperty("creator_user_ref")
    public void setCreatorUserRef(String creatorUserRef) {
        this.creatorUserRef = creatorUserRef;
    }

    /**
     * Specifies the executable binary that was executed as the process, as a reference to a File Object.
     * 
     */
    @JsonProperty("binary_ref")
    public String getBinaryRef() {
        return binaryRef;
    }

    /**
     * Specifies the executable binary that was executed as the process, as a reference to a File Object.
     * 
     */
    @JsonProperty("binary_ref")
    public void setBinaryRef(String binaryRef) {
        this.binaryRef = binaryRef;
    }

    /**
     * Specifies the other process that spawned (i.e. is the parent of) this one, as represented by a Process Object.
     * 
     */
    @JsonProperty("parent_ref")
    public String getParentRef() {
        return parentRef;
    }

    /**
     * Specifies the other process that spawned (i.e. is the parent of) this one, as represented by a Process Object.
     * 
     */
    @JsonProperty("parent_ref")
    public void setParentRef(String parentRef) {
        this.parentRef = parentRef;
    }

    /**
     * Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process Objects.
     * 
     */
    @JsonProperty("child_refs")
    public List<String> getChildRefs() {
        return childRefs;
    }

    /**
     * Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process Objects.
     * 
     */
    @JsonProperty("child_refs")
    public void setChildRefs(List<String> childRefs) {
        this.childRefs = childRefs;
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
        return new ToStringBuilder(this).append("type", type).append("extensions", extensions).append("isHidden", isHidden).append("pid", pid).append("name", name).append("created", created).append("cwd", cwd).append("arguments", arguments).append("commandLine", commandLine).append("environmentVariables", environmentVariables).append("openedConnectionRefs", openedConnectionRefs).append("creatorUserRef", creatorUserRef).append("binaryRef", binaryRef).append("parentRef", parentRef).append("childRefs", childRefs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(created).append(pid).append(type).append(childRefs).append(isHidden).append(parentRef).append(cwd).append(extensions).append(binaryRef).append(creatorUserRef).append(environmentVariables).append(name).append(openedConnectionRefs).append(arguments).append(additionalProperties).append(commandLine).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Process) == false) {
            return false;
        }
        Process rhs = ((Process) other);
        return new EqualsBuilder().append(created, rhs.created).append(pid, rhs.pid).append(type, rhs.type).append(childRefs, rhs.childRefs).append(isHidden, rhs.isHidden).append(parentRef, rhs.parentRef).append(cwd, rhs.cwd).append(extensions, rhs.extensions).append(binaryRef, rhs.binaryRef).append(creatorUserRef, rhs.creatorUserRef).append(environmentVariables, rhs.environmentVariables).append(name, rhs.name).append(openedConnectionRefs, rhs.openedConnectionRefs).append(arguments, rhs.arguments).append(additionalProperties, rhs.additionalProperties).append(commandLine, rhs.commandLine).isEquals();
    }

}
