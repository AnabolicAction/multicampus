package bean;

public class AirlineDelay {
private double year;
private double month;
private double count;

public AirlineDelay(double year, double month, double count) {
	super();
	this.year = year;
	this.month = month;
	this.count = count;
}
public double getYear() {
	return year;
}
public void setYear(double year) {
	this.year = year;
}
public double getMonth() {
	return month;
}
public void setMonth(double month) {
	this.month = month;
}
public double getCount() {
	return count;
}
public void setCount(double count) {
	this.count = count;
}
}
