package com.driver;

public class Main {

    public static class A{

        public String meth(){
            return "S";
        }

    }

    public static class B extends  A{

        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }

    }

    public static void main(String[] args){

        B b = new B();
        b.meth();

    }
  
}