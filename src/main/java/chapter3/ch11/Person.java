package chapter3.ch11;

public class Person {
  private String name;
  private int age;

  public Person() {
    this("이름없음", 1);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person getPerson() {
    return this;
  }

  public void printThis() {
    System.out.println(this);
  }

  public static void main(String[] args) {
    Person person = new Person();

    System.out.println(person.name);
    System.out.println(person.age);

    System.out.println(person.getPerson());
    person.printThis();
  }
}
