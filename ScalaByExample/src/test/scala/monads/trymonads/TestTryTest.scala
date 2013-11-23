package monads.trymonads

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.Ignore
import org.scalatest.FunSuite
import monads.trymonad.TryTest

@RunWith(classOf[JUnitRunner])
class TestTryTest extends FunSuite {

  test("Testing Try with 150 should be successs") {

    val myTry = new TryTest()

    assert(myTry.fetchValue(150) === 300, "should return happy message")

  }

  test("Testing Try with 151 should be unhappy") {

    val myTry = new TryTest()

    intercept[NumberFormatException] {

      myTry.fetchValue(151)

    }
  }

}