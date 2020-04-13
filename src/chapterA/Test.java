package chapterA;

public class Test {

    int num = 1;

    public static void main(String[] args) {
        /**
         * 对象的创建过程
         * 1：申请和分配内存
         * 2：成员变量的赋值(首先给默认值,后面如果有其他值则重新赋值)
         * 3：让t关联内存堆中的地址
         */
        Test t = new Test();
    }

}
