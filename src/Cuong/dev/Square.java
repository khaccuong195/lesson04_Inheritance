package Cuong.dev;

public class Square extends Shape {
	private double cd;
    private double cr;
    public Square(double cd, double cr) {
   	 this.cd=cd;
   	 this.cr=cr;
    }
	@Override
	public double dientich() {
		// TODO Auto-generated method stub
		return cd*cr;
	}

}
