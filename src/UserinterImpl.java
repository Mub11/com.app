

import java.util.Scanner;

public class UserinterImpl implements Userinter {
    public String Login (Userinfo userinfo){
        if("mub1".equals(userinfo.getUsername())){
            if("xxx".equals(userinfo.getpassword())){
                System.out.println("Login successful");
            }
            else{
                System.out.println("Password Error");
            }
        }
        else{
            System.out.println("Username does not exist");
        }
        return "wqe";
    }
    public void register(){
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        userDAOImpl.saveDAO();
    }
    public void registerme(){
        UserwriImpl userwriImpl = new UserwriImpl();
        userwriImpl.save();
    }
}
