package etudiant;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

   
     Etudiant medor = new Etudiant("roooo", 25);
      Etudiant medorb = new Etudiant("bbbb", 25);
      medor.travailler(medorb);
      medor.travailler();
      medor.seReposer();
      int[] tab={12,15,18,9,19};
     Eleve brun = new  Eleve("Brun", tab );
    System.out.println(brun.getMoyenne());
      brun.ajouterNote(18);
     brun.ajouterNote(20);
     brun.ajouterNote(19);
     System.out.println(brun);
      Point point = new Point(1,2);
      point.afficher();
      /*
     * System.out.println(seg1.longueur());
     * System.out.println(seg1.appartient(6));
     */

  }
}