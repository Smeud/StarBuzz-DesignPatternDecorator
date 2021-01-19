class Main {
  public static void main(String[] args) {
    Boisson b1 = new Expresso();
    System.out.println(b1);
    Boisson b5 = new Deca();
    System.out.println(b5);
    Boisson b6 = new Columbia();
    System.out.println(b6);
    Boisson b7 = new Sumatra();
    System.out.println(b7);

    Boisson b2 = new Columbia();
    b2 = new Caramel(b2);
    System.out.println(b2);

    Boisson b3 = new Deca();
    b3 = new Chocolat(b3);
    System.out.println(b3);

    Boisson b4 = new Sumatra();
    b4 = new Lait(b4);
    System.out.println(b4);

    Boisson b8 = new Expresso();
    b8 = new Lait(b8);
    b8 = new Chocolat(b8);
    System.out.println(b8);
  }
}