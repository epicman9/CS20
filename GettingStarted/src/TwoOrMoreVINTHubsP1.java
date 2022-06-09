//Add Phidgets Library 
import com.phidget22.*;

public class TwoOrMoreVINTHubsP1 {
  //Handle Exceptions 
  public static void main(String[] args) throws Exception{

      //Create 
      DigitalOutput redLED0 = new DigitalOutput();
      DigitalInput redButton0 = new DigitalInput();
      DigitalOutput redLED1 = new DigitalOutput();
      DigitalInput redButton1 = new DigitalInput();

      //Set VINT Hub 
      redLED0.setDeviceSerialNumber(606191);
      redButton0.setDeviceSerialNumber(606191);//put in VINT serial numbers
      redLED1.setDeviceSerialNumber(627174);
      redButton1.setDeviceSerialNumber(627174);

      //Address 
      redLED0.setHubPort(1);
      redLED0.setIsHubPortDevice(true);
      redButton0.setHubPort(0);
      redButton0.setIsHubPortDevice(true);
      redLED1.setHubPort(1);
      redLED1.setIsHubPortDevice(true);
      redButton1.setHubPort(0);
      redButton1.setIsHubPortDevice(true);
      boolean test = false;
      //Event 
      redButton0.addStateChangeListener(new DigitalInputStateChangeListener() 
      {
          public void onStateChange(DigitalInputStateChangeEvent e) 
          {
              System.out.println("bruh");	

          }
      });

      //Event 
      redButton1.addStateChangeListener(new DigitalInputStateChangeListener() 
      {
          public void onStateChange(DigitalInputStateChangeEvent e) 
          {
              System.out.println("bruh1");	

          }
      });
      
      //Open 
      redLED0.open(1000);
      redButton0.open(1000);
      redLED1.open(1000);
      redButton1.open(1000);
      
      
      while(true) //teacher said have gone far enough as this is the last one I was doing. just talk about the error and have no idea why it is there. 
      { 

      }
  }
}