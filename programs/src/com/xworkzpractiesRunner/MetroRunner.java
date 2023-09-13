package com.xworkzpractiesRunner;
import com.Xwork.practiescode.app.*;
import com.Xworkz.practiescodeRunner.app.*;

public class MetroRunner {
	
	public static void main(String[] args) {
		Metro metro = new MetroRules();
		metro.announcement('M');
		metro.payment(14.25);
		metro.timings(11);

	}

}
