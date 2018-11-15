package com.bili.lcc.config;

import com.bili.lcc.utils.ResponseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author songzhiheng
 * @date 2018/11/15
 */
public class MyAccessDeniedHandler implements org.springframework.security.web.access.AccessDeniedHandler {
    @Autowired
    private static final Logger logger = LoggerFactory.getLogger(MyAccessDeniedHandler.class);
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ResponseUtils.printJson(response,"无权限");
        logger.info("无权限");
    }
}
