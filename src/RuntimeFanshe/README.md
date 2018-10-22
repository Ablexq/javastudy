
[Java基础之—反射（非常重要）](https://blog.csdn.net/sinat_38259539/article/details/71799078)

# 1. 概述

Java 反射是可以让我们在运行时获取类的方法、属性、父类、接口等类的内部信息的机制。

也就是说，反射本质上是一个“反着来”的过程。我们通过new创建一个类的实例时，

实际上是由Java虚拟机根据这个类的Class对象在运行时构建出来的，而反射是通过一个类的Class对象来获取它的定义信息，

从而我们可以访问到它的属性、方法，知道这个类的父类、实现了哪些接口等信息。

JAVA反射机制是在【运行】状态中，

对于任意一个类，都能够知道这个类的所有属性和方法；

对于任意一个对象，都能够调用它的任意一个方法和属性；

这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

# 2. Class类

我们知道使用javac能够将.java文件编译为.class文件，这个.class文件包含了我们对类的原始定义信息（父类、接口、构造器、属性、方法等）。

.class文件在运行时会被ClassLoader加载到Java虚拟机（JVM）中，当一个.class文件被加载后，JVM会为之生成一个Class对象，

我们在程序中通过new实例化的对象实际上是在运行时根据相应的Class对象构造出来的。

确切的说，这个Class对象实际上是java.lang.Class<T>泛型类的一个实例，比如Class<MyClass>对象即为一个封装了MyClass类的定义信息的Class<T>实例。

由于java.lang.Class<T>类不存在公有构造器，因此我们不能直接实例化这个类，我们可以通过以下方法获取一个Class对象。

Class对象来获取它的定义信息，从而我们可以访问到它的属性、方法，知道这个类的父类、实现了哪些接口等信息。


# 3.获取class
反射是框架设计的灵魂
（使用的前提条件：必须先得到代表的字节码的Class，Class类用于表示.class文件（字节码））
```
//第一种方式获取Class对象  
Student stu1 = new Student();//这一new 产生一个Student对象，一个Class对象。
Class stuClass = stu1.getClass();//获取Class对象
System.out.println(stuClass.getName());

//第二种方式获取Class对象
Class stuClass2 = Student.class;
System.out.println(stuClass == stuClass2);//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个

//第三种方式获取Class对象
try {
    Class stuClass3 = Class.forName("fanshe.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
    System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}

```
注意：在运行期间，一个类，只有一个Class对象产生。

三种方式常用第三种，第一种对象都有了还要反射干什么。

第二种需要导入类的包，依赖太强，不导包就抛编译错误。

一般都第三种，一个字符串可以传入也可写在配置文件中等多种方法。













