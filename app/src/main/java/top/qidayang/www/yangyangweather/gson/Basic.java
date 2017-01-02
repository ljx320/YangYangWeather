package top.qidayang.www.yangyangweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 69133 on 2017/1/2.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public  class  Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
