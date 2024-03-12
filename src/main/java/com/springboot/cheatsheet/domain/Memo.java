package com.springboot.cheatsheet.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memo_id", nullable = false)
    private Long id;

    @Column(name = "memo_title")
    private String title;

    @Column(name = "memo_content")
    private String content;

    @Column(name = "memo_primary")
    private String primary;

    @Column(name = "memo_author")
    private String author;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
