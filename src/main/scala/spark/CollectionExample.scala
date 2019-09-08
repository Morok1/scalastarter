package spark

import scala.collection.SortedSet

object CollectionExample {
  def main(args: Array[String]): Unit = {
    val x = 10
    val y = 15
    val z = 19


  Traversable(1,2,3)
  Iterable("x", "y", "z")
  Map("x" -> 10, "y" -> 13, "z" -> 17)
  Set("Red", "Green", "Blue")
  SortedSet("Hello", "world!")

  Traversable(1, 2, 3)
  Iterable("x", "y", "z")
  Map("x" -> 10, "y" -> 13, "z" -> 17)
  Set("Red", "Green", "Blue")
  SortedSet("Hello,", "world!")
  IndexedSeq(0.0, 1.0, 2.0)
  List(2, 6, 10)

  val list = List(1,2,3) map (_ + 1)
  println(list)
  }

}
