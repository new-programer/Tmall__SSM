package com.nanhua.Tmall.pojo;

public class Category
{
    private Integer id;
    private String name;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name == null ? null :name.trim();
        System.out.println("测试一下this.name = name == null ? null :name.trim();是干嘛的" + (this.name = name == null ? null :name.trim()));
/*
        知识点备注：
        1.运算符关系
            口诀：单目乘除为关系，逻辑三目后赋值
            含义解读：
                单目：单目运算符+ –(负数) ++ -- 等
                乘除：算数单目运算符* / % + -
                    为：位移单目运算符<< >>
                关系：关系单目运算符> < >= <= == !=
                逻辑：逻辑单目运算符&& || & | ^
                三目：三目单目运算符A > B ? X : Y
                后：无意义，仅仅为了凑字数
                赋值：赋值=
                （一般，单目和三目运算符是从右向左，双目运算符是从左向右）
            此处语法是先运行关系运算法，故先进行==关系符左边的this.name = name，
            然后进行==关系符右边的null ? null :name.trim()
        2.字符串String类的trim()方法
            trim()方法返回调用字符串对象的一个副本，
            但是所有起始和结尾的空格都被删除了，例子如下：
            String s="    Hello World   ".trim();
		    就是把"Hello World"放入s中。
    */
    }
}
