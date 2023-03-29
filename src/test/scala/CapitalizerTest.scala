import org.scalatest.flatspec.AnyFlatSpec
import scala.util.{Try, Success, Failure}

class CapitalizerTest extends AnyFlatSpec {

  "capitalizeA" should "capitalize all 'a's in a list of strings" in {
  val capitalizer = new Capitalizer()
  val input = List("apple", "banana", "orange")
  val expectedOutput = List("Apple", "bAnAnA", "orAnge")
  assert(capitalizer.capitalizeA(input) == expectedOutput)
}

it should "not modify strings without 'a's in them" in {
  val capitalizer = new Capitalizer()
  val input = List("hello", "world")
  assert(capitalizer.capitalizeA(input) == input)
}

it should "return an empty list when given an empty list" in {
  val capitalizer = new Capitalizer()
  val input = List.empty[String]
  assert(capitalizer.capitalizeA(input) == input)
}

}