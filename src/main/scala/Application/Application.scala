package Application
import scala.io.StdIn

object Application {

  def main (args: Array[String]): Unit = {

    val userName = StdIn.readLine("Please enter your name").trim.toUpperCase
    val game = new NoughtsAndCrosses(userName)

    game.offerRulesToUser()
    game.playGameRecursive()
  }
}

