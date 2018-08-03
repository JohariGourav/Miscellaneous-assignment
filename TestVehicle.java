//test class for vehicle 
import java.util.*;

public class TestVehicle {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();

		Scanner scanner = new Scanner(System.in);
		int currentSpeed;
		float currentDirection;
		String ownerName;
		int highestVehicleIN;
		int vehicleId;
		System.out.println(
				"Enter owner name,vehicleId,speed,direction,highest vehicle identification number for vehicle");
		ownerName = scanner.nextLine();
		vehicleId = scanner.nextInt();
		currentSpeed = scanner.nextInt();
		currentDirection = scanner.nextFloat();
		highestVehicleIN = scanner.nextInt();

		vehicle.setOwnerName(ownerName);
		vehicle.setVehicleId(vehicleId);
		vehicle.setCurrentSpeed(currentSpeed);
		vehicle.setCurrentDirection(currentDirection);
		vehicle.setHighestVehicleIN(highestVehicleIN);

		int ch = 0;
		System.out.println("Enter your choice to perform a function on vehicle");
		System.out.println(" 1. Change Speed \n 2. Stop vehicle \n 3. Turn by degrees");
		ch = scanner.nextInt();
		System.out.println(ch);
		switch (ch) {
		case 1:
			System.out.println("Give new speed");
			int newSpeed = scanner.nextInt();
			vehicle.changeSpeed(newSpeed);
			break;
		case 2:
			vehicle.stop();
			break;
		case 3:
			System.out.println("By how much degrees vehicle should be turned");
			System.out.println("negative value for left turn || positive value for right turn");
			int degrees = scanner.nextInt();
			vehicle.turnDegree(degrees);
			break;

		default:
			System.out.println("invalid choice");
			break;

		}
	}

}
