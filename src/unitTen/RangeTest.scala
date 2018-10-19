package unitTen

object Margin extends Enumeration {
  type Margin = Value
  val Top, Bottom = Value
}

object RangeTest extends App {
  //以下两种方式都可以建立Array
  //    val array = Array.range(1,3)
  //    var array1 = (1 until 3).toArray
  //    println(array)
  //    val list1 = 1 to 10 by 2 toList
  val myMargin = Margin.Top
  if (myMargin == Margin.Top) {
    println("now works on Margin.Top")
  }
  Margin.values.foreach(println)
}
