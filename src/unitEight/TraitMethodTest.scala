package unitEight

trait WrappedCore{
  //定义如果要实现该特质，则子类必须要实现的方法
  this:{
     def speak(name:String):Boolean
     def touch:Unit
  } =>
  //由于特质里定义了方法，所以在子类实例化的时候，会默认执行
  println("haha");
}

class WrappedCoreSample extends WrappedCore{
  def speak(name:String):Boolean={
       true
  }
  def touch:Unit={}
}


object TraitMethodTest extends App{
    val sample = new WrappedCoreSample();
}
