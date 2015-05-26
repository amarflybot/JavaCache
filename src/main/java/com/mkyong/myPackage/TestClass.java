package com.mkyong.myPackage;

/**
 * Created by amarendra on 23/05/15.
 */
public class TestClass {
    public static void main(String[] args) {

        try {
            System.out.println("In Try");
            throw new Exception();

        }
        catch (Exception e){
            System.out.println("In Catch");
            System.exit(1);

        }
        finally {
            System.out.println("In Finally");
        }
    }
}
