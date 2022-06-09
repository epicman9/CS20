//Add Phidgets Library
import com.phidget22.*;

public class UsingTheSensorAPIP3 
{

    public static void main(String[] args) throws Exception 
    {
        
        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

                
        //Temperature Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() 
        {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Open
        temperatureSensor.open(1000);
        temperatureSensor.setTemperatureChangeTrigger(1);

        //Keep program running
        while (true) 
        {
            Thread.sleep(150);
        }
    }
}