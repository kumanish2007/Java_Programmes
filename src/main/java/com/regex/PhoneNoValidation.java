package com.regex;

import java.util.Arrays;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class PhoneNoValidation {

	public static void main(String[] args) {
		List<String> phoneNumber = getPhoneNumber();
		phoneNumber.forEach(phone ->System.out.println(isValid(phone)));
		
		List<String> phoneNumber1 = getPhoneNumber1();
		phoneNumber1.forEach(phone ->System.out.println(isValid(phone)));
	}
	
	private static boolean isValid(String s) {
        String regex = "\\d{3}-\\d{3}-\\d{4}"; // XXX-XXX-XXXX
        return s.matches(regex);
    }
	
	private static List<String> getPhoneNumber() {
		List<String> list = Arrays.asList("98349889", "593298893", "74983498", "9876534981");
		return list;
	}
	
	private static List<String> getPhoneNumber1() {
		List<String> list = Arrays.asList("983-498-0989", "593-2988-93", "749-8349-5678", "987-653-4981");
		return list;
	}
}
