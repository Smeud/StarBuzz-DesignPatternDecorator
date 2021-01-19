public class Lait extends DecorateurIngredient {
  public Lait(Boisson b){
    boisson = b;;
  }

  public String getDescription() {
    return boisson.getDescription()+", Lait";
  }
  public double getPrix() {
    return boisson.getPrix()+0.15;
  }
}