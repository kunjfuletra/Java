package assignment9.question3;


class Athlete {
 String name;
 int age;
 String country;

 public Athlete(String name, int age, String country) {
     this.name = name;
     this.age = age;
     this.country = country;
 }

 void displayAthleteDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Country: " + country);
 }
}




