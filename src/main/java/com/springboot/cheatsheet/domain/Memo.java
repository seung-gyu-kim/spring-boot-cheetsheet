package com.springboot.cheatsheet.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Memo {
    private String title;
    private String content;
    private String primary;
    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
