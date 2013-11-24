package collections

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.Ignore
import org.scalatest.FunSuite
import monads.trymonad.TryTest
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class MergeSortTest extends FunSuite {
  test("Test with empty List") {
    val mergeSorter = new MergeSort()
    mergeSorter.msort(List())
  }
  
  test("Test with one item List") {
    val mergeSorter = new MergeSort()
    println(mergeSorter.msort(List(1)))
  }
  
    test("Test with multi item List") {
    val mergeSorter = new MergeSort()
    val sList = mergeSorter.msort(List(1,4,8,2,3,0))
    assert(sList.head < sList.last, "Now last element is bigger that first element")
  }
}