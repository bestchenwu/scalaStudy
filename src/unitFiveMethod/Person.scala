package unitFiveMethod

class Person {
  
    protected var name:String="";
    
    def setName(name:String):this.type={
        this.name = name;
        this
    }
    
}

class Employee extends Person{
    
    var role="";
   
    def setRole(role:String):this.type={
      this.role=role
      this
    }
}

object Person{
  
    def main(strings:Array[String]):Unit={
      val employee = new Employee().setRole("role").setName("name");
      println(employee.name);
      println(employee.role);
    }
}