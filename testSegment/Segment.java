package testSegment;

public class Segment {
  private int extr1;
  private int extr2;
  // private String couleur;

  public Segment(int extr1, int extr2) {
    this.extr1 = extr1;
    this.extr2 = extr2;
    if (this.extr1 > this.extr2) {
      // System.err.println("error" );
      this.retourne();
    }
  }

  private void retourne() {
    int memoire = this.extr1;
    this.extr1 = this.extr2;
    this.extr2 = memoire;
  }

  public int longueur() {
    return (this.extr2 - this.extr1);
  }

  public boolean appartient(int x) {
    if (x >= this.extr1 && this.extr2 >= x) {
      return true;
    } else {
      return false;
    }
  }

  public int getExtr1() {
    return this.extr1;
  }

  public void setExtr1(int x) {
    this.extr1 = x;
  }

  public void setExtr2(int x) {
    
    this.extr2 = x;
  }

  public int getExtr2() {
    return this.extr2;
  }

  public String toString() {
    return ("extr1 = " + this.extr1 + "   /    extr2 = " + this.extr2);
  }

}