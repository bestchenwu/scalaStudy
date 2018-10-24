package src.unitEleven

import scala.collection.mutable.Queue
import scala.collection.{SortedSet, mutable}

object SortedCollectionTest extends App {
  //排序的set
  //  val set = SortedSet(4,2,6,8);
  //  println(set)
  //可变队列 FIFO
  //注意immutable里有个不可变的queue
  var queue = new Queue[String]
  queue += "apple";
  queue += "banana";
  val a = queue.dequeue
  println(a)
  val b = queue.dequeue;
  println(b)
  //LIFO 后进先出,和List类似，但推荐使用List
  var stack = mutable.Stack(1,2,4)
  stack.push(5)
  println(stack.pop())
}
