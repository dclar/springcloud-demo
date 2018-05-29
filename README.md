# springcloud-demo

#  背景

Spring Cloud的研究过程中的代码记录

#  章节

## 1 stream-cloud

对于spring cloud stream部分的代码样例，其中MQ的中间件采用kafka。
在kafka中，为了对spring cloud stream的producer与consumer之间联通，设置一个名称为"test"的topic。

### 1.1 producer

#### 1.1.1 kafka-producer-rest

- 利用RESTful接口发送message，通过spring cloud stream 的binding联通到kafka的topic


#### 1.1.2 kafka-producer-rest-partitioned

- message发送方式同`kafka-producer-rest`，在`application.yml`配置中实现binding的分区

### 1.2 consumer

#### 1.2.1 kafka-consumer

- 通过@StreamListener 接收binding的channel中的数据并进行log打印


