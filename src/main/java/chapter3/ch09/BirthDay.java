package chapter3.ch09;

public class BirthDay {
  private int year;
  private int month;
  private int day;
  private boolean isValid;

  public BirthDay() {
    isValid = true;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    if (month < 1 || month > 12) {
      this.isValid = false;
    }
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public boolean isValid() {
    return this.isValid;
  }
}
