CREATE DATABASE make_money#创建库
USE make_money #选中库

#创建角色表
CREATE TABLE role(
role_Id  INT PRIMARY KEY  AUTO_INCREMENT COMMENT'角色id',
role_name NVARCHAR(10) NOT NULL COMMENT'角色名称'

)COMMENT='角色表';


#创建用户表
CREATE TABLE `user`(
user_id	        INT PRIMARY KEY  AUTO_INCREMENT COMMENT'用户ID',	
user_name       NVARCHAR(20)	NOT NULL   COMMENT'用户名',
user_type       INT  COMMENT'用户角色id',
user_real_name	NVARCHAR(20) COMMENT'真实姓名',
user_id_card	NVARCHAR(18) COMMENT'证件号码',	
user_num	NVARCHAR(11) COMMENT'手机号',
user_zhi        NVARCHAR(18) COMMENT'支付宝',
user_create	DATETIME COMMENT'创建时间',
user_sf	        DECIMAL(10,2)   COMMENT'保证金',
user_balance	DECIMAL(10,2)	COMMENT'余额',
user_wd         DECIMAL(10,2)   COMMENT'提现金额',
user_ex	        INT	COMMENT'经验'
)COMMENT='用户表';


#创建任务类型表
CREATE TABLE mission_type(
mission_type_id	INT  PRIMARY  KEY  AUTO_INCREMENT COMMENT'任务类型ID',
mission_type_name  NVARCHAR(20)	NOT NULL COMMENT'类型名称'
)COMMENT='任务类型表';

#创建任务设备表
CREATE TABLE sys(
sys_id	INT PRIMARY KEY AUTO_INCREMENT 	COMMENT'设备ID',
sys_name NVARCHAR(10) COMMENT'设备名称'
)COMMENT='任务设备表';


#创建任务表
CREATE TABLE mission(
mission_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'任务ID',
mission_no	INT	 COMMENT'编号',#随机数6位
mission_sys	INT	 COMMENT'设备id',#外键（设备表）
mission_type	INT	 COMMENT'类别id',#外键（类型表）
mission_mana	INT	 COMMENT'用户id',#外键（用户表）
mission_headline  NVARCHAR(50)	NOT NULL COMMENT'标题',
mission_content	NVARCHAR(500)	NOT NULL COMMENT'内容',
mission_st	DATETIME	NOT NULL COMMENT'发布时间',
mission_ct	DATETIME	NOT NULL COMMENT'结算时间',
mission_num	INT	COMMENT'数量',#>=50
mission_money	DECIMAL(10,2)	COMMENT'出价',#>=0.5
mission_all	DECIMAL(10,2)   COMMENT'合计'#	>=1
)COMMENT='任务表';

#创建订单记录表
CREATE TABLE trial_log(
trial_id INT  PRIMARY KEY AUTO_INCREMENT COMMENT'任务接受ID',#	主键、自增
mission_id INT COMMENT'任务ID',#	外键（任务表）
user_id INT COMMENT'接受人ID',#	外键（用户表）
trial_t DATETIME COMMENT'接收时间',	
trial_ct DATETIME COMMENT'完成时间',	
trial_state INT COMMENT'任务状态',#（0：是未完成 1：是完成 2：是审核中）
trail_p	 NVARCHAR(20) COMMENT'审核人',
trial_s  NVARCHAR(256) COMMENT'完成结果'
)COMMENT='任务订单记录表';

#创建消息类型表
CREATE TABLE message_type(
type_id	INT  PRIMARY KEY AUTO_INCREMENT COMMENT'消息类型ID',#	主键、自增
type_name NVARCHAR(20)	NOT NULL COMMENT'类型名称'
)COMMENT='消息类型表';

#创建消息推送表
CREATE TABLE send_message(
send_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'推送消息ID' ,#主键、自增
send_type_id	INT COMMENT'消息类型ID', #外键（消息类型表）
send_time	DATETIME  COMMENT'推送时间',#当前系统时间
send_little	NVARCHAR(50) COMMENT'消息标题',	
send_content	NVARCHAR(1024)	COMMENT'消息内容',
send_p	INT	COMMENT'推送人',#外键（用户表）
send_user	INT  COMMENT'接收人'	#外键（用户表）
)COMMENT='消息推送表';

#创建消息阅读表
#CREATE TABLE read_message(
#read_id	INT PRIMARY KEY AUTO_INCREMENT	COMMENT'消息阅读ID',#主键、自增
#read_send_id	INT COMMENT'消息id',#外键（消息推送表）
#read_p	INT	COMMENT'阅读人' #外键（用户表）
#)COMMENT='消息阅读表';


#创建反馈表
CREATE TABLE feedback(
feedback_id INT PRIMARY KEY AUTO_INCREMENT COMMENT'反馈ID',#	主键、自增
feedback_con	NVARCHAR(1024)	COMMENT'反馈内容',
feedback_p	INT COMMENT'反馈人',#外键（用户表）
feedback_time	DATETIME COMMENT'反馈时间',#	当前系统时间
feedback_state	INT	COMMENT'反馈状态',
feedback_dp	INT	COMMENT'处理人'#外键（用户表）
)COMMENT='反馈表';

#创建交易类型表
CREATE TABLE trade_type(
trade_type_id	INT  PRIMARY KEY AUTO_INCREMENT COMMENT'交易类型ID',#	主键、自增
trade_type_name	NVARCHAR(20)	COMMENT'交易类型名称'
)COMMENT='交易类型表';

#创建交易方式类型表
CREATE TABLE trade_pattern(
trade_pattern_ID INT  PRIMARY KEY AUTO_INCREMENT COMMENT'交易方式ID',#主键、自增
trade_pattern_name NVARCHAR(20)	COMMENT'交易方式名称'
)COMMENT='交易方式类型表';
 
#创建交易表
CREATE TABLE trade(
 	trade_ID	INT  PRIMARY KEY AUTO_INCREMENT COMMENT'交易ID',#主键、自增
	trade_type	INT	COMMENT'交易类型',#外键（交易类型表）
	trade_pattern	INT	COMMENT'交易方式',#外键（交易方式表）
	trade_money  DECIMAL(10,2)	COMMENT'交易金额',
	trade_p	        INT     COMMENT'交易人',# 外键（用户表）
	trade_time    DATETIME  COMMENT'交易时间'#当前系统时间
)COMMENT='交易表';



#创建店铺表
CREATE TABLE store(
store_id   INT	 PRIMARY KEY  AUTO_INCREMENT COMMENT'店铺ID',#主键自增
store_no   INT	 COMMENT'店铺编号',#随机六位数
store_name NVARCHAR(20)	COMMENT'店铺名称',
user_id    INT	 COMMENT'用户id',#外连接（用户表）
store_ex   INT	 COMMENT'店铺经验'
)COMMENT='店铺表';

#创建处理类型表
CREATE TABLE after_type(
after_type_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'处理类型ID',#主键自增
after_type_name	NVARCHAR(20) COMMENT'处理类型名称'
)COMMENT='处理类型表';


#创建处理表
CREATE TABLE `after`(
	after_id	INT  PRIMARY KEY AUTO_INCREMENT	COMMENT'处理ID',#主键、自增
	after_type_id	INT	COMMENT'处理类型',#外键（类型表）
	after_userid	INT	COMMENT'处理目标',#外键（用户表）
	after_mission	INT	COMMENT'处理目标任务',#外键（任务表）
	after_reason	NVARCHAR(256)	COMMENT'处理原因',
	after_p	        INT	 COMMENT'申请人',#外键（用户表）
	after_time	DATETIME	COMMENT'处理时间',#当前系统时间
	after_ct	DATETIME	COMMENT'处理时间',
	after_dp	INT       COMMENT'处理人',#	外键（用户表）
	after_result	NVARCHAR(256)	COMMENT'处理结果'

)COMMENT='处理表';


#用户状态表
CREATE TABLE user_state(

user_state_id	INT  PRIMARY KEY  AUTO_INCREMENT COMMENT'用户账户状态记录ID',#主键、自增
user_id	INT COMMENT'用户',#外键（用户表）
user_s	INT COMMENT'账户状态', #1：正常、2：封停、3：冻结
user_state_date	DATETIME  COMMENT'时间',	#当前系统时间
user_state_reason	NVARCHAR(256)	NOT NULL  COMMENT'原因',
user_state_p	INT	COMMENT'操作人'#外键（用户表）

)COMMENT='用户状态记录表';


#主外连接
 ALTER TABLE `user` ADD CONSTRAINT fk_user_role  FOREIGN KEY(user_type)REFERENCES role(role_id);
 
 ALTER TABLE mission ADD CONSTRAINT fk_mission_mission_type  FOREIGN KEY(mission_type)REFERENCES mission_type(mission_type_id);
 ALTER TABLE mission ADD CONSTRAINT fk_mission_sys FOREIGN KEY(mission_sys)REFERENCES sys(sys_id);
 ALTER TABLE mission ADD CONSTRAINT fk_mission_user FOREIGN KEY(mission_mana) REFERENCES `user`(user_id);
 
 
 ALTER TABLE trial_log ADD CONSTRAINT fk_trial_log_mission FOREIGN KEY(mission_id) REFERENCES mission(mission_id);
 ALTER TABLE trial_log ADD CONSTRAINT fk_trial_log_user FOREIGN KEY(user_id) REFERENCES `user`(user_id);



 ALTER TABLE send_message ADD CONSTRAINT fk_send_message_message_type FOREIGN KEY(send_type_id) REFERENCES message_type(type_id);
 ALTER TABLE send_message ADD CONSTRAINT fk_send_message_user_p FOREIGN KEY(send_p) REFERENCES `user`(user_id);
 ALTER TABLE send_message ADD CONSTRAINT fk_send_message_user_j FOREIGN KEY(send_user) REFERENCES `user`(user_id);


 ALTER TABLE read_message ADD CONSTRAINT fk_read_message_send_message FOREIGN KEY(read_send_id) REFERENCES send_message(send_id);
 ALTER TABLE read_message ADD CONSTRAINT fk_read_message_user FOREIGN KEY(read_p) REFERENCES `user`(user_id);

 ALTER TABLE feedback ADD CONSTRAINT fk_feedback_user_p FOREIGN KEY(feedback_p) REFERENCES `user`(user_id);
 ALTER TABLE feedback ADD CONSTRAINT fk_feedback_user_dp FOREIGN KEY(feedback_dp) REFERENCES `user`(user_id);
 

 ALTER TABLE trade ADD CONSTRAINT fk_trade_trade_type FOREIGN KEY(trade_type)REFERENCES trade_type(trade_type_id);
 ALTER TABLE trade ADD CONSTRAINT fk_trade_trade_pattern FOREIGN KEY(trade_pattern) REFERENCES trade_pattern(trade_pattern_ID);
 ALTER TABLE trade ADD CONSTRAINT fk_trade_trade_user FOREIGN KEY(trade_p) REFERENCES `user`(user_id);


 ALTER TABLE store ADD CONSTRAINT fk_store_user FOREIGN KEY(user_id) REFERENCES `user`(user_id);

 ALTER TABLE `after` ADD CONSTRAINT fk_after_after_type FOREIGN KEY(after_type_id) REFERENCES after_type(after_type_id);
 ALTER  TABLE `after` ADD CONSTRAINT fk_after_user_id FOREIGN KEY(after_userid) REFERENCES `user`(user_id);
 ALTER TABLE `after` ADD CONSTRAINT fk_after_mission FOREIGN KEY(after_mission) REFERENCES mission(mission_id);
 ALTER TABLE  `after` ADD CONSTRAINT fk_after_user_p FOREIGN KEY(after_p) REFERENCES `user`(user_id);
 ALTER TABLE  `after` ADD CONSTRAINT fk_after_user_dp FOREIGN KEY(after_dp) REFERENCES `user`(user_id);
 ALTER TABLE user_state ADD CONSTRAINT fk_user_state_user  FOREIGN KEY(user_id)REFERENCES `user`(user_id);
ALTER TABLE user_state ADD CONSTRAINT fk_user_state_user_p  FOREIGN KEY(user_state_p)REFERENCES `user`(user_id);