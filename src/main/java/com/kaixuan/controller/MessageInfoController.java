package com.kaixuan.controller;


import com.kaixuan.pojo.MessageInfo;
import com.kaixuan.service.MessageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageInfoController {

    @Autowired
    MessageInfoService messageInfoService;


    @RequestMapping("addMessage")
    public Object addMessage(@RequestBody MessageInfo messageInfo){

        int i = messageInfoService.addMessage(messageInfo);

        if (i>0){
            return true;
        }else {
            return false;
        }


    }





}
