  
//Add Phidgets Library 
import com.phidget22.*;

public class BuildAThermostat 
{
    public static void main(String[] args) throws Exception
    {

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        
        //Open 
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        
        //Use your Phidgets 
        int settemp = 21;
        boolean statelastframe = redButton.getState();
        boolean statelastframe2 = greenButton.getState();
        int counterint = 0;
        
        
        while (true) 
        {
        	if(statelastframe != redButton.getState()) //checks for red button presses
        	{
        		if(redButton.getState() == true) 
        		{
        			settemp--;
        		}
                statelastframe = redButton.getState();
        	}
        	if(statelastframe2 != greenButton.getState()) //checks for green button presses
        	{
        		if(greenButton.getState() == true) 
        		{
        			settemp++;
        		}
        		statelastframe2 = greenButton.getState();
        	}
        	
        	if(settemp-temperatureSensor.getTemperature() < 2 && settemp-temperatureSensor.getTemperature() >=0 || settemp-temperatureSensor.getTemperature() > -2 && settemp-temperatureSensor.getTemperature() < 0) //checks if temperature is within 2 degrees of set temperature 
            {
                redLED.setState(false);
                greenLED.setState(true);

            }
            else 
            {
            	greenLED.setState(false);
            	redLED.setState(true);
            }
            if(counterint >= 100) //counter, once it reaches 100 that means 10 seconds have past
            {
                System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C, set Temperature: "  + settemp + " °C"); //display info
                counterint = 0;
            }
            counterint ++;
            Thread.sleep(100);
        }
    }
}
 