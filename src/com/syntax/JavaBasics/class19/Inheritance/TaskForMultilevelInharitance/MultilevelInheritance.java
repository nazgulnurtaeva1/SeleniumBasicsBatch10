package com.syntax.JavaBasics.class19.Inheritance.TaskForMultilevelInharitance;

public class MultilevelInheritance {
    /*
    Write program for multilevel inheritance where
    class CC inherits from class BB and Class BB inherits
    from Class AA.
     */
    public static void main(String[] args) {
       AA a=new AA();
        BB b=new BB();
        CC c = new CC();
    }
    }
    class AA {
    public AA() {
        System.out.println("AA");
    }
    }
    class BB extends AA {
    public BB() {
        System.out.println("AA will be printed");
    }
    }
    class CC extends BB{
    public CC() {
        System.out.println("BB will be printed");
    }
    }

