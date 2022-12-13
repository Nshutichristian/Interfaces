

public class CargoPlane implements AirVehicle{
//instance variables
private int noOfEngines;
private int noOfCrews;
private String planeName;
private String manufacturer;
//default constructor
public CargoPlane() {
noOfEngines=0;
noOfCrews=0;
planeName="";
manufacturer="";
}
//parameterized constructor
public CargoPlane(int engines,int crews,String name,String m) {
noOfEngines=engines;
noOfCrews=crews;
planeName=name;
manufacturer=m;
}
//getter and setter methods
public int getNoOfEngines() {
return noOfEngines;
}
public int getNoOfCrews() {
return noOfCrews;
}
public String getPlaneName() {
return planeName;
}
public String getManufacturer() {
return manufacturer;
}
public void setNoOfEngines(int noOfEngines) {
this.noOfEngines = noOfEngines;
}
public void setNoOfCrews(int noOfCrews) {
this.noOfCrews = noOfCrews;
}
public void setPlaneName(String planeName) {
this.planeName = planeName;
}
public void setManufacturer(String manufacturer) {
this.manufacturer = manufacturer;
}
//toString method
@Override
public String toString() {
return "CargoPlane [noOfEngines=" + noOfEngines + ", noOfCrews=" + noOfCrews + ", planeName=" + planeName
+ ", manufacturer=" + manufacturer + "]";
}
@Override
public void avTakeoff() {
System.out.println(planeName+" is starting the takeoff roll.");
}


@Override
public void avFly() {
System.out.println(planeName+" has taken off and is now flying.");

}
@Override
public void avLand() {
System.out.println(planeName+" has successfully landed.");

}

}