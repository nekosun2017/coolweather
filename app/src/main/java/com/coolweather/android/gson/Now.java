package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sun on 2017/10/3.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        public String info;
    }
}
