  
//Add Phidgets Library 
import com.phidget22.*;

public class UsingTheSensorAPIP2
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
        TemperatureSensor tempSensor = new TemperatureSensor();

        //Open 
        tempSensor.open(1000);

        System.out.println("Range of Data Interval values: " + tempSensor.getMinDataInterval() + "-" + tempSensor.getMaxDataInterval());	

    }
}