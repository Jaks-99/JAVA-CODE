package com.Xworkz.practiescodeRunner.app;
import com.Xwork.practiescode.app.*;

public class MilitaryRules implements Military {

	@Override
	public boolean wearUniform() {
		return true;
	}

	@Override
	public String service() {
		return "Security";
	}

	@Override
	public int unitNumber() {
		return 100;
	}

}
