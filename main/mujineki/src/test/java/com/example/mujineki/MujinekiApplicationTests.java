package com.example.mujineki;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// MujinekiApplication.java をコンテキストの基点として指定
@SpringBootTest(classes = MujinekiApplication.class)
class MujinekiApplicationTests {

    @Test
    void contextLoads() {
        // このテストはアプリケーションコンテキストが正しくロードされるか確認する
    }

}