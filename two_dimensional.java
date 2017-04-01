package myjavaproject;

import java.util.Scanner;

public class two_dimensional {
	public static void main(String[] args) {
		String s = "WELCOMETOXXXXXCORPORATION";
		char[] sc = s.toCharArray();
		char[][] c = new char[5][5];
		int x=0;
		for(int i =0; i<5; i++) {
			for(int j=0; j<5 && x < sc.length; j++) {
				c[i][j] = sc[x];
				x++;
			}
		}
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%-5c", c[i][j]);
			}
			System.out.println();
		}
		Scanner scan = new Scanner(System.in);
		String find = scan.next();
		char[] fc = find.toCharArray();
		x=0;
		for(int i =0; i<5; i++) {
			for(int j=0; j<5 && x<fc.length; j++) {
				if(c[i][j] == fc[x]) {
					int xxx = x;
					int gg = 0;
					int y = 0;
					//left to right check
					for(y=j;y<5 && xxx<fc.length;y++) {
						if(c[i][y] ==  fc[xxx]){
							gg++;
						}
						xxx++;
					}
					if(gg == fc.length) {
						System.out.println("Start Index: <"+i+","+(y-fc.length) + ">\nEnd Index: <" + i+","+(y-1)+">");
					}
					//top to bottom check
					xxx = x;
					gg = 0;
					y =  0;
					for(y=i;y<5 && xxx<fc.length;y++) {
						if(c[y][j] ==  fc[xxx]){
							gg++;
						}
						xxx++;
					}
					if(gg == fc.length) {
						System.out.println("Start Index: <"+(y-fc.length)+","+j + ">\nEnd Index: <" + (y-1)+","+j+">");
					}
				}
			}
		}
		scan.close();
	}
}
