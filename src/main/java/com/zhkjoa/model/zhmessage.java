package com.zhkjoa.model;

public class zhmessage {
    private Integer mId;

    private String mName;

    private String mTitle;

    private String mData;

    private String mTime;

    private String mDepartment;

    private Integer mState;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle == null ? null : mTitle.trim();
    }

    public String getmData() {
        return mData;
    }

    public void setmData(String mData) {
        this.mData = mData == null ? null : mData.trim();
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime == null ? null : mTime.trim();
    }

    public String getmDepartment() {
        return mDepartment;
    }

    public void setmDepartment(String mDepartment) {
        this.mDepartment = mDepartment == null ? null : mDepartment.trim();
    }

    public Integer getmState() {
        return mState;
    }

    public void setmState(Integer mState) {
        this.mState = mState;
    }
}