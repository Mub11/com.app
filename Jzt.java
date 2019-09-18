/*
program: 99formula
describe: output 99formula
author: Mub11
date: 2019/9/18
*/
public class Jzt{
	public static void main(String[] args){
		int i;
		int j;
		for (i = 1; i <= 13; i++){
			for (j = 1; j <= 13-i; j++){
			    System.out.print(" ");
			}
			for (j = 1; j <= 2*i-1; j++){
				System.out.print("*");
			}
                System.out.print("\n");		
		}
	}
}