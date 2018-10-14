package unitTen

import scala.collection.LinearSeq

trait Animal{
   def speak
}
case class Dog(name:String) extends Animal{
  override def speak: Unit = {println(name)}
}
case class Cat(name:String) extends Animal{
  override def speak: Unit = {println(name)}
}
class AnimalKindom{
   //如果不使用具体类型声明，则使用scaladoc命令生成的doc文档里会产生如下的描述
   //val animals: Array[Product with Serializable with Animal]
   val animals = Array(Dog("dog"),Cat("cat"));
  //如果声明了类型,则生成的声明如下
  //val animals2: Array[Animal]
  val animals2 = Array[Animal](Dog("dog"),Cat("cat"));
}
object VectorTest extends App{

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
}
