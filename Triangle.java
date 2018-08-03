//Triangle class to check if it's right, scalene, isosceles or equilateral
public class Triangle {

	int side1, side2, side3;

	public boolean isRight(int side1, int side2, int side3) {
		if (side3 * side3 == Math.sqrt((side2 * side2) + (side3 * side3)))
			return true;
		else
			return false;
	}

	public boolean isScalene(int side1, int side2, int side3) {
		if (side1 == side2 || side2 == side3 || side1 == side3)
			return false;
		else
			return true;
	}

	public boolean isIsosceles(int side1, int side2, int side3) {
		if (side1 == side2 && side2 != side3 && side1 != side3)
			return true;
		else if (side2 == side2 && side2 != side1 && side1 != side3)
			return true;
		else if (side1 == side3 && side2 != side3 && side1 != side2)
			return true;
		else
			return false;
	}

	public boolean isEquilateral(int side1, int side2, int side3) {
		if (side1 == side2 && side2 == side3 && side1 == side3)
			return true;
		else
			return false;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}
}
