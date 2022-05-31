//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightnessP2 
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        
        //Use your Phidgets with Duty Cycle 
        redLED.setDutyCycle(0.0);        	

        double i = 0;
        while(i < 1) //loop that increase light brightness
        {
            redLED.setDutyCycle(i);
            Thread.sleep(100);

        	i = i + 0.02;
        }
        if(i > 1) //makes sure that i is at 0 at start of decrease loop
        {
        	i = 1;
        }
        while(i > 0) //loop that decrease light brightness
        {
            redLED.setDutyCycle(i);
            Thread.sleep(100);

        	i = i - 0.02;
        }
        i = 0;
        redLED.setDutyCycle(i);

    }
}