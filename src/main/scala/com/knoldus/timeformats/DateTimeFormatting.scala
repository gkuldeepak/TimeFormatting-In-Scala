package com.knoldus.timeformats

import org.joda.time.DateTime
import java.time.Instant
import java.text.SimpleDateFormat

class DateTimeFormatting {

  def stringToDateTimeConversion(date: String): DateTime = {
    DateTime.parse(date)
  }

  def stringToDateTimeFormatter(date: String) = {
    val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
    simpleDateFormat.parse(date)
  }

  def millisToDate(date: String) = {
    Instant.ofEpochMilli(date.toLong)
  }

  def dateToMillis(date: String) = {
    DateTime.parse(date).getMillis
  }

  def getDate(date: String) = {
    val simpleDateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
    simpleDateFormat.parse(date).getDate
  }

  def getTime(date: String) = {
    val simpleDateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
    simpleDateFormat.parse(date).getTime
  }

  def getMonth(date: String) = {
    val simpleDateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
    simpleDateFormat.parse(date).getMonth
  }

  def getYear(date: String) = {
    val simpleDateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
    simpleDateFormat.parse(date).getYear
  }

  def getZone(date: String) = {
    val simpleDateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
    simpleDateFormat.parse(date).getTimezoneOffset
  }

  def getDay(date: String) = {
    val simpleDateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
    simpleDateFormat.parse(date).getDay match {
      case 0 => "FRIDAY"
      case 1 => "SATURDAY"
      case 2 => "SUNDAY"
      case 3 => "MONDAY"
      case 4 => "TUESDAY"
      case 5 => "WEDNESDAY"
      case 6 => "THURSDAY"
    }
  }


}
