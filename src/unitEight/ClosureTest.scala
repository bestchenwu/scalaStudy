package unitEight

import scala.collection.mutable.ArrayBuffer

object ClosureTest extends App{
//    var hello = "haha";
//    class foo{
//
//      def sayHello(): Unit ={
//        println(s"I am ${hello}");
//      }
//    }
//    val foo1 = new foo();
//    foo1.sayHello();
//    hello = "2ha";
//    foo1.sayHello();
//      var compareAge = 18
//      val isValidAge = (age:Int)=>age>compareAge
//      println(isValidAge(15))
//      println(isValidAge(20))
//      compareAge = 21;
//  println(isValidAge(15))
//  println(isValidAge(20))
      //从这个例子也可以看出闭包变量也可以是复杂对象，而不只是string,int
//     val fruits = ArrayBuffer("apple")
//     def addFruit(fruit:String)={
//         fruits+=fruit;
//         println(fruits.mkString(","))
//      }
//      def andAndPrint(f:(String)=>Unit,fruit:String): Unit ={
//        f(fruit)
//      }
//      andAndPrint(addFruit,"banana");
//  andAndPrint(addFruit,"orange");
//      var sum=(x:Int,y:Int,z:Int)=>x+y+z;
//      //定义了一个包含具体值的函数
//      //最后一个_:Int代表是一个任意变量，指向z
//      val f=sum(1,2,_:Int);
//      println(f(3))
//      println(f(4))
      //这里创建一个函数作为第一个函数的返回值
      var saySomething=(prefix:String)=>(name:String)=>prefix+","+name;
      //这里调用saySomething函数，相当于把匿名函数赋值给了变量sayHello，和上面的部分应用函数类似
      var sayHello=saySomething("hello")
      println(sayHello("AI"));
      //这里把匿名函数的功能做的稍微复杂了点，用了switch case算法
      val greeting=(language:String)=>(name:String)=>{
          language match{
            case "china" => name+" zhongguo"
            case "usa" => name+" usa"
          }
      }
      var greetingChina = greeting("china");
  var greetingUsa = greeting("usa");
       println(greetingChina("love"))
  println(greetingUsa("love"))
}
