package unitFour

object PersonTest {
  
  def main(args: Array[String]): Unit = {
//      val person = new Person("test",11);
////      person.name("hi");
////      println(person.name);
//      val anotherPerson = new Person("test11",22);
//      println(person.isHigerPrice(anotherPerson));
//      person.setNewPrice(0.20d);
//      println(person.isHigerPrice(anotherPerson));
      //当直接使用类名来初始化的时候，实际上使用apply方法
//      val person2 = CasePerson("test");
//      println(person2.name);
//    val defaultPerson = new DefaultPerson(11);
//    defaultPerson.address = Some(Address("address","0000"));
//    defaultPerson.address.foreach(item => {
//      println(item.name);
//      println(item.zipCode);
//    });
//    
//    val employee = new Employee(11,"employee",35d);
//    employee.address = Some(Address("address","0000"));
    
     val person1 = new Person("test",1);
     val person2 = new Person("test",1);
     val person3 = new Person("test",2);
     println(person1==person2);
     println(person1==person3);
      //      println(person.name);
//      val person1 = new Person("test2");
//      println(person1.name);
//      println(person1.id);
//      val privatePerson =  PrivatePerson.getPerson();
    
//       val defaultPerson = new DefaultPerson(13);
//       println(defaultPerson.name);
      //person.name="test1";
  }
}