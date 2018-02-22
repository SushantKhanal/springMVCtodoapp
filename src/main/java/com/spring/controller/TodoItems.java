package com.spring.controller;

import java.util.LinkedList;

public class TodoItems {

    private String listItem;
    private String submitted;
    private LinkedList<String> editedItems;
    private LinkedList<String> markedItems;
    private LinkedList<String> idOfMarkedItems;

//the getter and setter methods for the above varriables are listed below

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

    public LinkedList<String> getEditedItems() {
        if (editedItems == null) {
            editedItems = new LinkedList<String>();
        }
        return editedItems;
    }

    public void setEditedItems(LinkedList<String> editedItems) {
        this.editedItems = editedItems;
    }

    public LinkedList<String> getMarkedItems() {
        if (markedItems == null) {
            markedItems = new LinkedList<String>();
        }
        return markedItems;
    }

    public void setMarkedItems(LinkedList<String> lisst) {
        this.markedItems = lisst;
    }

    public LinkedList<String> getIdOfMarkedItems() {
        if (idOfMarkedItems == null) {
            idOfMarkedItems = new LinkedList<String>();
        }
        return idOfMarkedItems;
    }

    public void setIdOfMarkedItems(LinkedList<String> idOfMarkedItems) {
        this.idOfMarkedItems = idOfMarkedItems;
    }
}
