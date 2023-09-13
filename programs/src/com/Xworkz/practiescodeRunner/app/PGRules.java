package com.Xworkz.practiescodeRunner.app;
import com.Xwork.practiescode.app.*;

public class PGRules implements PG {

	@Override
	public String noBoysAllowed() {

		return "BOYS NOT ALLOWED";
	}

	@Override
	public boolean hasWashingMachine() {

		return true;
	}

	@Override
	public double rent() {

		return 5000;
	}

}
