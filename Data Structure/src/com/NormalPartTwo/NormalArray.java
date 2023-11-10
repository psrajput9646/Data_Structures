package com.NormalPartTwo;

import java.util.ArrayList;
import java.util.Objects;

public class NormalArray {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // [ 5,1,true,[1,2],obj1(a,1)]
        class Struden {
            String a;
            int b;
            public Struden(String a ,int b){
                this.a=a;
                this.b=b;
            }
        }

        Struden s=new Struden("pk",1);


        ArrayList sub=new ArrayList();
        sub.add(1);
        sub.add(2);

        ArrayList sum=new ArrayList();
        sum.add(5);
        sum.add(1);
        sum.add(true);
        sum.add(sub);
        sum.add(s);

        int count =0;
        for(int i=0;i<sum.size();i++){

            if(isIntValue(sum.get(i))){
                count+= (int)sum.get(i);
              //  System.out.println(sum.get(i)+" : "+sum.get(i).getClass());
            }else if(sum.get(i) instanceof ArrayList){
                ArrayList arrayList= (ArrayList) sum.get(i);
                for (int j = 0; j < arrayList.size(); j++) {
                 if (isIntValue(arrayList.get(j))){
                     count+= (int)arrayList.get(j);
                 }
                }
              //  System.out.println(sum.get(i)+" : "+sum.get(i).getClass());
            }else if(sum.get(i) instanceof Struden){
                Struden ss=(Struden) sum.get(i);
                if (isIntValue(ss.a)){
                    int ll= Integer.parseInt(ss.a);
                    count+= ll;
                }
                if (isIntValue(ss.b)){
                    count+= ss.b;
                }
               // System.out.println(ss.a+" : "+sum.get(i).getClass());
            }

        }
        System.out.println(count);

    }

    public static boolean isIntValue(Object ob){
        if(ob instanceof Integer){
            return true;
        }else {
            return false;
        }
    }
}
