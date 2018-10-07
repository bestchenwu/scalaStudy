package unitFour

abstract class BaseController(db: Database) {

  def getName(): String = {
    db.name;
  }

  val getName1 = {
    db.name
  };

  //不定义方法体实现，只用定义空方法
  def connect;

  def getDatabase: Database;
}

case class Database(val name: String, val url: String) {

  override
  def toString: String = {
    s"I ame a database,name:$name,url:$url";
  }
}