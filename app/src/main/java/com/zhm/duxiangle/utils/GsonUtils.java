package com.zhm.duxiangle.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhm.duxiangle.bean.Book;
import com.zhm.duxiangle.bean.Page;
import com.zhm.duxiangle.bean.UserInfo;

import java.util.List;
import java.util.Objects;

/**
 * Created by zhuanghm(183340093@qq.com) on 2015/10/9.
 */
public class GsonUtils {
    private static GsonUtils skHttpUtils;
    private Gson gson;

    private GsonUtils() {
    }

    public static GsonUtils getInstance() {
        if (null == skHttpUtils) {
            skHttpUtils = new GsonUtils();
        }
        return skHttpUtils;
    }

    public <T> T json2Bean(String json, Class<T> tClass) {
        //gson源码已经对json空值进行判断
        if (null == gson) {
            gson = new Gson();
        }
//        return gson.fromJson(json, new TypeToken<T>() {
//        }.getType());
        return gson.fromJson(json, tClass);
    }

    public String bean2Json(Object object) {
        //gson源码已经对json空值进行判断
        if (null == gson) {
            gson = new Gson();
        }
        return gson.toJson(object);
    }

    public List<Book> getBooks(String json) {
        //gson源码已经对json空值进行判断
        if (null == gson) {
            gson = new Gson();
        }
        return gson.fromJson(json, new TypeToken<List<Book>>() {
        }.getType());
    }
    public Page<UserInfo> getUserInfos(String json) {
        //gson源码已经对json空值进行判断
        if (null == gson) {
            gson = new Gson();
        }
        return gson.fromJson(json, new TypeToken<Page<UserInfo>>() {
        }.getType());
    }

    public Page<Book> getPageBooks(String json) {
        //gson源码已经对json空值进行判断
        if (null == gson) {
            gson = new Gson();
        }
        return gson.fromJson(json, new TypeToken<Page<Book>>() {
        }.getType());
    }

}
