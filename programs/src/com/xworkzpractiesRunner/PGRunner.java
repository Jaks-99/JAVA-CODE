package com.xworkzpractiesRunner;
import com.Xwork.practiescode.app.*;
import com.Xworkz.practiescodeRunner.app.*;

public class PGRunner {
	
	public static void main(String[] args) {
		PG pg = new PGRules();
		System.out.println("Note : "+pg.noBoysAllowed());
		System.out.println("HAS Washing Machine : "+pg.hasWashingMachine());
		System.out.println("RENT : "+pg.rent());

}
}
