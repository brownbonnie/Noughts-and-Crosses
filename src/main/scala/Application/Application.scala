package Application
import scala.io.StdIn

object Application {

  def main (args: Array[String]): Unit = {

    val A1 = new Square(state = "", position = "A1")
    val A2 = new Square(state = "", position = "A2")
    val A3 = new Square(state = "", position = "A3")
    val game = new GameBoard(Array(A1, A2, A3))

    val userName = StdIn.readLine("Please enter your name")

    val interface = new UserInterface(userName)

    interface.offerRulesToUser()
    interface.playGameRecursive()

    val userXOrOChoice = interface.userPickXOrO

    val userSquareChoice = interface.userPickSquare()

    println(game.changeSquare(userSquareChoice, userXOrOChoice))

  }
}

