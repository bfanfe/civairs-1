package com.ngis.civairs.model.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestEncriptor {

	private static final String ALGORITHME_SHA_256="SHA-256";
	private static final String ALGORITHME_SHA_512="SHA-512";
	private static final String ALGORITHME_SHA_384="SHA-384";
	private static final String ALGORITHME_MD5="MD5";
	
	public static String encripteSHA256(String input) throws NoSuchAlgorithmException {
		return getEncripted(ALGORITHME_SHA_256, input);
	}
	
	public static String encripteSHA512(String input) throws NoSuchAlgorithmException {
		return getEncripted(ALGORITHME_SHA_512, input);
	}
	
	public static String encripteSHA384(String input) throws NoSuchAlgorithmException {
		return getEncripted(ALGORITHME_SHA_384, input);
	}
	
	public static String encripteMD5(String input) throws NoSuchAlgorithmException {
		return getEncripted(ALGORITHME_MD5, input);
	}
	

	public static String getEncripted(String algorithme, String input) throws NoSuchAlgorithmException {
		byte[] digest = null;
		MessageDigest sha = MessageDigest.getInstance(algorithme);
		digest = sha.digest(input.getBytes());
		return bytesToHex(digest);
	}
	
	private static String bytesToHex(byte[] b) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		StringBuffer buffer = new StringBuffer();
		for (int j = 0; j < b.length; j++) {
			buffer.append(hexDigits[(b[j] >> 4) & 0x0f]);
			buffer.append(hexDigits[b[j] & 0x0f]);
		}
		return buffer.toString();
	}
	

}