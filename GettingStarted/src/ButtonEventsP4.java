//Add Phidgets Library
import com.phidget22.*;

public class ButtonEventsP4 
{
    //Handle Exceptions
    public static void main(String[] args) throws Exception 
    {
       
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        	
        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if(e.getState() == true) 
            	{
                    System.out.println("red pressed");

            	}
            	else 
            	{
                    System.out.println("red not pressed");
            	}
            }
        });
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if(e.getState() == true) 
            	{
                    System.out.println("green pressed");

            	}
            	else 
            	{
                    System.out.println("green not pressed");
            	}
            }
        });
        
        //Open
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) 
        {
            Thread.sleep(5000); //no change
        }
    }
}