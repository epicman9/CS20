//Add Phidgets Library
import com.phidget22.*;

public class DataIntervalP1 
{
    //Handle Exceptions
    public static void main(String[] args) throws Exception 
    {

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Temperature Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() 
        {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
                System.out.println("Temperature: " + e.getTemperature());
            }
        });

        //Open
        temperatureSensor.open(5000);

        //Set Data Interval 
        temperatureSensor.setDataInterval(500);

        //Keep program running
        while (true) 
        {
            Thread.sleep(150); //output every 500ms
        }
    }
}