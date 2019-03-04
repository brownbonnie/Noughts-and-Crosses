package Application

object Application {

  def main (args: Array[String]): Unit = {

    val A1 = new Square(state = "", position = "A1")
    val A2 = new Square(state = "", position = "A2")
    val A3 = new Square(state = "", position = "A3")
    val game = new GameBoard(Array(A1, A2, A3))

    val userName = new UserInput(messageToUser = "Please enter your name.").toString

    val interface = new UserInterface(userName)

    interface.offerRulesToUser()
    interface.playGameRecursive()

  }
}

