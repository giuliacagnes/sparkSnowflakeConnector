import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
import net.snowflake.spark.snowflake.Utils.SNOWFLAKE_SOURCE_NAME

object sparkSnowflakeConnector extends sfCredentials with App{
    println("spark snowflake connector program started ...")
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession.builder
      .master("local")
      .appName("spark snowflake connector")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")
  //  val SNOWFLAKE_SOURCE_NAME = "net.snowflake.spark.snowflake"

  val df = spark.read
    .format(SNOWFLAKE_SOURCE_NAME)
    .options(sfOptions)
    .option("dbtable", "ITEMS")
    .load().cache

  df.printSchema

  println("snowflake table:")
  println("***************")

  df.show(false)

  println("writing ECLIPSE_TABLE to snowflake....")
  df.write
    .format(SNOWFLAKE_SOURCE_NAME)
    .options(sfOptions)
    .option("dbtable", "SPARK_SNOWFLAKE_TABLE")
    .mode("overwrite")
    .save()
}
