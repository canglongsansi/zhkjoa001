package com.zhkjoa.model;

public class zhuser {
    private Integer zhId;

    private String zhUsername;

    private String zhPassword;

    private String zhDepartment;

    private String zhName;

    private String zhEmail;

    private String zhSex;

    private Integer zhState;

    public Integer getZhId() {
        return zhId;
    }

    public void setZhId(Integer zhId) {
        this.zhId = zhId;
    }

    public String getZhUsername() {
        return zhUsername;
    }

    public void setZhUsername(String zhUsername) {
        this.zhUsername = zhUsername == null ? null : zhUsername.trim();
    }

    public String getZhPassword() {
        return zhPassword;
    }

    public void setZhPassword(String zhPassword) {
        this.zhPassword = zhPassword == null ? null : zhPassword.trim();
    }

    public String getZhDepartment() {
        return zhDepartment;
    }

    public void setZhDepartment(String zhDepartment) {
        this.zhDepartment = zhDepartment == null ? null : zhDepartment.trim();
    }

    public String getZhName() {
        return zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName == null ? null : zhName.trim();
    }

    public String getZhEmail() {
        return zhEmail;
    }

    public void setZhEmail(String zhEmail) {
        this.zhEmail = zhEmail == null ? null : zhEmail.trim();
    }

    public String getZhSex() {
        return zhSex;
    }

    public void setZhSex(String zhSex) {
        this.zhSex = zhSex == null ? null : zhSex.trim();
    }

    public Integer getZhState() {
        return zhState;
    }

    public void setZhState(Integer zhState) {
        this.zhState = zhState;
    }
}