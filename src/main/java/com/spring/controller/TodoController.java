package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class TodoController {
    Map<String, Boolean> items= new HashMap<String, Boolean>();
    @GetMapping("/")
    public ModelAndView showTodoApp() {
        ModelAndView model = new ModelAndView("TodoList");
        return model;
    }
//    @PostMapping("/submit")
//    public ModelAndView showTodoList( @ModelAttribute("todoItems1") TodoItems todoItems1) {
//        ModelAndView model1 = new ModelAndView("TodoList");
//        return model1;
//    }
    @PostMapping("/submit")
    public ModelAndView showTodoList(@RequestParam("listItem") String item) {
        ModelAndView model1 = new ModelAndView("TodoList");
        items.put(item, true);
//        for(String xxx : items) {
//
//        }
        model1.addObject("todoItem", items);
        return model1;
    }
}

