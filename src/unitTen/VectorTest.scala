package unitTen

import scala.collection.LinearSeq
import scala.collection.mutable.ArrayBuffer

trait Animal {
  def speak
}

case class Dog(name: String) extends Animal {
  override def speak: Unit = {
    println(name)
  }
}

case class Cat(name: String) extends Animal {
  override def speak: Unit = {
    println(name)
  }
}

class AnimalKindom {
  //如果不使用具体类型声明，则使用scaladoc命令生成的doc文档里会产生如下的描述
  //val animals: Array[Product with Serializable with Animal]
  val animals = Array(Dog("dog"), Cat("cat"));
  //如果声明了类型,则生成的声明如下
  //val animals2: Array[Animal]
  val animals2 = Array[Animal](Dog("dog"), Cat("cat"));
}

object VectorTest extends App {

  //     val v = Vector(1,2,3)
  //     println(v.sum)
  //     println(v.filter(_>2))
  //vector、range、array、string等采取的是索引模式，读写速度极快
  //       val x = IndexedSeq(1,3,4)
  //       System.out.println(x.getClass);
  //       //linear是链表存储方式，包含头指针、尾指针等
  //       val y = LinearSeq(1,3,4)
  //        System.out.println(y.getClass);
  //       val map = Map(1->"test");
  //       val set = Set("a")
  //
  //       val list = List[Double](1,3.0,44l);
  //val array = Array(Dog("dog"),Cat("cat"));
  //vector是不可变序列集合的首选
  //      var sisiters = Vector("hello");
  //      sisiters=sisiters :+"sweet";
  //      println(sisiters);
  //由于vector是不可变类，尝试更改元素，会报immutable错误
  //sisiters(0)="joke";
  //arrayBuffer是可变序列集合的首选
  //      val arrayBuffer = ArrayBuffer("ab");
  //       arrayBuffer.+=("test")
  //  arrayBuffer ++=List("haha")
  //      println(arrayBuffer)
  val x = Vector(1, 2, 3)
  //      x.foreach(println(_));
  //      for(f <- x){
  //         println(f)
  //      }
  //      //这是for循环的带索引的另外一种方式
  //      for(i <- 0 until x.size){
  //        println(x(i))
  //      }
  //      //这种方式可以简化为
  //      for( (elem,count) <- x.zipWithIndex){
  //          println(elem)
  //          println(count)
  //      }
  //由于zipWithIndex返回的是一个Tuple数组，可以使用tuple直接来取值，如下所示
  //       for(elem <- x.zipWithIndex){
  //         //第二个是计数,第一个是元素内容
  //            println(s"key:${elem._1},value:${elem._2}")
  //       }
  //        val array = Array("haha","love");
  //        //利用foreach循环+yield可以产生新的集合对象
  //        val newArray = for(elem <- array) yield elem.toUpperCase()
  //        val map = Map("test"->"testHaha","joking"->"testJoking")
  //        for((k,v)<-map){
  //          println(s"key=${k},value=${v}")
  //        }
  //迭代器在scala很少用
  //        val iter = Iterator(1,2,3)
  //        iter.foreach(println);
  //         println("now circle twice")
  //        iter.foreach(println);
  //这里如果直接使用val fruits = "banana" :: "apple"会报 :: is not a member of String
  //原因是xx :: List 是list的一个方法，相当与把新元素放在list前面，这里的Nil会被推断为一个list
  //"apple" :: Nil == Nil .:: "apple"
  val fruits = "banana" :: "apple" :: Nil

  //          val newFruits = for(e <- fruits) yield e.toUpperCase()
  //以上方法可以用map操作来替换
  //val newFruits = fruits.map((item:String)=>item.toUpperCase())
  def plusOne(char: Char): Char = {
    (char.toByte + 1).toChar
  }
  //如果在map里添加if卫语句，则apple会输出为空白
  val newFruits = fruits.map((item:String)=>{
      if(item.length>5) item
  })

  //val newFruits = "Hello".map(plusOne);
  //val newFruits = fruits.map((item: String) => item.toUpperCase())
  println(newFruits)
  val list = List(List("sweet"),List("love"));
  println(list.flatten)
}
