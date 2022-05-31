  
//Add Phidgets Library 
import com.phidget22.*;

public class UsingTheSensorAPIP1 
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();

        //Open 
        humiditySensor.open(1000);

        System.out.println("Range of Humidity values: " + humiditySensor.getMinHumidity() + "-" + humiditySensor.getMaxHumidity());	

    }
}