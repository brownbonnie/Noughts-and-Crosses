import Application.GameBoard
import Application.Square
import org.scalatest.FunSuite

class GameBoardSpec extends FunSuite {

  test ("def changeSquare correctly changes state") {

    val square1 = new Square(" ")
    val game = new GameBoard(square1)

    val resultingSquareState = game.changeSquare("X").state

    assert(resultingSquareState == "X")
  }
}
