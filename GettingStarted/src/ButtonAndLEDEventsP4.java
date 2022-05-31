//Add Phidgets Library
import com.phidget22.*;

public class ButtonAndLEDEventsP4 
{
    //Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;
    static int buttoncountgreen = 0;
    static int buttoncountred = 0;

    //Handle Exceptions
    public static void main(String[] args) throws Exception 
    {

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        
        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
                //Record button state to turn on/off the red LED
                if(e.getState() == true) 
                {
                	buttoncountred++;	
                }                
                turnRedLEDOn = e.getState(); 
            }
        });

        //Event 
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
                //Record button state to turn on/off the green LED
                turnGreenLEDOn = e.getState();
                if(e.getState() == true) 
                {
                	buttoncountgreen++;	
                }
            }
        });

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        boolean runloop = true;
        //Use your Phidgets 
        while(runloop) 
        {
        	if(buttoncountgreen >= 10) 
        	{
                redLED.setState(true);
                greenLED.setState(true);
                System.out.println("Green wins!"); //display info
                runloop = false;
        	}
        	else if (buttoncountred >= 10) 
        	{
                redLED.setState(true);
                greenLED.setState(true);
                System.out.println("Red wins!"); //display info
                runloop = false;

        	}
            //sleep for 10 milliseconds 

            Thread.sleep(10);
        }
        //sleep for 150 milliseconds 

        Thread.sleep(10000);
        redLED.setState(false);
        greenLED.setState(false);
    }
}