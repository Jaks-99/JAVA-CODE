package com.Xworkz.practiescodeRunner.app;
import com.Xwork.practiescode.app.*;

public class EnginnerRules implements Enginner{

	@Override
	public String wearId() {

		return "YES";
	}

	@Override
	public void attendence() {
		System.out.println("Attence method implementaion in EngEngineeringRules.....");

	}

	@Override
	public double fee() {

		return 25000;
	}
}
