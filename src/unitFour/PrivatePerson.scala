package unitFour

class PrivatePerson private(val name:String) {
    
   override def toString():String={
        return "this is a private person:"+name;
    }
}
//与类名具有相同名称,定义在同一个文件中，我们称为伴生对象
//伴生对象中的任何一个方法都会成为原来类的静态方法    
object PrivatePerson{
    
     val person = new PrivatePerson("sweet");
     def getPerson():PrivatePerson={
         person
       };
       //或者匿名写法
       def getPerson1=()=>{person};
   }

