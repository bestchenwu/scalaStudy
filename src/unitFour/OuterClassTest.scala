package unitFour

object OuterClassTest {

  def main(args: Array[String]): Unit = {
    val o1 = new OuterClass;
    val o2 = new OuterClass;
    val i1 = new o1.InnerClass;
    val i2 = new o2.InnerClass;
    i1.x = 5;
    i2.x = 10;
    println(f"i1.x=${i1.x}");
    println(f"i2.x=${i2.x}");
  }
}