package app;

import DefaultValue.DefaultValue;
import javax.swing.*;
import java.io.*;

public class UserDAOImpl implements UserDAO {
    /*
     * @porgram: userifo
     * @Description: to register user in data source
     * @param: userinfo
     * @auther: mub1
     * @data: 2019/10/16 23:31
     */
    @Override
    public boolean saveUser(Userinfo userinfo){
        boolean result = false;
        try{
            if(userinfo.getUsername() == null || userinfo.getUsername().length() == 0){
                throw new Exception();
            }
            String  filename = DefaultValue.FILEPATH + userinfo.getUsername() + DefaultValue.FILETYPE;
            String content = userinfo.getUsername() + "\n" + userinfo.getpassword();
            File file = new File(filename);
            if (file.exists()) {
                throw new Exception();
            }
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
            out.write(content);
            out.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public Userinfo findUserInfoByName(String username){
        Userinfo userinfo = new Userinfo();
        try {
            if (username == null || username.length() == 0){
                throw new Exception();
            }
            String filname = DefaultValue.FILEPATH + username + DefaultValue.FILETYPE;
            File file = new File(filname);
            if(!file.exists()){
                throw new Exception();
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            String findName = in.readLine();
            String findPassword = in.readLine();
            userinfo.setUsername(findName);
            userinfo.setUserpassword(findPassword);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userinfo;
    }
    @Override
    public void saveDAO() {
        try {
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(System.in));
            System.out.println("Enter Username");
            String line = in.readLine();
            System.out.println("Enter password");
            String line0 = in.readLine();
            BufferedWriter out = new BufferedWriter(new FileWriter(line));
            out.write(line + line0);
            out.close();
            System.out.println("user data saved !");
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
