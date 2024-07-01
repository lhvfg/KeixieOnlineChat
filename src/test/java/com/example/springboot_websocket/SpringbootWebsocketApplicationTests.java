package com.example.springboot_websocket;

import com.example.springboot_websocket.mapper.UserMessageMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebsocketApplicationTests {
    @Autowired
    private UserMessageMapper webSocketMapper;

//    @Test
//    public void contextLoads() {
//        UserMessage userMessage = new UserMessage("11111", "11111111");
//        webSocketMapper.insert(userMessage);
//    }


}
