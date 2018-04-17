package com.zss.java.compositepattern;

/**
 * 树叶构件类：没有子节点的树叶
 * @author lemon
 * @date 2018/4/17 17:36
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        return;
    }

    @Override
    public void remove(Component c) {
        return;
    }

    @Override
    public void display(String depth) {
        System.out.println(depth + " " + name);
    }
}
