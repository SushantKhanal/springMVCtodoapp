package com.spring.services;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : Suraj Gautam
 *         <suraj.gautam@f1soft.com>
 */
public class ItemIdMap {
    private ArrayList<String> ids= new ArrayList<>();
    private ArrayList<String> items = new ArrayList<>();
    private Map<String,String> map = new LinkedHashMap<String,String>();  // ordered

    public Map createItemIdMap(String item) {

        String elemId = this.getRandomNumber();
        ids.add(item);
        if(ids.contains(elemId) || ids.isEmpty()) {
            elemId = this.getRandomNumber();
        }

        if(!ids.contains(elemId)){
            ids.add(elemId);
        }

        for(int i=0; i<items.size(); i++) {
            map.put(ids.get(i), items.get(i));
        }
        return map;
    }
    private String getRandomNumber() {
        RandomNumber random1 = new RandomNumber();
        int id = random1.generate();
        String elemId = Integer.toString(id);
        return elemId;
    }
}
