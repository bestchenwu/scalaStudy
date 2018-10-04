package unitFour

class Test(var name : String,var id : Int) {
    
    //函数(函数必须有参数列表)
    val printHome=(home:String)=> {println(home);};
    
    //方法 方法可以没有参数列表
    def printHome1():String={
      println(name);
      name
    }
}