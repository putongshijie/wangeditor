package com.kaixuan.service.impl;

import com.kaixuan.mapper.MessageInfoMapper;
import com.kaixuan.pojo.MessageInfo;
import com.kaixuan.service.MessageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageInfoServiceImpl implements MessageInfoService {

    @Autowired
    MessageInfoMapper messageInfoMapper;


    @Transactional(propagation = Propagation.REQUIRED)
    public int addMessage(MessageInfo messageInfo) {
        return messageInfoMapper.addMessage(messageInfo);
    }
}
