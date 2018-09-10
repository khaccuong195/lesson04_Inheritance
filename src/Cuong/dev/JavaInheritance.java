package Cuong.dev;

public class JavaInheritance {
	public static void main(String [] agrs) {
		   double max=0;
		   double min;
		   Shape shapes[] = new Shape[10];
		   shapes[0] = new Square(8,9);
		   shapes[1] = new Circle(9);
		   shapes[2] = new Circle(36);
		   shapes[3] = new Square(7,91);
		   shapes[4] = new Triangle(7,8,6);
		   shapes[5] = new Square(17,10);
		   shapes[6] = new Triangle(9,6,7);
		   shapes[7] = new Triangle(7,9,8);
		   shapes[8] = new Circle(9);
		   shapes[9] = new Square(7,12);
		   
		   for(int i=0;i<shapes.length;i++) {
			   System.out.println("dien tich:"+shapes[i].dientich());
		   }
		   
		   for(int i=0;i<shapes.length;i++) {
			   if(shapes[i].dientich()>max)
				   max=shapes[i].dientich();
		   }	
		   
		   min=shapes[0].dientich();
		   for(int i=0;i<shapes.length;i++) {
			   if(shapes[i].dientich()<min)
				   min=shapes[i].dientich();
		   }
		   
		   System.out.println("dien tich lon nhat:"+max);
		   System.out.println("dien tich nho nhat"+min);
		}
}
