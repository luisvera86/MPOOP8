class Main {
  public static void main(String[] args) {
    System.out.println("**************Clases concretas************************");

    Poligono poligono1= new Poligono();
    Triangulo triangulo1= new Triangulo();
    Cuadrilatero cuadrilatero1= new Cuadrilatero();

    System.out.println(poligono1);
    System.out.println(triangulo1);
    System.out.println(cuadrilatero1);
    System.out.println(poligono1.area());
    System.out.println(triangulo1.area());
    System.out.println(cuadrilatero1.area());

    System.out.println("************CLASE ABSTRACTA**********");
    //PoligonoA pol=new PoligonoA();->no se puede instanciar
    TrianguloA triangulo2=new TrianguloA();
    CuadrilateroA cuadrilatero2=new CuadrilateroA();
    System.out.println(triangulo2);
    System.out.println(cuadrilatero2);
    System.out.println(triangulo2.perimetro());
    System.out.println(cuadrilatero2.perimetro());

    System.out.println("**********Interface***********");

    //InstrumentoMusical im = new InstrumentoMusical());
    InstrumentoViento iv= new 





    //System.out.println("**********atributos de Interface***********");
    
    System.out.println("El mes"+Meses.NUEVE+"corresponde a: ");
    System.out.println(Meses.NOMBRES_MESES(Meses.NUEVE));




    

  }
}