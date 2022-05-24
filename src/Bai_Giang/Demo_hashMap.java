package Bai_Giang;

import java.util.*;

public class Demo_hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        Queue<Integer>queue = new LinkedList<>()  ;
        queue.add(1);
        queue.add(2);
        queue.add(3);
        ((LinkedList)queue).addFirst(2);
        System.out.println(queue.peek());
        for(int i=0;i< queue.size();i++){
            System.out.println(queue);
        }
        hashMap.put(1,"the");
        hashMap.put(2,"duong");
        hashMap.put(3,"minh");
        hashMap.put(4,"nam");
        hashMap.put(5,"duc");
        Set<Integer> keys= hashMap.keySet();
        for(Integer i:keys){
            System.out.println(hashMap.get(i));
        }
        System.out.println("========================");
//        duyệt thông qua Entry
        Set<Map.Entry<Integer,String>> entryS = hashMap.entrySet();
        for(Map.Entry<Integer,String>e :entryS){
            System.out.println("key: "+e.getKey()+"value: "+e.getValue());
        }
    }
}
