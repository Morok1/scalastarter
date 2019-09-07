package algorithms

object AbsInt {
  def absMax(elements: List[Int]): Int  = Math.abs(elements.maxBy(x => Math.abs(x)))
}
