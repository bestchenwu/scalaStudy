package unitFour

class DefaultPerson(val id: Int, val name: String = "hello") {

  var address = None: Option[Address];
}

case class Address(val name: String, val zipCode: String);