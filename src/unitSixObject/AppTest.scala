package unitSixObject

/**
  * 定义一个scala启动类，有两种方式
  * 1、第一种方式是让类继承APP类
  * 2、第二种方式是让类实现main方法
  * 所以以下两种方式的逻辑是相同的,但无论是哪一种方式，都必须是object对象,
  * 而不是类class
  */
object AppTest extends App {

  args.foreach(println);
}

//object AppTest{
//
//  def main(args: Array[String]): Unit = {
//    args.foreach(println);
//  }
//}


