package userService;

import userinfo.Userinfo;

public interface UserDAO {
    public Userinfo findUserInfoByName(String username);
    /*
     * @porgram: userifo
     * @Description: to register user in data source
     * @param: userinfo
     * @auther: mub1
     * @data: 2019/10/16 23:31
     */
    public boolean saveUser(Userinfo userinfo);
}
