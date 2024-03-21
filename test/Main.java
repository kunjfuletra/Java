package test;



class Main{
	public static void main(String[] args) {
	int a,b;
	a=12;
	b=0;
	try {
		 System.out.println(a/b);
	}
	catch(Exception e) {
			  System.out.println("Can not divide any number with zero. Enter number bigger than 0") ;
		  }
	}
}