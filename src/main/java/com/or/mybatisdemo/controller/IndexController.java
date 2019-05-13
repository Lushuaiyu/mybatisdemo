package com.or.mybatisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName
 * @Description TODO
 * @Author lushuaiyu
 * @Data 2019-05-12 08:42
 * @Version 1.0
 */
@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("in")
    public String index(){
        return "login";
    }
}
