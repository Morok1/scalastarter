package basis

object Ex1 {
  def main(args: Array[String]): Unit = {
    print("Hello")

    print(1.toString)

    val name = "Misha";

    print(name.toUpperCase)

    println("Hello".intersect("World"))
≠
    print(mult(1,2))

    val m: BigInt = 12
    print(m)
  }

  def mult(m:Int, n:Int){
    return m*n
  }

}

