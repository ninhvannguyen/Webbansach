package com.niit.java23;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Ninh");
        hm.put(2,"nam");
        hm.put(3,"Ngoc");
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.get(3));

/*        hm.remove(1);
        hm.remove(2);*/
        for (Integer key:hm.keySet()
             ) {
            System.out.println(key+ ":" +hm.get(key));
        }
        Iterator it =hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> obj=(Map.Entry)it.next();
            Integer key = obj.getKey();
            String value = obj.getValue();
            System.out.println(key+":"+value);
        }
        for (String value:hm.values()
             ) {
            System.out.println(value);
        }
        Hashtable<Integer,String> hm2=new Hashtable<>();
        hm2.put(1,"Ninh");
        hm2.put(2,"nam");
        hm2.put(3,"Ngoc");
//        hm2.put(4,null);
        System.out.println(hm2.get(1));
        System.out.println(hm2.get(2));
        System.out.println(hm2.get(3));

/*        hm2.remove(1);
        hm2.remove(2);*/
        for (Integer key:hm2.keySet()
        ) {
            System.out.println(key+ ":" +hm2.get(key));
        }
        Iterator it2 =hm2.entrySet().iterator();
        while (it2.hasNext()){
            Map.Entry<Integer,String> obj=(Map.Entry)it2.next();
            Integer key = obj.getKey();
            String value = obj.getValue();
            System.out.println(key+":"+value);
        }
        for (String value:hm2.values()
        ) {
            System.out.println(value);
        }
    }
}
