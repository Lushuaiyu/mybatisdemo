package com.or.mybatisdemo.controller;

import com.or.mybatisdemo.domain.eneity.User;
import com.or.mybatisdemo.query.QueryUser;
import com.or.mybatisdemo.service.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @ClassName
 * @Description TODO
 * @Author lushuaiyu
 * @Data 2019-05-12 14:12
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("queryParams")
    public List<User> queryParams(@RequestParam(defaultValue = "1") String page,
                                  @RequestParam(defaultValue = "5") String limit,
                                  QueryUser queryUser){
        queryUser.setPage(page);
        queryUser.setLimit(limit);
        return userService.queryParams(page,limit, queryUser);




    }
}
