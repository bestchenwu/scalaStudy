package unitTen

object TupleTest extends App{

//    val (x,y,z) = (1,"a",List(3,2))
//    println(x)
//    println(y)
//    println(z)
    //val c = ("array","orange")
    val c = "array" -> "orange"
    println(c)
    println(c.getClass)
    //对于元组，可以像集合一样使用
    //调用productIterator，使得成为一个集合
    for(item <- c.productIterator){
      println(item)
    }
}
