package com.xuhao.config;

import com.xuhao.pojo.User;
import com.xuhao.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //授权
        System.out.println("进入授权");
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入认证");
        UsernamePasswordToken UserToken = (UsernamePasswordToken) authenticationToken;
        User user = userService.selectUserByName(UserToken.getUsername());
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo("", user.getPwd(), "");
    }
}
