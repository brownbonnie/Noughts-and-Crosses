package Application
import scala.io.StdIn

class UserInput (messageToUser: String) {

  override def toString: String = {
    val input = StdIn.readLine(messageToUser)
    input
  }

}
