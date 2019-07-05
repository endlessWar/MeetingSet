package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.UserManager;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/5/22 13:50
 */
public interface IUserBaseMapper {
    UserManager getUserInfo(UserManager userManager);

    List<UserManager> searchusers(String word);

    int addUser(UserManager userManager);

    int updateUser(UserManager userManager);

    int delUser(UserManager userManager);

    void delLinkByUser(UserManager userManager);

    String getPassword(UserManager userManager);

    UserManager getUserByAccount(UserManager userManager);
}
