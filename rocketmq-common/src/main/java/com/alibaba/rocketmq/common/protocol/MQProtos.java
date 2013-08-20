// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mq.proto

package com.alibaba.rocketmq.common.protocol;

public final class MQProtos {
    private MQProtos() {
    }

    public enum MQRequestCode {
        // Broker 发送消息
        SEND_MESSAGE(0, 10),
        // Broker 订阅消息
        PULL_MESSAGE(1, 11),
        // Broker 查询消息
        QUERY_MESSAGE(2, 12),
        // Broker 查询Broker Offset
        QUERY_BROKER_OFFSET(3, 13),
        // Broker 查询Consumer Offset
        QUERY_CONSUMER_OFFSET(4, 14),
        // Broker 更新Consumer Offset
        UPDATE_CONSUMER_OFFSET(5, 15),
        // Broker 更新或者增加一个Topic
        UPDATE_AND_CREATE_TOPIC(6, 17),
        // Broker 删除一个Topic，包含数据与配置
        DELETE_TOPIC(7, 19),
        // Broker 获取所有Topic的配置（Slave和Namesrv都会向Master请求此配置）
        GET_ALL_TOPIC_CONFIG(8, 21),
        // Broker 获取所有Topic配置（Slave和Namesrv都会向Master请求此配置）
        GET_TOPIC_CONFIG_LIST(9, 22),
        // Broker 获取所有Topic名称列表
        GET_TOPIC_NAME_LIST(10, 23),
        // Broker 更新Broker上的配置
        UPDATE_BROKER_CONFIG(12, 25),
        // Broker 获取Broker上的配置
        GET_BROKER_CONFIG(13, 26),
        // Broker 触发Broker删除文件
        TRIGGER_DELETE_FILES(14, 27),
        // Broker 获取Broker运行时信息
        GET_BROKER_RUNTIME_INFO(15, 28),
        // Broker 根据时间查询队列的Offset
        SEARCH_OFFSET_BY_TIMESTAMP(16, 29),
        // Broker 查询队列最大Offset
        GET_MAX_OFFSET(17, 30),
        // Broker 查询队列最小Offset
        GET_MIN_OFFSET(18, 31),
        // Broker 查询队列最早消息对应时间
        GET_EARLIEST_MSG_STORETIME(19, 32),
        // Broker 根据消息ID来查询消息
        VIEW_MESSAGE_BY_ID(20, 33),
        // Broker Client向Client发送心跳，并注册自身
        HEART_BEAT(21, 34),
        // Broker Client注销
        UNREGISTER_CLIENT(22, 35),
        // Broker Consumer将处理不了的消息发回服务器
        CONSUMER_SEND_MSG_BACK(23, 36),
        // Broker Commit或者Rollback事务
        END_TRANSACTION(24, 37),
        // Broker 获取ConsumerId列表通过GroupName
        GET_CONSUMER_LIST_BY_GROUP(25, 38),
        // Broker 主动向Producer回查事务状态
        CHECK_TRANSACTION_STATE(26, 39),
        // Broker Broker通知Consumer列表变化
        NOTIFY_CONSUMER_IDS_CHANGED(27, 40),
        // Broker Consumer向Master锁定队列
        LOCK_BATCH_MQ(28, 41),
        // Broker Consumer向Master解锁队列
        UNLOCK_BATCH_MQ(29, 42),
        // Broker 获取所有Consumer Offset
        GET_ALL_CONSUMER_OFFSET(30, 43),
        // Broker 获取所有定时进度
        GET_ALL_DELAY_OFFSET(32, 45),
        // Namesrv 向Namesrv追加KV配置
        PUT_KV_CONFIG(33, 100),
        // Namesrv 从Namesrv获取KV配置
        GET_KV_CONFIG(34, 101),
        // Namesrv 从Namesrv获取KV配置
        DELETE_KV_CONFIG(35, 102),
        // Namesrv 注册一个Broker，数据都是持久化的，如果存在则覆盖配置
        REGISTER_BROKER(36, 103),
        // Namesrv 卸载一个Broker，数据都是持久化的
        UNREGISTER_BROKER(37, 104),
        // Namesrv 根据Topic获取Broker Name、队列数(包含读队列与写队列)
        GET_ROUTEINTO_BY_TOPIC(38, 105),
        // Namesrv 获取注册到Name Server的所有Broker集群信息
        GET_BROKER_CLUSTER_INFO(39, 106),

        // Broker 更新或者增加一个订阅组
        UPDATE_AND_CREATE_SUBSCRIPTIONGROUP(40, 200),
        GET_ALL_SUBSCRIPTIONGROUP_CONFIG(41, 201),

        // 统计信息
        GET_TOPIC_STATS_INFO(42, 202),

        // 获取Consumer连接列表，附带订阅关系
        GET_CONSUMER_CONNECTION_LIST(43, 203),
        // 获取Producer连接列表
        GET_PRODUCER_CONNECTION_LIST(44, 204),

        // 清除Name Server中某个Broker的写权限
        WIPE_WRITE_PERM_OF_BROKER(45, 205),

        // 从Name Server获取完整Topic列表
        GET_ALL_TOPIC_LIST_FROM_NAMESERVER(46, 206),
        // 从Broker删除订阅组
        DELETE_SUBSCRIPTIONGROUP(47, 207),
        // 从Broker获取消费状态（进度）
        GET_CONSUME_STATS(48, 208),
        // Suspend Consumer消费过程
        SUSPEND_CONSUMER(49, 209),
        // Resume Consumer消费过程
        RESUME_CONSUMER(50, 210),
        // 重置Consumer Offset
        RESET_CONSUMER_OFFSET_IN_CONSUMER(51, 211),
        // 重置Consumer Offset
        RESET_CONSUMER_OFFSET_IN_BROKER(52, 212),
        // 调整Consumer线程池数量
        ADJUST_CONSUMER_THREAD_POOL(53, 213),
        // 查询消息被哪些消费组消费
        WHO_CONSUME_THE_MESSAGE(54, 214),
        // 从Broker删除Topic配置
        DELETE_TOPIC_IN_BROKER(55, 215),
        // 从Namesrv删除Topic配置
        DELETE_TOPIC_IN_NAMESRV(56, 216), ;

        // Broker 发送消息
        public static final int SEND_MESSAGE_VALUE = 10;
        // Broker 订阅消息
        public static final int PULL_MESSAGE_VALUE = 11;
        // Broker 查询消息
        public static final int QUERY_MESSAGE_VALUE = 12;
        // Broker 查询Broker Offset
        public static final int QUERY_BROKER_OFFSET_VALUE = 13;
        // Broker 查询Consumer Offset
        public static final int QUERY_CONSUMER_OFFSET_VALUE = 14;
        // Broker 更新Consumer Offset
        public static final int UPDATE_CONSUMER_OFFSET_VALUE = 15;
        // Broker 更新或者增加一个Topic
        public static final int UPDATE_AND_CREATE_TOPIC_VALUE = 17;
        // Broker 删除一个Topic，包含数据与配置
        public static final int DELETE_TOPIC_VALUE = 19;
        // Broker 获取所有Topic的配置（Slave和Namesrv都会向Master请求此配置）
        public static final int GET_ALL_TOPIC_CONFIG_VALUE = 21;
        // Broker 获取所有Topic配置（Slave和Namesrv都会向Master请求此配置）
        public static final int GET_TOPIC_CONFIG_LIST_VALUE = 22;
        // Broker 获取所有Topic名称列表
        public static final int GET_TOPIC_NAME_LIST_VALUE = 23;
        // Broker 更新Broker上的配置
        public static final int UPDATE_BROKER_CONFIG_VALUE = 25;
        // Broker 获取Broker上的配置
        public static final int GET_BROKER_CONFIG_VALUE = 26;
        // Broker 触发Broker删除文件
        public static final int TRIGGER_DELETE_FILES_VALUE = 27;
        // Broker 获取Broker运行时信息
        public static final int GET_BROKER_RUNTIME_INFO_VALUE = 28;
        // Broker 根据时间查询队列的Offset
        public static final int SEARCH_OFFSET_BY_TIMESTAMP_VALUE = 29;
        // Broker 查询队列最大Offset
        public static final int GET_MAX_OFFSET_VALUE = 30;
        // Broker 查询队列最小Offset
        public static final int GET_MIN_OFFSET_VALUE = 31;
        // Broker 查询队列最早消息对应时间
        public static final int GET_EARLIEST_MSG_STORETIME_VALUE = 32;
        // Broker 根据消息ID来查询消息
        public static final int VIEW_MESSAGE_BY_ID_VALUE = 33;
        // Broker Client向Client发送心跳，并注册自身
        public static final int HEART_BEAT_VALUE = 34;
        // Broker Client注销
        public static final int UNREGISTER_CLIENT_VALUE = 35;
        // Broker Consumer将处理不了的消息发回服务器
        public static final int CONSUMER_SEND_MSG_BACK_VALUE = 36;
        // Broker Commit或者Rollback事务
        public static final int END_TRANSACTION_VALUE = 37;
        // Broker 获取ConsumerId列表通过GroupName
        public static final int GET_CONSUMER_LIST_BY_GROUP_VALUE = 38;
        // Broker 主动向Producer回查事务状态
        public static final int CHECK_TRANSACTION_STATE_VALUE = 39;
        // Broker Broker通知Consumer列表变化
        public static final int NOTIFY_CONSUMER_IDS_CHANGED_VALUE = 40;
        // Broker Consumer向Master锁定队列
        public static final int LOCK_BATCH_MQ_VALUE = 41;
        // Broker Consumer向Master解锁队列
        public static final int UNLOCK_BATCH_MQ_VALUE = 42;
        // Broker 获取所有Consumer Offset
        public static final int GET_ALL_CONSUMER_OFFSET_VALUE = 43;
        // Broker 获取所有定时进度
        public static final int GET_ALL_DELAY_OFFSET_VALUE = 45;
        // Namesrv 向Namesrv追加KV配置
        public static final int PUT_KV_CONFIG_VALUE = 100;
        // Namesrv 从Namesrv获取KV配置
        public static final int GET_KV_CONFIG_VALUE = 101;
        // Namesrv 从Namesrv获取KV配置
        public static final int DELETE_KV_CONFIG_VALUE = 102;
        // Namesrv 注册一个Broker，数据都是持久化的，如果存在则覆盖配置
        public static final int REGISTER_BROKER_VALUE = 103;
        // Namesrv 卸载一个Broker，数据都是持久化的
        public static final int UNREGISTER_BROKER_VALUE = 104;
        // Namesrv 根据Topic获取Broker Name、队列数(包含读队列与写队列)
        public static final int GET_ROUTEINTO_BY_TOPIC_VALUE = 105;
        // Namesrv 获取注册到Name Server的所有Broker集群信息
        public static final int GET_BROKER_CLUSTER_INFO_VALUE = 106;
        public static final int UPDATE_AND_CREATE_SUBSCRIPTIONGROUP_VALUE = 200;
        public static final int GET_ALL_SUBSCRIPTIONGROUP_CONFIG_VALUE = 201;
        public static final int GET_TOPIC_STATS_INFO_VALUE = 202;
        public static final int GET_CONSUMER_CONNECTION_LIST_VALUE = 203;
        public static final int GET_PRODUCER_CONNECTION_LIST_VALUE = 204;
        public static final int WIPE_WRITE_PERM_OF_BROKER_VALUE = 205;

        // 从Name Server获取完整Topic列表
        public static final int GET_ALL_TOPIC_LIST_FROM_NAMESERVER_VALUE = 206;
        // 从Broker删除订阅组
        public static final int DELETE_SUBSCRIPTIONGROUP_VALUE = 207;
        // 从Broker获取消费状态（进度）
        public static final int GET_CONSUME_STATS_VALUE = 208;
        // Suspend Consumer消费过程
        public static final int SUSPEND_CONSUMER_VALUE = 209;
        // Resume Consumer消费过程
        public static final int RESUME_CONSUMER_VALUE = 210;
        // 重置Consumer Offset
        public static final int RESET_CONSUMER_OFFSET_IN_CONSUMER_VALUE = 211;
        // 重置Consumer Offset
        public static final int RESET_CONSUMER_OFFSET_IN_BROKER_VALUE = 212;
        // 调整Consumer线程池数量
        public static final int ADJUST_CONSUMER_THREAD_POOL_VALUE = 213;
        // 查询消息被哪些消费组消费
        public static final int WHO_CONSUME_THE_MESSAGE_VALUE = 214;

        // 从Broker删除Topic配置
        public static final int DELETE_TOPIC_IN_BROKER_VALUE = 215;
        // 从Namesrv删除Topic配置
        public static final int DELETE_TOPIC_IN_NAMESRV_VALUE = 216;

        private final int index;
        private final int value;


        private MQRequestCode(int index, int value) {
            this.index = index;
            this.value = value;
        }


        public static MQRequestCode valueOf(int value) {
            switch (value) {
            case 10:
                return SEND_MESSAGE;
            case 11:
                return PULL_MESSAGE;
            case 12:
                return QUERY_MESSAGE;
            case 13:
                return QUERY_BROKER_OFFSET;
            case 14:
                return QUERY_CONSUMER_OFFSET;
            case 15:
                return UPDATE_CONSUMER_OFFSET;
            case 17:
                return UPDATE_AND_CREATE_TOPIC;
            case 19:
                return DELETE_TOPIC;
            case 21:
                return GET_ALL_TOPIC_CONFIG;
            case 22:
                return GET_TOPIC_CONFIG_LIST;
            case 23:
                return GET_TOPIC_NAME_LIST;
            case 25:
                return UPDATE_BROKER_CONFIG;
            case 26:
                return GET_BROKER_CONFIG;
            case 27:
                return TRIGGER_DELETE_FILES;
            case 28:
                return GET_BROKER_RUNTIME_INFO;
            case 29:
                return SEARCH_OFFSET_BY_TIMESTAMP;
            case 30:
                return GET_MAX_OFFSET;
            case 31:
                return GET_MIN_OFFSET;
            case 32:
                return GET_EARLIEST_MSG_STORETIME;
            case 33:
                return VIEW_MESSAGE_BY_ID;
            case 34:
                return HEART_BEAT;
            case 35:
                return UNREGISTER_CLIENT;
            case 36:
                return CONSUMER_SEND_MSG_BACK;
            case 37:
                return END_TRANSACTION;
            case 38:
                return GET_CONSUMER_LIST_BY_GROUP;
            case 39:
                return CHECK_TRANSACTION_STATE;
            case 40:
                return NOTIFY_CONSUMER_IDS_CHANGED;
            case 41:
                return LOCK_BATCH_MQ;
            case 42:
                return UNLOCK_BATCH_MQ;
            case 43:
                return GET_ALL_CONSUMER_OFFSET;
            case 45:
                return GET_ALL_DELAY_OFFSET;
            case 100:
                return PUT_KV_CONFIG;
            case 101:
                return GET_KV_CONFIG;
            case 102:
                return DELETE_KV_CONFIG;
            case 103:
                return REGISTER_BROKER;
            case 104:
                return UNREGISTER_BROKER;
            case 105:
                return GET_ROUTEINTO_BY_TOPIC;
            case 106:
                return GET_BROKER_CLUSTER_INFO;

            case 200:
                return UPDATE_AND_CREATE_SUBSCRIPTIONGROUP;
            case 201:
                return GET_ALL_SUBSCRIPTIONGROUP_CONFIG;
            case 202:
                return GET_TOPIC_STATS_INFO;

            case 203:
                return GET_CONSUMER_CONNECTION_LIST;
            case 204:
                return GET_PRODUCER_CONNECTION_LIST;
            case 205:
                return WIPE_WRITE_PERM_OF_BROKER;

            case 206:
                return GET_ALL_TOPIC_LIST_FROM_NAMESERVER;
            case 207:
                return DELETE_SUBSCRIPTIONGROUP;
            case 208:
                return GET_CONSUME_STATS;
            case 209:
                return SUSPEND_CONSUMER;
            case 210:
                return RESUME_CONSUMER;
            case 211:
                return RESET_CONSUMER_OFFSET_IN_CONSUMER;
            case 212:
                return RESET_CONSUMER_OFFSET_IN_BROKER;
            case 213:
                return ADJUST_CONSUMER_THREAD_POOL;
            case 214:
                return WHO_CONSUME_THE_MESSAGE;
            case 215:
                return DELETE_TOPIC_IN_BROKER;
            case 216:
                return DELETE_TOPIC_IN_NAMESRV;
            default:
                return null;
            }
        }


        public int getIndex() {
            return index;
        }


        public final int getNumber() {
            return value;
        }
    }

    public enum MQResponseCode {
        // Broker 刷盘超时
        FLUSH_DISK_TIMEOUT(0, 10),
        // Broker 同步双写，Slave不可用
        SLAVE_NOT_AVAILABLE(1, 11),
        // Broker 同步双写，等待Slave应答超时
        FLUSH_SLAVE_TIMEOUT(2, 12),
        // Broker 消息非法
        MESSAGE_ILLEGAL(3, 13),
        // Broker, Namesrv 服务不可用，可能是正在关闭或者权限问题
        SERVICE_NOT_AVAILABLE(4, 14),
        // Broker, Namesrv 版本号不支持
        VERSION_NOT_SUPPORTED(5, 15),
        // Broker, Namesrv 无权限执行此操作，可能是发、收、或者其他操作
        NO_PERMISSION(6, 16),
        // Broker, Topic不存在
        TOPIC_NOT_EXIST(7, 17),
        // Broker, Topic已经存在，创建Topic
        TOPIC_EXIST_ALREADY(8, 18),
        // Broker 拉消息未找到（请求的Offset等于最大Offset，最大Offset无对应消息）
        PULL_NOT_FOUND(9, 19),
        // Broker 可能被过滤，或者误通知等
        PULL_RETRY_IMMEDIATELY(10, 20),
        // Broker 拉消息请求的Offset不合法，太小或太大
        PULL_OFFSET_MOVED(11, 21),
        // Broker 查询消息未找到
        QUERY_NOT_FOUND(12, 22),
        // Broker 订阅关系解析失败
        SUBSCRIPTION_PARSE_FAILED(13, 23),
        // Broker 订阅关系不存在
        SUBSCRIPTION_NOT_EXIST(14, 24),
        // Broker 订阅关系不是最新的
        SUBSCRIPTION_NOT_LATEST(15, 25),
        // Broker 订阅组不存在
        SUBSCRIPTION_GROUP_NOT_EXIST(16, 26),
        // Producer 事务应该被提交
        TRANSACTION_SHOULD_COMMIT(17, 200),
        // Producer 事务应该被回滚
        TRANSACTION_SHOULD_ROLLBACK(18, 201),
        // Producer 事务状态未知
        TRANSACTION_STATE_UNKNOW(19, 202),
        // Producer ProducerGroup错误
        TRANSACTION_STATE_GROUP_WRONG(20, 203), ;
        // Broker 刷盘超时
        public static final int FLUSH_DISK_TIMEOUT_VALUE = 10;
        // Broker 同步双写，Slave不可用
        public static final int SLAVE_NOT_AVAILABLE_VALUE = 11;
        // Broker 同步双写，等待Slave应答超时
        public static final int FLUSH_SLAVE_TIMEOUT_VALUE = 12;
        // Broker 消息非法
        public static final int MESSAGE_ILLEGAL_VALUE = 13;
        // Broker, Namesrv 服务不可用，可能是正在关闭或者权限问题
        public static final int SERVICE_NOT_AVAILABLE_VALUE = 14;
        // Broker, Namesrv 版本号不支持
        public static final int VERSION_NOT_SUPPORTED_VALUE = 15;
        // Broker, Namesrv 无权限执行此操作，可能是发、收、或者其他操作
        public static final int NO_PERMISSION_VALUE = 16;
        // Broker, Topic不存在
        public static final int TOPIC_NOT_EXIST_VALUE = 17;
        // Broker, Topic已经存在，创建Topic
        public static final int TOPIC_EXIST_ALREADY_VALUE = 18;
        // Broker 拉消息未找到（请求的Offset等于最大Offset，最大Offset无对应消息）
        public static final int PULL_NOT_FOUND_VALUE = 19;
        // Broker 可能被过滤，或者误通知等
        public static final int PULL_RETRY_IMMEDIATELY_VALUE = 20;
        // Broker 拉消息请求的Offset不合法，太小或太大
        public static final int PULL_OFFSET_MOVED_VALUE = 21;
        // Broker 查询消息未找到
        public static final int QUERY_NOT_FOUND_VALUE = 22;
        // Broker 订阅关系解析失败
        public static final int SUBSCRIPTION_PARSE_FAILED_VALUE = 23;
        // Broker 订阅关系不存在
        public static final int SUBSCRIPTION_NOT_EXIST_VALUE = 24;
        // Broker 订阅关系不是最新的
        public static final int SUBSCRIPTION_NOT_LATEST_VALUE = 25;
        // Broker 订阅组不存在
        public static final int SUBSCRIPTION_GROUP_NOT_EXIST_VALUE = 26;
        // Producer 事务应该被提交
        public static final int TRANSACTION_SHOULD_COMMIT_VALUE = 200;
        // Producer 事务应该被回滚
        public static final int TRANSACTION_SHOULD_ROLLBACK_VALUE = 201;
        // Producer 事务状态未知
        public static final int TRANSACTION_STATE_UNKNOW_VALUE = 202;
        // Producer ProducerGroup错误
        public static final int TRANSACTION_STATE_GROUP_WRONG_VALUE = 203;
        private final int index;
        private final int value;


        private MQResponseCode(int index, int value) {
            this.index = index;
            this.value = value;
        }


        public static MQResponseCode valueOf(int value) {
            switch (value) {
            case 10:
                return FLUSH_DISK_TIMEOUT;
            case 11:
                return SLAVE_NOT_AVAILABLE;
            case 12:
                return FLUSH_SLAVE_TIMEOUT;
            case 13:
                return MESSAGE_ILLEGAL;
            case 14:
                return SERVICE_NOT_AVAILABLE;
            case 15:
                return VERSION_NOT_SUPPORTED;
            case 16:
                return NO_PERMISSION;
            case 17:
                return TOPIC_NOT_EXIST;
            case 18:
                return TOPIC_EXIST_ALREADY;
            case 19:
                return PULL_NOT_FOUND;
            case 20:
                return PULL_RETRY_IMMEDIATELY;
            case 21:
                return PULL_OFFSET_MOVED;
            case 22:
                return QUERY_NOT_FOUND;
            case 23:
                return SUBSCRIPTION_PARSE_FAILED;
            case 24:
                return SUBSCRIPTION_NOT_EXIST;
            case 25:
                return SUBSCRIPTION_NOT_LATEST;
            case 26:
                return SUBSCRIPTION_GROUP_NOT_EXIST;
            case 200:
                return TRANSACTION_SHOULD_COMMIT;
            case 201:
                return TRANSACTION_SHOULD_ROLLBACK;
            case 202:
                return TRANSACTION_STATE_UNKNOW;
            case 203:
                return TRANSACTION_STATE_GROUP_WRONG;
            default:
                return null;
            }
        }


        public final int getNumber() {
            return value;
        }


        public int getIndex() {
            return index;
        }
    }
}
