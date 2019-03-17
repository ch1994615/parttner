package prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.util.List;

/**
 * @author jackChen
 * @date 2019/3/17
 */
public class PrototypeParttner implements Cloneable,Serializable{

    public PrototypeParttner(int age, String name, int gender, List<?> list) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.list = list;
    }

    private int age;
    private String name;
    private int gender;
    private List<?> list;

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅拷贝
//        return super.clone();
        //深拷贝
        //通过序列化和反序列化得到
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
