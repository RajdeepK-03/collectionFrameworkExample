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
        public static void exe1Func()
    {
        ArrayList<String>  mStringArrayList = new ArrayList<>();
        mStringArrayList.add("abc");
        mStringArrayList.add("Cab");
        mStringArrayList.add("Cat");
        mStringArrayList.add("mate");
        mStringArrayList.add("Atem");
        mStringArrayList.add("bac");
        mStringArrayList.add("Tac");
        mStringArrayList.add("atc");
        mStringArrayList.add("Pop");
        mStringArrayList.add("pat");
        mStringArrayList.add("123");
        mStringArrayList.add("231");
        mStringArrayList.add("431");
        System.out.printf(String.valueOf(mStringArrayList) + "\n");
        //
        ArrayList<String>  dupArrayLsit = new ArrayList<>();
        for (int i = 0; i < mStringArrayList.size(); i++){
            //
            ArrayList<String>  newArrayList = new ArrayList<>();
            for (int j = 0; j < mStringArrayList.size(); j++) {
                if(compStrings(mStringArrayList.get(i), mStringArrayList.get(j))) {
                    newArrayList.add(mStringArrayList.get(j));
                }
            }
            if(dupArrayLsit.equals(newArrayList)){
            }else{
                System.out.printf(String.valueOf(newArrayList) + "\n");
            }
            dupArrayLsit = newArrayList;
        }
    }
        public static Boolean compStrings(String var1, String var2) {
        /* check 1.
         * Used to check the Length
         *  */
        if(var1.length() != var2.length()){
            return false;
        }
        /* check 2.
         * Used to check the Characters
         *  */
        int c = 0;
        char[] charArray1 = var1.toCharArray();
        char[] charArray2 = var2.toCharArray();
        //
        for (int i = 0; i < charArray1.length; i++){
            //
            for (int j = 0; j < charArray2.length; j++){
                char str =  charArray1[i];
                if(Character.toLowerCase(charArray1[i]) == Character.toLowerCase(charArray2[j])){
                    c++;
                }
            }
        }
        if(c == charArray1.length){
            return true;
        }else{
            return false;
        }
    }





}
