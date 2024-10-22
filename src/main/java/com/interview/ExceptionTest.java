package org.example;

import java.util.Optional;

public class ExceptionTest {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        int count = 0;
        while(++i < --j){
            count++;
            System.out.println(i);
        }
        System.out.println("Count : "+ count);
        System.out.println("Test1 values : "+ test1());
        StringTest st = new StringTest();
        st.t1(null);
    }

    private static int test1(){
        int i = 0;
        try{
            i = 100;
            int a = 100/0;
            return i;
        }catch (Exception e){
            i = 200;
            return  i;
        }
        finally {
            i = 300;
            //return i;
        }
    }
}
class StringTest{
    public void t1(String st){
        System.out.println("String test");
    }
    public void t1(Object obj){
        System.out.println("Object test");
    }

   /* public void t1(StringTest obj){
        System.out.println("StringTest test");
    }*/
}