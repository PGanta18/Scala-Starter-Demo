package com.myhome.learnings

import org.apache.spark.sql.SparkSession
import org.apache.spark.storage.StorageLevel


object MainApp extends App {

  //val logger = Logger(getClass.getName)

  //System.setProperty("hadoop.home.dir", "/");

val spark = SparkSession.builder().appName("Test")
    .master("local[*]")
    .getOrCreate();

  println("Spark session initialized")

  val dataset = spark.read.option("header",true).csv("/Users/pganta/Desktop/Scala-Starter-Demo/src/main/scala/com/myhome/resources/Customer.csv").persist(StorageLevel.MEMORY_ONLY)

  println("##### DATASET CONTENTS ########")
  dataset.show(false)

  val account = spark.read.option("header",true).csv("/Users/pganta/Desktop/Scala-Starter-Demo/src/main/scala/com/myhome/resources/Account.csv").persist(StorageLevel.MEMORY_ONLY)


  val joinedDf = dataset.join(account,"AccountNumber")

  joinedDf.show(false)





}
