package patterns
trait A {
  def hello() : String = "Hello, I am story"
  def pass(a:Int): String = "Hello, I am trait A"
}

trait B {
  def hello() : String = "Hello, I am trait B!"
  def pass(a:String): String = s"Trait b said: 'You pass $a"
}

object Clashing extends B with A{
  override def hello(): String = super[A].hello()
  def helloB(): String = super[B].hello()

  def main(args: Array[String]): Unit = {
    System.out.println(hello())
    System.out.println(helloB())
    System.out.println()
  }
}

trait C {
  def value(a:Int): String = a.toString
}

trait D {
  def value(a:Int)
}