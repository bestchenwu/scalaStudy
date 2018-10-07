package unitThreeString

import scala.annotation.tailrec

object WhileListDemo {

  /**
    * 自定义循环控制机构
    */
  @tailrec
  def whileList(testCondition: => Boolean)(codeBlock: => Unit) {
    if (testCondition) {
      codeBlock;
      whileList(testCondition)(codeBlock)
    }
  }

  def main(args: Array[String]): Unit = {
    var x = 1;
    var sum = 0;
    whileList(x < 5) {
      sum += x;
      x += 1;
    }
    println("sum=" + sum);
  }
}