package strategy;

public class ZhaoYun {
    /**
     * 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
     */
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行
        System.out.println("\n\n\n\n\n\n\n\n");
        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GivenGreenLight());
        context.operate(); //执行了第二个锦囊了
        System.out.println("\n\n\n\n\n\n\n\n");
        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个 ------------ - ");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("\n\n\n\n\n\n\n\n");
/*
*问题来了：赵云实际不知道是那个策略呀，他只知道拆第一个锦囊，
*而不知道是BackDoor这个妙计，咋办？ 似乎这个策略模式已经把计谋名称写出来了
*
* 错！BackDoor、GivenGreenLight、BlockEnemy只是一个代码，你写成first、second、
third，没人会说你错!
*
* 策略模式的好处就是：体现了高内聚低耦合的特性呀，缺点嘛，这个那个，我回去再查查
*/
    }

    /**
     *         计谋有了，那还要有锦囊
     */
    public static class Context {
        //构造函数，你要使用那个妙计
        private IStrategy straegy;

        public Context(IStrategy strategy) {
            this.straegy = strategy;
        }

        //使用计谋了，看我出招了
        public void operate() {
            this.straegy.operate();
        }
    }

    public interface IStrategy {
        //每个锦囊妙计都是一个可执行的算法
        void operate();
    }

    /**
     *         找乔国老帮忙，使孙权不能杀刘备
     */
    public static class BackDoor implements IStrategy {
        public void operate() {
            System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
        }
    }

    /**
     *         求吴国太开个绿灯
     */
    public static class GivenGreenLight implements IStrategy {
        public void operate() {
            System.out.println("求吴国太开个绿灯,放行！");
        }
    }

    /**
     *         孙夫人断后，挡住追兵
     */
    public static class BlockEnemy implements IStrategy {
        public void operate() {
            System.out.println("孙夫人断后，挡住追兵");
        }
    }

}