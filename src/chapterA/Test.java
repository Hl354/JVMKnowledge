package chapterA;

public class Test {

    int num = 1;

    public static void main(String[] args) {
        /**
         * 对象的创建过程
         * 1：申请和分配内存
         * 2：成员变量的赋值(首先给默认值,后面如果有其他值则重新赋值)
         * 3：让t关联内存堆中的地址
         * 对象定位方式
         * 1：句柄方式,t指向一个句柄池,句柄池里面存储了堆里面的地址和方法区里的地址
         * 2：直接定位,t直接指向堆里面的地址,堆中的数据又有一个指向方法去的地址
         */
        Test t = new Test();
    }

}
