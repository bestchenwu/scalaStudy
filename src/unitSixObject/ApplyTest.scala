package unitSixObject

class person{

    var name:String = _
}

object person {

  /**
    * 定义apply方法，用于可以直接使用person("")来创建对象
    *
    * @param name
    * @return
    */
  def apply(name:String):person={
      val p = new person();
      p.name = name;
      p
    }

  def main(args: Array[String]): Unit = {
    val person1 = person("hello");
    println(person1.name);
  }
}
