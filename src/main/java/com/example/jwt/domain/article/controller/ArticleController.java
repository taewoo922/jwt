package com.example.jwt.domain.article.controller;

import com.example.jwt.domain.article.service.ArticleService;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/article", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class ArticleController {
    private final ArticleService articleService;

    @Data
    public static class LoginRequest {
        @NotBlank
        private String title;

        @NotBlank
        private String content;
    }



}
