package com.czb.logintest;

import android.content.Context;
import android.content.Intent;

import com.czb.baselibrary.ILoginService;

/**
 * FileName: LoginService
 * Author: huangming
 * Date: 2019/4/27
 * Description: ${DESCRIPTION}
 */
public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent=new Intent(context,LoginActivity.class);
        intent.putExtra(LoginActivity.TAG_CLASS,targetClass);
        context.startActivity(intent);
    }
}
