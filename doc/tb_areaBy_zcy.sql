create table `tb_area`(
  `area_id` int(2) not null auto_increment,
  `area_name` varchar(200) not null,
  `priority` int(2) not null default '0',
  `create_time` datetime default null,
  `last_edit_time` datetime default null,
  primary key (`area_id`),
  unique key `UK_AREA`(`area_name`)  
)ENGINE=InnoDB AUTO_INCREMENT=1 DAFAULT CHARSET = utf-8;