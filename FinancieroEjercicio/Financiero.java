public class Financiero{
  private double saldo[] = new double[]{6000.00, 4500.00, 5810.50, 6300.00, 6500.50, 6500.00, 6800.10, 6655.10, 6850.00, 7010.60, 8300.50, 9590.85};
  private double promedio;
  
  //Constructor
  public Financiero(double nuevo){
    promedio = nuevo;
  }
  
  //Metodo
  public void calculo(){
    for(int i = 0; i < saldo.length; i++){
      promedio = promedio + saldo[i];
    }
    
    promedio = promedio/12;
    //Salida
    System.out.println("$" + promedio);
  }
}