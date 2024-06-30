package OPPS.L2Abstractions;
//Driver class
public class ExternalPart {
	public static void main ( String[] args ) {

		// Create objects of classes implementing interfaces
        ExternalPart car = new ExternalPart(); //create a new {(object) or instance} of the class
		
        // Use the methods defined in the interface
		car.startEngine(); // Calls the startEngine method defined in the CarInterface
        car.accelerate(); // Calls the accelerate method defined in the CarInterface
		car.brake(); // Calls the brake method defined in the CarInterface
		car.changeGear(3); // Calls the changeGear method defined in the CarInterface

		car.move(10); // Calls the move method defined in the VehicleInterface

		car.stop(); // Calls the stop method defined in the VehicleInterface
		car.drive(50); // Calls the drive method defined in the VehicleInterface
	}


}
