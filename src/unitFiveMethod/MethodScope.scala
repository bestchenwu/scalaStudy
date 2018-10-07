package unitFiveMethod

class MethodScope {

  //只可当前类可见
  private[this] def privateThisMethod = {}

  //私有
  private def privateMethod = {};

  //当前类和子类可见
  protected def protectedMethod = {};

  //包级可见
  private[unitFiveMethod] def packageMethod = {}

  //无修饰符,则是公开方法
  def publicMethod = {}

  def copeWithOther(other: MethodScope) {
    //won't compile,other object can't get it
    //other.privateThisMethod
    other.privateMethod;
  }
}