package Application

class GameBoard (squares: Array[Square], userMoves: Array[Square] = Array()) {

  def changeSquare (square: Square, userXOrOChoice: String): Square = {
    new Square(square.position, userXOrOChoice)
  }

//  def monitorUntilGameOver() = {
//    squares match {
//      case lose if     => println("Sorry, you lost.")
//      case win         => println("You won!")
//      case keepPlaying => println("Keep playing")
//      case _           => println("Something went wrong.")
//    }
//  }

}
