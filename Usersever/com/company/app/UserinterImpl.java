package app;

import Result.Result;

public class UserinterImpl implements Userinter {
    @Override
    public Result login (Userinfo userlogin) {
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        Userinfo userinfo = userDAOImpl.findUserInfoByName(userlogin.getUsername());
        Result result = new Result(402, "incorrect pwd");
        if (userinfo.getUsername().equals(userlogin.getUsername())) {
            result.setResultcode(201);
            result.setResultmessage("welcome  " + userinfo.getUsername());
        }
        return result;
/*        if("mub1".equals(userinfo.getUsername())){
            if("xxx".equals(userinfo.getpassword())){
                System.out.println("Login successful");
            }
            else{
                System.out.println("Password Error");
            }
        }
        else{
            System.out.println("Username does not exist");
        }*/
    }
    @Override
    public Result register(Userinfo userinfo){
        UserDAOImpl userDaoimpl = new UserDAOImpl();
        boolean register = userDaoimpl.saveUser(userinfo);
        Result result = new Result(404,"can not save");
        if (register){
            result.setResultcode(200);
            result.setResultmessage("saved");
        }
        return result;
    }
    @Override
    public void registerme(){
        UserwriImpl userwriImpl = new UserwriImpl();
        userwriImpl.save();
    }
}
