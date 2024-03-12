package day6.library;

public class libraryUser {
	 	private String name;
	    private int ID;
	    private int numOfBooksBorrowed;
	    
	    public libraryUser() {
	    	ID = 99;
	    	name = "testuser";
	    	numOfBooksBorrowed = 5;
	    }

	    
	    public libraryUser(int ID,String name,int numofBooksBorrowed) {
	    	this.ID = ID;
	    	this.name = name;
	    	this.numOfBooksBorrowed = numofBooksBorrowed;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getID() {
	        return ID;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public int getNumOfBooksBorrowed() {
	        return numOfBooksBorrowed;
	    }

	    public void setNumOfBooksBorrowed(int numOfBooksBorrowed) {
	        this.numOfBooksBorrowed = numOfBooksBorrowed;
	    }
	    
	    @Override
	    public String toString() {
	        return "name=" + name + "  id= " +ID + "  number_of_books_borrowed=" + numOfBooksBorrowed;
	    }
	    

}
