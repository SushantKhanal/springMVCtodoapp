package com.spring.controller;

import java.util.LinkedList;

public class TodoItems {

    private Long id;
    private String listItem;
    private String submitted;
    private LinkedList<String> TTT;
    private LinkedList<String> lisst;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListItem() {
        return listItem;
    }

    public void setListItem(String listItem) {
        this.listItem = listItem;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public LinkedList<String> getTTT() {
        if (TTT == null) {
            TTT = new LinkedList<>(TTT);
        }
        return TTT;
    }

    public void setTTT(LinkedList<String> TTT) {
        this.TTT = TTT;
    }

    public LinkedList<String> getLisst() {
        if (lisst == null) {
            lisst = new LinkedList<>(lisst);
        }
        return lisst;
    }

    public void setLisst(LinkedList<String> lisst) {
        this.lisst = lisst;
    }
}
