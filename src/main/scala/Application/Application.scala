package Application
import scala.io.StdIn

object Application {

  def main (args: Array[String]): Unit = {

//    val userName = StdIn.readLine("Please enter your name").trim.toUpperCase
//    val interface = new UserInterface(userName)
//
//    interface.offerRulesToUser()
//    interface.playGameRecursive()

    val square = new Square(" ")
    val game = new GameBoard(square)

    print(game.changeSquare(userChoice = "X"))
  }
}

