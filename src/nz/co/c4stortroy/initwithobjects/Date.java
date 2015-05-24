package nz.co.c4stortroy.initwithobjects;

public class Date {

    private int day;
    private int month;
    private int year;

    public void createDate(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
	if (! isDateAvailable(day, month, year)) {
            System.out.println("A data " + formatDate() + " não existe!");
        }
    }
    public String formatDate(){
	String date = this.day + "/"+ this.month + "/"+ + this.year;
	return date;
    }
    
    private boolean isDateAvailable(int day, int month, int year) {
        if (day <= 0 || month <= 0) {
            return false;
        }
        int lastDayMonth = 31; // por padrao são 31 dias
        if (month == 4 || month == 6 || month == 9 || month == 11 ) {
            lastDayMonth = 30;
        } else if (month == 2) {
            if (year % 4 == 0) {
        	lastDayMonth = 29;
            } else {
        	lastDayMonth = 28;
            }
        }
        if (day > lastDayMonth) {
            return false;
        }
        return true;
    }
}
