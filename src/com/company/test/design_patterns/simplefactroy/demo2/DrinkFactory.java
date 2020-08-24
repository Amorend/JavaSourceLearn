package com.company.test.design_patterns.simplefactroy.demo2;

import com.wdzl.simplefactroy.demo1.AppleDrink;
import com.wdzl.simplefactroy.demo1.CoCoDrink;
import com.wdzl.simplefactroy.demo1.Drink;
import com.wdzl.simplefactroy.demo1.OrangeDrink;

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
