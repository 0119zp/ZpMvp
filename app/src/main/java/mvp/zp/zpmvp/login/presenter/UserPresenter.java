package mvp.zp.zpmvp.login.presenter;

import android.content.Context;
import android.widget.Toast;

import mvp.zp.zpmvp.login.model.OnLoginListener;
import mvp.zp.zpmvp.login.model.UserModel;
import mvp.zp.zpmvp.login.view.ZpLoginView;
import mvp.zp.zpmvp.utils.MLog;

/**
 * Created by Administrator on 2017/5/5 0005.
 */

public class UserPresenter {

    private ZpLoginView loginView;
    private final UserModel userModel;

    public UserPresenter(ZpLoginView zpLoginView){
        this.loginView = zpLoginView;
        userModel = new UserModel();
    }

    public void login(){
        userModel.login(loginView.getLoginName(), loginView.getLoginPwd(), new OnLoginListener() {
            @Override
            public void loginSuccess() {
                MLog.e("登录成功");
                loginView.loginSuccess();
            }

            @Override
            public void loginfialed() {
               MLog.e("登录失败");
                loginView.loginFailde();
            }
        });
    }

    public void clear(){
        loginView.clearName();
        loginView.clearPwd();
    }

}
