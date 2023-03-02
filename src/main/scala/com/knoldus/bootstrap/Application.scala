package com.knoldus.bootstrap

import com.knoldus.timeformats.DateTimeFormatting
import org.joda.time.DateTime

object Application extends App {

  val dateTimeFormatting = new DateTimeFormatting

  val currentTime = DateTime.now().toString
  println(dateTimeFormatting.stringToDateTimeConversion(currentTime))
  println(dateTimeFormatting.stringToDateTimeFormatter(currentTime))
  println(dateTimeFormatting.dateToMillis(currentTime))
  println(dateTimeFormatting.getTime(currentTime))
  println(dateTimeFormatting.getZone(currentTime))
  println(dateTimeFormatting.getDay(currentTime))

}
