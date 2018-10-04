package unitThreeString

object MatchTest {
  
   def main(args: Array[String]): Unit = {
      val index:Int = 3;
      index match{
        case 0 => println("i am 0");
        case 3 => println("i am 3");
        case _ => println("nothing");
      }
   }
}