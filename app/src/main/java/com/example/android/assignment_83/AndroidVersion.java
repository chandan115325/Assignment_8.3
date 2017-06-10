package com.example.android.assignment_83;

/**
 * Created by CHANDAN on 6/10/2017.
 */

public class AndroidVersion {
    // Android version number like 1.0,2.0,etc
    private String mAndroidVersionName;
    //Drawable image id
    private int mImageResourceId;

    /**
     * constructor to initialize the parameters
     * @param androidVersion
     * @param imageResourceId
     */
    public AndroidVersion(String androidVersion, int imageResourceId){
        mAndroidVersionName = androidVersion;
        mImageResourceId = imageResourceId;
    }

    public String getmAndroidVersion() {
        return mAndroidVersionName;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
