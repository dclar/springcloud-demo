# springcloud-demo

# 0 背景

Spring Cloud的研究过程中的代码记录

# 1 章节

## 1.1 stream-cloud

对于spring cloud stream部分的代码样例，其中MQ的中间件采用kafka。

### 1.1.1 kafka-producer-rest

- 利用RESTful接口发送message，通过spring cloud stream 的binding联通到kafka的topic


### 1.1.2 kafka-consumer

- 通过@StreamListener 接收binding的channel中的数据并进行log打印
