  
//Add Phidgets Library 
import com.phidget22.*;

public class HotOrCold 
{
    public static void main(String[] args) throws Exception
    {

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open 
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        
        //Use your Phidgets 
        while (true) 
        {
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
            if(20 < temperatureSensor.getTemperature() && temperatureSensor.getTemperature() < 24) 
            {
                redLED.setState(false);
                greenLED.setState(true);

            }
            else 
            {
            	greenLED.setState(false);
            	redLED.setState(true);
            }
            Thread.sleep(150);
        }
    }
}
 