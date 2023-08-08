package com.Normal;

import java.util.HashMap;
import java.util.Map;

public class OddOccurenceInArray {
    public static void main(String[] args) {
        int[] arr={8,3,6,5,2,4,3,4,2,5,6,9};
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
          if (map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
          }else {
              map.put(arr[i],1);
          }
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()%2!=0){
                System.out.println(entry.getKey());
              //  break; //for one number this logic will work
            }
        }
    }
}
