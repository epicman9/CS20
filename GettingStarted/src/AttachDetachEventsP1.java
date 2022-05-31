//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEventsP1 
{

    public static void main(String[] args) throws Exception 
    {
       
         //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Data Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() 
        {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
                //Print temperature
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Attach Event 
        temperatureSensor.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e) 
            {
                System.out.println("Attach!");
            }
        });

        //Detach Event 
        temperatureSensor.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) 
            {
                System.out.println("Detach!");
            }
        });

        //Open
        temperatureSensor.open(1000);

        //Keep program running
        while (true) 
        {
            Thread.sleep(150); //when disconnected says Detach! and stops, when reconnected says Attach! and continues.
        }
    }
}