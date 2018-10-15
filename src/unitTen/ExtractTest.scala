package unitTen

object ExtractTest extends App{

    val array = (1 to 10).toArray;
    def printMap(map:(Boolean,Array[Int] ) )={
      println(s"key:${map._1}")
      //这里v是list
      map._2.foreach(println)

  }
    //groupBy返回的是Boolean,Array[xx]的map
    //执行foreach后，获取了map的每一个元组
//    array.groupBy(_>5).foreach(printMap);
//    //也可以获得map后,取出值分别打印
//    val map = array.groupBy(_>5)
//    map(true).foreach(println)
//    val mens = List(("a","b","c"),("aa","bb","cc"))
//    val zipArray = mens.unzip3
//    println(zipArray)
//    val array1 = Array(20,6,8,9,28)
//    println(array1.reduceLeft(_ min _))
     //foldLeft与reduce的区别在于flodLeft会设置一个种子数作为第一个值
    //这里两个参数列表 实际上是自定义函数，第一个参数表示后一个语句的处理条件
    println(array.foldLeft(80)(_+_));
    //scanLeft返回的是一个序列，而不是一个值
    def product(x:Int,y:Int)={
      val result = x*y
      println(s"${x}*${y}=${result}")
      result
    }
    val result = array.scanLeft(10)(product)
    result.foreach(println)
    //array.drop(3).foreach(println);
}