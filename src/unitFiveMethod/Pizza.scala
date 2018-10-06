package unitFiveMethod

class Pizza {

  var pizzaType: String = "pizza";
  var pizzaSize: Int = 3;
  def updatePizza(pizzaType: String, pizzaSize: Int): Unit = {
    this.pizzaType = pizzaType;
    this.pizzaSize = pizzaSize;
  }
  def getPizza={(pizzaType,pizzaSize)};
  /** 方法体是可变参数 **/
  def printStringArray(str:String*)={str.foreach(println)};
  override def toString: String = { s"pizza type is ${pizzaType},size is ${pizzaSize}" }
}

object Pizza {
  def main(args: Array[String]): Unit = {
     val pizza = new Pizza();
     pizza.updatePizza(pizzaType="chinaPizza", pizzaSize=5);
     println(pizza.toString());
     //可以创建一个具有变量名称的元组，然后将方法的返回结果直接赋值给该元组
     val (mtype,size) = pizza.getPizza;
     println((mtype,size));
     pizza.printStringArray("hello","my")
     val list = List("i","am","sweet");
     pizza.printStringArray(list:_*);
  }
}