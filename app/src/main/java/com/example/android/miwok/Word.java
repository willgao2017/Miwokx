package com.example.android.miwok;

/**
 * Created by will on 2017/5/19.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMivokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMivokTranslation;
    }
}
