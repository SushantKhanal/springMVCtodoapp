package com.spring.controller;

import java.util.LinkedList;

public class TodoItems {
    private String listItem;
    private LinkedList<String> TTT = new LinkedList<String>();

    public LinkedList<String> getTTT() {
        return TTT;
    }

    public void setTTT(LinkedList<String> TTT) {
        this.TTT = TTT;
    }

    private LinkedList<String> lisst;
    public LinkedList<String> getLisst() {
        return lisst;
    }

    public void setLisst(LinkedList<String> lisst) {
        this.lisst = lisst;
    }



    public String getListItem() {
        return listItem;
    }

    public void setListItem(String listItem) {
        this.listItem = listItem;
    }

}
