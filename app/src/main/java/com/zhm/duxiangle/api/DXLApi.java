package com.zhm.duxiangle.api;

/**
 * Created by Administrator on 2015/10/27.
 */
public class DXLApi {
    //login:http://localhost:8080/DuXiangLeServer/UserServlet?action=login
    //192.168.253.1
    public static String HOST = "192.168.173.1:8080";
    public static final String PORT = "";

    /**
     * 获取登录的url
     *
     * @return
     */
    public static String getUserApi() {

        return "http://"+HOST + PORT + "/DuXiangLeServer/UserServlet";
    }

}
