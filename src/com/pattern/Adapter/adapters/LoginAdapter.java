package com.pattern.Adapter.adapters;

import com.pattern.Adapter.Login.ResultMsg;

/**
 * @author jackChen
 * @date 2019/3/16
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(Object [] values);
}
