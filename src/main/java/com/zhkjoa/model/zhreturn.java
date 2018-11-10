package com.zhkjoa.model;

public class zhreturn {
    private Integer rId;

    private String rName;

    private String rTitle;

    private String rData;

    private String rTime;

    private Integer rState;

    private String rDepartment;

    private String rManagername;

    private String rReason;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrTitle() {
        return rTitle;
    }

    public void setrTitle(String rTitle) {
        this.rTitle = rTitle == null ? null : rTitle.trim();
    }

    public String getrData() {
        return rData;
    }

    public void setrData(String rData) {
        this.rData = rData == null ? null : rData.trim();
    }

    public String getrTime() {
        return rTime;
    }

    public void setrTime(String rTime) {
        this.rTime = rTime == null ? null : rTime.trim();
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    public String getrDepartment() {
        return rDepartment;
    }

    public void setrDepartment(String rDepartment) {
        this.rDepartment = rDepartment == null ? null : rDepartment.trim();
    }

    public String getrManagername() {
        return rManagername;
    }

    public void setrManagername(String rManagername) {
        this.rManagername = rManagername == null ? null : rManagername.trim();
    }

    public String getrReason() {
        return rReason;
    }

    public void setrReason(String rReason) {
        this.rReason = rReason == null ? null : rReason.trim();
    }
}