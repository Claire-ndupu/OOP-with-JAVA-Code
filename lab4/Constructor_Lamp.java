package lab4;

class Lamp {
			  // stores the value for light
			  // true if light is on
			  // false if light is off
			  boolean isOn;

			  // method to turn on the light
			  void turnOn() {
			    isOn = true;
			    System.out.println("Light on? " + isOn);

			  }

			  // method to turn off the light
			  void turnOff() {
			    isOn = false;
			    System.out.println("Light on? " + isOn);
			  }
	}

public class Constructor_Lamp {

	public static void main(String[] args) {
		
		// create objects led and halogen
	    Lamp led = new Lamp();
	    Lamp halogen = new Lamp();
	    
	    // turn on the light by calling method turnOn() using led object
	    led.turnOn();
	    
	    // turn off the light by calling method turnOff() using halogen object
	    halogen.turnOff();

		}
	
	}
	
