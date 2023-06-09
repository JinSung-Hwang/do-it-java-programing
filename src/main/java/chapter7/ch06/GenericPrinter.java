package chapter7.ch06;

public class GenericPrinter <T extends Material> {

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

  public void doPrinting() {
    material.doPrinting();
  }


}
