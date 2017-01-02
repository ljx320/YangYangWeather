package top.qidayang.www.yangyangweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 69133 on 2017/1/2.
 */

public class Now {

    @SerializedName("tmp")
    public  String tmperature;

    @SerializedName("cond")
    public More more;

    public class  More{
        @SerializedName("txt")
        public  String info;

    }

}
