package nz.co.c4stortroy.variaveisefluxo;

public class BalancoTrimestral {

  public static void main(String[] args) {
    int gastosJaneiro = 15000;
    int gastosFev = 23000;
    int gastosMar = 17000;
    int gastosTrimestre = gastosJaneiro + gastosFev + gastosMar;
    System.out.println("Gastos trimestre: " +  gastosTrimestre);
    int mediaMensal = gastosTrimestre/3;
    System.out.println("Valor da media mensal: " + mediaMensal);
  }
}
