package com.capgemini.day2;

public class MissingElementCheck {
	static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;   
        for ( i = 0; i< n; i++)
           total -= a[i];
        return total;
    }

	public static int checkForTheMissingElement(int[] arr) {
		
    int miss = getMissingNo(arr,5);
		// TODO Auto-generated method stub
		return miss;
	}

}
