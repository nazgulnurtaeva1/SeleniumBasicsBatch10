package com.syntax.JavaBasics.class23.Example2;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Teacher("Asghar");
        person.eat();
        Teacher teacher=new Teacher("Naz");
        teacher.eat();
//all the teachers are person

      //  Teacher teacher= new Person("Person");
        //Not all persons are  Teacher
        Person person1=new Student("Mike");
        Person [] persons={new Student("Farhad"), new Employee("Nazgul"),
        new Person("Asel")};

        for (Person person3:persons
             ) {
            person3.performDailyTask();

            if(person3 instanceof Teacher) {
                ((Teacher)person3).designClasses();
            }
        }

    }
}
