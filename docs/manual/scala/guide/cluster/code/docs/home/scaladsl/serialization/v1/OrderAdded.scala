/*
 * Copyright (C) 2016-2019 Lightbend Inc. <https://www.lightbend.com>
 */
package docs.home.scaladsl.serialization.v1

import com.lightbend.lagom.scaladsl.playjson.{JsonMigration, JsonMigrations, JsonSerializerRegistry, JsonSerializer}

import scala.collection.immutable.Seq

//#rename-class
case class OrderAdded(shoppingCartId: String)
//#rename-class

