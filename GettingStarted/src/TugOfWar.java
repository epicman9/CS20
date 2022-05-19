  
//Add Phidgets Library 
import com.phidget22.*;

public class TugOfWar 
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

        int buttonpresses1 = 0;
        int buttonpresses2 = 0;

        //Use your Phidgets 
        while(buttonpresses1 < 10 && buttonpresses2 < 10)
        {

        	if(statelastframe != redButton.getState()) 
        	{
        		if(redButton.getState() == true) 
        		{
        			buttonpresses1++;

        		}
                statelastframe = redButton.getState();
        	}
        	if(statelastframe2 != greenButton.getState()) 
        	{
        		if(greenButton.getState() == true) 
        		{
        			buttonpresses2++;
        		}
        		statelastframe2 = greenButton.getState();
        	}
        	

            Thread.sleep(10);
        }
    	int i = 0;
    	if(buttonpresses1 >= 10) 
    	{
            greenLED.setState(true);
            redLED.setState(true);
            Thread.sleep(500);
            greenLED.setState(false);
            redLED.setState(false);
            Thread.sleep(250);
            i++;
            while(i <= 4) 
            {
                redLED.setState(true);
                Thread.sleep(500);
                redLED.setState(false);
                Thread.sleep(250);
                i++;
            }
    	}
    	if(buttonpresses2 >= 10) 
    	{
            greenLED.setState(true);
            redLED.setState(true);
            Thread.sleep(500);
            greenLED.setState(false);
            redLED.setState(false);
            Thread.sleep(250);
            i++;
            while(i <= 4) 
            {
                greenLED.setState(true);
                Thread.sleep(500);
                greenLED.setState(false);
                Thread.sleep(250);
                i++;
            }

    	}
    }
}