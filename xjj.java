import java.util.Scanner;
/*
auther : Mub11
date : 2019/9/23
*/
public class xjj{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("please input your age");
		int age = scan.nextInt();
		if(age < 18){
			age = 1;
		}
		else{
			age = 0;
		}
		switch(age){
			case 1:
			System.out.println("youngsister");
			break;
			case 0:
			System.out.println("oldersister");
			break;
	    }
	}
}