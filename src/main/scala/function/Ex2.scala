package function

import java.io.InputStream
import java.net.URL

object Ex2 {

  def main(args: Array[String]): Unit = {
    println(less(1,2))
    val in = new URL("http://horstmann.com/cay-tiny.gif").openStream();
    try{
      process(in)
    } finally {
      in.close();
    }
    testLoop(1)
    print("Hello".charAt(1))
    print(fuc(3))
  }
  def fuc(n: Int): Int = if(n <= 0) 1 else n * fuc(n-1)
  def less(m:Int, n:Int): Boolean ={
    return m < n;
  }

  def root(x: Double)= if (x >=0) {Math.sqrt(4)} else throw new IllegalArgumentException("x should not be negative");

  try{
    println("hello")
  } catch {
    case e: Exception => println(e)
  }
  def process(in: InputStream){
    var bytes = -1
    var next = 0;
    while (next != -1) {
      next = in.read()
      bytes += 1;
      println("bytes " + bytes)
    }

  }
  def testLoop(m:Int){
    for (i <- 1 to 10; j <- 1 to 2) print(i,j)
  }

}
