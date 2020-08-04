package com.company.test.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {

        Collection collection = new ArrayList(10),
        collection1 = new ArrayList(10);
        collection.add("1");
        collection.add("2");
        collection.add("3");
        //collection1.add(null);
        System.out.println(collection.addAll(collection1));
        System.out.println(collection);
        System.out.println(collection1);

    }

    public static void m2() {
        Collection collection = new ArrayList();

        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");

        collection.add(new Integer(3));
        collection.add(new Integer(1));
        collection.add(new Integer(1));
        collection.add(new Integer(2));
        Collection a = new ArrayList();
        a.add("1");
        Collection b = a,c = collection;
        c.add(a);
        c.add(collection);

        boolean bb = collection.containsAll(collection);

        System.out.println(b);
        System.out.println(a.containsAll(c));
        System.out.println(a.containsAll(collection));
        System.out.println(collection.containsAll(a));
        System.out.println(collection.containsAll(b));
        System.out.println(collection.containsAll(c));
        System.out.println(c.containsAll(a));
        System.out.println(collection);
    }

    public static void m(Collection collection1) {

        Collection collection = collection1;

        Object[] objects = collection.toArray();
        for (Object object : objects) {

            System.out.println(object);
        }
//        String [] ts = {""};
//        Integer arr[] = {1};
//        Object[] objects = collection.toArray(ts);
//        for (Object object : objects) {
//            String object1 = (String) object;
//            System.out.println(object1);
//        }
    }

}
