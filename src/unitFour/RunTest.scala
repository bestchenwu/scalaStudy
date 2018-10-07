package unitFour


object RunTest {

  def main(args: Array[String]): Unit = {
    //在类定义上像定义函数一样，定义变量，即表明类的构造参数
    //如果用 var来修饰，则会系统生成getter和setter方法
    val test = new Test("hello", 11);
    test.name = "hello1";
    //      println(test.name);
    //      println(test.id);
    //      test.id_$eq(13);
    //      println(test.id);

    test.printHome("haha");
    test.printHome1()

  }

}