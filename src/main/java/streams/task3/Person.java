package streams.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> createListOfDistinctAdultPerson(List<Person> personList) {
        return personList.stream()
                .filter(person -> person != null && person.getAge() >= 18)
                .filter(UtilityFunction.distinctByKey(Person::getFirstName))
                .collect(Collectors.toList());
    }

    public static List<String> createListOfUniqueName(List<Person> personList) {
        return personList.stream()
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .map(String::trim)
                .filter(name -> !name.trim().isEmpty())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

