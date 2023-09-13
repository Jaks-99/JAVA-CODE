package com.xworkzpractiesRunner;
import com.Xwork.practiescode.app.*;
import com.Xworkz.practiescodeRunner.app.*;

public class EnginnerRunner {
	
	public static void main(String[] args) {
		Enginner engineeringRules=new EnginnerRules();
		System.out.println("Wear Id : "+engineeringRules.wearId());
		engineeringRules.attendence();
		System.out.println("FEE : "+engineeringRules.fee());

	}

}
