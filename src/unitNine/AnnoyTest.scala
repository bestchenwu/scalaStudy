package unitNine

import unitFiveMethod.Person
import unitFour.Animal

object AnnoyTest extends App {
//  val x = List(1, 3)
//  val y = x.filter((i:Int)=>i%2==0)
//  val z = x.filter(_%2==0)
//  val half = (x:Double) => {var y = x*0.5;println(y);y}
//  val booleanCheck = (x:Int)=>x%2==0
//  //匿名函数可以当作变量传递
//  val a = x.filter(booleanCheck)
//  var testHalf=half(3)
//  println(testHalf)
//  val c = scala.math.cos(_)
//  println(c(0.5))
//  def callMethod(callBack:Unit): Unit ={
//    callBack
//  }
//  //callMethod(half(3))
//  def plusOne(x:Int):Int=x+1
////  println(plusOne(3))
//  //定义一个函数作为参数的方法，函数必须带一个Int类型的参数
//  def exec(CallBack:Int=>Int)={
//    println(CallBack(1))
//  }
//  def exec1(CallBack:(String,Int)=>Seq[String])={
//    CallBack("sb",5)
//  }
//  def seqFun(a:String,b:Int):Seq[String]={
//      Seq(a,(b*4).toString)
//  }
//  println(exec1(seqFun))
  //exec(plusOne)
  //定义函数变量的时候，只需要把函数需要的入参和出参类型描述清楚即可，无需加上变量名
  //同时这种方式还支持实时传入值
  def executeAndPrint(f:(Int,Int)=>Int,x:Int,y:Int)={
      var result = f(x,y)
       println(result)
  }
  val sum = (x:Int,y:Int)=>x+y;
  executeAndPrint(sum,2,3);
  def printAnyObject(f:(Any,Any)=>Unit,x:Any,y:Any)={
      f(x,y)
  }
  val printObject=(x:Any,y:Any)=>{
      println(x)
      println(y)
  }
  printAnyObject(printObject,"haah",Animal("dog",3))
}