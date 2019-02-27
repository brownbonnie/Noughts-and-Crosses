package Application

import scala.io.StdIn

class NoughtsAndCrosses {
}

object NoughtsAndCrosses {

  def displayRules = {
    val doesUserWantRules = StdIn.readLine(
      "Would you like to view the rules before you start?\n" +
        "Please enter \"yes\" or \"no\".")
  }


  def startGame = {
    val userName = StdIn.readLine(
      "┌───────────────────────────────┐\n" +
      "│Welcome to Noughts and Crosses!│\n" +
      "│    Please enter your name.    │\n" +
      "└───────────────────────────────┘\n")

    val userCharacter = StdIn.readLine(
    s"Okay $userName, please pick your character.\n\n" +
        " Confident  Nervous    Rematch   \n\n" +
        "  (；⌣̀‸⌣́)     (⊙_⊙)    ლ(¯ロ¯ლ)   \n\n" +
        "     A         B         C       \n\n" +
    "Enter A, B, or C\n").toCharArray.head

    //Option to view rules

    println(
        "        Ready??          \n" +
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

    println(
        "        Fight!!          \n" +
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

    //character walks on screen...
    //unlock weapons?
    //leaderboard?
    //"UserName, are you still here?" else new game/ character
  }

}
