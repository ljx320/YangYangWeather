package top.qidayang.www.yangyangweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 69133 on 2017/1/2.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfrot comfrot;

    @SerializedName("cw")
    public CarWash carWash;

    public  Sport sport;

    public  class  Comfrot{

        @SerializedName("txt")
        public  String info;

    }

    public class  CarWash{

        @SerializedName("txt")
        public  String info;

    }

    public  class  Sport{
        @SerializedName("txt")
        public String info;

    }
}
