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

trait Pizza{
    var PizzaType:Int
    var name:String = "pizze"
}

class MyPizza extends Pizza{
     //如果父类没有声明变量的值，则子类中需要加变量的声明
     var PizzaType = 3
     //如果父类中有声明变量类型，则不需要加变量的声明
     name = "myPizza"
}

object TraitTest extends App{

  val dog = new Dog()
  dog.speak
}


