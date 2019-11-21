package loginform;

import DefaultValue.DefaultValue;
import userinfo.Userinfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LoginCheck {
    public int loginCheck(Userinfo userinfo){
        try {
            String  filename = DefaultValue.FILEPATH + userinfo.getUsername() + DefaultValue.FILETYPE;
            File file = new File(filename);
            if (!file.exists()) {
                throw new Exception();
            }
            BufferedReader read = new BufferedReader(new FileReader(file));
            if (userinfo.getUsername().equals(read.readLine())){
                if (userinfo.getpassword().equals(read.readLine())){
                    QQForm qqForm = new QQForm();
                    qqForm.setFrameWeChatVisible(true);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}
