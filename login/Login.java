import java.util.Scanner;
public class Login{
	public static void main(String[] args){
		User user = new User();
		System.out.println("plesa input your Username");
		Scanner scan = new Scanner(System.in);
		String Username = scan.next();
		System.out.println("plesa input your password");
		String password = scan.next();
		System.out.println("this is the infomation of user: " + user.getUsername());
		if(Username.equals(user.getUsername())){
			if(password.equals(user.getpassword())){
				System.out.println("Login successful");
				return;
			}
			System.out.println("your password error");
			return;
		}
		System.out.println("your Username error");
		return;
	}
}