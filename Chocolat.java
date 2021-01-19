public class Chocolat extends DecorateurIngredient {
  public Chocolat(Boisson boisson) {
    super(boisson);
  }

  public double cout() {
    return 0.15 +boisson.cout();
  }

  public String getDescription() {
    return boisson.getDescription()+", Chocolat";
  }
}