//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEventsP2 
{

	static boolean LEDAttached = true;
	static boolean ButtonAttached = true;

	static boolean turnRedLEDOn = false;
    public static void main(String[] args) throws Exception 
    {
        
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Attach Event 
        redButton.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e) 
            {
                System.out.println("Attach button!");
                ButtonAttached = true;
                
            }
        });
        redLED.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e) 
            {
                System.out.println("Attach LED!");
                LEDAttached = true;
            }
        });
        //Detach Event 
        redButton.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) 
            {
                System.out.println("Detach button!");
                ButtonAttached = false;
            }
        });
        redLED.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) 
            {
                System.out.println("Detach LED!");
                LEDAttached = false;
            }
        });
        
        
        
        //Open
        redButton.open(1000);
        redLED.open(1000);

        //Keep program running
        while (true) 
        {

        }
    }
}