package mvp.zp.zpmvp.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import mvp.zp.zpmvp.R;
import mvp.zp.zpmvp.login.presenter.UserPresenter;
import mvp.zp.zpmvp.login.view.ZpLoginView;

/**
 * Created by Administrator on 2017/5/5 0005.
 */

public class ZpLoginActivity extends Activity implements ZpLoginView{


    private EditText name;
    private EditText ped;
    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userPresenter = new UserPresenter(this);

        initView();
    }

    private void initView() {
        name = (EditText) findViewById(R.id.et_name_edit);
        ped = (EditText) findViewById(R.id.et_pwd_edit);
    }

    public void login(View view){
        userPresenter.login();
    }

    public void clear(View view){
        userPresenter.clear();
    }

    @Override
    public String getLoginName() {
        return name.getText().toString();
    }

    @Override
    public String getLoginPwd() {
        return ped.getText().toString();
    }

    @Override
    public void clearName() {
        name.setText("");
    }

    @Override
    public void clearPwd() {
        ped.setText("");
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailde() {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
    }
}
