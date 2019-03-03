import Application.GameBoard
import Application.Square
import org.scalatest.FunSuite

class GameBoardSpec extends FunSuite {

  test ("def changeSquare correctly changes state") {

    val squareA1 = new Square(" ")
    val game = new GameBoard(squareA1)

    val resultingSquare = game.changeSquare("X")

    assert(
      game.changeSquare("X").state == resultingSquare.state
    )
  }
}
