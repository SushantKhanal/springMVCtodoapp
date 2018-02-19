package com.spring.controller;

import java.util.ArrayList;

public class TodoItems {
    private String listItem;

    private ArrayList<String> lisst;
    public ArrayList<String> getLisst() {
        return lisst;
    }

    public void setLisst(ArrayList<String> lisst) {
        this.lisst = lisst;
    }



    public String getListItem() {
        return listItem;
    }

    public void setListItem(String listItem) {
        this.listItem = listItem;
    }

}
