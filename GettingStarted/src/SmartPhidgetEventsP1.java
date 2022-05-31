//Add Phidgets Library
import com.phidget22.*;

public class SmartPhidgetEventsP1 
{

    public static void main(String[] args) throws Exception 
    {
        
        //Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Humidity Event 
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() 
        {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) 
            {
                System.out.println("Humidity: " + e.getHumidity() + "%RH");
            }
        });
        
        //Temperature Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() 
        {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Keep program running
        while (true) 
        {
            Thread.sleep(150); //output pretty much the same as L5 exept the way they do the text makes it harder to read.
        }
    }
}