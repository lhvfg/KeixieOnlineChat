package com.example.springboot_websocket.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_websocket.bean.UserMessage;
import com.example.springboot_websocket.mapper.UserMessageMapper;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */

@Service
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
