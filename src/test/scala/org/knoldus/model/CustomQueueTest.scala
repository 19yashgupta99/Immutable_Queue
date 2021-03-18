package org.knoldus.model

import org.scalatest.flatspec.AsyncFlatSpec

class CustomQueueTest extends AsyncFlatSpec{

  it should "add an element to the Integer type queue and return a queue containing that element" in {
    val customQueue = new CustomQueue[Int]
    val updatedQueue = customQueue.enqueue(25)
    assert(updatedQueue.queue.contains(25))
  }

  it should "delete an existing element" in{
    val customQueue = new CustomQueue[Int]
    val updatedQueue = customQueue.enqueue(25)
    val updatedQueue1 = updatedQueue.dequeue()
    assert(!updatedQueue1.queue.contains(25))
  }

}
