package com.dt.scala.basics

import scala.io.Source
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object FunctionOps {
	def main(args: Array[String]) {
		val width = args(0).toInt
		for (arg <- args.drop(1))
		  processData(arg, width)
		  
		  
		  var increase = (x: Int) => x + 1
		  println(increase(10))
		  increase = (x: Int) => x + 9999
		  
		  val someNumbers = List(-11, -10, -5, 0, 5, 10)
		  someNumbers.foreach((x: Int) => print (x))
		  println
		  someNumbers.filter((x: Int) => x > 0).foreach((x: Int) => print (x))
		   println
		  someNumbers.filter((x) => x > 0).foreach((x: Int) => print (x))
		   println
		  someNumbers.filter(x => x > 0).foreach((x: Int) => print (x))
		   println
		  someNumbers.filter(_ > 0).foreach((x: Int) => print (x))
		   println
		  val f = (_: Int) + (_: Int)
		  println(f(5, 10))
	}
	
	
	def processData(filename: String, width: Int) {
	  
	  def processLine(line: String) {
	    if (line.length > width)
	    	println(filename +": "+ line)
	  }
	  
	  val source = Source.fromFile(filename)
	  for (line <- source.getLines)
		  processLine(line)
	  
	}
	
	
	
	
}