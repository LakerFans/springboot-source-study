package com.study.jj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.jj.mapper.BaseMapper;
import com.study.jj.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private BaseMapper baseMapper;

    @Override
    public void get() {
        baseMapper.getById(1);
    }
}
