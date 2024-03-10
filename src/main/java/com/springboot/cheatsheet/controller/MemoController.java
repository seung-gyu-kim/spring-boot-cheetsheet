package com.springboot.cheatsheet.controller;

import com.springboot.cheatsheet.dto.response.MemoResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoController {
    //    {
//        "title": "Controller와 RestController의 차이",
//        "content": "Controller는 View를, RestController는 JSON을 반환한다.",
//        "primary": "보통",
//        "author": "김승규",
//        "createdAt": "2024-03-09T11:27:51",
//        "updatedAt": "2024-03-10T12:00:00"
//    }
    @GetMapping("/")
    public MemoResponseDto getMemo() {
        return new MemoResponseDto(
                "Controller와 RestController의 차이",
                "Controller는 View를, RestController는 JSON을 반환한다.",
                "보통",
                "김승규"
        );
    }
}
