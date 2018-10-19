package unitTen
class Person(var name:String,var id:Int) extends Ordered[Person]{
  override def toString: String = {s"id=${id},name=${name}"}

  override def compare(that: Person): Int = {
     if(this.name == that.name){
       return 0
     }else if(this.name<that.name){
       return -1
     }else{
       return 1
     }
  }
}
object CollectionSortTest extends App{
//    val list = List("man","woman","app").sorted;
//    //输出List(app, man, woman)
//    println(list)
//    //也可以调用自定义的排序方法
//    //输出List(woman, app, man)
//    println(list.sortWith(_.length>_.length))
    val person1 = new Person("test",1);
    val person2 = new Person("joking",2);
    val person3 = new Person("haha",3)
    val list = List(person1,person2,person3)
    //对于没有实现Ordering接口的类，无法调用sorted
    println(list.sorted)
    //但是可以使用自定义比较函数
    //这里相当与定义了def cmp(x,y):Boolean=x op y
    //在内部实现了一个Order对象  order对象定义了lt gt等方法，lt调用当前的比较方法cmp(x,y)
    // ,gt调用cmp(y,x) 所以lt(test,haha) = 1,所以test对象就排在了前面
    println(list.sortWith(_.name>_.name));
}
