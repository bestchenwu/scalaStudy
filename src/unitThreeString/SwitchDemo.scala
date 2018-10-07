package unitThreeString

import scala.annotation.switch;

class SwitchDemo {

  //val x :Any = null;
  val x: Int = 3;
  //使用switch注解，可以促使scalac编译器自动寻找合适的解析器(tableswitch或者lookupswitch)
  //使用javap -c SwitchDemo.class 可以看出编译器使用了tableswitch来优化
  //tableswitch和lookupswitch的区别是判断case列表项是否是一个比较集中的区间,当是集中区间的时候
  //java编译器会使用tableswitch,把case项区分成一个low-high区域和default区域,提高查询性能
  val y =  x match {
    case 0 => 10
    case 1 => 1
    //使用条件表达式作为分支
    case x if x % 2 == 0 => 18
    //多个条件之间用|分割
    case 2 | 3 | 4 => 1
    //也可以定义一个合法的变量名称
    //使用模式匹配,在条件前加上一个变量名称和一个@符号
    //case list @ List(0, _, _) => list
    case oop => oop
    //case _ => null
  }
}