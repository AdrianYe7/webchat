package com.xyz.controller;

import com.xyz.service.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Project webchat
 * @Package com.xyz.controller
 * @Description Chat Controller
 * @Date 2017/8/17
 * @USER AdrianYip
 * @COMPANY xCloud
 */
@Controller
@RequestMapping("/chat")
public class ChatController {
    @Resource
    private ChatService chatService;

    @RequestMapping("/main")
    public ModelAndView main(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("chat/chat-main");
        String test = chatService.test();
        System.out.println("-----------------------test = " + test + "----------------------");
        return mav;
    }
}
