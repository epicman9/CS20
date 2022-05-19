//Add Phidgets Library 
import com.phidget22.*;

public class L5ReadTemperatureAndHumidityP1 
{
    public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true)
        {
        	if(humiditySensor.getHumidity() <= 30) //check if humidity less than 30%
        	{
                System.out.println("Humidity is low, Temperature: " + temperatureSensor.getTemperature() + " °C" );
                Thread.sleep(150);
        	}
        	else 
        	{
                System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, Temperature: " + temperatureSensor.getTemperature() + " °C" );
                Thread.sleep(150);
        	}

        }
    }
}