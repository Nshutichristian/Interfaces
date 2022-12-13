

public class AirVehicleDemo {

public static void main(String[] args) {
//creating two objects : one for FighterJet and CargoPlane
FighterJet fj=new FighterJet(2,1,"F-16","General Dynamics");
CargoPlane cp=new CargoPlane(4,3,"C-17","Boeing");
//display the details of fj object
System.out.println("# FighterJet Info #");
System.out.println(fj.toString());
fj.avTakeoff();
fj.avFly();
fj.breakSoundBarrier();
fj.avLand();
//display the details of cp object
System.out.println("\n# CargoPlane Info #");
System.out.println(cp.toString());
cp.avTakeoff();
cp.avFly();
cp.avLand();
}

}