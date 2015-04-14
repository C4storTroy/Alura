package nz.co.c4stortroy.initwithobjects;

public class Date {
    
     int day;
     int month;
     int year;
    
    public void createDate(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
    }
    public String formatDate(){
	String date = this.day + "/"+ this.month + "/"+ + this.year;
	return date;
    }
}
