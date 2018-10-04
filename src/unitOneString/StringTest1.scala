package unitOneString

import scala.util.matching.Regex

object StringTest1 {
  
  def  main(args: Array[String]): Unit = {
    //print("hello scala");
    //val s = "hello world";
    //print(s.length());
    //s.foreach(println);
    //val result = "hello world".filter(_ != 'l');
    //println(result);
    //使用stringOperator的操作方法
    //val test1 = "scala".drop(2).take(2).capitalize;
    //println(test1);
//    val s1 = "Hello";
//    val s2 = "Hello"
//    val s3:String = null;
      //字符串之间的比较
//    println(s1==s2);
//    println(s1==s3);
//    s3.toUpperCase();
      //多行字符串
//       val foo = """this is three
//           line string,
//           haha
//           """;
//       println(foo);
    //如果不加竖线，则输出为以下格式
    //foo score and 
    //  seven years ago
    //如果加了竖线，则输出为这个格式
    //foo score and 
    //seven years ago
//    val speech = """foo score and 
//      |seven years ago""".stripMargin;
//      println(speech);
//    val array = "hello world".split(" ");
//    array.foreach(println);
     //val worldStringArray = "hello world , this is AI".split("\\s+").map(_.trim);
     //worldStringArray.foreach(println);
//     val name="fred";
//     val age = 33;
//     val weight = 300;
//     println(s"this is $name,his age is $age,weight is $weight");
//     println(s"this is $name,his age is ${age+1}");
     //对数字进行格式化
     //println(f"this is $weight%.2f ");
//     val str = s"foo\nbar";
//     println(str);
//     val str1 = raw"foo\nbar";
//     println(str1);
//       val upper = "hello,world".toUpperCase();
//       println(upper);
//      val upper = "hello,world".map(c => c.toUpper);
//      println(upper);
//        val upper = "hello,world".map(_.toUpper);
//        println(upper);
//        val upper = "hello,world".filter(_!='l').map(_.toUpper);
//        println(upper);
        //for(c <- "hello") println(c);
        //使用yield的好处是将每次循环的结果放到一个临时存放取中
        //当循环结束时,在临时存放区里的所有元素以一个集合的形式返回
//        val upper = for(c <- "hello,world") yield c.toUpper;
//        println(upper.toString());
//        def toLower(c:Char):Char = (c.toByte+32).toChar;
//        val toLowerString = "HELLO".map(toLower);
//        println(toLowerString);
      //val numPattern = "[0-9]+".r;
      //val numPattern = new Regex("[0-9]+");
      //println(numPattern);
      //val match1 = numPattern.findFirstIn("123 main street 101");
      //println(match1.toString());
//      val match2 = numPattern.findFirstIn("123 main street 101");
//      println(match2);
//      val array = numPattern.findAllIn("123 main street 101");
//      array.foreach(println);
        //TODO:模式匹配在这里匹配有问题
//      val pattern = "([0-9]+)([A-Za-z]+)".r;
//      val pattern(count,fruit)="100 bananas";
//      println(count);
//      println(fruit);
        //val charStr = "hello".charAt(0);
        //println(charStr);                                     
        //val charStr = "hello"(0);
        //println(charStr);
        implicit class StringImprovements(s:String){
            def increment = s.map( c => (c+1).toChar); 
        }
        val result = "HAL".increment;
        println(result);
  }  
}