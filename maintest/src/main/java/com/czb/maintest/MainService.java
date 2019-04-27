package com.czb.maintest;

import android.content.Context;
import android.content.Intent;

import com.czb.baselibrary.IMainService;

/**
 * FileName: MainService
 * Author: huangming
 * Date: 2019/4/27
 * Description: ${DESCRIPTION}
 */
public class MainService implements IMainService {
    @Override
    public void launch(Context context, String tag) {
        Intent intent=new Intent(context,MainActivity.class);
        intent.putExtra(MainActivity.TAG_CLASS,tag);
        context.startActivity(intent);
    }
}
