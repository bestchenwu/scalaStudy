package unitSixObject

import unitFour.Employee
import unitFour.DefaultPerson
import scala.xml._;

object TransferTest {

  def main(strings: Array[String]): Unit = {
    //        val employee = new Employee(11,"employee",13.5);
    //        //使用asInstanceOf词强制转换成DefaultPerson类型
    //        val person = employee.asInstanceOf[DefaultPerson];
    //        println(s"id=${person.id},name=${person.name}");
    //在scala中没有xx.class的方式，但提供了一个native方法classOf[类名]来代替
    //val stringClass = classOf[String];
    //或者使用一个具体的对象.getClass方法
//            val stringClass = "".getClass;
//            stringClass.getMethods.foreach(println);
            var hello = <p>hello,world</p>
            hello.child.foreach(e=>println(e.getClass));
            hello = <p>hello,<br>world</br></p>
            hello.child.foreach(e=>println(e.getClass));
  }
}