package ir.amin.hash.sample;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Timer {

	
	Instant start;
	Instant end;
	
	public void start(){
        start = Instant.now();  // start timer
	}
	
	public void end(){
		end = Instant.now();    // end timer
	}
	
	public void print(){
        System.out.println(String.format(
                "Hashing took %s ms",
                ChronoUnit.MILLIS.between(start, end)
        ));
	}
	
}
