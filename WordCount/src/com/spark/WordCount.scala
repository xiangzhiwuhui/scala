package com.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

/**
 * 使用Scala开发本地测试的Spark WordCount程序
 * 本地指可以在本开发环境中运行。
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    /**
     * 1,创建Spark的配置对象SparkConf，设置Spark程序的运行时的配置信息，例如说通过setMaster来设置程序要链接的
     *   spark集群的master的URL，如果设置为local，则代表spark程序在本地运行，特别适合于机器配置条件非常差的机子
     * */
    val conf = new SparkConf();//创建SparkConf对象
    conf.setAppName("My first Spark App !") //设置应用程序名称，在程序运行的监控界面可以看到名称
    conf.setMaster("local") //指定为local，此时程序在本地运行，不需要安装Spark集群
    
    /**
     * 2,创建SparkContext对象
     *   SparkContext是Spark程序所有功能的唯一入口，无论采用Scala，Java，Python，R等都必须有一个SparkContext
     *   SparkContext核心作用：初始化Spark应用程序运行所有需要的核心组件，包括DAGSchedule,TaskScheduler,SchedulerBackend
     *   同时还会负责Spark程序往Master注册程序等
     *   SparkContext是整个Spark应用程序中最为至关重要的一个对象
     * */
    
    val sc = new SparkContext(conf) //创建SparkContext对象，通过传入SparkConf实例来定制Spark运行
    
    /**
     * 3,根据具体的数据来源（HDFS,HBase, Local,FS,DB,S3等）通过SparkContext来创建RDD
     * RDD的创建基本有三种方式：根据外部的数据来源（例如HDFS），根据Scala集合，由其它的RDD操作产生
     * 数据会被RDD划分成为一系列的Partitions，分配到每个Partition的数据属于一个Task的处理范畴
     * 
     * */
//    val lines: RDD[String] = sc.textFile("D://READ.md", 1) //读取本地文件并设置为一个partition
    val lines = sc.textFile("D://READ.md", 1) //读取本地文件并设置为一个partition
    /**
     * 4,对初始的RDD进行transformation级别的处理，例如map,filter等高阶函数等的编程，来进行具体的数据计算
     *  4.1 将每一行的字符串拆分成单个的单词，
     *  4.2 在单词拆分的基础上对每个单词实例计数为1，也就是wrod => (word, 1)
     *  4.3 在每个单词实例计数为1的基础之上统计每个单词在文件中出现的总次数
     * */
    
    val words = lines.flatMap { line => line.split(" ") } //对每一行的字符串进行单词拆分并把所有行的拆分结果通过flat合并成一个大的单词集合
    
    val pairs = words.map { word => (word, 1) } //在单词拆分的基础上对每个单词实例计数为1，也就是wrod => (word, 1)
    
    val wordCount = pairs.reduceByKey(_ + _) //对相同的key，进行value的累加（包括Local和Reducer级别同时Reduce）
    
    wordCount.foreach(wordNumberPair => println(wordNumberPair._1 + " : " + wordNumberPair._2))
    
    sc.stop()
    
  }
}