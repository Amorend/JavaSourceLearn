package com.company.test.design_patterns.com.wdzl.simplefactroy.demo1;

/**
 * 简单工厂
 */
public class DrinkFactory {
    public final static int DRINK_COCO = 1;
    public final static int DRINK_APPLE = 2;
    public final static int DRINK_ORANGE = 3;
    public static Drink getDrink(int sel){
        switch (sel){
            case DRINK_COCO:
                return new CoCoDrink();
            case DRINK_ORANGE:
                return new OrangeDrink();
            case DRINK_APPLE:
                return new AppleDrink();
            default:
                return new Drink() {
                    @Override
                    public void drink() {
                        System.out.println("水");
                    }
                };
        }
    }
}
