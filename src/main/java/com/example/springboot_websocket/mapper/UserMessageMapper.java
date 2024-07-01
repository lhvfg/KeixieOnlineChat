package com.example.springboot_websocket.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_websocket.bean.UserMessage;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMessageMapper extends BaseMapper<UserMessage> {

}
