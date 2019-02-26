package com.example.android.miwok;



public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId =NO_IMAGE_PROVIDED;
    private static int NO_IMAGE_PROVIDED =-1;

    public Word(String DefaultTranslation, String MiwokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }
    public Word(String DefaultTranslation, String MiwokTranslation,int ImageResourceId){
        mDefaultTranslation = DefaultTranslation;
        mImageResourceId=ImageResourceId;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResource(){
        return mImageResourceId;
    }
    public boolean hasImageResource(){
       return mImageResourceId != NO_IMAGE_PROVIDED;

    }


}
