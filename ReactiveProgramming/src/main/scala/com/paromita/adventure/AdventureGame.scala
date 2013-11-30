package com.paromita.adventure

import scala.util.{ Try, Success, Failure }
import scala.Enumeration
import Coin._
import Treasure._

class AdventureGame {
  def eatenByMonster(t : AdventureGame) = false
  
  def collectCoins(): Try[List[Coin]] = {
    if (eatenByMonster(this)) {
      throw new GameOverException("Ooops")
    }
    return Try(List(Gold, Gold, Silver))
  }
  
  def isTreasureValue(coins : List[Coin]) : Boolean = {
    val coinValue = coins.flatMap(coin => List(coin.id)).sum 
    coinValue < 10
  }
  
  def buyTreasure(coins: List[Coin]): Try[Treasure] = {
    if (isTreasureValue(coins))
      throw new GameOverException("Nice Try!")
    Try(Diamond)
  }
  
}

object AdventureGame extends App {
  val adventure = new AdventureGame()
  val coins: Try[List[Coin]] = adventure.collectCoins
  /*val treasure = coins match {
    case Success(cs) => adventure.buyTreasure(cs)
    case failure @ Failure(t) => failure
  }*/
  //Better way
  val treasure = coins.flatMap(coins => adventure.buyTreasure(coins))
  //Now lets see the result
  treasure match {
    case Success(s) => println("Happy Ending, you got the treasure" + s)
    case Failure(t) => println(t.getMessage())
  }
}