package Application

object Application {

  def main (args: Array[String]): Unit = {

    val s1 = new Square(state = "", position = "s1")
    val s2 = new Square(state = "", position = "s2")
    val s3 = new Square(state = "", position = "s3")
    val squares = Array(s1, s2, s3)
    val game = new GameBoard(squares)

    val userName = new UserInput(messageToUser = "Please enter your name.").toString

    val interface = new UserInterface(userName)
//
//    interface.offerRulesToUser()
//    interface.playGameRecursive()

    interface.userPickSquare()
  }
}

