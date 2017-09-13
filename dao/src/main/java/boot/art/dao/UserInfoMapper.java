package boot.art.dao;

import boot.art.model.UserInfo;

import java.util.Map;

/**
 * Created by shaofeng on 2017/9/12.
 */
public interface UserInfoMapper {
    public UserInfo selectById(Map<String,Object> params);

    public boolean insert(UserInfo u);
}
