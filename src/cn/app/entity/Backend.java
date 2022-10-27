package cn.app.entity;

public class Backend {
    private String userCode;
    private String userName;
    private int userType;
    private String userPassword;

    public Backend(String userCode, String userName, int userType, String userPassword) {
        this.userCode = userCode;
        this.userName = userName;
        this.userType = userType;
        this.userPassword = userPassword;
    }

    public Backend() {}

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "Backend{" +
                "userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
