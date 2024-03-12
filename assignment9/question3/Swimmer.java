package assignment9.question3;

class Swimmer extends Athlete {
	 String swimmingStyle;

	 public Swimmer(String name, int age, String country, String swimmingStyle) {
	     super(name, age, country); 
	     this.swimmingStyle = swimmingStyle;
	 }

	 void displaySwimmerDetails() {
	     displayAthleteDetails(); 
	     System.out.println("Swimming Style: " + swimmingStyle);
	 }
}