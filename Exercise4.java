package src;

import java.util.ArrayList;

public class Exercise4 {

    public static void main(String[] args) {
        Person person1 = new Person("John", 21, "Handyman");
        Person person2 = new Person("Mary", 20, "Nurse");
        Person person3 = new Person("Li", 25, "Athlete");
        //ArrayList of objects of type Person
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        System.out.println("-----------------------------------");
        //Print out the contents of the ArrayList
        for(Person p : persons) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------");
        System.out.println(nameSearch(persons, "Li"));
        System.out.println("-----------------------------------");
    }

    //Method to search for Person object by name
    public static Person nameSearch(ArrayList<Person> persons, String name) {
        for (Person p : persons) {
            if (p.name.equals(name)){
                return p;
            }
        }
        return null;
    }
}
