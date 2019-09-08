package spark

object FunctionAsReturnValue {
  def TransferMoney(money:Double) = {
    if(money > 10)
       (money:Double) => "Dob" + money*1
    else
    (money:Double) => "Dob" + money*1
  }

  def main(args: Array[String]): Unit = {
    val returnFunction = TransferMoney(10)
    println(returnFunction(10))
  }
}
