DROP DATABASE IF EXISTS smdatabase;
CREATE DATABASE smdatabase DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
use smdatabase;


DROP TABLE IF EXISTS `admi`;
CREATE TABLE `admi` (
  `Admi_id` char(10) NOT NULL,
  `Admi_name` char(20) NOT NULL,
  `Admi_account` char(10) NOT NULL,
  `Admi_pwd` char(10) NOT NULL,
  PRIMARY KEY (`Admi_id`),
  UNIQUE KEY `管理员账号` (`Admi_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `admi` VALUES ('1', '库斯里', 'root', '123');
INSERT INTO `admi` VALUES ('2', '阿夫', '1002', '123');
INSERT INTO `admi` VALUES ('3', '瓦龙', '1003', '123');


DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `Commodity_id` varchar(40) NOT NULL,
  `Commodity_name` varchar(20) DEFAULT NULL,
  `Category _numbe` char(20) NOT NULL,
  `Commodity_type` varchar(20) DEFAULT NULL,
  `Commodity_price` int(11) DEFAULT NULL,
  `Production_address` varchar(40) DEFAULT NULL,
  `Remarks_information` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Commodity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `commodity` VALUES ('10001', '牙刷', 'ys_01', '生活用品', '12', '上海', '巨能刷');
INSERT INTO `commodity` VALUES ('10002', '毛巾', 'mj_01', '生活用品', '10', '江苏', '耐用');
INSERT INTO `commodity` VALUES ('10003', '泡面', 'pm_01', '食品', '5', '台湾', '耐吃');
INSERT INTO `commodity` VALUES ('10004', '牛奶', 'nn_01', '食品', '5', '内蒙古', '好奶');
INSERT INTO `commodity` VALUES ('10005', '橙汁', 'cz_01', '食品', '4', '漳州', '饮料');
INSERT INTO `commodity` VALUES ('10006', '篮球', 'lq_01', '体育用品', '99', '义乌', '好球');
INSERT INTO `commodity` VALUES ('10007', '足球', 'zq_01', '体育用品', '80', '义乌', '好球');
INSERT INTO `commodity` VALUES ('10008', '排球', 'pq_01', '体育用品', '80', '义乌', '好球');
INSERT INTO `commodity` VALUES ('10009', '高尔夫球', 'grf__01', '体育用品', '80', '义乌', '好球');


DROP TABLE IF EXISTS `commodity_category`;
CREATE TABLE `commodity_category` (
  `Category _number` char(20) NOT NULL,
  `Commodity_type` char(20) NOT NULL,
  `Category_description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Category _number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `commodity_category` VALUES ('cz_01', '食品', null);
INSERT INTO `commodity_category` VALUES ('lq_01', '体育用品', null);
INSERT INTO `commodity_category` VALUES ('mj_01', '休闲食品', '洗漱');
INSERT INTO `commodity_category` VALUES ('nn_01', '食品', null);
INSERT INTO `commodity_category` VALUES ('pm_01', '饼干糕点', '食品');
INSERT INTO `commodity_category` VALUES ('sd_02', '饮料', null);
INSERT INTO `commodity_category` VALUES ('ws_02', '保健品', null);
INSERT INTO `commodity_category` VALUES ('ys_01', '糖果', '洗漱');
INSERT INTO `commodity_category` VALUES ('zq_01', '体育用品', null);


DROP TABLE IF EXISTS `commodity_inventory`;
CREATE TABLE `commodity_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Commodity_id` varchar(40) NOT NULL,
  `Commodity_name` varchar(20) DEFAULT NULL,
  `Category _number` char(20) NOT NULL,
  `Commodity_type` varchar(20) DEFAULT NULL,
  `Purchase_price` int(11) DEFAULT NULL,
  `Inventory_quantity` int(11) DEFAULT NULL,
  `Total_inventory_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Commodity_id` (`Commodity_id`),
  KEY `Category _number` (`Category _number`),
  CONSTRAINT `commodity_inventory_ibfk_1` FOREIGN KEY (`Commodity_id`) REFERENCES `commodity` (`Commodity_id`),
  CONSTRAINT `commodity_inventory_ibfk_2` FOREIGN KEY (`Category _number`) REFERENCES `commodity_category` (`Category _number`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


INSERT INTO `commodity_inventory` VALUES ('1', '10001', '牙刷', 'ys_01', '生活用品', '8', '100', '800');
INSERT INTO `commodity_inventory` VALUES ('2', '10002', '毛巾', 'mj_01', '生活用品', '5', '100', '500');
INSERT INTO `commodity_inventory` VALUES ('3', '10003', '泡面', 'pm_01', '食品', '3', '100', '300');
INSERT INTO `commodity_inventory` VALUES ('4', '10004', '牛奶', 'nn_01', '食品', '4', '100', '400');
INSERT INTO `commodity_inventory` VALUES ('5', '10005', '橙汁', 'cz_01', '食品', '3', '200', '600');
INSERT INTO `commodity_inventory` VALUES ('6', '10006', '篮球', 'lq_01', '体育用品', '50', '20', '1000');
INSERT INTO `commodity_inventory` VALUES ('7', '10007', '足球', 'zq_01', null, null, null, null);


DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `Emp_id` char(10) NOT NULL,
  `Emp_name` char(20) NOT NULL,
  `Emp_account` char(10) DEFAULT NULL,
  `Emp_pwd` char(10) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `addres` varchar(50) DEFAULT NULL,
  `phone` char(15) DEFAULT NULL,
  PRIMARY KEY (`Emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `emp` VALUES ('1011', '李相赫', 'lx', '123456', '男', '首尔', '1321321');
INSERT INTO `emp` VALUES ('1012', '诺言', 'ny', '123456', '男', '上海', '123213');
INSERT INTO `emp` VALUES ('1013', '李逵', 'lk', '123456', '男', '梁山', '123213');


DROP TABLE IF EXISTS `emp_sale`;
CREATE TABLE `emp_sale` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `Emp_id` char(10) NOT NULL,
  `Emp_name` char(20) NOT NULL,
  `Commodity_id` varchar(40) NOT NULL,
  `Commodity_name` varchar(20) DEFAULT NULL,
  `Commodity_type` varchar(20) DEFAULT NULL,
  `Commodity_price` decimal(10,2) DEFAULT NULL,
  `Number` int(11) DEFAULT NULL,
  `Selling_time` date DEFAULT NULL,
  `Total_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `e_sa_com` (`Commodity_id`),
  KEY `Emp_id` (`Emp_id`),
  CONSTRAINT `emp_sale_ibfk_1` FOREIGN KEY (`Commodity_id`) REFERENCES `commodity` (`Commodity_id`),
  CONSTRAINT `emp_sale_ibfk_2` FOREIGN KEY (`Emp_id`) REFERENCES `emp` (`Emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;


INSERT INTO `emp_sale` VALUES ('1', '1011', '李相赫', '10001', '牙刷', '生活用品', '12.00', '10', '2019-12-24', null);
INSERT INTO `emp_sale` VALUES ('2', '1012', '诺言', '10001', '牙刷', '生活用品', '12.00', '20', '2019-12-23', null);
INSERT INTO `emp_sale` VALUES ('3', '1011', '李相赫', '10001', '牙刷', '生活用品', '123.00', '12', '2019-12-24', null);
INSERT INTO `emp_sale` VALUES ('4', '1013', '李逵', '10002', '毛巾', '生活用品', '10.00', '5', '2019-12-26', null);
INSERT INTO `emp_sale` VALUES ('5', '1013', '李逵', '10003', '泡面', '食品', '5.00', '5', '2019-12-26', null);
INSERT INTO `emp_sale` VALUES ('6', '1013', '李逵', '10002', '毛巾', '生活用品', '10.00', '6', '2019-12-26', null);
INSERT INTO `emp_sale` VALUES ('7', '1012', '诺言', '10002', '毛巾', '生活用品', '10.00', '5', '2019-12-25', null);
INSERT INTO `emp_sale` VALUES ('8', '1013', '李逵', '10002', '毛巾', '生活用品', '10.00', '10', '2019-12-26', null);
INSERT INTO `emp_sale` VALUES ('9', '1013', '李逵', '10002', '毛巾', '生活用品', '10.00', '10', '2019-12-26', null);
INSERT INTO `emp_sale` VALUES ('10', '1013', '李逵', '10002', '毛巾', '生活用品', '10.00', '10', '2019-12-26', null);
INSERT INTO `emp_sale` VALUES ('11', '1011', '李相赫', '10002', '毛巾', '生活用品', '10.00', '10', '2019-12-26', null);
INSERT INTO `emp_sale` VALUES ('12', '1012', '诺言', '10002', '毛巾', '生活用品', '10.00', '10', '2019-12-26', null);




DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `Supplier_id` char(10) NOT NULL,
  `Supplier_name` varchar(100) DEFAULT NULL,
  `Organization_code` char(20) NOT NULL,
  `Contacts` char(20) DEFAULT NULL,
  `Contact_number` char(15) DEFAULT NULL,
  `Corporate_representative` char(20) DEFAULT NULL,
  `EMAIL` char(30) DEFAULT NULL,
  PRIMARY KEY (`Supplier_id`),
  UNIQUE KEY `
机构代码` (`Organization_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `supplier` VALUES ('2001', '星光生活', 'XG01', '李大海', '13800001111', '李大海', '');
INSERT INTO `supplier` VALUES ('2002', '康帅傅', 'KSF01', '康帅', '17888888888', '康帅', '');
INSERT INTO `supplier` VALUES ('2003', '梦牛', 'MN01', '牛大力', '17888889999', '牛大力', '');
INSERT INTO `supplier` VALUES ('2004', '奈克', 'NK01', '杨树', '17876543210', '杨树', null);

DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Commodity_id` varchar(40) NOT NULL,
  `Commodity_name` varchar(20) DEFAULT NULL,
  `Supplier_id` char(10) NOT NULL,
  `Purchase_time` date DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `Number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Commodity_id` (`Commodity_id`),
  KEY `Supplier_id` (`Supplier_id`),
  CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`Commodity_id`) REFERENCES `commodity` (`Commodity_id`),
  CONSTRAINT `purchase_ibfk_2` FOREIGN KEY (`Supplier_id`) REFERENCES `supplier` (`Supplier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

INSERT INTO `purchase` VALUES ('1', '10001', '牙刷', '2001', '2019-12-24', '8.00', '100');
INSERT INTO `purchase` VALUES ('2', '10002', '毛巾', '2001', '2019-12-24', '5.00', '30');
INSERT INTO `purchase` VALUES ('4', '10001', '毛巾', '2001', '2000-10-12', '8.00', '11');
INSERT INTO `purchase` VALUES ('5', '10001', '毛巾', '2001', '2000-10-18', '5.00', '11');
INSERT INTO `purchase` VALUES ('6', '10001', '牛奶', '2001', '2000-10-10', '5.00', '11');
INSERT INTO `purchase` VALUES ('7', '10001', '毛巾', '2001', '2000-10-12', '10.00', '11');
INSERT INTO `purchase` VALUES ('8', '10001', '毛巾', '2001', '2000-10-13', '99.00', '11');
INSERT INTO `purchase` VALUES ('9', '10001', '毛巾', '2001', '2000-10-26', '11.00', '11');


DROP TABLE IF EXISTS `return_goods`;
CREATE TABLE `return_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Commodity_id` varchar(40) NOT NULL,
  `Commodity_name` varchar(20) DEFAULT NULL,
  `Supplier_id` char(10) NOT NULL,
  `Return_time` date DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `Number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Commodity_id` (`Commodity_id`),
  KEY `Supplier_id` (`Supplier_id`),
  CONSTRAINT `return_goods_ibfk_1` FOREIGN KEY (`Commodity_id`) REFERENCES `commodity` (`Commodity_id`),
  CONSTRAINT `return_goods_ibfk_2` FOREIGN KEY (`Supplier_id`) REFERENCES `supplier` (`Supplier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

INSERT INTO `return_goods` VALUES ('1', '10001', '牙刷', '2001', '2019-12-24', '8.00', '50');
INSERT INTO `return_goods` VALUES ('2', '10002', '毛巾', '2001', '2019-12-24', '5.00', '20');
INSERT INTO `return_goods` VALUES ('5', '10001', '毛巾', '2001', '2019-12-25', '5.00', '10');
INSERT INTO `return_goods` VALUES ('6', '10001', '牙刷', '2001', '2019-12-25', '5.00', '2');
INSERT INTO `return_goods` VALUES ('7', '10002', '毛巾', '2001', '2019-12-24', '5.00', '20');
INSERT INTO `return_goods` VALUES ('8', '10002', '毛巾', '2001', '2019-12-26', '5.00', '20');

