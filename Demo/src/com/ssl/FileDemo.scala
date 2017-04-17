package com.ssl

import java.io.File
import java.io.FileInputStream
import java.io.PrintWriter
import java.util.Date
import sys.process._
/**
 * @author lenovo
 */

object FileDemo {
  def main(args: Array[String]): Unit ={
    
    val numitemPattern = "([0-9]+) ([a-z]+)".r
    for(numitemPattern(num, item) <- numitemPattern.findAllIn("11 b, 55 a"))println(num+item)
//    
    
//    val children = new File("E:/scala").listFiles
//    for(child <- children)println(child)
//    
    
//    val out = new PrintWriter("numbers.txt")
//    var precent = 0
//    val beginTime = new Date().getTime
//    println("开始写入!")
//    for(i <- 1 to 1000000000){
//      out.print(i.toString + "  ")
//      if(i%10 == 0)out.print("\n")
//      if(i%10000000 == 0){
//          precent += 1
//          println("已完成：" + precent + "%")
//        }
//      
//      
//      
//    } 
//    out.close()
//    println("写入完毕！")
//    println("用时：" + ((new Date().getTime - beginTime)/1000.0)+"秒")
    
    
//    val file = new File("myfile.txt")
//    val in = new FileInputStream(file)
//    val bytes = new Array[Byte](file.length.toInt)
//    in.read(bytes)
//    in.close
//    for(byte <- bytes)println(byte)
//    val source = Source.fromURL("http://www.dj.com")
//    val lines = source.getLines()
//    for(line <- lines)println(line)
//    val source = Source.fromFile("numbersFile.txt")
//    val tokens = source.mkString.split("\\s+")
//    val numbers = tokens.map(_.toInt)
//    for(number <- numbers){
//      println(number)
//    }
//    val age = StdIn.readInt()
//    println(age)
//    val source = Source.fromFile("myfile.txt", "utf-8")
//    val tokens = source.mkString.split("\\s+")
//    for(token <- tokens){
//      println(token)
//    }
//    val iter = source.buffered
//    var count = 0
//    while(iter.hasNext){
//      if(iter.head.equals('l'))count+=1
//      iter.next()
//    }
//    source.close()
//    println(count)
//    val line = source.getLines()
//    val lines = source.getLines().toArray
//    val contents = source.mkString
  }
}

