package edu.knoldus

import scala.collection.immutable.HashSet

import edu.knoldus.modules.entities.{ColoredPoint, Point}
import edu.knoldus.modules.utilities.Color
import org.apache.log4j.Logger

/**
 * Created by manjot on 2/2/18.
 */
object Application {
  def main(args: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass)
    val firstPoint = new Point(1, 2)
    val secondPoint = new Point(1, 2)
    val thirdPoint = new Point(3, 2)
    val anonymousSubClass = new Point(1, 1) {override val y = 2 }
    val redColoredPoint = new ColoredPoint(1, 2, Color.Red)
    val blueColoredPoint = new ColoredPoint(1, 2, Color.Blue)
    //Reflexive
    log.info("\nReflexive: \n ")
    log.info(secondPoint == secondPoint)
    log.info("\n")
    //Null
    log.info("\nNull: \n ")
    log.info(secondPoint == null)
    log.info("\n")
    //Symmetry
    log.info("\nSymmetry:\n")
    log.info("\nFor two Equal Points:\n")
    log.info(firstPoint == secondPoint)
    log.info("\n")
    log.info(secondPoint == firstPoint)
    log.info("\n")
    log.info("\nFor two non Equal Points:\n")
    log.info(firstPoint == thirdPoint)
    log.info("\n")
    log.info(thirdPoint == firstPoint)
    log.info("\n")
    //Transitivity
    log.info("\nTransitivity: \n")
    log.info(firstPoint == redColoredPoint)
    log.info("\n")
    log.info(firstPoint == blueColoredPoint)
    log.info("\n")
    log.info(redColoredPoint == blueColoredPoint)
    log.info("\n")
    //Anonymous class
    log.info("\nFor an anonymous sub-class:\n")
    log.info(firstPoint == anonymousSubClass)
    log.info("\n")
    log.info("\nHashCode:\n")
    val hashSet = HashSet(firstPoint)
    log.info(hashSet contains secondPoint)
  }
}
