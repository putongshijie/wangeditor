package com.kaixuan.service.impl;


import com.kaixuan.mapper.UserInfoMapper;

import com.kaixuan.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;




}
