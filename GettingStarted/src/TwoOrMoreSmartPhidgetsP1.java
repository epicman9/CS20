 
//Add Phidgets Library 
import com.phidget22.*;

public class TwoOrMoreSmartPhidgetsP1 
{
    public static void main(String[] args) throws Exception
    {

        //Create 
        TemperatureSensor temperatureSensor0 = new TemperatureSensor();
        TemperatureSensor temperatureSensor1 = new TemperatureSensor();
        DigitalInput greenButton1 = new DigitalInput();
        DigitalInput redButton1 = new DigitalInput();
        DigitalInput redButton0 = new DigitalInput();
        DigitalInput greenButton0 = new DigitalInput();

         //Address 
         temperatureSensor0.setHubPort(3);
         temperatureSensor1.setHubPort(3);
         greenButton1.setIsHubPortDevice(true);
         greenButton1.setHubPort(5);
         redButton1.setIsHubPortDevice(true);
         redButton1.setHubPort(0);
         greenButton0.setIsHubPortDevice(true);
         greenButton0.setHubPort(5);
         redButton0.setIsHubPortDevice(true);
         redButton0.setHubPort(0);
         
        //Open 
        temperatureSensor0.open(1000);
        temperatureSensor1.open(1000);
        greenButton0.open(1000);
        redButton0.open(1000);
        greenButton1.open(1000);
        redButton1.open(1000);

        //Event 
        greenButton1.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if(e.getState() == true) 
            	{
            		try 
            		{
            			System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C" );
            		} 
            		catch (PhidgetException e1) 
            		{
            			// TODO Auto-generated catch block
            			e1.printStackTrace();
            		}
            	}
            }
        });
        redButton1.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if(e.getState() == true) 
            	{
            		try 
            		{
            			System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C" );
            		} 
            		catch (PhidgetException e1) 
            		{
            			// TODO Auto-generated catch block
            			e1.printStackTrace();
            		}

            	}
            }
        });
        greenButton0.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if(e.getState() == true) 
            	{
            		try 
            		{
            			System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C" );
            		} 
            		catch (PhidgetException e1) 
            		{
            			// TODO Auto-generated catch block
            			e1.printStackTrace();
            		}
            	}
            }
        });
        redButton0.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if(e.getState() == true) 
            	{
            		try 
            		{
            			System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C" );
            		} 
            		catch (PhidgetException e1) 
            		{
            			// TODO Auto-generated catch block
            			e1.printStackTrace();
            		}
            	}
            }
        });


        //Use your Phidgets 
        while (true) 
        {
            Thread.sleep(2000);
        }
    }
} // commented out because causes projectwide error issues.