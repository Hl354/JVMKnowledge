package chapterB;

public class Test {

    /**
     * 加载顺序
     * 1：父类静态变量
     * 2：父类静态代码块
     * 3：子类静态变量
     * 4：子类静态代码块
     * 5：父类非静态变量
     * 6：父类非静态代码块
     * 7：父类构造函数
     * 8：子类非静态变量
     * 9：子类非静态代码块
     * 10：子类构造函数
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("开始");
        new Children();
        System.out.println("结束");
    }

}

class Children extends Parent{
    static {
        System.out.println("Children类静态代码块");
    }

    public static String strChildren = "Children类静态变量";

    Children() {
        System.out.println(strChildren);
    }
}

class Parent {
    static {
        System.out.println("Parent类静态代码块");
    }

    public static String strParent = "Parent类静态变量";

    Parent() {
        System.out.println(strParent);
    }
}