package unitFour

/**
 * 类的继承时候,父类不需要加类型名称
 */
class BaseControllerTest(db:Database) extends BaseController(db){
    
     def connect{
        println(s"name:${db.name},url:${db.url} have connected");
     }
     
     def getDatabase:Database={
        db;
     }
     
}
object BaseControllerTest{
    
    def main(args: Array[String]): Unit = {
        val db = new Database("mysql","mysql url");
         val test = new BaseControllerTest(db);
         test.connect;
         println(test.getDatabase);
         println("name:"+test.getName());
    }
}