package observerable;


/*
*  观察者模式
*  https://www.cnblogs.com/luohanguo/p/7825656.html
*  观察者模式的定义：
*  在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新。
*  大白话：
*  其实就是发布订阅模式，发布者发布信息，订阅者获取信息，订阅了就能收到信息，没订阅就收不到信息。
* */
public class Test {

    public static void main(String[] args) {
        WechatObserverable server = new WechatObserverable();

        Observer userZhang = new UserObserver("ZhangSan");
        Observer userLi = new UserObserver("LiSi");
        Observer userWang = new UserObserver("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");

    }
}