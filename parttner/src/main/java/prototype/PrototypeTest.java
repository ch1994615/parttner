package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackChen
 * @date 2019/3/17
 */
public class PrototypeTest {
    public static void main(String[] args) {
        List list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        PrototypeParttner prototype =  new PrototypeParttner(10,"chenhao",1,list);
        System.out.println(prototype.getList());
        try {
            PrototypeParttner prototypeParttner = (PrototypeParttner) prototype.clone();
            System.out.println(prototypeParttner.getList()); //浅拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
