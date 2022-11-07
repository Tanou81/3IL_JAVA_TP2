
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Chien medor = new Chien("labrador", 25, "blanc");
    medor.aboyer();
    medor.dormir();

    Voiture vroum = new Voiture("toyoata", 345666);
    vroum.demarrer();

  }
}