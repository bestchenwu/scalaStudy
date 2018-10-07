package unitThreeString

object ForeachTest {

  def main(args: Array[String]): Unit = {
    val a = Array("test", "test1");
    //       for(e <- a){
    //           println(e);
    //       }
    //       //使用foreach循环,可以产生一个新数组
    //如果使用scalac -Xprint:parse方法查看内部实现，可以得知yield操作本质上是数组的map操作
    var newArray = for (e <- a) yield e.toUpperCase();
    //事实上等价于
    var newArray2 = a.map(_.toUpperCase);
    //       //如果转换操作较复杂，则可以使用代码块
    //       //如下代码块和上面的代码输出效果是一样的
    //       newArray = for(e <- a) yield { val e1 = e.toUpperCase();e1};
    //       for(i <- 0 until a.length){
    //           //对于数组的访问，使用array(数组下标的方式)
    //           println(s"$i is ${a(i)}");
    //       }
    //使用数组下标访问
    //for(i <-0 until 3){
    //或者
    //       for(i <-0 to 3){
    //           println(i);
    //       }
    //       for((item,count) <- a.zipWithIndex){
    //         println(s"item:${item}");
    //         println(s"count:${count}");
    //       }
  }

  //如果在for循环里加上条件，那么相当于加了一个过滤条件
  //如果使用scalac -Xprint:parse查看，则可以看到底层相当于解释为1.to(10).withFilter().foreach()
  for (i <- 1 to 10; if (i % 2 == 0)) {
    println(i);
  }
  //内部转化为两个foreach循环
  //1.to(3).foreach(((i) => 1.to(3).foreach(((j) => println(StringContext("i=", ",j=", "").s(i, j))))))
  for (i <- 1 to 3; j <- 1 to 3) {
    println(s"i=${i},j=${j}");
  }
}