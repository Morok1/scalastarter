package algorithms

object Abs {
  def abs(number : Int): Int = {
    if(number < 0){
      return number * -1
    }
    return number;
  }
}
