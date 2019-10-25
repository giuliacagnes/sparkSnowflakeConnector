## Spark-Snowflake Connector 

![spark](http://www.bigdatauniversity.com.br/c4x/BDUPT/BD095PT/asset/bdu-course-apache-spark.jpg)

### Introduction

This is a Scala project to show how the connector of Spark and Snowflake works, using Sbt for dependencies. The goal is to read a table through Spark's application from Snowflake and overwrite it on Snowflake in another table.

### Requisites

   - Apache Spark
   - Scala
   - Sbt
   - Snowflake 
   - Git
   - IntelliJ( optional: any other IDE is ok ) 

### Installing

Clone the repository:
```
$ git clone git@github.com:giuliacagnes/sparkSnowflakeConnector.git
$ cd sparkSnowflakeConnector
```
### Usage

*important note* remember to check the dependecies inside sbt to see better read this :https://docs.snowflake.net/manuals/user-guide/spark-connector-install.html

1. Import project on IDE 
2. Change credential with your snowflake's user and password
3. Build the project  [![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
4. Run the project
5. Check inside Snowflake if the table is there. 

![Snowflake](https://pbs.twimg.com/profile_images/1146105019575312384/gKDFnnCi_400x400.jpg)

### Author

    Giulia Cagnes - @GiuliaCagnes
