package org.knoldus.implementation

import org.knoldus.model.CustomQueue

object CustomQueueImplementation {
  def main(args: Array[String]): Unit = {
    val customQueueObject = new CustomQueue[Int]

    val newCustomQueueObject1 = customQueueObject.enqueue(25)
    val newCustomQueueObject2 = newCustomQueueObject1.enqueue(56)
    val newCustomQueueObject3 = newCustomQueueObject2.enqueue(65)

    println(newCustomQueueObject3.queue)

    val newCustomQueueObject4 = newCustomQueueObject3.dequeue()

    println(newCustomQueueObject4.queue)

  }

}
