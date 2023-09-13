class Resume{
	static void format(){
		System.out.println("the format of the resume should be correct");
	}
	static void format(String type)
	{
		System.out.println("the format of the resume should be of:"+type);
	}
	static void format(String type,int pages){
		System.out.println("the format should be:"+type+" pages should be:"+pages);
	}
	static void clear(){
		System.out.println("I'm clearing the resume");
	}
	static void delete(){
		System.out.println("I'm deleting the resume from the application ");
		
	}
}