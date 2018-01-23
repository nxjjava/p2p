package com.p2p.service;

import com.p2p.util.Response;

/**
 * Created by 91908 on 2018/1/23.
 */
public interface UserService {
    Response login(String username, String password);
}
