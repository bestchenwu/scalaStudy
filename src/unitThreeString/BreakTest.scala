package unitThreeString

import util.control.Breaks._;
import scala.annotation.tailrec

object BreakTest {
  
  //递归调用,在object类里面定义方法，等同于定义全局静态方法
  //这是典型递归调用的形式，由于每次调用的时候，计算机都要保存当前栈和变量,如果n很大，将会是一笔巨大的开销
    def factor(i:Int):Int={
        if(i==1){
          i
        }else{
          i* factor(i-1);   
        }
    }
    
    def factorInTail(i:Int):Int={
      //使用tailrec注解来表明强制使用尾递归
      @tailrec
      def factorTail(i:Int,last:Int):Int= {
        if(i<0){
          0
        }else if(i==0){ 
          1
        }else if(i==1){
          //当i=1的时候则表示调用链条结束了
          last
        }else{
          factorTail(i-1,i*last);  
        }
      }
      factorTail(i,1);
    }
    
    
  
  def main(args: Array[String]): Unit = {
    val result = factor(4);
    println(s"result=${result}");
    val result1 = factorInTail(4);
    println(s"tail result=${result1}");
    //break example
//    var sum1 = 0;
//    breakable {
//      for (i <- 1 to 10) {
//        if (i > 5) {
//          //break the outerside loop
//          break;
//        }else{
//          sum1+=i;  
//        }
//      }
//      //TODO:这句不会执行
//      //println("break i="+i);
//    }
//    var sum = 0;
//    for (i <- 1 to 10) {
//       //break the inside loop
//       breakable{
//         if(i%2!=0){
//           break; 
//         }else{
//           sum+=i;
//         }
//       }
//    }
//    println(s"break sum : "+sum1);
//    println(s"continue sum : "+sum);
  }
}
