public class Voiture {
  // Ci-dessous la déclaration des attributs de la classe
  private String modele;
  private int prix;
  private Pilot pilote;

  public Voiture(String modele, int prix) {
    this.modele = modele;
    this.prix = prix;
    this.pilote = new Pilot("Alfred", 25);
  }

  // La déclaration des méthodes avec leur code
  public void demarrer() {
    System.out.println("vrom vrom ");
  }

  public void arret() {
    System.out.println("iiiiiiii");
  }

  public void deplacer() {
    System.out.println("mmmmmmmmm");
  }

}