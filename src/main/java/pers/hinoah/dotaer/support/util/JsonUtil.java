package pers.hinoah.dotaer.support.util;

import com.google.gson.Gson;

/**
 * @auther hinoah
 * @date 16/10/29 下午1:05
 */
public class JSONUtil {

    public static <T> String toJson(T t) {
        Gson gson = new Gson() ;
        return gson.toJson(t);
    }

    public static <T> T toObject(String json, Class<T> obj) {
        Gson gson = new Gson() ;
        return gson.fromJson(json, obj);
    }

}
