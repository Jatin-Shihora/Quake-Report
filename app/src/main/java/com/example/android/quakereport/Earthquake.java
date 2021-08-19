package com.example.android.quakereport;

public class Earthquake {
    /**Magnitude of the earthquake*/
    private double mMagnitude;
    /**Location of the earthquake*/
    private String mLocation;
    /**Date of the earthquake*/
    private String mDate;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    /**construct a new (@link Earthquake) object.
     *
     * @param magnitude is the magnitude(size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time when the earthquake happened
     * @param url is the website URL to find more details about the earthquake*/
    public Earthquake(double magnitude , String location ,long timeInMilliseconds, String url){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl = url;
    }

    /**returns the magnitude of the earthquake*/
    public double getMagnitude(){
        return mMagnitude;
    }
    /**returns the location of the earthquake*/
    public String getLocation(){
        return mLocation;
    }
    /**returns the date of the earthquake*/
    public String getDate(){
        return mDate;
    }
    /**returns the time of earthquake*/
    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
    /*** Returns the website URL to find more information about the earthquake.*/
    public String getUrl() { return mUrl; }

}
