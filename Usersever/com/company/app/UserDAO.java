package app;

public interface UserDAO {
    public void saveDAO();
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
