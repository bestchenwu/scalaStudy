package src.unitTen

//格式化代码快捷键ctrl+alt+L
object UnionTest extends App {
  //++运算符可以用在序列或者链表里
  //  var a = Array(1,2)
  //  //a ++= Seq(3,4)
  //   var b = a++Seq(3,4)
  //  b.foreach(println)
  //  var a = Set(1,2,3)
  //  var b = Set(1,2,3,4)
  //   //--运算符是由Subtractable特质提供的，目前实现该特质的是Set、 map、Buffer
  //   var c = b -- a
  //    println(c)
//  var mans = List("jack", "tom");
//  var womans = List("lily", "cherry");
//  //zip操作将两个数组交替形成多个元组拼成的列表
//  var humans = mans zip womans;
//  //输出List((jack,lily), (tom,cherry))
//  println(humans);
//  //将元组形成的列表打散成由List()形成的元组
//  var unzipTuple = humans.unzip
//  //输出(List(jack, tom),List(lily, cherry))
//  println(unzipTuple);
   var fruits = Array("apple","orange")
   var price = Array(4)
  //如果两个列表元素个数不对等，那么ZIP后会进行截断
   var fruitsWithZip = fruits.zip(price)
  fruitsWithZip.foreach(println)
   //println(fruitsWithZip)
   var t = fruitsWithZip.unzip
   t._1.foreach(println)
  t._2.foreach(println)
}
