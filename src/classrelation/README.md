

类和类之间关系包括了 is a，has a, use a三种关系

# is a包括了 继承，实现关系

继承:子是父的关系，狗是动物
```
public class Animal{}

public class Dog extends Animal{}
```

实现:实现类实现接口，同样是是的关系，UserServiceImpl实现了UserService接口

```
public interface UserService{}

public class UserServiceImpl implements UserService{}
```

# has a包括了 组合，聚合，关联关系

组合:有的关系，人有一个心脏，而且这个心脏是在创造人时，内部创造的

```
public class Heart{}

public class Person{
    private Hart hart;
    public Person(){
        this.hart=new Hart();
    }
}
```
聚合:有的关系,汽车有发动机，而且汽车产生就有发动机了，而对于汽车制造的时候，发动机不一定是自己造的，可以拿别人造好的发动机

```
public class Engine{}

public class Car{
    private Engine engine;
    public Car(Engine engine){
        this.engine=engine;
    }
}
```

关联:一个人可以有一辆汽车，而这个汽车不是一个人出生就有，而是后期买的

```
public class Car{}

public class Person{
    private Car car;
    public void setCar(){
        this.car=car;
    }
}
```



# use a包括了 依赖关系

依赖:使用的关系，一个人可以做火车到达想去的地方，但火车不是这个人的东西，人只是使用火车移动

```
public class Train{
    public void move(){}
}

public class Person{
    public void move(Train train){
        train.move();
    }
}
```

# 总结

通过代码可以看出，类和类之间的关系，按我这个顺序是从高到低

一个类改变了对于其他类的影响也是从高到低

我们写代码要遵守两个原则

高低原则
    高内聚，低耦合
    
开闭原则
   对扩展开，对修改闭
   
所以我们写代码，能有耦合低的关系就不要用耦合高的关系

强弱程度依次为：

继承 > 实现 > 组合 > 聚合 > 关联 > 依赖
is a > has a > use a

