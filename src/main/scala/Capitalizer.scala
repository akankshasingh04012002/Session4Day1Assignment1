import scala.util.Try
import scala.util.{Try, Success, Failure}

class Capitalizer {
  def capitalizeA(list: List[String]): List[String] = {
    for {
      myList <- list
    } yield {
      // Used map() to iterate over each character in the string and capitalize 'a' if found
      Try {
        myList.map(char => if (char == 'a' || char == 'A') 'A' else char)
      } match {
        case Success(value) => value
        case Failure(exception) => exception.getMessage
      }
    }
  }
}