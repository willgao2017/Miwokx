package com.example.android.miwok;

/**
 * Created by will on 2017/5/19.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMivokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMivokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    boolean hasImage () {
        if (mImageResourceID == NO_IMAGE_PROVIDED)
            return false;
        else
            return true;
    }
}
