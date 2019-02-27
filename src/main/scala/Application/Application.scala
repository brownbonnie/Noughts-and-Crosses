package Application

object Application {

  def main (args: Array[String]): Unit = {

    NoughtsAndCrosses.displayRules()
    NoughtsAndCrosses.startGame()

    NoughtsAndCrosses.thanksForPlaying()

  }
}
