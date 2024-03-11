package com.springboot.cheatsheet.service.impl;

import com.springboot.cheatsheet.dto.response.MemoResponseDto;
import com.springboot.cheatsheet.service.MemoService;
import org.springframework.stereotype.Service;

@Service
public class MemoServiceImpl implements MemoService {
    @Override
    public MemoResponseDto getMemo() {
        return new MemoResponseDto(
                "Controller와 RestController의 차이",
                "Controller는 View를, RestController는 JSON을 반환한다.",
                "보통",
                "김승규"
        );
    }
}
