package temp;
class A {
    int i = 10;
    void print() {
    	System.out.println("A");
    }
}

class B extends A {
    int i = 20;
    void print() {
    	System.out.println("B");
    }
}

public class abc {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
        a.print();
    }
}

