package com.quiz.quizback.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/test")
public class TestController {

    // 기본페이지 테스트
    @GetMapping("")
    public String index() {
        return "안녕하세요. 현재 서버의 시간은 " + new Date() + "입니다 !";
    }
}
