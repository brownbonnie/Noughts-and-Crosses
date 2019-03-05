package application

class GameBoard (squares: Array[Square]) {

  def changeSquare (square: Square, userXOrOChoice: String): Square = {
    Square(square.position, userXOrOChoice)
  }

}
