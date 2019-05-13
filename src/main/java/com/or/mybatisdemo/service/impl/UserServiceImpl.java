package com.or.mybatisdemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.or.mybatisdemo.domain.dao.UserMapper;
import com.or.mybatisdemo.domain.eneity.User;
import com.or.mybatisdemo.query.QueryUser;
import com.or.mybatisdemo.service.api.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @ClassName
 * @Description TODO
 * @Author lushuaiyu
 * @Data 2019-05-12 13:29
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryParams(String page, String limit, QueryUser queryUser) {



        String startNum = queryUser.getStartNum();
        String endNum = queryUser.getEndNum();
        String page1 = queryUser.getPage();
        int pageInt = Integer.parseInt(page1);
        String limit1 = queryUser.getLimit();
        int limitInt = Integer.parseInt(limit1);

        Map<String, Object> hashMap = new HashMap<>();

        hashMap.put("startNum", startNum);
        hashMap.put("endNum", endNum);
        hashMap.put("page", pageInt);
        hashMap.put("limit",  limitInt );
        List<User> users = userMapper.queryParams(hashMap);
        return users;


    }
}
