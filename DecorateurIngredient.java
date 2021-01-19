public abstract class DecorateurIngredient extends Boisson {
  protected Boisson boisson;

  public String getDescritption() {
    return boisson.getDescription();
  }
  public double getPrix() {
    return boisson.getPrix();
  }
}