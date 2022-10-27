package cn.app.entity;

public class Dev {
    private String devCode;
    private String devPassword;

    public Dev(String devCode, String devPassword) {
        this.devCode = devCode;
        this.devPassword = devPassword;
    }

    public Dev() { }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "devCode='" + devCode + '\'' +
                ", devPassword='" + devPassword + '\'' +
                '}';
    }
}
