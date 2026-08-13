package com.practice;

public class Test13 {	

		    public static void main(String[] args) {

		        String s = "Java is simple";

		        int start = 0;

		        for (int i = 0; i < s.length(); i++) {

		            if (s.charAt(i) == ' ') {

		                System.out.println(
		                    s.substring(start, i) +
		                    " - (" + start + ", " + (i - 1) + ")"
		                );

		                start = i + 1;
		            }
		        }

		        // Last word
		        System.out.println(
		            s.substring(start) +
		            " - (" + start + ", " + (s.length() - 1) + ")"
		        );
		    }
		
	}


