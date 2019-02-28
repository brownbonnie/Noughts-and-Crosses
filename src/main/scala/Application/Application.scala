package Application
object Application {

  def main (args: Array[String]): Unit = {

    NoughtsAndCrosses.offerRulesToUser()
    NoughtsAndCrosses.playGameRecursive()
  }
}

