package Application
import scala.annotation.tailrec
import scala.io.StdIn

class UserInterface(userName: String) {

  def offerRulesToUser(): Unit = {
    println(
      "\t\t\t~~Noughts and Crosses~~\n" +
      "\nWould you like to view the rules?\n" +
      "\nPlease enter yes or no."
    )

    val doesUserWantRules = getUserInputUntilValid(
      List("yes", "no".replace(" ", ""))
    )

    if (doesUserWantRules == "yes") {
      println("\nRules:\n\n" +
        "Each player takes it in turn to place their X or O into an empty square in the grid.\n" +
        "To win get three of your symbols in a line horizontally, vertically or diagonally.\n\n" +
        "(͠≖ ͜ʖ͠≖)\uD83D\uDC4C Good luck!\n\n")
    }
    else {println("Okay...\n")}
  }

  @tailrec
  final def getUserInputUntilValid(validItems: List[String]): String = {
    val input = StdIn.readLine.trim

    if (validItems.contains(input)) {
      input
    }
    else {
      println(s"Please choose one of the following: ${validItems.mkString(", ")}")
      getUserInputUntilValid(validItems)
    }
  }

  @tailrec
  final def playGameRecursive(numberOfGames: Int = 0): Unit = {
    println(
      s"\n\t~*Ready to play?*~" +
        s"\n  Please enter yes or no."
    )

    val userPlayChoice = getUserInputUntilValid(List("yes", "no"))
      .replace(" ", "")

    if (userPlayChoice != "yes") {
      println("Okay, see you next time")
    }
    else {
      startGame()
      thanksForPlaying()
      playGameRecursive(numberOfGames + 1)
    }
  }

  def userPickXOrO(): String = {
    println("Please pick either X or O.")

    getUserInputUntilValid(List("X", "O"))
                    .replace(" ", "")
                    .replace("0", "O")
                    .toUpperCase
  }

  def startGame(): Unit = {
    println(
      "┌───────────────────────────────┐\n" +
      "│Welcome to Noughts and Crosses!│\n" +
      "└───────────────────────────────┘\n"
    )

    println(
      s"Okay $userName, please pick your character.           \n\n" +
        "  Confident    Nervous    'I lost the last game'     \n\n" +
        "  \uD83D\uDCAA( ⌣̀‸⌣́)      (⊙_⊙;)          ლ(¯ロ¯ლ)    \n\n" +
        "     A           B                 C                 \n\n" +
        "Enter A, B, or C\n"
    )

    startingScreen()
  }

  def userPickCharacter(): String = getUserInputUntilValid(List("A", "B", "C"))
                                   .replace(" ", "")

  def startingScreen(): Unit = userPickCharacter() match {
     case "A" =>
          println(
            "                               \n" +
            "   ┌──────────────────────┐    \n" +
            "   │■■■■■■■■■■KO■■■■■■■■■■│    \n" +
            "   └──────────────────────┘    \n" +
            "   ฅ^•ﻌ•^ฅ      \uD83D\uDCAA( ⌣̀‸⌣́) \n" +
            s"  COMPUTER       $userName\n"     +
            "                         \n"       +
            "┌─────────────────────────────┐\n" +
            "│    1    │    2    │    3    │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│ ─────────────────────────── │\n" +
            "│    4    │    5    │    6    │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│ ─────────────────────────── │\n" +
            "│    7    │    8    │    9    │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "└─────────────────────────────┘\n"
          )
     case "B" =>
          println(
            "                               \n" +
            "   ┌──────────────────────┐    \n" +
            "   │■■■■■■■■■■KO■■■■■■■■■■│    \n" +
            "   └──────────────────────┘    \n" +
            "   ฅ^•ﻌ•^ฅ          (⊙_⊙;)     \n" +
            s"  COMPUTER          $userName \n" +
            "                               \n" +
            "┌─────────────────────────────┐\n" +
            "│    1    │    2    │    3    │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│ ─────────────────────────── │\n" +
            "│    4    │    5    │    6    │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│ ─────────────────────────── │\n" +
            "│    7    │    8    │    9    │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "│         │         │         │\n" +
            "└─────────────────────────────┘\n"
          )

     case "C" =>
       println(
           "                               \n" +
           "   ┌──────────────────────┐    \n" +
           "   │■■■■■■■■■■KO■■■■■■■■■■│    \n" +
           "   └──────────────────────┘    \n" +
           "   ฅ^•ﻌ•^ฅ         ლ(¯ロ¯ლ)    \n" +
           s"  COMPUTER          $userName \n" +
           "                               \n" +
           "┌─────────────────────────────┐\n" +
           "│    1    │    2    │    3    │\n" +
           "│         │         │         │\n" +
           "│         │         │         │\n" +
           "│         │         │         │\n" +
           "│ ─────────────────────────── │\n" +
           "│    4    │    5    │    6    │\n" +
           "│         │         │         │\n" +
           "│         │         │         │\n" +
           "│         │         │         │\n" +
           "│ ─────────────────────────── │\n" +
           "│    7    │    8    │    9    │\n" +
           "│         │         │         │\n" +
           "│         │         │         │\n" +
           "│         │         │         │\n" +
           "└─────────────────────────────┘\n"
       )

      userPickSquare()

        }

  @tailrec
  final def userPickSquare(userXOrOChoice: String = "", numSquaresChosen: Int = 0): Square = {
   println("Please choose a square.\nEnter a number between 1 and 9.")
    val userSquareChoice = getUserInputUntilValid(List("1", "2", "3","4", "5", "6", "7", "8", "9"))

    if (numSquaresChosen > 7) {
      println("There are no squares left to pick")
      new Square("", "")
    }
    else {
      println("Please pick your next square.")
      new Square(userXOrOChoice, userSquareChoice)
      userPickSquare(userXOrOChoice, numSquaresChosen + 1)
    }
  }

  def thanksForPlaying(): Unit = {
      println(
          "┌───────────\"^.--.^\"───────────┐\n" +
          "│      Thanks for playing!     │\n"   +
          "└──────────────────────────────┘\n\n" +
          "\n\n\nCredit for ASCII art goes to:\n"+
          "http://textart4u.blogspot.com/2013/03/one-line-ascii-text-art.html\n" +
          "https://kawaiiface.net/\n"            +
          "https://www.messletters.com/en/shapes/\n\n")
    }
}