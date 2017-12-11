use db_aidu_info;

CREATE TABLE `tb_sellers` (
      `seller_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '商户ID',
      `seller_name` varchar(50) NOT NULL COMMENT '商户店名',
      `sales` int(10) NOT NULL COMMENT '月销量',
      `min_price` int(10) NOT NULL COMMENT '起送价',
      `reach_time` int(10) NOT NULL DEFAULT '0' COMMENT '送达时间',
      PRIMARY KEY (`seller_id`),
      KEY `列 1` (`seller_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='商户表';
	
	INSERT INTO tb_sellers
VALUES
(1,'爱渡饮品',200,0,30);