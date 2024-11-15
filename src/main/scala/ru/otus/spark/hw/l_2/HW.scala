package ru.otus.spark.hw.l_2

import ru.otus.spark.hw.l_2.Functions._

object HW extends App {
  greet()
  println(sum(5, 10))
  println(List(1, 2, 3, 4, 5).map(_ + 1))
  oddOrEven()
  println(getLength("some text"))
  println(concatenateStrings(Seq("some", "text")))
}

object Functions {
  def greet(): Unit = {
    println("Enter your name: ")
    val name: String = scala.io.StdIn.readLine()
    println(s"Hello $name !")
  }

  def sum(num1: Int, num2: Int): Int = num1 + num2

  def oddOrEven(): Unit = {
    println("Enter number: ")
    val num: Int = scala.io.StdIn.readInt()
    if (num % 2 == 0) println("even")
    else println("odd")
  }

  def getLength(str: String): Int = str.length

  def concatenateStrings(seq: Seq[String]): String = seq.mkString(" ")
}