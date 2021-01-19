public abstract class DecorateurIngredient extends Boisson {
  protected Boisson boisson;

  public DecorateurIngredient(Boisson boisson) {
    this.boisson = boisson;
  }

  public String getDescritption(){
    return boisson.getDescription();
  }
}