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
    coins.flatMap(coin => List(coin.id)).sum > 5
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
}