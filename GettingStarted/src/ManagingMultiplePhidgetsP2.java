//Add Phidgets Library
import com.phidget22.*;

//Imports required for lists
import java.util.ArrayList;
import java.util.List;

public class ManagingMultiplePhidgetsP2 
{
  //Handle Exceptions
  public static void main(String[] args) throws Exception
  {

      //Define
      List < DigitalOutput  > leds = new ArrayList();

      //Create, Address and Open
      for(int i = 0; i < 6; i++)
      {
          leds.add(new DigitalOutput());
          leds.get(i).setHubPort(i);
          leds.get(i).setIsHubPortDevice(true);
          leds.get(i).open(1000);
      }        

      //Use your Phidgets
      while(true)
      {
          for(int i = 0; i < leds.size(); i++)
          {
              leds.get(i).setState(true);
              Thread.sleep(1000);

          }  
          for(int i = 5; i > -1; i--)
          {
              leds.get(i).setState(false);
              Thread.sleep(1000);

          }          
          
      }
  }
}
