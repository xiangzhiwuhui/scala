package com.ssl

import com.ssl.Person
package com{
  package object ssl{
    var name1 = "张志强"
  }
  package ssl{

    class Person(var id: Integer, var name: String){
      var sex: String = ""
      def this(id: Integer, name: String, sex: String){
        this(id, name)
        this.sex = sex
      }
      
      def say(say: String) ={
        println(name+":say "+say)
        println(name1)
      }
    }
    
    object Person{
      def apply(id: Integer, name: String) = {
        new Person(id,name)
      }
      def apply(id: Integer, name: String, sex: String) = {
        new Person(id, name, sex)
      }
    }
  }
}


/**
 * @author lenovo
 */
object PackageDemo {
  def main(args: Array[String]): Unit ={
    
    val person = Person(1,"dd")
    person.say("ssl")
//    val person = Person(1,"ssl")
//    person.say("你好！")
//    
//    val person1 = Person(2, "小区")
//    person1.say("Hello World ！")
  }
  
}


