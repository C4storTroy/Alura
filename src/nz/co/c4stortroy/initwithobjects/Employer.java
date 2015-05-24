package nz.co.c4stortroy.initwithobjects;

public class Employer {

    private String name;
    private double income;
    private String passport;
    private String departament;
    private static int nextEmployer;
    private int identify;
    
    Date date;
    
    public Employer(String name){
	this.name = name;
	this.identify = nextEmployer++;
    }
    
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
	System.out.println("Income: " + this.income + "\n");
    }

    /*
     * this method is an example to use static
     */
    public int getIdentify() {
	return identify;
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
