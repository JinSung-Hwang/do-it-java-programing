package chapter3.ch16;

import java.util.Calendar;

// 싱글톤 패턴
public class SchoolTest {
  public static void main(String[] args) {

    School school = School.getInstance();

    School school2 = School.getInstance();

    System.out.println(school == school2);

    Calendar calendar = Calendar.getInstance();
  }
}
