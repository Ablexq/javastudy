package facade;

/**
 * java设计模式之外观模式（门面模式）
 * https://www.cnblogs.com/lthIU/p/5860607.html
 *
 * 简单来说，该模式就是把一些复杂的流程封装成一个接口供给外部用户更简单的使用。这个模式中，设计到3个角色。　
 * 1）.门面角色：外观模式的核心。它被客户角色调用，它熟悉子系统的功能。内部根据客户角色的需求预定了几种功能的组合。
 * 2）.子系统角色:实现了子系统的功能。它对客户角色和Facade时未知的。它内部可以有系统内的相互交互，也可以由供外界调用的接口。　
 * 3）.客户角色:通过调用Facede来完成要实现的功能。
 */
public class Cilent {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("=================");
        computer.shutDown();
    }
}