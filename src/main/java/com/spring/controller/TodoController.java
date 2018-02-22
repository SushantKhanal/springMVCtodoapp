package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class TodoController {
    LinkedList<String> items = new LinkedList<String>();

    @GetMapping("/")
    public ModelAndView showTodoApp() {
        ModelAndView model = new ModelAndView("TodoList");
        return model;
    }

    @PostMapping("/submit")
    public ModelAndView showTodoList(@ModelAttribute("todoItems1") TodoItems todoItems1) {
        ModelAndView model1 = new ModelAndView("TodoList");

        String listItem = todoItems1.getListItem();
        String submitted = todoItems1.getSubmitted();
        String check = "Clear Completed";
        LinkedList<String> markedItems = todoItems1.getMarkedItems();
        LinkedList<String> editedItems = todoItems1.getEditedItems();
        LinkedList<String> idOfMarkedItems = todoItems1.getIdOfMarkedItems();

//the following piece of code adds newly created item to the lists
        if (todoItems1.getListItem() != "") {
            items.add(listItem);
            editedItems.add(listItem);
        }

//the following code snippet removes the completed items from both lists
        if (submitted.equals(check)) {
            if (markedItems != null) {
                for (String item : markedItems) {
                    if (items.contains(item)) {
                        items.remove(item);
                    }
                }
                for (String item : markedItems) {
                    if (editedItems.contains(item)) {
                        editedItems.remove(item);
                    }
                }
            }
        }

//following code updates the original list("items") based on the list "editedItems"
        if (items != editedItems) {
            items = editedItems;
        }
        model1.addObject("idOfMarkedItems", idOfMarkedItems);
        model1.addObject("todoItems", items);
        model1.addObject("markedItems", markedItems);
        return model1;
    }

}

