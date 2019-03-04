package Application

class GameBoard (squares: Array[Square]) {

  def changeSquare (square: Square, userXOrOChoice: String): Square = {
    new Square(square.position, userXOrOChoice)
  }

}
