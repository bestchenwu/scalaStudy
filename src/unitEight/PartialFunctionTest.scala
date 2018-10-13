package unitEight

import scala.collection.mutable.ArrayBuffer

object PartialFunctionTest extends App{

    val divide = new PartialFunction[Int,Int] {
      override def isDefinedAt(x: Int): Boolean = {x!=0}

      override def apply(x: Int): Int = { (42/x).intValue()}
    }
//
//    println(divide.isDefinedAt(0))
//    if(divide.isDefinedAt(6)){
//      println(divide.apply(6))
//    }
    val list1 = List(0,2,3) collect( divide);
    println(list1);
//    val oneToFive = new PartialFunction[Int,String] {
//      val oneToFiveArray = ArrayBuffer("ONE","TWO","THREE","FOUR","FIVE")
//      override def isDefinedAt(x: Int): Boolean = {x<=5}
//
//      override def apply(v1: Int): String = {oneToFiveArray(v1-1)}
//    }
//
//    val sixToTen = new PartialFunction[Int,String] {
//      val sixToTenArray = ArrayBuffer("SIX","SEVEN","EIGHT","NINE","TEN")
//      override def isDefinedAt(x: Int): Boolean = {x>=6}
//
//      override def apply(v1: Int): String = {sixToTenArray(v1-6)}
//    }
//    //orElse将两个函数应用串联在了一起
//    val oneToTen = oneToFive orElse sixToTen;
//  println(oneToTen(3));
//  println(oneToTen(8));
}
