package edu.knoldus.modules.entities

import edu.knoldus.modules.utilities.Color

/**
 * Created by manjot on 2/2/18.
 */
class ColoredPoint(override val x: Int, override val y: Int, val color: Color.Value)
  extends Point(x, y) {
  override def hashCode: Int = (super.hashCode, color).##

  override def equals(other: Any): Boolean = {
    other match {
      case that: ColoredPoint =>
        (this.color == that.color) && super.equals(that)
      case _ => false
    }
  }

  override def canEqual(other: Any): Boolean = {
    other.isInstanceOf[ColoredPoint]
  }
}

