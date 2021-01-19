public class Caramel extends DecorateurIngredient {
  public Caramel(Boisson b) {
    boisson = b;
  }

  public String getDescription() {
    return boisson.getDescription()+", Caramel";
  }

  public double getPrix() {
    return boisson.getPrix()+0.10;
  }

}