package com.ssl


/**
 * @author lenovo
 */
object ExtendsDemo {
  def main(args: Array[String]): Unit = {
    var person: Person = new Student(1, "ssl", 10)
    person.say("你好！")
    
  }
}

class Person(var id: Integer, var name: String){
  
  def say(say: String){
    println("Person say: "+id + "\t" +name)
  }
}

class Student(id: Integer, name: String, var age: Integer) extends Person(id, name){
  
  override def say(say: String){
    println("Student say: "+id + "\t" + name + "\t" + age)
  }
}

