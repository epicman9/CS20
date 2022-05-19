//Add Phidgets Library 
import com.phidget22.*;

public class L5ReadTemperatureAndHumidityP2 
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
        	if(temperatureSensor.getTemperature() < 21) //check if temperature less than 21 degrees celcius
        	{
                System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, Room is too cold." );
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