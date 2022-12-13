
public class FighterJet implements AirVehicle,SoundBarrier{
//instance variables
private int noOfEngines;
private int noOfCrews;
private String jetName;
private String manufacturer;
//default constructor
public FighterJet()
{
noOfEngines=0;
noOfCrews=0;
jetName="";
manufacturer="";
}
//parameterized constructor
public FighterJet(int engines,int crews,String name,String m) {
noOfEngines=engines;
noOfCrews=crews;
jetName=name;
manufacturer=m;
}
//getter and setter methods
public int getNoOfEngines() {
return noOfEngines;
}
public int getNoOfCrews() {
return noOfCrews;
}
public String getJetName() {
return jetName;
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
public void setJetName(String jetName) {
this.jetName = jetName;
}
public void setManufacturer(String manufacturer) {
this.manufacturer = manufacturer;
}
//toString() method to return the details of current object
@Override
public String toString() {
return "FighterJet [noOfEngines=" + noOfEngines + ", noOfCrews=" + noOfCrews + ", jetName=" + jetName
+ ", manufacturer=" + manufacturer + "]";
}
//simulating the AirVehicle and SoundBarrier interface methods
@Override
public void breakSoundBarrier() {
System.out.println(jetName+" has broken the sound barrier.");

}
@Override
public void avTakeoff() {
System.out.println(jetName+" is starting the takeoff roll.");
}
@Override
public void avFly() {
System.out.println(jetName+" has taken off and is now flying.");

}
@Override
public void avLand() {
System.out.println(jetName+" has successfully landed.");

}


}