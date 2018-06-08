package br.com.lendolivro.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GerenciadorHash {
	
	public static String getHashMd5(String nome) throws NoSuchAlgorithmException{
		
			 String novaChave = null ;
		     MessageDigest md5=MessageDigest.getInstance("MD5");
		     md5.update(nome.getBytes(),0,nome.length());
		     novaChave=new BigInteger(1,md5.digest()).toString();
		     
		return novaChave;
	}
	
	public static String getHashSHA1(String nome) throws NoSuchAlgorithmException{
		
		 String novaChave = null;
		 MessageDigest sha1=MessageDigest.getInstance("SHA1");
		 sha1.update(nome.getBytes(),0,nome.length());
		 novaChave =new BigInteger(1,sha1.digest()).toString(16);
		 
		 return novaChave;
	}

}
