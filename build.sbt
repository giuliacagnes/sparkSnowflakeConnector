name := "testSparkSnowflake"

version := "0.1"

scalaVersion := "2.11.12"
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"
// https://mvnrepository.com/artifact/net.snowflake/spark-snowflake
libraryDependencies += "net.snowflake" %% "spark-snowflake" % "2.5.4-spark_2.4"
// https://mvnrepository.com/artifact/net.snowflake/snowflake-jdbc
libraryDependencies += "net.snowflake" % "snowflake-jdbc" % "3.8.4"