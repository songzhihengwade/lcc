package com.bili.lcc.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author songzhiheng
 * @date 2018/11/15
 */
public class ResponseUtils {
    public static void printJson(HttpServletResponse response,String message){
        PrintWriter writer = null;
        response.setHeader("Content-Type","application/json;charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(message);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.flush();
            writer.close();
        }
    }
}
