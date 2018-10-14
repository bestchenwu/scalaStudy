package unitTen

object FlatMapTest extends App{

    def toInt(x:String):Option[Int]={
      try{
          Some(x.toInt)
      }catch{
        case e=>None
      }
    }
    val array = List("1","one","2")
    /**
     这里flatMap相当与先执行array.map(toInt),产生List(Some[Int],None,Some[Int])
      再执行flattern，将二维列表打成一维列表List(Some[Int],None,Some[Int]).flattern
      同时自动过滤掉None类型,产生List(1,2)
      再在List(1,2)上调用sum方法
      所以flatMap等同于xx.map().flattern
     **/
     println(array.flatMap(toInt).sum)

     def subWords(name:String)=List(name,name.tail,name.take(name.length-1))
     val words = List("band","start")
     println(words.flatMap(subWords))
}
