
package com.cymose.stix.sdk.model.observables;

import java.util.HashMap;
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
 * user-account
 * <p>
 * The User Account Object represents an instance of any type of user account, including but not limited to operating system, device, messaging service, and social media platform accounts.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "extensions",
    "user_id",
    "account_login",
    "account_type",
    "display_name",
    "is_service_account",
    "is_privileged",
    "can_escalate_privs",
    "is_disabled",
    "account_created",
    "account_expires",
    "password_last_changed",
    "account_first_login",
    "account_last_login"
})
public class UserAccount extends CyberObservableCore {

    /**
     * The value of this property MUST be `user-account`.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The value of this property MUST be `user-account`.")
    private String type;
    @JsonProperty("extensions")
    private com.cymose.stix.sdk.model.common.Extensions extensions;
    /**
     * Specifies the identifier of the account.
     * (Required)
     * 
     */
    @JsonProperty("user_id")
    @JsonPropertyDescription("Specifies the identifier of the account.")
    private String userId;
    /**
     * Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login.
     * 
     */
    @JsonProperty("account_login")
    @JsonPropertyDescription("Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login.")
    private String accountLogin;
    /**
     * Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov vocabulary.
     * 
     */
    @JsonProperty("account_type")
    @JsonPropertyDescription("Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov vocabulary.")
    private String accountType;
    /**
     * Specifies the display name of the account, to be shown in user interfaces, if applicable.
     * 
     */
    @JsonProperty("display_name")
    @JsonPropertyDescription("Specifies the display name of the account, to be shown in user interfaces, if applicable.")
    private String displayName;
    /**
     * Indicates that the account is associated with a network service or system process (daemon), not a specific individual.
     * 
     */
    @JsonProperty("is_service_account")
    @JsonPropertyDescription("Indicates that the account is associated with a network service or system process (daemon), not a specific individual.")
    private Boolean isServiceAccount;
    /**
     * Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account).
     * 
     */
    @JsonProperty("is_privileged")
    @JsonPropertyDescription("Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account).")
    private Boolean isPrivileged;
    /**
     * Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account).
     * 
     */
    @JsonProperty("can_escalate_privs")
    @JsonPropertyDescription("Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account).")
    private Boolean canEscalatePrivs;
    /**
     * Specifies if the account is disabled.
     * 
     */
    @JsonProperty("is_disabled")
    @JsonPropertyDescription("Specifies if the account is disabled.")
    private Boolean isDisabled;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_created")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String accountCreated;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_expires")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String accountExpires;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("password_last_changed")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String passwordLastChanged;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_first_login")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String accountFirstLogin;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_last_login")
    @JsonPropertyDescription("Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.")
    private String accountLastLogin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The value of this property MUST be `user-account`.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `user-account`.
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
     * Specifies the identifier of the account.
     * (Required)
     * 
     */
    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    /**
     * Specifies the identifier of the account.
     * (Required)
     * 
     */
    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login.
     * 
     */
    @JsonProperty("account_login")
    public String getAccountLogin() {
        return accountLogin;
    }

    /**
     * Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login.
     * 
     */
    @JsonProperty("account_login")
    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    /**
     * Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov vocabulary.
     * 
     */
    @JsonProperty("account_type")
    public String getAccountType() {
        return accountType;
    }

    /**
     * Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov vocabulary.
     * 
     */
    @JsonProperty("account_type")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * Specifies the display name of the account, to be shown in user interfaces, if applicable.
     * 
     */
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Specifies the display name of the account, to be shown in user interfaces, if applicable.
     * 
     */
    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Indicates that the account is associated with a network service or system process (daemon), not a specific individual.
     * 
     */
    @JsonProperty("is_service_account")
    public Boolean getIsServiceAccount() {
        return isServiceAccount;
    }

    /**
     * Indicates that the account is associated with a network service or system process (daemon), not a specific individual.
     * 
     */
    @JsonProperty("is_service_account")
    public void setIsServiceAccount(Boolean isServiceAccount) {
        this.isServiceAccount = isServiceAccount;
    }

    /**
     * Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account).
     * 
     */
    @JsonProperty("is_privileged")
    public Boolean getIsPrivileged() {
        return isPrivileged;
    }

    /**
     * Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account).
     * 
     */
    @JsonProperty("is_privileged")
    public void setIsPrivileged(Boolean isPrivileged) {
        this.isPrivileged = isPrivileged;
    }

    /**
     * Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account).
     * 
     */
    @JsonProperty("can_escalate_privs")
    public Boolean getCanEscalatePrivs() {
        return canEscalatePrivs;
    }

    /**
     * Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account).
     * 
     */
    @JsonProperty("can_escalate_privs")
    public void setCanEscalatePrivs(Boolean canEscalatePrivs) {
        this.canEscalatePrivs = canEscalatePrivs;
    }

    /**
     * Specifies if the account is disabled.
     * 
     */
    @JsonProperty("is_disabled")
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    /**
     * Specifies if the account is disabled.
     * 
     */
    @JsonProperty("is_disabled")
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_created")
    public String getAccountCreated() {
        return accountCreated;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_created")
    public void setAccountCreated(String accountCreated) {
        this.accountCreated = accountCreated;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_expires")
    public String getAccountExpires() {
        return accountExpires;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_expires")
    public void setAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("password_last_changed")
    public String getPasswordLastChanged() {
        return passwordLastChanged;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("password_last_changed")
    public void setPasswordLastChanged(String passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_first_login")
    public String getAccountFirstLogin() {
        return accountFirstLogin;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_first_login")
    public void setAccountFirstLogin(String accountFirstLogin) {
        this.accountFirstLogin = accountFirstLogin;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_last_login")
    public String getAccountLastLogin() {
        return accountLastLogin;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * 
     */
    @JsonProperty("account_last_login")
    public void setAccountLastLogin(String accountLastLogin) {
        this.accountLastLogin = accountLastLogin;
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
        return new ToStringBuilder(this).append("type", type).append("extensions", extensions).append("userId", userId).append("accountLogin", accountLogin).append("accountType", accountType).append("displayName", displayName).append("isServiceAccount", isServiceAccount).append("isPrivileged", isPrivileged).append("canEscalatePrivs", canEscalatePrivs).append("isDisabled", isDisabled).append("accountCreated", accountCreated).append("accountExpires", accountExpires).append("passwordLastChanged", passwordLastChanged).append("accountFirstLogin", accountFirstLogin).append("accountLastLogin", accountLastLogin).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountCreated).append(accountLogin).append(displayName).append(accountExpires).append(accountType).append(type).append(userId).append(extensions).append(isPrivileged).append(passwordLastChanged).append(accountLastLogin).append(accountFirstLogin).append(canEscalatePrivs).append(isDisabled).append(additionalProperties).append(isServiceAccount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserAccount) == false) {
            return false;
        }
        UserAccount rhs = ((UserAccount) other);
        return new EqualsBuilder().append(accountCreated, rhs.accountCreated).append(accountLogin, rhs.accountLogin).append(displayName, rhs.displayName).append(accountExpires, rhs.accountExpires).append(accountType, rhs.accountType).append(type, rhs.type).append(userId, rhs.userId).append(extensions, rhs.extensions).append(isPrivileged, rhs.isPrivileged).append(passwordLastChanged, rhs.passwordLastChanged).append(accountLastLogin, rhs.accountLastLogin).append(accountFirstLogin, rhs.accountFirstLogin).append(canEscalatePrivs, rhs.canEscalatePrivs).append(isDisabled, rhs.isDisabled).append(additionalProperties, rhs.additionalProperties).append(isServiceAccount, rhs.isServiceAccount).isEquals();
    }

}
