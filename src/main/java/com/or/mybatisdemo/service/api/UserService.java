package com.or.mybatisdemo.service.api;

import com.or.mybatisdemo.domain.eneity.User;
import com.or.mybatisdemo.query.QueryUser;

import java.util.List;


/**
 * @ClassName
 * @Description TODO
 * @Author lushuaiyu
 * @Data 2019-05-12 13:09
 * @Version 1.0
 */
public interface UserService {
    public List<User> queryParams(String page, String limit, QueryUser queryUser);
}
