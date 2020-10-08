package com.reconda.streaming

import com.mongodb.casbah.{MongoClient, MongoClientURI}
import redis.clients.jedis.Jedis

object ConnHelper extends Serializable{
  lazy val jedis = new Jedis("localhost")
  lazy val mongoClient = MongoClient( MongoClientURI("mongodb://localhost:27017/recommender") )

}
