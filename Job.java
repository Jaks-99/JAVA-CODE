class Job{
	static void apply(){
		System.out.println("I am applying job");
	}
	
	static void apply(String campanyName){
	  System.out.println("Campany Name : " +campanyName);
	}
	
	static void apply(String Designation){
		System.out.println(" job designation is: "+Designation);
	}
	
	static void apply(String personName,int exp){
		System.out.println("my name is:"+personName+" experience is:"+exp);
	}
	
	static void apply(String roll){
		System.out.println("Job roll is : "+roll);
	} 
	
	static void apply(int Package){
	  System.out.println("Package : "+Package);
	}
	
	static void apply(int bond){
	  System.out.println("Bond : " +bond);
	}
	
	static void apply(String name,int exp,String refName){
		System.out.println("My name is:"+name+" experience is:"+exp+" reference name is:"+refName);
	}
	
	
	static void apply(int exp){
		System.out.println("my experience is:"+exp);
	}
	
	static void rejectOffer(){
		System.out.println("I'm rejecting the offer");
	}
	
}