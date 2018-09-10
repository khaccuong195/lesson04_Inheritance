package Cuong.dev;

public class Triangle extends Shape {
	private double a,b,c;
    public Triangle(double a,double b,double c) {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    } 
	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4;
	}

}
