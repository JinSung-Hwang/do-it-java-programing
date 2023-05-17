package chapter5.ch06;


import java.util.ArrayList;

class Animal {
  public void move() {
    System.out.println("동물이 움직인다");
  }
}

class Human extends Animal {
  public void move() {
    System.out.println("사람이 두발로 걷습니다.");
  }
  public void readBooks() {
    System.out.println("책을 읽습니다.");
  }
}

class Tiger extends Animal {
  public void move() {
    System.out.println("호랑이가 네발로 뜁니다.");
  }
  public void hunting() {
    System.out.println("사냥을 합니다.");
  }
}

class Eagle extends Animal {
  public void move() {
    System.out.println("독수가 하늘을 날아갑니다.");
  }
  public void flying() {
    System.out.println("독수리가 날아다닙니다.");
  }
}

public class AnimalTest {
  public static void main(String[] args) {
    Animal hAnimal = new Human();
    Animal tAnimal = new Tiger();
    Animal eAnimal = new Eagle();

    ArrayList<Animal> animalList = new ArrayList<Animal>();
    animalList.add(hAnimal);
    animalList.add(tAnimal);
    animalList.add(eAnimal);

    for (Animal ani: animalList) {
      ani.move();
    }

    animalMove(hAnimal);
    animalMove(tAnimal);
    animalMove(eAnimal);

    testDownCasting(animalList);
  }

  public static  void animalMove(Animal animal) {
    animal.move();
  }

  // 다운 캐스팅
  // 업캐스팅한 객체는 superclass의 public 메소드만 사용할 수 있다.
  // overriding하지 않은 순수 subclass의 메소드를 사용하려면 다운 캐스팅해서 사용해야한다.

  // 일반적으로 다형성을 이용해서 코딩하는 것이 유지보수에 좋지만
  // 그렇지 못해 원래 타입으로 돌아와야하는 경우 instanceOf를 활용하여 코딩해야한다.
  // instanceof를 사용하지 않으면 컴파일에서는 오류가 안나도 실행 단계에서 오류날 수 있다.
  public static void testDownCasting(ArrayList<Animal> animalList) {
    for (int i = 0; i< animalList.size(); i++ ){
      Animal aniaml = animalList.get(i);

      if (aniaml instanceof Human) {
        Human human = (Human) aniaml;
        human.readBooks();
      } else if (aniaml instanceof Tiger) {
        Tiger tiger = (Tiger) aniaml;
        tiger.hunting();
      } else {
        Eagle eagle = (Eagle) aniaml;
        eagle.flying();
      }
    }
  }
}
