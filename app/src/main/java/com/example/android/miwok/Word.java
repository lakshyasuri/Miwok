package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;
    private int mResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioID;

    public Word(String defaultTranslation, String miwokTranslation,int audioID)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioID = audioID;
    }
    public Word(String defaultTranslation, String miwokTranslation, int resourceID, int audioID)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceID = resourceID;
        mAudioID = audioID;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getResourceID()
    {
        return mResourceID;
    }
    public boolean hasImage()
    {
        return mResourceID!=NO_IMAGE_PROVIDED;
    }
    public int getAudioID(){ return mAudioID; }
}
