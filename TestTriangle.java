
//Test triangle class to check if it is right angled,scalene,isosceles or equilateral
import java.util.*;

public class TestTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Triangle triangle = new Triangle();
		System.out.println("Enter 3 sides of a triangle");
		int side1 = scanner.nextInt();
		int side2 = scanner.nextInt();
		int side3 = scanner.nextInt();

		triangle.setSide1(side1);
		triangle.setSide2(side2);
		triangle.setSide3(side3);
		int ch = 0;
		System.out.println("Enter your choice to check triangle type");
		System.out.println(" 1. Right Triangle \n 2. Scalene \n 3. Isosceles \n 4. Equilateral");
		ch = scanner.nextInt();
		System.out.println(ch);
		switch (ch) {
		case 1:
			if (triangle.isRight(triangle.getSide1(), triangle.getSide2(), triangle.getSide3()))
				System.out.println("Its a Right Triangle");
			else
				System.out.println("Its not a right triangle");
			break;
		case 2:
			if (triangle.isScalene(triangle.getSide1(), triangle.getSide2(), triangle.getSide3()))
				System.out.println("Its a Scalene Triangle");
			else
				System.out.println("Its not a Scalene triangle");
			break;
		case 3:
			if (triangle.isIsosceles(triangle.getSide1(), triangle.getSide2(), triangle.getSide3()))
				System.out.println("Its a isosceles Triangle");
			else
				System.out.println("Its not a isosceles triangle");
			break;
		case 4:
			if (triangle.isEquilateral(triangle.getSide1(), triangle.getSide2(), triangle.getSide3()))
				System.out.println("Its a equilateral Triangle");
			else
				System.out.println("Its not a equilateral triangle");
			break;
		default:
			System.out.println("invalid choice");
			break;

		}
	}
}
