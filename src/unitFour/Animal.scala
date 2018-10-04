package unitFour

/**
 * 所有动物的超类
 */
case class Animal(val name:String,val sex:Int) {
   
    val greeting={println("animal");"animal"};
  
    /**
     * 重载构造函数
     */
    def this(name:String){
      this(name,1);
    }
}