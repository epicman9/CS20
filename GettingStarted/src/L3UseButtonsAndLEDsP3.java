  
//Add Phidgets Library 
import com.phidget22.*;

public class L3UseButtonsAndLEDsP3 
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

        boolean statelastframe = redButton.getState();
        boolean statelastframe2 = greenButton.getState();

        int buttonpresses = 0;
        
        //Use your Phidgets 
        while(true){

        	if(statelastframe != redButton.getState())  //checks if previous state different from current state
        	{
        		if(redButton.getState() == true) //checks if new state is true
        		{
        			buttonpresses++;
                    System.out.println("The button has been pressed " + buttonpresses + " times.");   

        		}
                statelastframe = redButton.getState();
        	}
        	if(statelastframe2 != greenButton.getState()) //checks if previous state different from current state
        	{
        		if(greenButton.getState() == true)  //checks if new state is true
        		{
        			buttonpresses++;
                    System.out.println("The button has been pressed " + buttonpresses + " times.");   
        		}
        		statelastframe2 = greenButton.getState();
        	}
        	
            if( redButton.getState())
            {
                redLED.setState(true);
            } 
            else 
            {
                redLED.setState(false);
            }

            if(greenButton.getState())
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