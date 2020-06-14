public class UserData {
    private String firstName;
    private String lastName;
    private String street;
    private String birthdate;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String education;
    private String hobbies;
    private String bio;
    private boolean isSubscribed;
    private String role;
    private String lastLoginTime;
    private boolean isSocialLogin;
    private String  providername;
    private String  profileurl;
    private boolean isDeleted;
    private String id;
    private String userName;
    private String normalizedUserName;
    private String email;
    private String normalizedEmail;
    private boolean emailConfirmed;
    private String passwordHash;
    private String securityStamp;
    private String  concurrencyStamp;
    private String phoneNumber;
    private boolean phoneNumberConfirmed;
    private boolean twoFactorEnabled;
    private String lockoutEnd;
    private boolean lockoutEnabled;
    private Integer accessFailedCount;
    private String token;

//    public static UserData instance;
//
//    public static UserData getInstance() {
//        if (instance == null) {
//            instance = new UserData();
//        }
//        return instance;
//    }

    public UserData() {

    }

    public UserData(String firstName, String lastName, String street, String birthdate, String city, String state, String zip, String country, String education, String hobbies, String bio, boolean isSubscribed, String role, String lastLoginTime, boolean isSocialLogin, String providername, String profileurl, boolean isDeleted, String id, String userName, String normalizedUserName, String email, String normalizedEmail, boolean emailConfirmed, String passwordHash, String securityStamp, String concurrencyStamp, String phoneNumber, boolean phoneNumberConfirmed, boolean twoFactorEnabled, String lockoutEnd, boolean lockoutEnabled, Integer accessFailedCount,String token) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.birthdate = birthdate;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.education = education;
        this.hobbies = hobbies;
        this.bio = bio;
        this.isSubscribed = isSubscribed;
        this.role = role;
        this.lastLoginTime = lastLoginTime;
        this.isSocialLogin = isSocialLogin;
        this.providername = providername;
        this.profileurl = profileurl;
        this.isDeleted = isDeleted;
        this.id = id;
        this.userName = userName;
        this.normalizedUserName = normalizedUserName;
        this.email = email;
        this.normalizedEmail = normalizedEmail;
        this.emailConfirmed = emailConfirmed;
        this.passwordHash = passwordHash;
        this.securityStamp = securityStamp;
        this.concurrencyStamp = concurrencyStamp;
        this.phoneNumber = phoneNumber;
        this.phoneNumberConfirmed = phoneNumberConfirmed;
        this.twoFactorEnabled = twoFactorEnabled;
        this.lockoutEnd = lockoutEnd;
        this.lockoutEnabled = lockoutEnabled;
        this.accessFailedCount = accessFailedCount;
        this.token = token;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getEducation() {
        return education;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getBio() {
        return bio;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public String getRole() {
        return role;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public boolean isSocialLogin() {
        return isSocialLogin;
    }

    public String getProvidername() {
        return providername;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getNormalizedUserName() {
        return normalizedUserName;
    }

    public String getEmail() {
        return email;
    }

    public String getNormalizedEmail() {
        return normalizedEmail;
    }

    public boolean isEmailConfirmed() {
        return emailConfirmed;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getSecurityStamp() {
        return securityStamp;
    }

    public String getConcurrencyStamp() {
        return concurrencyStamp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isPhoneNumberConfirmed() {
        return phoneNumberConfirmed;
    }

    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public String getLockoutEnd() {
        return lockoutEnd;
    }

    public boolean isLockoutEnabled() {
        return lockoutEnabled;
    }

    public Integer getAccessFailedCount() {
        return accessFailedCount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", education='" + education + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", bio='" + bio + '\'' +
                ", isSubscribed=" + isSubscribed +
                ", role='" + role + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", isSocialLogin=" + isSocialLogin +
                ", providername='" + providername + '\'' +
                ", profileurl='" + profileurl + '\'' +
                ", isDeleted=" + isDeleted +
                ", id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", normalizedUserName='" + normalizedUserName + '\'' +
                ", email='" + email + '\'' +
                ", normalizedEmail='" + normalizedEmail + '\'' +
                ", emailConfirmed=" + emailConfirmed +
                ", passwordHash='" + passwordHash + '\'' +
                ", securityStamp='" + securityStamp + '\'' +
                ", concurrencyStamp='" + concurrencyStamp + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", phoneNumberConfirmed=" + phoneNumberConfirmed +
                ", twoFactorEnabled=" + twoFactorEnabled +
                ", lockoutEnd='" + lockoutEnd + '\'' +
                ", lockoutEnabled=" + lockoutEnabled +
                ", accessFailedCount=" + accessFailedCount +
                ", token='" + token + '\'' +
                '}';
    }
}
