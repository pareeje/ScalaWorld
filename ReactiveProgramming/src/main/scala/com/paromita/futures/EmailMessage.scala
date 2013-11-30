package com.paromita.futures

import scala.util.{ Try, Success, Failure }
import scala.concurrent.duration._
import scala.util.Random
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

class EmailMessage {

  val msgs = List("Msg1", "Msg2", "Msg3", "Msg4", "Msg5", "Msg6", "Msg7", "Msg8")
  def readMessage(idx: Int): Future[String] = {
    Thread.sleep(2)
    Future(msgs(idx))
  }
  def sendMessage(msg: String): Future[Boolean] = {
    Thread.sleep(10000)
    Future(msgs.contains(msg))
  }
}

object EmailMessage extends App {
  val email = new EmailMessage()
  email.readMessage(3) onComplete {
    case Success(s) => println("Recieved msg = " + s)
    case Failure(t) => println("Failed to recieve msg")
  }

  email.sendMessage("Msg10") onComplete {
    case Success(s) => println("Success send of msg")
    case Failure(t) => println("Failed to send msg")
  }
  
  email.readMessage(10) onComplete {
    case Success(s) => println("Recieved msg = " + s)
    case Failure(t) => println("Failed to recieve msg")
  }

  email.sendMessage("Msg1") onComplete {
    case Success(s) => println("Success send of msg")
    case Failure(t) => println("Failed to send msg")
  }
}