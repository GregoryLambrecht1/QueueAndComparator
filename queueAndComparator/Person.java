package QueueComparator;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparator<Person> {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int weight;
    private int height;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender, int age, int weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName()) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof lists.Person)) return false;
        lists.Person person = (lists.Person) o;
        return getAge() == person.getAge() && getWeight() == person.getWeight() && getHeight() == person.getHeight() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGender(), getAge(), getWeight(), getHeight());
    }

    @Override
    public String toString() {
        return
                "firstName :" + firstName +
                        ", lastName :" + lastName +
                        ", gender :" + gender +
                        ", age: " + age +
                        ", weight: " + weight +
                        ", height: " + height
                ;
    }



}
