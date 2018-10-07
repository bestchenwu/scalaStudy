package unitFour

class Dog(name: String, sex: Int) extends Animal(name, sex) {

  //可以覆盖父类属性
  //这样在类的初始化过程中，会初始化两次
  override
  val greeting = {
    println("dog"); "dog"
  };

  /**
    * 如果子类自定义辅助构造函数，则必须显式调用父类的构造函数
    */
  def this(sex: Int) {
    this("", sex);
  }
}

/**
  * 另外一个类只覆盖只带名称字符串的构造函数
  */
class Cat(name: String) extends Animal(name) {

}