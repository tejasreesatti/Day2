package com.capgemini.day2;

public class SubjectMarks {

	public static String evaluationOfMarks(int sub1, int sub2, int sub3) {
		String p = "Passed";
		String pr = "Promoted";
		String f = "Failed";
		if(sub1 >= 60 && sub2 >= 60 && sub3 >= 60) {
			return p;
		}
		else if((sub1 >= 60 && sub2 >= 60)||(sub2 >= 60 && sub3 >= 60)||(sub3 >= 60 && sub1 >= 60)) {
			return pr;
		}
		else {
			return f;
		}
		// TODO Auto-generated method stub
		
	}

}
