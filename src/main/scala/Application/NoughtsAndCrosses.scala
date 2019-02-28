package Application
import scala.annotation.tailrec
import scala.io.StdIn

class NoughtsAndCrosses {}

object NoughtsAndCrosses {

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
  def getUserInputUntilValid(validItems: List[String]): String = {
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
  def playGameRecursive(numberOfGames: Int = 0): Unit = {
   println(
     s"\n*~Would you like to play?~*" +
     s"\n Please enter yes or no."
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

    def startGame(): Unit = {
      val userName = StdIn.readLine(
        "┌───────────────────────────────┐\n" +
        "│Welcome to Noughts and Crosses!│\n" +
        "│    Please enter your name.    │\n" +
        "└───────────────────────────────┘\n")

      println("Please pick either X or O.")
      val isUserXOrO = getUserInputUntilValid(List("X", "O"))
                       .replace(" ", "")

      println(
        s"Okay $userName, please pick your character.           \n\n" +
          "  Confident    Nervous    'I lost the last game'     \n\n" +
          "  \uD83D\uDCAA( ⌣̀‸⌣́)      (⊙_⊙;)          ლ(¯ロ¯ლ)    \n\n" +
          "     A           B                 C                 \n\n" +
          "Enter A, B, or C\n"
      )

      def userPickCharacter = getUserInputUntilValid(List("A", "B", "C"))
                                   .replace(" ", "")

      val startingScreen: Unit = userPickCharacter match {
        case "A" =>
          println(
            "                           \n" +
              " ┌──────────────────────┐\n" +
              " │■■■■■■■■■■KO■■■■■■■■■■│\n" +
              " └──────────────────────┘\n" +
              "  ฅ^•ﻌ•^ฅ      \uD83D\uDCAA( ⌣̀‸⌣́) \n" +
              s" COMPUTER       $userName\n" +
              "                         \n" +
              "┌───────────────────────┐\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│ ───────────────────── │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│ ───────────────────── │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "└───────────────────────┘\n"
          )

        case "B" =>
          println(
             "                          \n" +
              " ┌──────────────────────┐\n" +
              " │■■■■■■■■■■KO■■■■■■■■■■│\n" +
              " └──────────────────────┘\n" +
              "  ฅ^•ﻌ•^ฅ       (⊙_⊙;) \n" +
              s" COMPUTER       $userName\n" +
              "                         \n" +
              "┌───────────────────────┐\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│ ───────────────────── │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│ ───────────────────── │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "└───────────────────────┘\n"
          )

        case "C" =>
          println(
              "                         \n" +
              " ┌──────────────────────┐\n" +
              " │■■■■■■■■■■KO■■■■■■■■■■│\n" +
              " └──────────────────────┘\n" +
              "  ฅ^•ﻌ•^ฅ      ლ(¯ロ¯ლ)  \n" +
              s" COMPUTER       $userName\n" +
              "┌───────────────────────┐\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│ ───────────────────── │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│ ───────────────────── │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "│       │       │       │\n" +
              "└───────────────────────┘\n"
          )
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
}