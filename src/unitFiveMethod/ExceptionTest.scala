package unitFiveMethod

import java.io.IOException

object ExceptionTest {
  
    @throws(classOf[IOException])
    @throws(classOf[RuntimeException])
    def playSound={throw new RuntimeException}
    
    def main(strings:Array[String]):Unit={
        println("before play");
        playSound;
        //will not compile,because the method has no arguments
        //playSound()
        println("after play");
    }  
}