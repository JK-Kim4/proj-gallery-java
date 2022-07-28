package com.gallery.admin.controller.post;

import com.gallery.admin.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService postService;

}
