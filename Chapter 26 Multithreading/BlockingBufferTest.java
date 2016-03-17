// Fig. 26.15: BlockingBufferTest.java
// Two threads manipulating a blocking buffer that properly
// implements the producer/consumer relationship.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingBufferTest {
    public static void main( String[] args ) {
        // Create new thread pool with two threads
        ExecutorService application = Executors.newCachedThreadPool();
        
        // create BlockingBuffer to store ints
        Buffer sharedLocation = new BlockingBuffer;
        
        application.execute( new Producer( sharedLocation ) );
        application.execute( new Producer( sharedLocation ) );
        
        application.shutdown();
    } // end main
} // end class BlockingBufferTest