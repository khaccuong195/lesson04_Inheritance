package Cuong.dev;

public class Circle extends Shape {
	private double r;
    public Circle(double r) {
		this.r=r;
	}
	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}

}
