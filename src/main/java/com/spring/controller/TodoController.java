package com.spring.controller;

import jdk.nashorn.internal.ir.RuntimeNode;
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
import com.spring.controller.TodoItems;

@Controller
public class TodoController {
    List<String> items= new ArrayList<String>();
    @GetMapping("/")
    public ModelAndView showTodoApp() {
        ModelAndView model = new ModelAndView("TodoList");
        return model;
    }
    @PostMapping("/submit")
    public ModelAndView showTodoList( @ModelAttribute("todoItems1") TodoItems todoItems1) {
        ModelAndView model1 = new ModelAndView("TodoList");
        if(todoItems1.getListItem()!= "") {
            items.add(todoItems1.getListItem());
        }

        List<String> lisst = todoItems1.getLisst();


        if(lisst != null) {
            for(String item: lisst) {
                if(items.contains(item)) {
                    items.remove(item);
                }
            }
        }

        model1.addObject("todoItem", items);
        model1.addObject("lisst", lisst);
        return model1;
    }

}

