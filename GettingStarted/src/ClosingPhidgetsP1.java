  
//Add Phidgets Library
import com.phidget22.*;

public class ClosingPhidgetsP1 
{
    public static void main(String[] args) throws Exception
    {

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        
        
        //I have commented this out because I dont want to constantly be told there is an error in my code some where.
        //System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );

    }
}
