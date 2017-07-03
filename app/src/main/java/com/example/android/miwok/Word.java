package com.example.android.miwok;

/**
 * Created by Nitika Kamboj on 16-06-2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceid=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation,int imageresourceid,int audioresourceid) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceid=imageresourceid;
        mAudioResourceId=audioresourceid;
    }

    public Word(String defaultTranslation, String miwokTranslation,int audioresourceid)
     {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation=miwokTranslation;
         mAudioResourceId=audioresourceid;
    }
    public String getDefaultTranslation()
    {
     return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
     return mMiwokTranslation;
    }
    public int getImageResourceid()
    {
    return mImageResourceid;
    }
    public boolean hasImage()
    {
     return mImageResourceid!=NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceId()
    {
     return mAudioResourceId;
    }
}

