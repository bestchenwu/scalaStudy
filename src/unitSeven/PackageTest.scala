package unitSeven
import java.util.{HashMap => JHashMap}
//这里引入java.util下面的所有包，但是把Random屏蔽
import java.util.{Random => _,_}
package dog{
    class Foo{
      override def toString: String = {"I am a dog.Foo"}
    }
}
package cat{
     class Foo{
       override def toString: String = {"I am a cat.foo"}
     }
}


object PackageTest extends App {

    val foo1 = new dog.Foo
    val foo2 = new cat.Foo
    println(foo1.toString);
    println(foo2.toString);
    val myMap = new JHashMap();
    //由于hashMap被重命名为JHashMap,所以下面语句无法编译
    //val myMap1 = new HashMap();
    //由于引入的时候隐藏了Random,所以这一句会报错
    //val random = new Random();
}
