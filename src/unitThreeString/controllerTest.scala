package unitThreeString

import Array.ofDim

object controllerTest {

  //这两个是类中的函数定义函数
  def f(x: Int) = {
    x * 3
  };

  def f2 = (x: Int) => x + 3 + 2;

  //这是类中的方法定义(两者差别很小，区别是方法需要加一个返回值)
  def addInt(x1: Int, x2: Int): Int = {
    return x1 + x2
  }

  //以下是函数和方法的高阶不同
  //方法里可以将函数作为返回值
  def m1(f: (Int, Int) => Int): Int = {
    f(2, 6);
  }

  def ttt(f: Int => Int): Int = {
    f(10);
  }

  //定义一个方法
  def f0(x: Int): Int = {
    x * 10;
    //return x;
  }

  //在方法后面跟上一个下划线，表示将方法转换为函数
  def f1 = f0 _;

  def m2(): Int = {
    10
  }

  val multiPly = (i: Int) => i * 10

  val greeting: String = "test";

  def main(args: Array[String]): Unit = {
    //      println(multiPly(50));
    //      var array = new Array[String](3);
    //      array(0)="test";
    //      for( item <- array){
    //          println(item);
    //      }
    //println(m1(addInt));

    //也可以不用转换成函数，scala会自动转换成函数
    //      println(ttt(f0));
    //      println(ttt(f1));

    //二维数组是Array类里的一个方法
    val ofDimArray = ofDim[Int](3, 3);
    for (x <- 0 to 2) {
      for (y <- 0 to 2) {
        ofDimArray(x)(y) = x * y;
      }
    }
    for (x <- 0 to 2) {
      for (y <- 0 to 2) {
        println(ofDimArray(x)(y));
      }
    }
    //println(f(5));
    //println(f2(5));
    //println(addInt(5, 2));
    //      val a = Array("apple","banana","orange");
    ////      for(e <- a){
    ////        val s = e.toUpperCase();
    ////        println(s);
    ////      }
    ////        val newArray = for(e <- a) yield e.toUpperCase();
    ////        for(e <- newArray){
    ////          println(e);
    ////        }
    ////        for(i<-0 until a.length){
    ////          println(s"$i is ${a(i)}");
    ////        }
    //        //或者
    ////        for((e,count) <- a.zipWithIndex){
    ////          println(s"$count is $e");
    ////        }
    //          val names = Map("fname"-> "robert","lname"->"goren");
    //
    //          val x = 20;
    //          if(x>10){
    //            println(10);
    //          }else{
    //            println(5);
    //          }
    //
    ////          for((k,v) <- names){
    ////            println(s"key:$k,value:$v");
    ////          }
    //names.keys.foreach(k => println(s"key:$k,value:$names($k)"));
    //names.foreach((k,v) => println(s"key:$k,value:$v"));
  }
}