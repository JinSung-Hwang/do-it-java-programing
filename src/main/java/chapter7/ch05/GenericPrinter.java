package chapter7.ch05;

public class GenericPrinter<T> {

  private T material;

  public void setMaterial(T material) {
    this.material = material;
  }

  public T getMaterial() {
    return material;
  }

  public String toString() {
    return material.toString();
  }

}
