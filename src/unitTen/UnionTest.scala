package src.unitTen

object UnionTest extends App{
    //++运算符可以用在序列或者链表里
//  var a = Array(1,2)
//  //a ++= Seq(3,4)
//   var b = a++Seq(3,4)
//  b.foreach(println)
  var a = Set(1,2,3)
  var b = Set(1,2,3,4)
   //--运算符是由Subtractable特质提供的，目前实现该特质的是Set、 map、Buffer
   var c = b -- a
    println(c)
}
