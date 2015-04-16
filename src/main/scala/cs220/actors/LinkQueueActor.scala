package cs220.actors

import scala.collection.mutable.Queue
import scala.collection.mutable.Set
import akka.actor.{Actor, ActorRef, ActorLogging}

/**
 * The `LinkQueueActor` is responsible for queuing links to be fetched by
 * a `FetchActor`. The `FetchActor` will communicate with this actor to
 * get the next link to fetch. We limit the number of links fetched to an
 * arbitrary total of 500 - after which this actor will shutdown the actor
 * system.
 */
class LinkQueueActor(parseQueue: ActorRef) extends Actor with ActorLogging {
  // We have provided some definitions below which will help you with
  // you implementation. You are welcome to modify these, however, this
  // is what we used for our implementation.
  val queue        = Queue[String]()
  val fetchers     = Set[ActorRef]()
  var limit        = 500

  def receive = {
    // TODO
    ???
  }

}
