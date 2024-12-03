package ru.otus.spark.hw.l_5

import ru.otus.spark.hw.l_5.Functions.{getAgeCategory, interviewUser, sum}

import java.util.Scanner

object HW extends App {
  val age: Int = 30
  val weight: Double = 80.5
  val name: String = "Mike"
  val isStudent: Boolean = false

  println(age, weight, name, isStudent)
  println(sum(10, 15))
  println(getAgeCategory(age))

  val range: Range.Inclusive = 1 to 10 // = Range.inclusive(1, 10)
  range.foreach(num => print(s"$num "))
  println()

  Seq(name, "John", "Viki").foreach(name => print(s"$name "))
  println()

  interviewUser()

  val squares: Seq[Int] =
    for {
      num <- range
    } yield num * num

  val evens: Seq[Int] =
    for {
      num <- range
      if num % 2 == 0
    } yield num

  println(squares)
  println(evens)
}

object Functions {
  def sum(num1: Int, num2: Int): Int = num1 + num2

  def getAgeCategory(age: Int): String = if (age < 30) "Young" else "Adult"

  def interviewUser(): Unit = {
    println("Enter your name, age and whether you are a student: ")
    val sc: Scanner = new Scanner(System.in)
    val name: String = sc.next()
    val age: Int = sc.nextInt()
    val isStudent: Boolean = sc.nextBoolean()

    println(s"name: $name, age: $age, age category: ${getAgeCategory(age)}, is student: $isStudent")
  }
}
