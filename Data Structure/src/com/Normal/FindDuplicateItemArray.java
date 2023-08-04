package com.Normal;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateItemArray {
    public static void main(String[] args) {
        duplicateItemArr();
        duplicateItemUsingSet();
    }

  static  void duplicateItemArr(){
        int n[]= {5,6,2,3,4,2,5,7,8};
        for (int i = 0; i < n.length; i++) {
            int cont=0;
            for (int j = i; j < n.length; j++) {
                if (n[i]==n[j]){
                    cont++;
                    if (cont>1){
                        System.out.println(n[j]);
                        break;
                    }
                }
            }
        }
    }

    static void duplicateItemUsingSet(){
        int n[]= {5,6,2,3,4,2,5,7,8};
        Set set=new HashSet<Integer>();
        for (int i = 0; i < n.length; i++) {
           if (set.add(n[i])==false){
               System.out.println(n[i]);
           }else {
               set.add(n[i]);
           }
        }
    }
}
