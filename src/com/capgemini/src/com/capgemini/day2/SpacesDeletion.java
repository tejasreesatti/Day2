package com.capgemini.day2;

public class SpacesDeletion {

	public static String deleteExcessSpaces(String string, String word, int position) {
		// TODO Auto-generated method stub
		String fin = "";
		int i;
		for(i = 0; i < string.length()-1; i++) {
			if(string.charAt(i) == string.charAt(i+1) && string.charAt(i) == ' ') {
				
			}
			else
			{
				fin += string.charAt(i);
			}
		}
		fin = fin + string.charAt(i);
		string = fin;
		fin = "";
		int count = 0;
		for(i = 0; i < string.length(); i++)
		{
			if(string.charAt(i) == ' ') {
				count++;
				if(count == (position - 1))
				{
					fin = string.substring(0,  i+1)+string.substring(i+2+word.length());
				}
			}
		}
		System.out.println(fin);
		return fin;
	}

}
