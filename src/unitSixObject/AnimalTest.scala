package unitSixObject

trait Animal{
   def speak;
}

object AnimalFactory{
    object dog extends Animal{
      override def speak: Unit = {println("I am a dog")}
    }
    object cat extends Animal{
      override def speak: Unit = {println("I am a cat")}
    }
    def createAnimal(name:String):Animal={
      if(name.equals("dog")){
        dog;
      }else if(name.eq("cat")){
        cat;
      }else{
        throw new RuntimeException();
      }
    }
}


object AnimalTest extends App {

    val dog = AnimalFactory.createAnimal("dog");
    val cat = AnimalFactory.createAnimal("cat");
    dog.speak
    cat.speak
}
