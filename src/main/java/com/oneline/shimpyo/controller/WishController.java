package com.oneline.shimpyo.controller;

import com.oneline.shimpyo.service.WishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WishController {
    private final WishService wishService;
}