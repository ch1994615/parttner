package com.pattern.simple.DeepClone;

import java.io.*;
import java.util.Date;

/**
 * @author jackChen
 * @date 2019/2/24
 */
public class QitianDaSheng extends Monkey implements Serializable,Cloneable{

    public JinGuBang j = new JinGuBang();
    @Override
    protected Object clone() throws CloneNotSupportedException {//只是克隆了对象地址 那么 修改了 主对象 克隆对象的属性都会变
        return this.deepClone();
    }

    /*
     * @author jackChen
     * 使用序列化的形式 让对象属性完成真正的clone
     * @date 2019/2/24
     * @param [q]
     * @return com.pattern.simple.DeepClone.QitianDaSheng
     */
    public Object deepClone(){

        try {
            /**
             * 将对象序列化到  byte中
             */
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QitianDaSheng q = (QitianDaSheng) ois.readObject();
            q.setBirthday(new Date());


            bos.close();
            oos.close();
            bis.close();
            ois.close();
            return q;

        }catch (Exception e){

        }

        return null;
    }
}
