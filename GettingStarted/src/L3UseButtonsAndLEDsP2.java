  
//Add Phidgets Library 
import com.phidget22.*;

public class L3UseButtonsAndLEDsP2 
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets 
        while(true){

            if(greenButton.getState())
            {
                redLED.setState(true);
            } 
            else 
            {
                redLED.setState(false);
            }

            if(redButton.getState())
            {
                greenLED.setState(true);
            } 
            else 
            {
                greenLED.setState(false);
            }

            Thread.sleep(150);
        }
    }
}