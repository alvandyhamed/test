package com.parsparand.halvandi.mycolllibrary;

/**
 * Created by h.alvandi on 10/31/2017.
 */

public class Point {
    float mLatitude;
    float mLongitude;

    public Point(float latitude, float longitude) {
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public float getLongitude() {
        return mLongitude;
    }
}
