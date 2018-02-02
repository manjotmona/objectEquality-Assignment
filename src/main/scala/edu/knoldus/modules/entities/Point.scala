package edu.knoldus.modules.entities

/**
 * Created by manjot on 2/2/18.
 */
class Point(val x: Int, val y: Int) {
  override def hashCode: Int = (x, y).##

  override def equals(that: Any): Boolean = {
    that match {
      case point: Point => (point canEqual this) && this.x == point.x && this.y == point.y
      case _ => false
    }
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Point]
}
