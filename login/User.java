

public class User{
	private String username;
	private String userpassword;
	
	public User(){
		
	}
	
	public User(String username,String userpassword){
		this.username = username;
		this.userpassword = userpassword;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setUserpassword(String userpassword){
		this.userpassword = userpassword;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public String getUserpassword(){
		return this.userpassword;
	}
}