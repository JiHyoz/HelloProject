package com.zsz;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

/**
 * @Title: CustomerDemo
 * @Author zhushouzheng
 * @Package com.zsz
 * @Date 2024/11/12 23:23
 * @Description: CustomerDemo
 */
public class CustomerDemo {

    public static void main(String[] args) {
        // 1.构建KafkaCustomer
        Consumer consumer = buildCustomer();

        // 2.设置主题
        consumer.subscribe(Arrays.asList("HelloWorld"));

        // 3.接受消息
        try {
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(500);
                System.out.println("customer Message---");
                for (ConsumerRecord<String, String> record : records)

                    // print the offset,key and value for the consumer records.
                    System.out.printf("offset = %d, key = %s, value = %s\n",
                            record.offset(), record.key(), record.value());
            }
        } finally {
            // 4.关闭消息
            consumer.close();
        }


    }
    public static Consumer buildCustomer() {
        Properties props = new Properties();
        // bootstrap.servers是Kafka集群的IP地址。多个时,使用逗号隔开
        props.put("bootstrap.servers", "localhost:9092");
        // 消费者群组
        props.put("group.id", "test");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("session.timeout.ms", "30000");
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer
                <String, String>(props);

        return consumer;
    }
}
