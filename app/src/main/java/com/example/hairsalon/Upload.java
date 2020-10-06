package com.example.hairsalon;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mPrice;
    private String mImageUrl;
    private String mKey;

    public Upload() {
    }

    public Upload(String mName , String mPrice , String mImageUrl) {
        this.mName = mName;
        this.mPrice = mPrice;
        this.mImageUrl = mImageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmKey() {
        return mKey;
    }

    public void setmKey(String mKey) {
        this.mKey = mKey;
    }
}

