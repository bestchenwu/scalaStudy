package unitTwoString

object NumberTest {

  def main(args: Array[String]): Unit = {
    //println(Short.MaxValue);
    //    val intValue = "100".toInt;
    //    println(intValue);

    //    @throws(classOf[NumberFormatException])
    //    def toIntValue(s:String) = s.toInt;
    //
    //    val test1 = toIntValue("aa");

    //      def toIntValue(s:String):Option[Int] = {
    //          try{
    //            Some(s.toInt);
    //          }catch{
    //            case e : NumberFormatException => None
    //          }
    //      }
    //
    //
    //      val test1 = toIntValue("111").get;
    //      val test2 = toIntValue("aaa").getOrElse(0);
    //      println(test1);
    //      println(test2);

    //      val b = BigInt(1);
    //      val c = BigDecimal(3.55);
    //      println(b);
    //      println(c);
    //
    //        val a = 19.45.toInt;
    //        println(a);

    //      val a = 0 : Short;
    //      println(a);
    //      val b:Short = 0;
    //      println(b);

    //        var a = 1;
    //        a+=1;
    //        println(a);

    //        var x = 1;
    //        x+=1;
    //        println(x);
    //
    //        x*=3;
    //        println(x);

    //        object MathUtils {
    //          def ~=(x:Double,y:Double,precision:Double)={
    //             if((x-y).abs<precision) {
    //                 true
    //             }else{
    //               false
    //             }
    //          }
    //        }
    //
    //        println(MathUtils.~=(0.3, 0.1+0.2, 0.01));
    //          var b = BigInt(1234567890);
    //          b+=b;
    //          println(b.isValidByte);
    //          println(b.isValidInt);
    //          println(b.isValidLong);

    val r = scala.util.Random;
    //          println(r.nextPrintableChar());
    //          println(r.nextPrintableChar());

    //val range = 0 to r.nextInt(10);
    //        println(r);
    //        println(r.nextInt());
    //        println(r.nextInt(50));

    //for(i <- 0 to r.nextInt(10)) yield i*2;

    //          val range = 1 to 10;
    //          for(i <- range by 2){
    //            println(i);
    //          }
    val pi = scala.math.Pi;
    //          printf(f"$pi%1.5f");
    val formatter = java.text.NumberFormat.getIntegerInstance;
    printf(formatter.format(pi));
  }
}