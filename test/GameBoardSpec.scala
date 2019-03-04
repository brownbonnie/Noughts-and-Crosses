import Application.GameBoard
import Application.Square
import org.scalatest.{FunSuite, Matchers}

class GameBoardSpec extends FunSuite with Matchers{

  test ("changeSquare returns new Square A1 with state 'X'.") {

    val A1 = new Square(state = "", position = "A1")
    val A2 = new Square(state = "", position = "A2")
    val A3 = new Square(state = "", position = "A3")

    val game = new GameBoard(Array(A1, A2, A3))

    val resultingSquareState = game.changeSquare(A1, userXOrOChoice = "X")
                                   .state

    assert(resultingSquareState == "X")
    resultingSquareState shouldBe "X"

  }

  test ("changeSquare returns new Square A1 with state 'O'.") {

    val A1 = new Square(state = "", position = "A1")
    val A2 = new Square(state = "", position = "A2")
    val A3 = new Square(state = "", position = "A3")

    val game = new GameBoard(Array(A1, A2, A3))

    val resultingSquareState = game.changeSquare(A1, userXOrOChoice = "O")
                                   .state

    assert(resultingSquareState == "O")
  }
}
