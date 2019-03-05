package application

object Application {

  def main (args: Array[String]): Unit = {

    val s1 = Square(state = "", position = "s1")
    val s2 = Square(state = "", position = "s2")
    val s3 = Square(state = "", position = "s3")
    val s4 = Square(state = "", position = "s4")
    val s5 = Square(state = "", position = "s5")
    val s6 = Square(state = "", position = "s6")
    val s7 = Square(state = "", position = "s7")
    val s8 = Square(state = "", position = "s8")
    val s9 = Square(state = "", position = "s9")

    val squares = Array(s1, s2, s3, s4, s5, s6, s7, s8, s9)
    val game = new GameBoard(squares)

    val userName = new UserInput(messageToUser = "Please enter your name.").toString
    val interface = new UserInterface(userName)

    interface.offerRulesToUser()
    interface.playGameRecursive()
  }
}

