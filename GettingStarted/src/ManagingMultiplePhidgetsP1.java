//Add Phidgets Library
import com.phidget22.*;

//Imports required for lists
import java.util.ArrayList;
import java.util.List;

public class ManagingMultiplePhidgetsP1 
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
          }  
          
          Thread.sleep(1000);
          
          for(int i = 0; i < leds.size(); i++)
          {
              leds.get(i).setState(false);
          }
          
          Thread.sleep(1000); //it goes to all of the ports and turns on the LED at each port. Instead of declaring and addressing each LED separatly it uses an array and a loop to declare and adress and open 6. 
      }
  }
}
