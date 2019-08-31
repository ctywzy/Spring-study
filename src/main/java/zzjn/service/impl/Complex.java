package zzjn.service.impl;

import zzjn.service.IBookService;

import java.util.List;
import java.util.Map;

public class Complex implements IBookService {
    private String[] myStr;
    private List<String> myList;
    private Map<String,String> myMap;
    public void saveBook() {
        System.out.println(myStr.toString());
        System.out.println(myList.toString());
        System.out.println(myMap.toString());
    }


    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

}
