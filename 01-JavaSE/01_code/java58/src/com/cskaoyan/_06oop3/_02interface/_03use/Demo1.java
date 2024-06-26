package com.cskaoyan._06oop3._02interface._03use;

/**
 * 接口的声明特点
 * - 接口能不能创建对象?
 * - 不能创建对象,实际上接口是抽象的. 因为接口的声明修饰符中隐含了关键字abstract
 * - 接口能不能用final修饰?
 * - 不能,接口定义出来目的就是为了被实现. final天生和接口矛盾
 *
 * 接口的命名特点(非强制)
 * - 接口在命名时,为了体现接口的特殊性,表示它是一个接口. 某些程序员会在接口的命名前加大写字母"I"
 * 只是让大家能够一眼看出来这是个接口。
 *
 * **接口的实现类的书写格式(非强制)**
 * - 某些程序员会在接口的所在位置,定义一个全新的包,叫"impl"
 * - 然后在该包下写接口的实现类,命名为"接口名 + Impl"
 *
 * @author Common-zhou
 * @since 2024-03-12 11:18
 */
public class Demo1 {

    public static void main(String[] args) {
        // 接口不能创建对象
        // Fly1 fly1 = new Fly1();

        // 有一些东西能放在一些地方，有些东西不能放在这些地方。
        // final 可以放在类上，可以放在方法上，可以放在属性上
        // static
        // 这个都是JVM规定的。

        // static int i = 10;
        // SE阶段学的很多东西，都是语法。  语法： 就是别人定义好的，我们要学这个东西。
        // 英语。
        // 不是语法的时候，就可以考虑为什么的问题。

    }
}


interface Fly1 {
    void fly();
}
