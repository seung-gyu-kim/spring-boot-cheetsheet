package com.springboot.cheatsheet.dto.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//    {
//        "title": "Controller와 RestController의 차이",
//        "content": "Controller는 View를, RestController는 JSON을 반환한다.",
//        "primary": "보통",
//        "author": "김승규",
//        "createdAt": "2024-03-09T11:27:51",
//        "updatedAt": "2024-03-10T12:00:00"
//    }

public class MemoResponseDto {
    private String title;
    private String content;
    private String primary;
    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public MemoResponseDto(String title, String content, String primary, String author) {
        this.title = title;
        this.content = content;
        this.primary = primary;
        this.author = author;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title + "추가된 내용입니다.";
    }

    public String getContent() {
        return content;
    }

    public String getPrimary() {
        if("보통".equals(primary)) {
            return  primary + " ~~~~~";
        }
        return primary;
    }

    public String getAuthor() {
        return author.substring(1);
    }

    public String getCreatedAt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
        return createdAt.format(formatter);       // 2024년03월10일
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
