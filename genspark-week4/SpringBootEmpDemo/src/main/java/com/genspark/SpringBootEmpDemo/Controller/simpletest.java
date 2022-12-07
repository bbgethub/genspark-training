package com.genspark.SpringBootEmpDemo.Controller;

public class simpletest {

    public static void main(String args[]){
        try{
            System.out.println("1");
            throw new RuntimeException();
        }catch (Exception ex){
            System.out.println("2");
            try{
                System.out.println("3");
                throw new RuntimeException();
            }catch (Exception e){
                System.out.println("4");
            }
            System.out.println("5");
        }
        finally {
            System.out.println("6");
        }
    }
}
