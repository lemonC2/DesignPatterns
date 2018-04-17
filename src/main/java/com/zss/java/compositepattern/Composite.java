package com.zss.java.compositepattern;


import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构建类：具体组合类
 * @author lemon
 * @date 2018/4/17 17:37
 */
public class Composite extends Component {
    //存放添加的树枝节点
    private List<Component> childComopnents = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }
//添加树枝节点
    @Override
    public void add(Component c) {
        childComopnents.add(c);
    }
//移除树枝节点
    @Override
    public void remove(Component c) {
    childComopnents.remove(c);
    }

    @Override
    public void display(String depth) {
        System.out.println(depth+" " + name);
        depth += "+";
        for (Component component : childComopnents){
            component.display(depth);
        }
    }
}
