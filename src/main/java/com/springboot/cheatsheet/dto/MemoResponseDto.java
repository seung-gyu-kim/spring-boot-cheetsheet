package com.springboot.cheatsheet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

//    {
//        "title": "Controller와 RestController의 차이",
//        "content": "Controller는 View를, RestController는 JSON을 반환한다.",
//        "primary": "보통",
//        "author": "김승규",
//        "createdAt": "2024-03-09T11:27:51",
//        "updatedAt": "2024-03-10T12:00:00"
//    }

@Getter
@AllArgsConstructor
public class MemoResponseDto {
    private String title;
    private String content;
    private String primary;
    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
