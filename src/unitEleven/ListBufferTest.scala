package unitEleven

import scala.collection.mutable.ListBuffer

object ListBufferTest extends App {
  //由于list是不可变的链表(LIFO--后进先出)，
  // 所以如果要使用可变链表，需要使用ListBuffer
  val listBuffer = new ListBuffer[String]();
  //+=运算符号用于单个元素
  listBuffer += "buffer"
  listBuffer += "joken"
  //++=运算符号用于集合
  listBuffer ++= List("fruits")
  println(listBuffer)
  val list = listBuffer.toList
  println(list)

  //如果是给不可变list加元素，那么可以用::运算符，来创建一个新list
  var list2 = "frist"::list;
  println(list2)
  //也可以使用:+来添加元素
  var list3 = "second"+:list2
  println(list3)
  //TODO:如下输出的很奇怪
  //输出Vector(t, h, i, r, d, List(second, frist, buffer, joken, fruits))
  var list4 = "third":+list3
  println(list4)
  //TODO:如何向不可变列表后面添加元素
  //list2+="last"
  //println(list2)
}
