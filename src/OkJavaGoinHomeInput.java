

import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHomeInput {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright Level");
		
		//Elevator Call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security Off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light On
		Lighting lighting = new Lighting(id);
		lighting.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		

	}

}
