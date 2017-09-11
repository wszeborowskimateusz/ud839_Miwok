package com.example.android.miwok;

/**
 * Created by Mateusz on 10/09/2017.
 * Te class represent a single wrd in application
 */

public class Word {

    /*A miwok translation of a word*/
    private String mMiwokTranslation;

    /*A default translation of a word*/
    private String mDefaultTranslation;

    /*Image ID*/
    private int mImageResourceId;

    /**/
    private boolean mHasImage;

    /**
     * Create new Word
     * @param def a default translation of a word
     * @param miwok a mewok translation of a word
     */
    public Word(String def, String miwok){
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = def;
        this.mHasImage = false;
    }

    /**
     * Create new Word
     * @param def a default translation of a word
     * @param miwok a mewok translation of a word
     * @param imageId an ID of an image for a word
     */
    public Word(String def, String miwok,int imageId){
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = def;
        this.mImageResourceId = imageId;
        this.mHasImage = true;
    }

    /**
     * @return the miwok translation of a word
     */
    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }

    /**
     * @return the default translation of a word
     */
    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }

    /**
     * @return the Id of the image
     */
    public int getImageResourceId(){
        return this.mImageResourceId;
    }

    /**
     * @return true if Adapter should load image and false when it should't
     */
    public boolean hasImage(){
        return this.mHasImage;
    }
}
