package unitThreeString

class Outer {
  
  class Inner{
    private def f(){
      println("inner");
    }
    class InnerMost{
      f();
    }
  }
  
  def main(args: Array[String]): Unit = {
      
  }
  
  //new Inner().f();
}