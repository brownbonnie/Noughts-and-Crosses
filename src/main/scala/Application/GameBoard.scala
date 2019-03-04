package Application

import scala.annotation.tailrec
import scala.io.StdIn

class GameBoard (squares: Array[Square]) {

  def changeSquare (square: Square, userXOrOChoice: String): Square = {
    new Square(square.position, userXOrOChoice)
  }

  @tailrec
  final def userPickSquare(userXOrOChoice: String = "", numSquaresChosen: Int = 0): Square = {
    val userSquareChoice = StdIn.readLine("Please choose a square.")

    if (numSquaresChosen > 9) {
      new Square("", "")
    }
    else {
      new Square(userXOrOChoice, userSquareChoice)
      userPickSquare(userXOrOChoice, numSquaresChosen + 1)
    }
  }
}
