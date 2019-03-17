package com.pattern.decorator.impl;

import java.io.DataInputStream;
import java.io.InputStream;

/**
 * @author jackChen
 * @date 2019/3/4
 */
public class IoHandler {

    InputStream is = null;
    DataInputStream dis = new DataInputStream(is);
}
