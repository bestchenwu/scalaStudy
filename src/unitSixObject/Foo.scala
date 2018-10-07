package unitSixObject

/**
  * 类与其的伴生对象之间可以互相访问
  */
class Foo {

    val x = 3;
    def printFooX={println(Foo.fooX)}
}

object Foo{
    var fooX = 5;
    def printX(foo:Foo)={println(foo.x)}
}