package com.charatcters;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

	public static void main(String[] args) {
         Map<Character,Integer> map=new HashMap<>();
         String str="Java is language !!";
         char[] charArray = str.toCharArray();
         for (int i = 0; i < charArray.length; i++) {
        	 char c = charArray[i];
        	 if(!Character.isWhitespace(c)){
        	 if(map.containsKey(c)){
        		 map.put(c, map.get(c)+1);
        	 }else{
        		 map.put(c, 1);
        	 }
        	 }
		}
         
         map.forEach((key,value)->System.out.println(key+" "+value));
		
	}

}
