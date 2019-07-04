package com.example

import java.util.Random

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }


  def foo() = {
    val r = new Random()
    r.nextLong
  }

}
