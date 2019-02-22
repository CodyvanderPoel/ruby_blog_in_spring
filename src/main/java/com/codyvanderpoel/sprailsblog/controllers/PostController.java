package com.codyvanderpoel.sprailsblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/new-post")
    public String NewPost() {
        return("new_post");
    }
}
