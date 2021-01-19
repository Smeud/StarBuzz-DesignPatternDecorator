class Main {
  public static void main(String[] args) {
    Boisson b1 = new Expresso();
    System.out.println(b1.getDescription()+" $ "+b1.cout());

    Boisson b2 = new Columbia();
    b2 = new Caramel(b2);
    System.out.println(b2.getDescription()+" $ "+b2.cout());

    Boisson b3 = new Deca();
    b3 = new Chocolat(b3);
    System.out.println(b3.getDescription()+" $ "+b3.cout());

    Boisson b4 = new Sumatra();
    b4 = new Lait(b4);
    System.out.println(b4.getDescription()+" $ "+b4.cout());
  }
}