import Application.GameBoard
import Application.Square
import org.scalatest.FunSuite

class GameBoardSpec extends FunSuite {

  test ("changeSquare returns Square with state 'X") {

    val square1 = new Square(" ")
    val game = new GameBoard(square1)
    val resultingSquareState = game.changeSquare("X").state

    assert(resultingSquareState == "X")

  }

  test ("changeSquare returns Square with state 'O' ") {

    val square1 = new Square(" ")
    val game = new GameBoard(square1)
    val resultingSquareState = game.changeSquare("O").state

    assert(resultingSquareState == "O")
  }
}
