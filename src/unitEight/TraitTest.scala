package unitEight

/**
  * trait在scala中意为特质，类似于JAVA中的interface
  */
trait Animal {
  def speak
}
trait swim{
   def swiming
}
class FourLag {

  var lagNum: Int = 4
}

//当需要继承类和接口的时候，先写extends类再写接口
class Dog extends FourLag with Animal {

  override def speak: Unit = {
    println("I am " + this.getClass.getSimpleName+",lagNum:"+lagNum)
  }
}
//如果是实现两个接口，则第一个接口用extends,第二个接口用with
class tiger extends Animal with swim{
  override def speak: Unit = {}

  override def swiming: Unit = {}
}
object TraitTest extends App{

  val dog = new Dog()
  dog.speak
}


