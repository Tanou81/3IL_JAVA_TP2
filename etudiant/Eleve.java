package etudiant;

public class Eleve {
  private String nom;
  private int[] listeNotes;
  private double moyenne;
  // private String couleur;

  public Eleve(String nom, int[] listeNotes) {
    this.nom = nom;
    this.listeNotes = listeNotes;
    this.moyenne= this.calculMoyenne();
  }
  public Eleve(String nom) {
    this.nom = nom;
    this.listeNotes = null;
    this.moyenne= this.calculMoyenne();
  }

  private int calculMoyenne() {
    if (listeNotes.length != 0 ){
    int somme = 0;
    for (int i = 0; i < listeNotes.length; i++){
      somme = somme + listeNotes[i];
  }
    return (somme /listeNotes.length) ; 
    }else {
      return 0 ; 
    }
}
  public double getMoyenne(){
    return this.moyenne;
  }
  public String getNom(){
    return this.nom;
  }
  public int[] getListesNotes(){
    return this.listeNotes;
  }
  public void ajouterNote(int note){
    if (note<0){
      note = 0 ;
    }
    if (note>20){
      note = 20;
    }
    int[] tab = new int[this.listeNotes.length+2];
    for (int i = 0 ; i <  this.listeNotes.length; i++){
      tab[i]= this.listeNotes[i];
    }
     tab[this.listeNotes.length+1]=note; 
    this.listeNotes= tab;
    //this.listeNotes[this.listeNotes.length]=note ; 
    this.calculMoyenne();
  }

  public String toString(){
    return ("l'eleve  "+this.nom+ " a " + this.moyenne+ "/20 de moyenne" );
  }
  
}