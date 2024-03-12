package day6.library;
public class libraryPackageDemo {

	public static void main(String[] args) {
		 	books book1 = new books();
		 	book1.setTitle("Chanakya Niti");
		 	book1.setAuthor("RadhaKrishnan Pillai");
		 	book1.setISBN("1234567890");
		 	book1.setAvailable(true);
		 	
		 	
		 	libraryUser user0 = new libraryUser();
	        libraryUser user1 = new libraryUser(1, "Kunj", 6);
	        System.out.println(user0.toString());
	        System.out.println(user1.toString());
	       
	        
	}

}
