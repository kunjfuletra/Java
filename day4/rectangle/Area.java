package day4.rectangle;
public class Area {
    private double l;
    private double b;

 
    public void setDim(double l, double b) {
        this.l = l;
        this.b = b;
    }


    public double getArea() {
        return l * b;
    }

  
    public double getLength() {
        return l;
    }


    public void setLength(double l) {
        this.l= l;
    }


    public double getBreadth() {
        return b;
    }


    public void setBreadth(double b) {
        this.b= b;
    }

   
}

