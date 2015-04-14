package nz.co.c4stortroy.initwithobjects;

public class Funcionario {

    private String name;
    private double income;
    private String passport;
    private String departament;
    Date date;
    
    public void plusIncome(double plus){
	this.income += plus;
    }
 
    public double calculaGanhoAnual(){
	return this.income * 12;
    }
    
    public void mostra(){
	System.out.println("Nome: "+ this.name);
	System.out.println("Departamento: "+ this.departament);
	System.out.println("RG: "+ this.passport);
	System.out.println("Date: " + this.date.formatDate());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
