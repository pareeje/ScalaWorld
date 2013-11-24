package collections

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.Ignore
import org.scalatest.FunSuite
import monads.trymonad.TryTest
import org.scalatest.FunSuite
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class GenericMergeSortTest extends FunSuite {

  test("Test with empty List") {
    //GenericMergeSort.msort(List())()
  }

  test("Test with multi item List") {
    val sList = GenericMergeSort.msort(List(1, -4, 8, 2, 3, 0))
    assert(sList.head < 0, "Now first element is negative")
  }

  test("Test with boolean items List") {
    val sList = GenericMergeSort.msort(List(true, false, false, true))
    //assert(sList.head, "Now first element is negative")
    println(sList)
  }
  test("Test with string items List") {
    val sList = GenericMergeSort.msort(List("xxx", "aaa", "fff", "ddd", "zzz"))
    println(sList)
  }
}