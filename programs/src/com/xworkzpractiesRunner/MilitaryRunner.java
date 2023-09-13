package com.xworkzpractiesRunner;
import com.Xwork.practiescode.app.*;
import com.Xworkz.practiescodeRunner.app.*;

public class MilitaryRunner {
	public static void main(String[] args) { 
	Military military=new MilitaryRules();
	System.out.println("Wear Uniform : "+military.wearUniform());
	System.out.println("UNIT NUMBER : "+military.unitNumber());
	System.out.println("Service : "+military.service());
	}

}
