package Application

import scala.io.StdIn

class NoughtsAndCrosses {
}

object NoughtsAndCrosses {

  def displayRules(): Unit = {
    val doesUserWantRules = StdIn.readLine(
      "Welcome! Would you like to view the rules before you start?\n" +
        "Please enter \"yes\" or \"no\".").toLowerCase

    if (doesUserWantRules == "yes") {
      println("Rules:\n\n" +
          "Each player takes it in turn to place their X or O into an empty square in the grid.\n" +
          "To win get three of your symbols in a line horizontally, vertically or diagonally.\n\n" +
          "(͠≖ ͜ʖ͠≖)\uD83D\uDC4C Good luck!\n\n"
      )} else {println("Okay... let's begin...")}
  }

  def startGame(): Unit = {
    val userName = StdIn.readLine(
        "┌───────────────────────────────┐\n" +
        "│Welcome to Noughts and Crosses!│\n" +
        "│    Please enter your name.    │\n" +
        "└───────────────────────────────┘\n")

    val userCharacter = StdIn.readLine(
       s"Okay $userName, please pick your character.           \n\n" +
        "  Confident    Nervous    'I lost the last game'     \n\n" +
        "  \uD83D\uDCAA( ⌣̀‸⌣́)      (⊙_⊙;)          ლ(¯ロ¯ლ)    \n\n" +
        "     A           B                 C                 \n\n" +
        "Enter A, B, or C\n").toCharArray.head.toUpper

    println(
      userCharacter match {
        case 'A' =>
          println(
              "                        \n" +
              "┌──────────────────────┐\n" +
              "│■■■■■■■■■■KO■■■■■■■■■■│\n" +
              "└──────────────────────┘\n" +
              "  ฅ^•ﻌ•^ฅ      \uD83D\uDCAA( ⌣̀‸⌣́) \n" +
              s" COMPUTER       $userName\n" +
              "                         \n" +
              "┌───────────────────────┐\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "└───────────────────────┘\n")
        case 'B' =>
          println(
            "                        \n" +
              "┌──────────────────────┐\n" +
              "│■■■■■■■■■■KO■■■■■■■■■■│\n" +
              "└──────────────────────┘\n" +
              "  ฅ^•ﻌ•^ฅ       (⊙_⊙;) \n" +
              s" COMPUTER       $userName\n" +
              "                         \n" +
              "┌───────────────────────┐\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "└───────────────────────┘\n")
        case 'C' =>
          println(
            "                        \n" +
              "┌──────────────────────┐\n" +
              "│■■■■■■■■■■KO■■■■■■■■■■│\n" +
              "└──────────────────────┘\n" +
              "  ฅ^•ﻌ•^ฅ      ლ(¯ロ¯ლ) \n" +
              s" COMPUTER       $userName\n" +
              "                         \n" +
              "┌───────────────────────┐\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "│                       │\n" +
              "└───────────────────────┘\n")
      })
  }

  def thanksForPlaying(): Unit = {println(
        "┌───────────\"^.--.^\"───────────┐\n" +
        "│      Thanks for playing!     │\n" +
        "│                              │\n" +
        "│ Credit for ASCII art goes to:│\n" +
        "└──────────────────────────────┘\n" +
        "http://textart4u.blogspot.com/2013/03/one-line-ascii-text-art.html\n" +
        "https://kawaiiface.net/\n" +
        "https://www.messletters.com/en/shapes/")
  }
}

//ideas:
//character walks on screen...
//unlock weapons?
//leaderboard?
//"UserName, are you still here?" else new game/ character