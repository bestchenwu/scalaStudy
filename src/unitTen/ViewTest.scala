package src.unitTen

import java.util.Date


object ViewTest extends App {

  val range = 1 to 100000
  //第一次展示正常的Range Range 1 to 10
  //输出scala.collection.immutable.Range$Inclusive
//  println(range.getClass)
  //另外视图只能针对序列形式
  val range1 = (1 to 10000).view
  //第二次展示的是一个惰性视图 SeqView(...)
//    println(range1.getClass)
//  val viewShow = range1.force
  //输出scala.collection.immutable.Vector()
//  println(viewShow.getClass)
  println(s"startDate=${new Date()}")
  val newRange = range.map(_*2)
  println(s"end=${new Date()}")
  println(s"startDate=${new Date()}")
  val newRangeView = range1.map(_*2)
  println(s"end=${new Date()}")
  //map不是一个tranform方法，所以不会立即计算结果
}
