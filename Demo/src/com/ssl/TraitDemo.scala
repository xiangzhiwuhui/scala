package com.ssl

/**
 * @author lenovo
 */
object TraitDemo {
  def main(args: Array[String]): Unit ={
//    val acc1= new SavingAccount with ConsoleLogger with TimestampLogger with ShortLogger
//    acc1.withdraw(100)
//    val acc2 = new SavingAccount with ConsoleLogger with ShortLogger with TimestampLogger
//    acc2.withdraw(1000)
//    implicit def a2RichA(a: A) = new RichA(a)
//    val a = new A
//    a.rich
//    
//    def b(implicit name: String) = {println(name)}
//    implicit val name = "sss "
//    b("niaho")
    
//    val sa = new SavingAccount
//    sa.withdraw(-100)
    
    implicit class RichPerson(p: Person1){
      def say{println("implicit DD")}
    }
    val p = new Person1
    p.say
  }
}

class Person1{
  
}


//trait Logger{
//  def log(msg: String)
//  def info(msg: String){log("INFO:" + msg)}
//  def warn(msg: String){log("WARN:" + msg)}
//  def server(msg: String){log("SERVER:" + msg)}
//}
//
//class SavingAccount extends Logger{
//  def withdraw(amount: Double){
//    if(amount < 0)warn("请输入正确金额！")else info("所取金额为：" + amount)
//  }
//  override def log(msg: String){println(msg)}
//}

//class A{}
//class RichA(a: A){
//  def rich{
//    println("rich...")
//  }
//}


//trait Logger{
//  def log(msg: String)
//}
//
//trait TimestampLogger extends Logger{
//  abstract override def log(msg: String){
//    super.log(new java.util.Date + " " + msg)
//  }
//}
//
//class Account{
//  
//}

///*叠加在一起的特质*/
//trait Logged{
//  def log(msg: String){}
//}
//
//trait ConsoleLogger extends Logged{
// override def log(msg: String){println(msg)}
//}
//
//trait TimestampLogger extends Logged{
//  override def log(msg: String){
//    super.log(new java.util.Date()+" "+ msg)
//  }
//}
//
//trait ShortLogger extends Logged{
//  val maxLength = 15
//  override def log(msg: String){
//    super.log(if(msg.length <= maxLength) msg else msg.substring(0, maxLength-3) + "...")
//  }
//}
//
//class SavingAccount extends Logged{
//  def withdraw(amount: Double){
//    log("取款"+amount+"元")
//  }
//}

