package nz.co.c4stortroy.initwithobjects;

public class CompanyTest {

    public static void main(String[] args) {
	int position = 0;
	Company company = new Company(null);
	company.getEmployer(position);
	
	Employer e1 = new Employer();
	e1.setName("Hugo");
	e1.setIncome(600);
	e1.plusIncome(50);
	e1.setPassport("1234");
	e1.setDepartament("Software Development");
	e1.date = new Date();
	e1.date.createDate(2, 2, 2015);
	
	Employer e2 = new Employer();
	e2.setName("Charlie");
	e2.setIncome(610);
	e2.plusIncome(50);
	e2.setPassport("4321");
	e2.setDepartament("QA");
	e2.date = new Date();
	e2.date.createDate(2, 2, 2015);
		
	Employer e3 = new Employer();
	e3.setName("Marcelo");
	e3.setIncome(620);
	e3.plusIncome(50);
	e3.setPassport("5678");
	e3.setDepartament("Moodle Team");
	e3.date = new Date();
	e3.date.createDate(2, 2, 2015);
	
	company.add(e1);
	company.add(e2);
	company.add(e3);

	company.showAllInfos();
    }
}
