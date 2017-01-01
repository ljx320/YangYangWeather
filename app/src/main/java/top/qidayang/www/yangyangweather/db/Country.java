package top.qidayang.www.yangyangweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 69133 on 2017/1/1.
 */

public class Country extends DataSupport {
    private  int id;
    private  String cityName;
    private int cityCode;
    private int provinceCode;


    public int getId(){
        return  id;

    }

    public  void setId(int id){
        this.id=id;

    }

    public String getCityName(){
        return  cityName;

    }

    public void setCityName(String cityName){

        this.cityName=cityName;
    }

    public  int getCityCode(){
        return  this.cityCode;

    }

    public  void  setCityCode(int cityCode){
        this.cityCode=cityCode;

    }

    public  int getProvinceCode(){
        return  provinceCode;

    }

    public  void  setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;

    }
}
