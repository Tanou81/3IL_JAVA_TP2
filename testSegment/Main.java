package testSegment;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Segment seg1 = new Segment(5, 10);
    System.out.println(seg1.longueur());
    
      System.out.println(seg1.appartient(6));
      System.out.println(seg1.appartient(12));
      System.out.println(seg1);
     
  }
}