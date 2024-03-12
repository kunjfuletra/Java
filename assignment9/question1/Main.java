package assignment9.question1;

public class Main{
    
	
    static int temperature=20;

    String seasonName="winter";

    static void displayTemp() {
        temperature = 25; 
        System.out.println("Temperature: " + temperature);
    }

    void displaySeasonName() {
    	//d
//    	temperature = 10;
//    	System.out.println("Temperature: " + temperature);
    	
    	
    	seasonName = "Summer"; 
    	System.out.println("Season Name: " + seasonName);
    }

    public static void main(String[] args) {
    	
    	//a.
        System.out.println("Temperature in Main: " + temperature);
        
        //b.
        Main season = new Main();
        System.out.println(season.seasonName);
        
        //c.
        displayTemp();
        
        //d.
//        season.displaySeasonName();	
        
        //f. cant make static reference to instance variable
        
        //g.
        season.displaySeasonName();
    }
}

