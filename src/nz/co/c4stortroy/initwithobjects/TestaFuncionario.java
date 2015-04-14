package nz.co.c4stortroy.initwithobjects;

public class TestaFuncionario {
    
    
    public static void main(String[] args) {
	Funcionario f1 = new Funcionario();
	//Date date = new Date();
	
	f1.setName("Hugo");
	f1.setIncome(100);
	f1.plusIncome(50);
	f1.setPassport("1234");
	f1.setDepartament("Software Development");
	
	f1.date = new Date();
	f1.date.createDate(2, 2, 2015);
	f1.mostra();
	
		
	System.out.println("salario atual:" + f1.getIncome());
	System.out.println("ganho anual:" + f1.calculaGanhoAnual());
    }

}
