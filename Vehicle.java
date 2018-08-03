/*Vehicle containing fields currentSpeed, currentDirection, ownerName,highestIdentificationNumber, vehicleID
 * Methods : to change speed , to stop, to turn by degrees, toString method.
 */
public class Vehicle {

	private int currentSpeed;
	private float currentDirection;
	private String ownerName;
	private static int highestVehicleIN;
	private int vehicleId;

	public void Vehicle() {

	}

	public void Vehicle(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	@Override
	public String toString() {
		return "Vehicle [currentSpeed=" + currentSpeed + ", currentDirection=" + currentDirection + ", ownerName="
				+ ownerName + ", vehicleId=" + vehicleId + "]";
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public float getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(float currentDirection) {
		this.currentDirection = currentDirection;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public static int getHighestVehicleIN() {
		return highestVehicleIN;
	}

	public static void setHighestVehicleIN(int highestVehicleIN) {
		Vehicle.highestVehicleIN = highestVehicleIN;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public void changeSpeed(int speed) {
		currentSpeed = speed;
		System.out.println("Speed changed to " + currentSpeed);
	}
	
	public void stop() {
		currentSpeed = 0;
		System.out.println("Speed changed to zero");
	}
	public void turnDegree(float degree) {
		currentDirection += degree; 
		System.out.println("Direction changed to "+currentDirection);
	}
}
