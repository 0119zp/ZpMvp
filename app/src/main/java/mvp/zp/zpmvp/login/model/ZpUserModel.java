package mvp.zp.zpmvp.login.model;

/**
 * Created by Administrator on 2017/5/5 0005.
 *
 * model层主要负责：
 * 从网络，数据库，文件，传感器，第三方等数据源读写数据。
 * 对外部的数据类型进行解析转换为APP内部数据交由上层处理。
 * 对数据的临时存储,管理，协调上层数据请求。
 */

public interface ZpUserModel {

    void login(String name, String pwd, OnLoginListener onLoginListener);

}
