package Value

//import values.Value

class Notification(message: String) extends Value {
  override def toString() = message
	def execute(env: Environment)= Notification.UNSPECIFIED
}

//"variable updated", "binding created", "unknown", "error", and "OK".
object Notification {

  val OK = new Notification("ok")
  val ERROR = new Notification("error")
    val UNSPECIFIED = new Notification("Unspecified identifier")
    val VARIABLE = new Notification("variable updated")
  val BINDING = new Notification("binding created")

}