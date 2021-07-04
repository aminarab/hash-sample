package ir.amin.hash.sample;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import org.mindrot.jbcrypt.BCrypt;

import ir.amin.hash.sample.algorithms.BCryptAlgorithm;
import ir.amin.hash.sample.algorithms.PBKDF2;
import ir.amin.hash.sample.algorithms.PasswordArgon2Jvm;
import ir.amin.hash.sample.algorithms.SaltedMD5Example;
import ir.amin.hash.sample.algorithms.SimpleMD5Example;

public class Bootstrap {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
		new SimpleMD5Example().hash();
		System.out.println("---------------MD5--------------");
		new SaltedMD5Example().hash();
		System.out.println("---------------SaltedMD5--------------");
		new PasswordArgon2Jvm().hash();
		System.out.println("---------------Argon2i--------------");
		new PBKDF2().hash();
		System.out.println("---------------PBKDF2--------------");
		new BCryptAlgorithm().hash();
		System.out.println("---------------BCrypt--------------");
		
	}
}
