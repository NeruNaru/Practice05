package com.javaex.ex09;

public class StringUtil {
    
	public static String concatString(String[] strArray){
        String resultStr = "";
		
		for(int i = 0 ; i<strArray.length ; i++) {
        	resultStr = resultStr + strArray[i];
        }
		
		return resultStr;
        //메소드 내용작성
        
    }

}
