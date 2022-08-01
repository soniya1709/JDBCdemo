
public class Student {
int roll;
String name;
String collegename;
public Student() {
	super();
}
public Student(int roll, String name, String collegename) {
	super();
	this.roll = roll;
	this.name = name;
	this.collegename = collegename;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", collegename=" + collegename + "]";
}

}
