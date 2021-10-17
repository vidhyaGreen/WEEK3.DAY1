package week3day1;

public class OutputOfClass {

	public static void main(String[] args) {
		
//inheriting the methods and variable of of BMW

		
	Bmw obj1=new Bmw();
	obj1.acclerate();
	obj1.applyBrake();
	obj1.closeDoor();
	obj1.enableAirbag();
	obj1.fillFuel();
	obj1.driveVehicle();
	obj1.shiftGear();
	
	System.out.println(" The BMW car has wheels :" + obj1.Wheelcar);
	
	//inheriting the methods and variable of of Audi
	
	
	Audi obj2=new Audi();
	obj2.acclearte();
	obj2.applyBrake();
	obj2.driveVehicle();
	obj2.fillFuel();
    obj2.shiftGear();
    obj2.closeDoor();
    obj2.enableAirbag();
	
	System.out.println(" The Audi car has wheels :" + obj2.Wheelcar);
	
	
	//inheriting the methods and variable of of Mahendra:
	
	Mahendra obj3=new Mahendra();
obj3.acclerate();
obj3.fillFuel();
obj3.driveVehicle();
obj3.applyBrake();
obj3.shiftGear();

System.out.println(" The Mahendra car has wheels :"+ obj3.Wheelauto);



//inheriting the methods and variable of of Bajaj:

Bajaj obj4=new Bajaj();
obj3.acclerate();
obj3.fillFuel();
obj3.driveVehicle();
obj3.applyBrake();
obj3.shiftGear();

System.out.println(" The Bajaj car has wheels :"+ obj3.Wheelauto);
}
}