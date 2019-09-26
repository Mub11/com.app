
public class Login{
	public static void main(String[] args){
		User user = new User("test","pwd");
		
		System.out.println("this is the infomation of user: " + user.getUsername());
	}
}