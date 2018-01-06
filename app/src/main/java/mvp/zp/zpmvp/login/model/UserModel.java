package mvp.zp.zpmvp.login.model;

/**
 * Created by Administrator on 2017/5/5 0005.
 */

public class UserModel implements ZpUserModel{

    @Override
    public void login(String name, String pwd, OnLoginListener onLoginListener) {
        if (!name.equals("") && !pwd.equals("")){
            onLoginListener.loginSuccess();
        }else {
            onLoginListener.loginfialed();
        }
    }

}
