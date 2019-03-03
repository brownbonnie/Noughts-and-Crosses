package Application

class GameBoard (square: Square) {

  def changeSquare (userChoice: String): Square = {
    userChoice match {
      case "X" => new Square(state = "X")
      case "O" => new Square(state = "O")
      case _   => square
    }
  }

}
