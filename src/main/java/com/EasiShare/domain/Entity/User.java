package com.EasiShare.domain.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "UserID")
    private int id;

    @Column(name = "Username", columnDefinition = "nvarchar")
    private String userName;

    @Column(name = "Fullname", columnDefinition = "nvarchar")
    private String fullName;

    @Column(name = "IsExternal")
    private boolean isExternal;

    @Column(name = "Mobile", columnDefinition = "nvarchar")
    private String mobile;

    @Column(name = "Status")
    private char status;

    @Column(name = "StatusChangedAt")
    private Date statusChangedAt;

    @Column(name = "Isovernorm")
    private boolean isOverNorm;

    @Column(name = "CreatedAt")
    private Date createdAt;

    @Column(name = "MustChangePassword")
    private boolean mustChangePassword;

    @Column(name = "Email" , columnDefinition = "nvarchar")
    private String email;

    @Column(name = "IsAdmin")
    private boolean isAdmin;

    @Column(name = "CompanyId")
    private int companyId;

    @Column(name = "InvalidAttempts")
    private int invalidAttempts;

    @Column(name = "LockedAt")
    private Date lockedAt;

    @Column(name = "LastAccess")
    private Date lastAccess;

    @Column(name = "Policy", columnDefinition = "nvarchar")
    private String policy;

    @Column(name = "ReminderSentAt")
    private Date reminderSentAt;

    @Column(name = "Properties", columnDefinition = "nvarchar")
    private String properties;

    @Column(name = "ExpiryAt")
    private Date expiryAt;

    @Column(name = "RefreshPolicy")
    private boolean refreshPolicy;

    @Column(name = "DefaultPolicy")
    private int defaultPolicy;

    @Column(name = "PersonalDrive")
    private int personalDrive;

    @Column(name = "ADAccountName", columnDefinition = "nvarchar")
    private String adAccountName;

    @Column(name = "AdminRoles", columnDefinition = "nvarchar")
    private String adminRoles;

    @Column(name = "LastUserDeactNotifSentTime")
    private Date lastUserDeactNotifSentTime;

    @Column(name = "LastAcctExpiryNotifSentTime")
    private Date lastAcctExpiryNotifSentTime;

    @Column(name = "LastPwdExpNotifSentTime")
    private Date lastPwdExpNotifSentTime;

    @Column(name = "Department", columnDefinition = "nvarchar")
    private Date department;
}