public class User {
     private String username;
     private String password;
     private Boolean isSocialLogin;

    public User(String username, String password, Boolean isSocialLogin) {
        this.username = username;
        this.password = password;
        this.isSocialLogin = isSocialLogin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSocialLogin() {
        return isSocialLogin;
    }

    public void setSocialLogin(Boolean socialLogin) {
        isSocialLogin = socialLogin;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isSocialLogin=" + isSocialLogin +
                '}';
    }
}
