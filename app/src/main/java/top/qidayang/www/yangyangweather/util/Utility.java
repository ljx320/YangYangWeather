package top.qidayang.www.yangyangweather.util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import top.qidayang.www.yangyangweather.db.City;
import top.qidayang.www.yangyangweather.db.Country;
import top.qidayang.www.yangyangweather.db.Province;

/**
 * Created by 69133 on 2017/1/1.
 */

public class Utility {

    public static boolean handleProvinceResponse(String response) {

        if (!TextUtils.isEmpty(response)) {

            try {
                JSONArray allProvince = new JSONArray(response);

                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();

                }
                return true;

            } catch (JSONException e) {
                e.printStackTrace();

            }

        }
        return false;


    }

    public static boolean handleCityResponse(String response, int provinceId) {

        if (!TextUtils.isEmpty(response)) {

            try {

                JSONArray allCities = new JSONArray(response);

                for (int i = 0; i < allCities.length(); i++) {

                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();

                }
                return true;

            } catch (JSONException e) {

                e.printStackTrace();
            }

        }
        return false;


    }

    public static boolean handleCountryResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {

            try {
                JSONArray allCountries = new JSONArray(response);

                for (int i = 0; i < allCountries.length(); i++) {
                    JSONObject contryObject = allCountries.getJSONObject(i);
                    Country country = new Country();
                    country.setCountryName(contryObject.getString("name"));
                    country.setWeatherId(contryObject.getString("weather_id"));
                    country.setCityId(cityId);
                    country.save();

                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();

            }
        }
        return false;


    }

}
