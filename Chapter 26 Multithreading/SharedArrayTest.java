// Fig. 26.9: SharedArrayTest.java
// Executes two Runnables to add elements to a shared SimpleArray.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main( String[] args ) {
        // construct the shared object
        SimpleArray sharedSimpleArray = new SimpleArray( 6 );
        
        // create two tasks to write to the shared SimpleArray
        ArrayWriter writer1 = new ArrayWriter( 1, sharedSimpleArray );
        ArrayWriter writer2 = new ArrayWriter( 11, sharedSimpleArray );
        
        // execute the tasks with an ExecutionService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute( writer1 );
        executor.execute( writer2 );
        
        executor.shutdown();
        
        try {
            // wait 1 minute for both writers to finish executing
            boolean taskEnded = executor.awaitTermination(
                1, TimeUnit.MINUTES );
                
            if ( taskEnded ) 
                System.out.println( sharedSimpleArray ); // print contents
            else
                System.out.println( "Timed out while waiting for tasks to finish." );
        } // end try
        catch ( InterruptedException ex ) {
            System.out.println( "Interrupted while waiting for tasks to finish." );
        } // end catch   
    } // end main
} // end class SharedArrayTest