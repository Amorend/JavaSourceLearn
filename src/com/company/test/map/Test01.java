package com.company.test.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 extends HashMap {
    Map a;

    public static void main(String[] args) {
        Test01 m = new Test01();
        m.put("a", "1");
        m.put("b", "2");
//        m.replaceAll((key, value) -> (key + "1") + value);
//        m.putIfAbsent("c","2");

        System.out.println(m.remove(null, "1"));
        System.out.println(m);
//        Object orDefault1 = m.getOrDefault1("a", "aaaaaaaaaaa");
//        System.out.println(orDefault1);
//        System.out.println(m.forEach((o, o2) -> {
//
//        }));




    }

    public static void m2() {
        Map m = new HashMap<String, String>();
        m.put("a", "1");
        m.put("b", "2");
//        m.containsValue();
//        System.out.println(m.keySet());
//        System.out.println(m.entrySet());
        Set mm = m.entrySet();

//        System.out.println(m.containsValue("1"));
//        System.out.println(m.containsKey("a"));
//        m.getOrDefault("a",);

//        System.out.println(mm);
    }

//    V getOrDefault(Object key, V defaultValue) {
//        V v;
//        return (((v = (V) a.get(key)) != null) || a.containsKey(key))
//                ? v
//                : defaultValue;
//    }

    static void m1() {
        Comparator<Map.Entry<String, String>> entryComparator = Map.Entry.comparingByKey();
    }


    public Object getOrDefault1(Object key, Object defaultValue) {
        Object v;
        System.out.println((v = get(key)) != null);
        System.out.println(containsKey(key));
        Object o = (((v = get(key)) != null) | containsKey(key))
                ? v
                : defaultValue;

        return o;
    }
}



