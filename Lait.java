public class Lait extends DecorateurIngredient {
  public Lait(Boisson boisson){
    super(boisson);
  }

  public double cout() {
    return 0.20 +boisson.cout();
  }

  public String getDescription() {
    return boisson.getDescription()+", Lait";
  }
}