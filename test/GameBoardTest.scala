import application.GameBoard
import application.Square
import org.scalatest.{FunSuite, Matchers}

class GameBoardTest extends FreeSpec with Matchers {

  test("changeSquare returns new Square with state changed.") {

    val s1 = new Square(state = "", position = "s1")
    val s2 = new Square(state = "", position = "s2")
    val s3 = new Square(state = "", position = "s3")
    val game = new GameBoardTest(Array(s1, s2, s3))

    val resultingSquareState = game.changeSquare(s1, userXOrOChoice = "X")
                                   .state
    resultingSquareState shouldBe "O"
  }

}


