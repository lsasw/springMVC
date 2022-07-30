package org.example.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.NonNull;

import java.text.SimpleDateFormat;

/**
 * @author lbenb
 * @version 1.0
 */
public class JsonUtil {
    public static String getJson(Object obj) {
        return getJson(obj, "yyyy-MM-dd HH:mm:ss");
    }


    public static String getJson(Object obj, String dateFormat) {

        ObjectMapper objm = new ObjectMapper();

        //关闭时间戳的显示
        objm.configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS, false);

        SimpleDateFormat format = new SimpleDateFormat(dateFormat);

        objm.setDateFormat(format);
        try {
            return objm.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
