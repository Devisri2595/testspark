package com.kumaranBroadridge.main

import org.apache.spark.sql.SparkSession
import com.kumaranBroadrige.common.CommonProps

/**
 * Hello world!
 *
 */
object App extends App {
  
  val spark = CommonProps.sparkSession
  
  val input = spark.sparkContext.parallelize(List(1,2,3,45,6,7,89))
  
  val output = input.map { x => x+1 }
  
  output.collect().foreach { println }
  
}
