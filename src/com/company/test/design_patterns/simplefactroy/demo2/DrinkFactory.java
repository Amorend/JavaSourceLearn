package com.company.test.design_patterns.simplefactroy.demo2;

import com.company.test.design_patterns.simplefactroy.demo1.Drink;

/**
 * 简单工厂
 */
public class DrinkFactory {
    public final static int DRINK_COCO = 1;
    public final static int DRINK_APPLE = 2;
    public final static int DRINK_ORANGE = 3;
    public static Drink getDrink(String classname){
        try {
            return (Drink) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
