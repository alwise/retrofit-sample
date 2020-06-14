public class Login {

    private String username;
    private String password;
    private boolean isSocialLogin;

    public Login(String username, String password, boolean isSocialLogin) {
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

    public boolean isSocialLogin() {
        return isSocialLogin;
    }

    public void setSocialLogin(boolean socialLogin) {
        isSocialLogin = socialLogin;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isSocialLogin=" + isSocialLogin +
                '}';
    }
}
