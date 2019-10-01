/**
 * 
 */
package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Shikhar
 *
 */
public class StringPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numberOfTestCases = sc.nextInt();
		String output="";
		while(sc.hasNext() && numberOfTestCases>0){
			String defaultStr = sc.next();
			
			char temp;
			//char[] defTempChars = defChars.clone();
			Set<String> strList =new HashSet<>();

			new StringPermutations().permutation(defaultStr,strList);
			
			List<String> sortedList = new ArrayList(strList);
			Collections.sort(sortedList);
			
			for(String str : sortedList){
				output = output + str+" ";
			}
			numberOfTestCases--;
			if(numberOfTestCases==0){
				sc.close();
				break;
			}
			
			output = output + "\n";
		}
		
		System.out.println(output);
	}

	void permutation(String defaultStr,Set<String> strList) {
		char[] defTempChars = defaultStr.toCharArray();
		
		strList.add(String.valueOf(defTempChars));
		int i = 0;
		char temp;
		for (int j = i + 1; j < defTempChars.length; j++) {
			temp = defTempChars[i];
			defTempChars[i] = defTempChars[j];
			defTempChars[j] = temp;

			if(strList.add(String.valueOf(defTempChars))){
				permutation(String.valueOf(defTempChars), strList);
			}else{
				break;
			}
		}
	}
}
