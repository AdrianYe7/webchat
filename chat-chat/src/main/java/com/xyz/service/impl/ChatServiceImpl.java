package com.xyz.service.impl;

import com.xyz.dao.ChatDao;
import com.xyz.service.ChatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Project webchat
 * @Package com.xyz.service.impl
 * @Description Chat Service Implement
 * @Date 2017/8/21
 * @USER AdrianYip
 * @COMPANY xCloud
 */
@Service("chatService")
public class ChatServiceImpl implements ChatService{
    @Resource
    private ChatDao chatDao;

    @Override
    public String test() {
        String test = chatDao.test();
        return test;
    }
}
