package com.feng.findfriends;

import com.feng.findfriends.once.InsertUsers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class FindFriendsApplicationTests {

    @Resource
    private InsertUsers insertUsers;

    @Test
    void contextLoads() {
        insertUsers.doInsertUsers();
    }

}
