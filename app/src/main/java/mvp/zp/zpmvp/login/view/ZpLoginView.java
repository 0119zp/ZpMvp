package mvp.zp.zpmvp.login.view;

/**
 * Created by Administrator on 2017/5/5 0005.
 *
 * view 层主要负责：
 * 提供UI交互
 * 在presenter的控制下修改UI。
 * 将业务事件交由presenter处理。
 *
 * 注意: View层不存储数据，不与Model层交互。
 * 在Android中View层一般是Activity、Fragment、View（控件）、ViewGroup（布局等）等
 */

public interface ZpLoginView {

    String getLoginName();
    String getLoginPwd();
    void clearName();
    void clearPwd();
    void loginSuccess();
    void loginFailde();
}
