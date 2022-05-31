//Add Phidgets Library
import com.phidget22.*;

public class ButtonEventsP3 
{
    //Handle Exceptions
    public static void main(String[] args) throws Exception 
    {
       
        //Create
        DigitalInput redButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
            	if(e.getState() == true) 
            	{
                    System.out.println("pressed");

            	}
            	else 
            	{
                    System.out.println("not pressed");
            	}
            }
        });

        //Open
        redButton.open(1000);

        //Keep program running
        while (true) 
        {
            Thread.sleep(5000); //no change
        }
    }
}