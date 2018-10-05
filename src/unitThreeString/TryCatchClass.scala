package unitThreeString

import java.io.FileNotFoundException

class TryCatchClass {
    
  def main(args: Array[String]): Unit = {
    val s = 3;
    //try catch跟java的类似，区别在于catch里面不跟具体的异常内容
    //直接跟不同的异常分支
    try{
        val y = s.toByte       
    }catch{
      case e:FileNotFoundException => throw e
      case e:IllegalArgumentException => throw e
    }
  }
}