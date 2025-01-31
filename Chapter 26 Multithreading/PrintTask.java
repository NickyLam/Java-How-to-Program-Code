// Fig. 26.4: PrintTask.java
// PrintTask class sleeps for a random time from 0 to 5 seconds
import java.util.Random;

public class PrintTask implements Runnable {
	private final int sleepTime; // random sleep time for thread
	private final String taskName; // name of task
	private final static Random generator = new Random();
	
	public PrintTask( String name ) {
		taskName = name; // set task name
		
		// pick random sleep time between 0 and 5 seconds
		sleepTime = generator.nextInt( 5000 ); // milliseconds
	}
	
	// method run contains the code that a thread will execute
	public void run() {
		try // put thread to sleep for sleepTime amount of time
		{
			System.out.printf( "%s going to sleep for %d milliseconds.\n",
				taskName, sleepTime );
			Thread.sleep( sleepTime );
		}
		catch ( InterruptedException exception ) {
			System.out.printf( "%s %s\n", taskName,
				"terminated permaturely due to interruption" );
		} // end catch
		
		// print task name
		System.out.printf( "%s done sleeping\n", taskName );
	} // end method run
} // end class PrintTask