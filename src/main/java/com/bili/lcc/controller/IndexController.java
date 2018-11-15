package com.bili.lcc.controller;

import com.bili.lcc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author songzhiheng
 * @date 2018/11/14
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
