# Write a scala code to read a csv file and store it in database.
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

val spark = SparkSession.builder().appName("Spark SQL basic example").config("spark.some.config.option", "some-value").getOrCreate()

val schema = StructType(Array(
StructField("ID", IntegerType, true),
StructField("Name", StringType, true),
StructField("age", IntegerType, true),
StructField("No", IntegerType, true),
StructField("city", StringType, true),
StructField("country", StringType, true)))

val df = spark.read.format("csv").option("header", "true").schema(schema).load("file:///C:/Users/DELL/Desktop/scala/emp.csv")

df.show()

df.write.format("jdbc").option("url", "jdbc:mysql://localhost:3306/spark").option("driver", "com.mysql.jdbc.Driver").option("dbtable", "emp").option("user", "root").option("password", "root").save()

# Write a scala code to read a json file and store it in database.
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

val spark = SparkSession.builder().appName("Spark SQL basic example").config("spark.some.config.option", "some-value").getOrCreate()

val df = spark.read.json("file:///C:/Users/DELL/Desktop/scala/emp.json")

df.show()

df.write.format("jdbc").option("url", "jdbc:mysql://localhost:3306/spark").option("driver", "com.mysql.jdbc.Driver").option("dbtable", "emp").option("user", "root").option("password", "root").save()

# Write a scala code to read a parquet file and store it in database.
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

val spark = SparkSession.builder().appName("Spark SQL basic example").config("spark.some.config.option", "some-value").getOrCreate()

val df = spark.read.parquet("file:///C:/Users/DELL/Desktop/scala/emp.parquet")

df.show()

df.write.format("jdbc").option("url", "jdbc:mysql://localhost:3306/spark").option("driver", "com.mysql.jdbc.Driver").option("dbtable", "emp").option("user", "root").option