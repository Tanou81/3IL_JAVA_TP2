package etudiant;

class Point{
  private int x ; 
  private int y ; 
  public Point (int x, int y) {
  this.x = x ;
  this.y = y ;
  }
  public void afficher ()
  {
    System.out.println ("Coordonnées " + this.x + " " + this.y) ;
  }

  public int normeMax(Point p1, Point p2){
    /* 
    int resultx = p2.getX() - p1.getX()
    int resulty = p2.getY() - p1.getY()
      */
    int result2x = p2.getX() - 0 ;
    int result2y = p2.getY() - 0 ;
    int result1x = p1.getX() - 0 ;
    int result1y = p1.getY() - 0 ;

    double  dist1 = Math.sqrt(Math.pow(result2x, 2) + Math.pow(result2y, 2)) ;
     System.out.println ("dist " + dist1) ;
  }

  public int getX(){
    return this.x; 
  }
  public int getY(){
    return this.y; 
  }
}
