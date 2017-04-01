package myjavaproject;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()%2==0) {System.exit(0);}
	  	char[] c = s.toCharArray();
		int x;
		int z=2;
		for(int i=1,j=c.length-1;i<=c.length;i++,j=j-2){
			String a = "";
			String b = "";
			if (i <= (c.length/2) + 1) {
				a = "%" + Integer.toString(i*5) +"c";
			    b = "%" + Integer.toString(j*5) +"c";
			}
			else {
				if(!(i == (c.length/2) + 2)) {
			    	z = z+2;
				}
			    x = i-z;
			    j = j+4;
			    a = "%" + Integer.toString((x)*5) +"c";
			    b = "%" + Integer.toString((j)*5) +"c";
			}
			//System.out.println(a + "   " +b);
			System.out.printf(a,c[i-1]);
            if (!(i == c.length/2 + 1)) {
            	System.out.printf(b,c[i-1]);
            }
            System.out.println();
        }
	sc.close();
  }
}
