package Application
import scala.io.StdIn

object Application {

  def main (args: Array[String]): Unit = {

    val userName = StdIn.readLine("Please enter your name").trim.toUpperCase

    val UI = new UserInterface(userName)
    val gameMechanics = new NoughtsAndCrosses


    UI.offerRulesToUser()
    UI.playGameRecursive()
  }
}

