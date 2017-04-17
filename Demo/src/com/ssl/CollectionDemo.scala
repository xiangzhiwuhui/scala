package com.ssl

/**
 * @author lenovo
 */
object CollectionDemo {
  def main (args: Array[String]): Unit ={

//    val digits = List(1, 2)
//    val digits1 = List(3, 4)
//    val newDigits = digits ::: digits1
//    println(newDigits.sum)
//    
//    val dig = 1 :: 2 :: 3 :: Nil
//    
//    val lst = collection.mutable.LinkedList(1, -2, 3, -9)
//    var cur = lst
//    
//    while(cur != Nil){
//      if(cur.elem < 0) cur.elem = 0
//      cur = cur.next
//    }
//    
//    val lstIter = lst.iterator
//    while(lstIter.hasNext){println(lstIter.next())}
    
    
//    val set = Set(1, 2, 3) - 2
//    val setIter = set.iterator
//    while(setIter.hasNext)println(setIter.next)
//  val names = List("Peter", "Paul", "Marry") 
//  val namesUpCase =  names.map(_.toUpperCase())
//  val namesUpCaseIter = namesUpCase.iterator
//  while (namesUpCaseIter.hasNext) {
//    println(namesUpCaseIter.next())
//  }
    val value = List(1, 7, 2, 9).foldLeft(0)(_ - _)
    println(value)
    
  }
  
  
  
//  def sum(lst: List[Int]): Int ={
//  
//    if(lst == Nil) 0 else lst.head + sum(lst.tail)
//  }
//  
//  def sum1(lst: List[Int]): Int = lst match{
//    case Nil => 0
//    case h :: t => h + sum1(t)
//    
//  }
}

