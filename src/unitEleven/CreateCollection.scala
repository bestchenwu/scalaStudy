package unitEleven

object CreateCollection extends App {
  //这里fill函数称为返回函数的函数，也称为柯里函数
  //fill(x:Any)(y:Any)={x op y}等价于fill(x:Any)=(y:Any)=>{x op y}
  //理解起来就是调用fill(x:Any)的时候先返回了一个函数，这个函数传入第一个参数
  // 如果要获取结果，需要调用这个函数，传入第二个参数值
  val list = List.fill(3)("foo")
  //这里的柯里函数第二个参数是一个函数字面量
  val list2 = List.tabulate(5)(_ * 3)
  println(list)
  println(list2)
  //可以这样理解为

  def saySomeThing(x:String)=(y:String)=>{x+" "+y}
  //等价与saySomeThing(x:String)=(y:String)=>{x+" "+y}
  //   val f1 = saySomeThing("hello")
  //   val f2 = f1("test")
  //   println(f1)//这里返回一个函数
  //   println(f2)//这里返回函数的调用结果
}
