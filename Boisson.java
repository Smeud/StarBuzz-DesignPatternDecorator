import java.text.NumberFormat;

public abstract class Boisson {
  private String description;
  private double prix;

  public String getDescription() {
    return description;
  }
  public double getPrix() {
    return prix;
  }

  protected void setDescription(String description) {
    this.description = description;
  }
  protected void setPrix(double prix) {
    this.prix = prix;
  }

  public String toString() {
    NumberFormat format = NumberFormat.getInstance();format.setMinimumFractionDigits(2);
    return getDescription()+" : "+format.format(getPrix())+"$";
  }
}