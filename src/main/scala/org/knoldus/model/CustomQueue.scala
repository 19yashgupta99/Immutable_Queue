package org.knoldus.model


class CustomQueue[A](referredQueue: List[A] = Nil){
  val queue : List[A] = referredQueue
  def enqueue(key : A): CustomQueue[A]={
    new CustomQueue[A](queue ::: List(key))
  }
  def dequeue(): CustomQueue[A]={
    new CustomQueue[A](queue.drop(1))
  }

}
