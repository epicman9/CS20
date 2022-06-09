  
//Add Phidgets Library 
import com.phidget22.*;

public class PhidgetAPIP2 
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();

        //Open 
        humiditySensor.open(1000);

        System.out.println(Phidget.getLibraryVersion());

    }
}