class Jobrun{
	public static void main(String[] args){
		Job.apply();
		Job.apply("Accenture");
		Job.apply("MCA");
		Job.apply("Amruth",2);
		Job.apply("Java developer");
		Job.apply(400000);
		Job.apply(4);
		Job.apply("Amruth",3,"Amrutheswara");
		Job.apply(5);
		Job.rejectOffer();
	}
}