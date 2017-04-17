package com.ssl

import scala.math._
import javax.swing._
import java.awt.Button
import java.awt.Panel
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.io.PrintWriter

/**
 * @author lenovo
 */
object FunctionDemo {
  def main(args: Array[String]): Unit ={
    val out = new PrintWriter("E:/VLDB2015.txt")
    for(i <- 1 to 300) {out.println(i.toString + "、  "); out.println()}
    
    out.close()
    println("结束！")
//    (1 to 9).reduceLeft((x, y) => x*y)
    
//    (1 to 100).map("*" * _).foreach (println _)
//    
//      val fun: (Double) => Double = 3*_
//      println(fun(2))
    
//    def mulBy(factor: Double) = (x: Double) => factor*x
//    println(mulBy(3)(3))
    
//    def valueAtOneQuarter(f: (Double) => Double) = f(8.9)
//    println(valueAtOneQuarter(ceil _))
    
    
//    val fun = (x: Int) => 3*x
//    println(fun(3))
//    
//    //val fun = ceil _
//    val nums = Array(2,3,4).map(x => 3*x)
//    for(num <- nums)println(num)
    
//    def printl(x: Any) = Console.print("ssl: " + x)
//    "Mary has a little lamb".split(" ").sortWith(_.length < _.length).foreach(printRich.print1(_))
//      def mulBy(factor: Double) = (x: Double) => factor * x
//      println(mulBy(3)(14))
//    implicit def makeAction(action: (ActionEvent) => Unit) = new ActionListener{
//      override def actionPerformed(event: ActionEvent){action(event)}
//    }
//    var counter =0 
//    val button = new JButton("Increment")
//    button.addActionListener((event: ActionEvent) => counter += 1)
    
  }
}

//object printRich{
//  def print1(x: Any) = Console.print("ssl: "+x)
//}

















