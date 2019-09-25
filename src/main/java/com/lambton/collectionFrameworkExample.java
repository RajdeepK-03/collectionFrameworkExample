package com.lambton;

import java.util.*;

public class collectionFrameworkExample
{
    public static void main (String[] args) {
        // arraylist

        ArrayList<String> mStringArrayList = new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("D");
        mStringArrayList.add("A");
        mStringArrayList.add("A");

        for (int i = 0; i < mStringArrayList.size(); i++) {
            System.out.println(mStringArrayList.get(i).toString());
        }
        for (String s : mStringArrayList) {
            System.out.println(s);
        }
        //   set **********


        Set<String> mySet = new HashSet<>();
        mySet.add("Punjab");
        mySet.add("UP");
        mySet.add("Gujrat");
        System.out.println(mySet);
        mySet.add("Punjab");
        System.out.println(mySet);

        //Map***************

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("IND", "India");
        stringMap.put("CAD", "Canada");
        stringMap.put("JAP", "Japan");
        stringMap.put("PAK", "Pakistan");
        System.out.println(stringMap);
        stringMap.put("IND", "New India");
        System.out.println(stringMap);
    }




}
