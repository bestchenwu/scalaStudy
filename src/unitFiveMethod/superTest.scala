package unitFiveMethod

trait person {
  def hello: String = "I am a person";
}

trait Man extends person {
  override def hello: String = "I am a man";
}

trait Woman extends person {
  override def hello: String = "I am a woman";
}

class Child extends person with Man with Woman {

  def printPerson = {
    println(super.hello);
  }

  def printMan = {
    println(super[Man].hello);
  }

  def printlnWoman = {
    println(super[Woman].hello);
  }
}

object superTest {

  def main(args: Array[String]): Unit = {
    val child = new Child();

    /**
      * 从输出结果可以看出最直接的父类是最后一个类
      *
      * I am a woman
      * I am a man
      * I am a woman
      */
    child.printPerson;
    child.printMan;
    child.printlnWoman;
  }
}