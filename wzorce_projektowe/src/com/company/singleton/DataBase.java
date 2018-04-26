package com.company.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {

    private static DataBase instance=null;
    private List<String> list;


    private DataBase() {
        list=new ArrayList<>();
    }

    public static DataBase getInstance(){
        if(instance==null){
            instance=new DataBase();
        }
        return instance;
    }

    public void add(String... value){
        list.addAll(Arrays.asList(value));
    }

    public void showAll(){
        System.out.println(list);
    }
}
