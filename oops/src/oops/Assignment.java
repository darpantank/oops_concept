package oops;

import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		boolean flag=true;
		Shape shape;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("\n1.Circle\n2.Rectangle \n3.Square\n4.Exit\nPlease Enter Your Choice : ");
			int userInput = sc.nextInt();
			switch(userInput) {
				case 1:
					System.out.print("Please Enter circle radius :");
					shape=new Circle(sc.nextDouble());
					shape.draw();
					System.out.println(shape.size());
					break;
				case 2:
					System.out.print("Please Enter rectangle length,width:");
					shape=new Rectangle(sc.nextDouble(), sc.nextDouble());
					shape.draw();
					System.out.println(shape.size());
					break;
				case 3 :
					System.out.print("Please Enter Square length :");
					shape=new Square(sc.nextDouble());
					shape.draw();
					System.out.println(shape.size());
					break;
				case 4:
					flag=false;
					break;
				default:
					System.out.println("Please Enter Proper Input");
			}
		}while(flag);
		System.err.println("Thank You !");
	}
}
