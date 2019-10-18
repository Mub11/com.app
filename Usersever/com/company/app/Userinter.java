package app;

import Result.Result;

public interface Userinter {
    
    public Result login(Userinfo userinfo);
    public Result register(Userinfo userinfo);
    public void registerme();
}
