package nz.co.c4stortroy.initwithobjects;

public class Company {
    private String name;
    private String cnpj;
    private Employer[] employer;
    int freePosition = 0;
    
    

    public Company(String cnpj) {
	this.cnpj=cnpj;
	this.employer = new Employer[10];
    }

    public void add(Employer e){
	this.employer[this.freePosition] = e;
	this.freePosition++;
    }

    public void showEmployers(){
	for(int i=0 ; i< this.freePosition ; i++){
	    System.out.println("Employer position: " + i);
	    System.out.println("Income: " + this.employer[1].getIncome());
	}
    }

    public void showAllInfos(){
	for(int i = 0; i < freePosition; i++){
	    this.employer[i].mostra();
	}
    }

    public boolean isIn(Employer e){
	for (int i = 0; i< this.freePosition; i++){
	    if(e ==this.employer[i]){
		return true;
	    }
	}
	return false;
    }
    
    public Employer getEmployer(int position){
	return this.employer[position];
    }
    
    public String getCnpj() {
	return this.cnpj;
    }
    
}

