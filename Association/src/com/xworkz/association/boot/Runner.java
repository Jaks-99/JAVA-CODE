package com.xworkz.association.boot;
import com.xworkz.association.app.Bus;
import com.xworkz.association.app.Button;
import com.xworkz.association.app.Charger;
import com.xworkz.association.app.Laptop;
import com.xworkz.association.app.Mobile;
import com.xworkz.association.app.Pant;
import com.xworkz.association.app.Shirt;
import com.xworkz.association.app.Paper;
import com.xworkz.association.app.Passanger;
import com.xworkz.association.app.Processor;
import com.xworkz.association.app.Trainer;
import com.xworkz.association.app.Wood;
import com.xworkz.association.app.Zip;
public class Runner {

	
	public static void main(String[] args) {
		System.out.println("Invoking main() in Main");

		Laptop laptop=new Laptop();

		Trainer trainer=new Trainer("Omkar",laptop);

		trainer.teach();

		System.out.println("---------------------------------------------");

		char size='s';
		Button button=new Button();
		Shirt shirt=new Shirt(size,button);

		shirt.wear();

		System.out.println("---------------------------------------------");

		String name="Rajesh";
		Bus bus=new Bus();
		Passanger passanger=new Passanger(name, bus);
		passanger.travel();

		System.out.println("---------------------------------------------");

		String material="nylon";

		Zip zip=new Zip();
		Pant pant=new Pant(material,zip);
		pant.type();

		System.out.println("---------------------------------------------");


		String type="timber";
		Paper paper=new Paper();
		Wood wood=new Wood(type, paper);
		wood.design();

		System.out.println("---------------------------------------------");

		String model="Redmi";
		Charger charger=new Charger();
		Mobile mobile=new Mobile(model, charger);
		mobile.runApps();

		System.out.println("---------------------------------------------");

		Processor processor=new Processor();
		Laptop lap=new Laptop();
		lap.setProcessor(processor);
		lap.runprograms();


	}
	
}
