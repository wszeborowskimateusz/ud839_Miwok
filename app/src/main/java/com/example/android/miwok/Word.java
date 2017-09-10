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

    public Word(String def, String miwok){
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = def;
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
}
