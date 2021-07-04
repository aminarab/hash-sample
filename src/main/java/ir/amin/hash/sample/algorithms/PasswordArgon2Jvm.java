package ir.amin.hash.sample.algorithms;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import ir.amin.hash.sample.Timer;

public class PasswordArgon2Jvm {
	

	
	 public void hash() {
		 	Timer timer = new Timer();
	        // default argon2i, salt 16 bytes, hash length 32 bytes.
	        Argon2 argon2 = Argon2Factory.create();


        	timer.start();
	        char[] password = "Hello World".toCharArray();
	        try {
	            // iterations = 10
	            // memory = 64m
	            // parallelism = 1
	            String hash = argon2.hash(22, 65536, 1, password);
		        timer.end();
	            System.out.println(hash);

	            // argon2 verify hash
	            if (argon2.verify(hash, password)) {
	                System.out.println("Hash matches password.");
	            }

	            //int iterations = Argon2Helper.findIterations(argon2, 1000, 65536, 1);
	            //System.out.println(iterations);

	        } finally {
	            // Wipe confidential data
	            argon2.wipeArray(password);
	        }

	        timer.print();
	    }
}
