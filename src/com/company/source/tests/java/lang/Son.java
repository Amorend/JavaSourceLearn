package tests.java.lang;

import javafx.scene.Parent;

public class Son extends Parent {

    public static void main(String[] args) {
        Parent p = new Son();

    }

    Son(){
        System.out.println("我是儿子");
    }

    public void println(){

    }
}
