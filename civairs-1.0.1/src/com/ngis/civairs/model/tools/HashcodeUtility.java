package com.ngis.civairs.model.tools;

public class HashcodeUtility {

	public static int hash31(String toHash){
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + toHash.hashCode();
		return hash;
	}
	
	
	
	public static int hash251(String toHash){
		final int prime = 251;
		int hash = 17;
		hash = hash * prime + toHash.hashCode();
		return hash;
	}
	
	public static String hash31ToString(String toHash){
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + toHash.hashCode();
		return ""+hash;
	}
	
	public static String hashABS31ToString(String toHash){
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + toHash.hashCode();
		if(hash < 0) hash = hash * (-1);
		return ""+hash;
	}
	
	public static String hash251ToString(String toHash){
		final int prime = 251;
		int hash = 17;
		hash = hash * prime + toHash.hashCode();
		return ""+hash;
	}
	
	public static String hashABS251ToString(String toHash){
		final int prime = 251;
		int hash = 17;
		hash = hash * prime + toHash.hashCode();
		if(hash < 0) hash = hash * (-1);
		return ""+hash;
	}
}
