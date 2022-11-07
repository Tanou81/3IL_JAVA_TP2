package etudiant;

public class Etudiant {
  private String nom;
  private int age;
  // private String couleur;

  public Etudiant(String nom, int age) {
    this.nom = nom;
    this.age = age;

  }

  public String getNom() {
    return this.nom;
  }

  public void travailler(Etudiant e) {

    if (this.nom == "Philipe") {
      System.out.println("Philipe se met au travail");
    } else {
      System.out.println(e.getNom() + " travail");
    }
  }

  public void travailler() {

    if (this.nom == "Philipe") {
      System.out.println("Philipe se met au travail");
    } else {
      System.out.println(this.nom + " travail");
    }
  }

  public void seReposer(Etudiant e) {
    if (this.nom == "Philipe") {
      System.out.println("Philippe se repose");
    } else {
      System.out.println(e.getNom() + " se repose");
    }
  }

  public void seReposer() {
    if (this.nom == "Philipe") {
      System.out.println("Philippe se repose");
    } else {
      System.out.println(this.nom + " se repose");
    }
  }

}