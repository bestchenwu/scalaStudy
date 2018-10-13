package unitFour

/**
  * 所有动物的超类
  */
case class Animal(val name: String, val sex: Int) {

  //这里定义了一个变量，它会在类初始化的时候执行
  val greeting = {
    println("animal"); "animal"
  };

  /**
    * 重载构造函数
    */
  def this(name: String) {
    this(name, 1);
  }
}