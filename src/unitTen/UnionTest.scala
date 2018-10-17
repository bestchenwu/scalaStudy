package src.unitTen

object UnionTest extends App{

//  var a = Array(1,2)
//  //a ++= Seq(3,4)
//   var b = a++Seq(3,4)
//  b.foreach(println)
    var a = Set(1,2,3)
  var b = Set(1,2,3,4)
   var c = b -- a
  println(c)
}
