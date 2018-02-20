package com.spring.controller;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

import com.spring.controller.TodoItems;

@Controller
public class TodoController {
    LinkedList<String> items= new LinkedList<String>();

    @GetMapping("/")
    public ModelAndView showTodoApp() {
        ModelAndView model = new ModelAndView("TodoList");
        return model;
    }
    @PostMapping("/submit")
    public ModelAndView showTodoList( @ModelAttribute("todoItems1") TodoItems todoItems1) {
        ModelAndView model1 = new ModelAndView("TodoList");

        String listItem = todoItems1.getListItem();
        LinkedList<String> lisst = todoItems1.getLisst();
        LinkedList<String> editedItems = todoItems1.getTTT();
//the following piece of code adds 'listItem' to 'items' and 'editedItems' lists
        if(todoItems1.getListItem()!= "") {
            items.add(listItem);
            editedItems.add(listItem);
//            if(!editedItems.contains(listItem)){
//                editedItems.add(listItem);
//            }
        }
//the following code snippet removes the completed items from both lists
        if(lisst != null) {
            for(String item: lisst) {
                if(items.contains(item)) {
                    items.remove(item);
                }
            }
            for(String item: lisst) {
                if(editedItems.contains(item)) {
                    editedItems.remove(item);
                }
            }
        }
//following code updates the original list("items") based on the list "editedItems"
        if(items != editedItems) {
            items = editedItems;
        }

        model1.addObject("editedItems", editedItems);
        model1.addObject("todoItem", items);
        model1.addObject("lisst", lisst);
        return model1;
    }

}

