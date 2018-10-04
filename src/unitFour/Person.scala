package unitFour

class Person(var _name:String,val id:Int) {
  
  //当定义私有变量的时候,只能通过内部定义的方法来访问
  private var privatePrice = 0.35d;
  //在private后面加[this],表示该字段只能当前类使用 
  //private[this] var privatePrice = 0.35d;
  //如果在private后面加上一个[this],则表明该成员只能当前类可以访问
  //private[this] var privatePrice = 0.35d;
  
  def setNewPrice = (newPrice:Double) =>{
      this.privatePrice = newPrice;
  }
  
  def isHigerPrice(another:Person):Int={
      privatePrice.compareTo(another.privatePrice);
  }
  
  //定义不同参数的构造函数
  def this(name:String)={
     this(name,Constants.DEFAULT_ID);
  }
  
  def this(id:Int)={
    this(Constants.DEFAULT_NAME,id);
  }
      
  def this()={
    this(Constants.DEFAULT_NAME,Constants.DEFAULT_ID);
  }
  
  //scala类中不允许构造函数参数名称和getter方法的名称都是同一个名字name
  
//  def name = name;
//  def name(aName:String)={
//    name=aName;
//  }
  
  //所以如果想覆盖getter和setter方法，就需要将构造函数参数名称前面加一个_，以此来表示不同
  def name = _name;
  def name(aName:String)={
    _name=aName;
  }
  
  def canEqual(a:Any):Boolean={
    a.isInstanceOf[Person];
  }
  
  override
  def equals(that:Any):Boolean = 
     that match {
       case that:Person => that.canEqual(this) && this.hashCode() == that.hashCode()
       case _ => false
     }
  
  override
  def hashCode:Int = {
    var hashCode = 31;
    hashCode+=_name.hashCode()*17;
    hashCode+=id*17;
    hashCode;
  }
}
object Constants{
      val DEFAULT_NAME =  "HELLO";
      val DEFAULT_ID = 13;
  }