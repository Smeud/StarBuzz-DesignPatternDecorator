public class Chocolat extends DecorateurIngredient {
  public Chocolat(Boisson b) {
    boisson = b;
  }

  public String getDescription() {
    return boisson.getDescription()+", Chocolat";
  }

  public double setPrix() {
    return boisson.getPrix()+0.25;
  }
}