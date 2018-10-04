package unitFour

object DogTest {
    
  def main(args: Array[String]): Unit = {
      val dog = new Dog("dog",0);
      println(s"dog greeting:${dog.greeting}");
      val animal = new Animal("animal");
      println(s"animal greeting:${animal.greeting}");
//      val cat = new Cat("cat");
//      println("dog sex:"+dog.sex);
//      println("cat sex:"+cat.sex);
  }
}