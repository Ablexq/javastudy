package constructor;

/**
 * 建造者模式：将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * http://blog.csdn.net/jason0539/article/details/44992733
 */
public class Constructor1 {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person manPerson = pd.constructPerson(new ManBuilder());
        Person womanPerson = pd.constructPerson(new WomanBuilder());
    }

    /*-------------角色Product：-----------*/
    public static class Person {
        private String head;
        private String body;
        private String foot;

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getFoot() {
            return foot;
        }

        public void setFoot(String foot) {
            this.foot = foot;
        }
    }

    public static class Man extends Person {
        public Man() {
            System.out.println("开始建造男人");
        }
    }

    public static class Woman extends Person {
        public Woman() {
            System.out.println("开始建造女人");
        }
    }

    /*-----------------角色Director：---------------*/
    public static class PersonDirector {
        public Person constructPerson(PersonBuilder pb) {
            pb.buildHead();
            pb.buildBody();
            pb.buildFoot();
            return pb.buildPerson();
        }
    }

    /*---------------角色ConcreteBuilder：-------------*/
    public static class WomanBuilder implements PersonBuilder {
        Person person;

        public WomanBuilder() {
            person = new Woman();
        }

        @Override
        public void buildBody() {
            person.setBody("建造女人的身体");
        }

        @Override
        public void buildFoot() {
            person.setFoot("建造女人的脚");
        }

        @Override
        public void buildHead() {
            person.setHead("建造女人的头");
        }

        @Override
        public Person buildPerson() {
            return person;
        }
    }

    /*------------------角色ConcreteBuilder：-------------*/
    public static class ManBuilder implements PersonBuilder {
        Person person;

        public ManBuilder() {
            person = new Man();
        }

        @Override
        public void buildBody() {
            person.setBody("建造男人的身体");
        }

        @Override
        public void buildFoot() {
            person.setFoot("建造男人的脚");
        }

        @Override
        public void buildHead() {
            person.setHead("建造男人的头");
        }

        @Override
        public Person buildPerson() {
            return person;
        }
    }

    /*--------------角色Builder：------------*/
    public interface PersonBuilder {
        void buildHead();

        void buildBody();

        void buildFoot();

        Person buildPerson();
    }
}
