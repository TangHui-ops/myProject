CREATE DATABASE cloud_make_money#创建库
USE cloud_make_money #选中库

#创建用户表
CREATE TABLE `user`(
user_id	        INT PRIMARY KEY  AUTO_INCREMENT COMMENT'用户ID',	
user_name       NVARCHAR(20) NOT NULL COMMENT'用户名',
user_username	INT NOT NULL COMMENT'用户账号',
user_pwd	NVARCHAR(16) NOT NULL COMMENT'用户密码',
user_head	NVARCHAR(256) COMMENT'用户头像',
user_type       INT  COMMENT'用户角色',
user_real_name	NVARCHAR(20) COMMENT'真实姓名',
user_id_card	NVARCHAR(18) COMMENT'证件号码',	
user_num	NVARCHAR(11) COMMENT'手机号',
user_zhi	NVARCHAR(20) COMMENT'支付宝',
user_create	DATETIME COMMENT'创建时间',
user_sf	        DECIMAL(10,2)   COMMENT'保证金',
user_balance	DECIMAL(10,2)	COMMENT'余额',
user_wd         DECIMAL(10,2)   COMMENT'提现金额',
user_ex	        INT	COMMENT'经验',
user_state 	INT COMMENT'用户状态'
)COMMENT='用户表';  于博恩，佘立伟，王军，刘万平，蒋勇，李仙，顾楚雄，毛扬坤
INSERT INTO `user` VALUES(0,'于博恩',123456678,'cxz123',NULL,'1','于博恩','235407195106112745','18842466134','18842466134','2020/1/1','200','142','100','43465',1);
INSERT INTO `user` VALUES(0,'佘立伟',842377556,'cxz123',NULL,'2','佘立伟','210203197503102721','13602939847','13602939847','2019/5/8','200','468','100','45635',2);
INSERT INTO `user` VALUES(0,'王军',572645362,'cxz123',NULL,'2','王军','130102196303250459','13309407425','13309407425','2019/2/3','200','456','100','22456',3);
INSERT INTO `user` VALUES(0,'刘万平',575348227,'cxz123',NULL,'2','刘万平','511502199103223189','13376258888','13376258888','2020/5/2','200','846','100','84638',3);
INSERT INTO `user` VALUES(0,'蒋勇',372895637,'cxz123',NULL,'2','蒋勇','431202198811101720','15355239999','15355239999','2020/2/5','200','453','100','38454',1);
INSERT INTO `user` VALUES(0,'李仙',674516728,'cxz123',NULL,'2','李仙','130821199103278829','13526891692','13526891692','2020/8/25','200','453','100','35757',1);
INSERT INTO `user` VALUES(0,'顾楚雄',842133647,'cxz123',NULL,'2','顾楚雄','520323197806058856','15105829147','15105829147','2020/2/2','200','754','100','45783',1);
INSERT INTO `user` VALUES(0,'毛扬坤',472614359,'cxz123',NULL,'2','毛扬坤','350105199506138487','15766737718','15766737718','2020/1/30','200','754','100','53567',2);
SELECT * FROM `user`;
#创建任务类型表

CREATE TABLE mission_type(
mission_type_id	INT  PRIMARY  KEY  AUTO_INCREMENT COMMENT'任务类型ID',
mission_type_name  NVARCHAR(20)	NOT NULL COMMENT'类型名称',
mission_type_picture  NVARCHAR(256)  COMMENT'类型图片'
)COMMENT='任务类型表';
INSERT INTO  mission_type VALUES(0,'最新','');
INSERT INTO  mission_type VALUES(0,'综合','');
INSERT INTO  mission_type VALUES(0,'优先','');
INSERT INTO  mission_type VALUES(0,'人气','');
INSERT INTO  mission_type VALUES(0,'苹果','');
INSERT INTO mission_type VALUES
   (NULL, '投票', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_0.png');
INSERT INTO mission_type VALUES
   (NULL, '关注', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_1.png');
INSERT INTO mission_type VALUES
   (NULL, '浏览', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_2.png');
INSERT INTO mission_type VALUES
   (NULL, '注册', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_3.png');
INSERT INTO mission_type VALUES
   (NULL, '加粉', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_4.png');
INSERT INTO mission_type VALUES
   (NULL, '转发', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_5.png');
INSERT INTO mission_type VALUES
   (NULL, '发帖', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_6.png');
INSERT INTO mission_type VALUES
   (NULL, '评论', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_7.png');
INSERT INTO mission_type VALUES
   (NULL, '高价', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_8.png');
INSERT INTO mission_type VALUES
   (NULL, '特单', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_9.png');
INSERT INTO mission_type VALUES
   (NULL, '长单', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_10.png');
INSERT INTO mission_type VALUES
   (NULL, '电商', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_11.png');
INSERT INTO mission_type VALUES
   (NULL, '其他', 'http://www.aliyunqifu.com/resources/images/antHelp/renwu_logo_12.png');

SELECT * FROM mission_type;


#创建任务设备表
CREATE TABLE sys(
sys_id	INT PRIMARY KEY AUTO_INCREMENT 	COMMENT'设备ID',`mission_type``mission_type``mission_type`
sys_name NVARCHAR(10) COMMENT'设备名称'
)COMMENT='任务设备表';
INSERT INTO sys VALUES(0,'全部');
INSERT INTO sys VALUES(0,'安卓');
INSERT INTO sys VALUES(0,'苹果');
SELECT * FROM sys;
#创建任务表
CREATE TABLE mission(
mission_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'任务ID',
mission_no	INT	 COMMENT'编号',#随机数6位
mission_sys	INT	 COMMENT'设备id',#外键（设备表）
mission_type	INT	 COMMENT'类别id',#外键（类型表）
mission_mana	INT	 COMMENT'用户id',#外键（用户表）
mission_headline  NVARCHAR(50)	NOT NULL COMMENT'标题',
mission_content	NVARCHAR(500)	NOT NULL COMMENT'内容',
mission_step	NVARCHAR(256) 	COMMENT'操作步骤',
mission_st	DATETIME	NOT NULL COMMENT'发布时间',
mission_ct	DATETIME	NOT NULL COMMENT'结算时间',
mission_num	INT	COMMENT'数量',#>=50
mission_money	DECIMAL(10,2)	COMMENT'出价',#>=0.5
mission_all	DECIMAL(10,2)   COMMENT'合计',#	>=1
mission_verify  NVARCHAR(256) COMMENT'备注',
mission_text  NVARCHAR(256) COMMENT'文字验证',
mission_pattern NVARCHAR(500) COMMENT'审核图样',
mission_link NVARCHAR(256) COMMENT'链接'
)COMMENT='任务表';
INSERT INTO mission VALUES(0,432454,1,1,1,'秘乐视频注册','短视频红利来了，每天看5分钟得秘豆，一个秘豆20块',NULL,'2020/5/19','2020/5/31',66,10,580,'test','test','test','test');,
INSERT INTO mission VALUES(0,123456,2,2,2,'番茄自提2元','下载番茄软件小说，下载完了注册福利填写邀请码，可领红包',NULL,'2020/8/1','2020/08/14',50,11,484,'test','test','test','test');
INSERT INTO mission VALUES(0,234567,3,3,3,'淘宝茅台助力','逛天猫超市，强一起抢53度飞天茅台吧',NULL,'2020/5/1','2020/5/20',51,12,538,'test','test','test','test');
INSERT INTO mission VALUES(0,345678,1,4,4,'公众号搜索关注','微信公众号搜索关注，回复就ok截图，3-7天不取消',NULL,'2020/11.1','2020/11.12',52,13,594,'test','test','test','test');
INSERT INTO mission VALUES(0,456789,2,5,5,'简单微信阅读文章任务','每人只能做一次，取消公众号任务无效哦',NULL,'2020/1/1','2020/4/20',53,14,653,'test','test','test','test');
INSERT INTO mission VALUES(0,567891,3,6,6,'悦动购物商场','买东西之前把链接发给省钱助手为你省一大笔钱',NULL,'2020/1/1','2020/5/10',53,15,700,'test','test','test','test');
INSERT INTO mission VALUES(0,678910,3,7,7,'转发粉像生活','填写完整的个人信息扫二维码点击右上角转发',NULL,'2020/4/1','2020/5/20',54,16,760,'test','test','test','test');
INSERT INTO mission VALUES(0,789101,2,8,8,'一秒发帖','顺丰骑士抢单软件，只要坑吃亏一个月挣1w还是很轻松的',NULL,'2020/1/11','2020/1/20',55,17,822,'test','test','test','test');
INSERT INTO mission VALUES(0,891011,1,9,1,'华为应用商店评论','看清图标正确下载带2020的好字样，请不要用无卡手机',NULL,'2020/11/7','2020/11/25',56,18,887,'test','test','test','test');
INSERT INTO mission VALUES(0,910111,1,10,2,'高佣联盟激活','下载安装注册高佣联盟APP，可0元购,购物卷先领劵在购物',NULL,'2020/5/2','2020/5/19',57,19,953,'test','test','test','test');
INSERT INTO mission VALUES(0,121314,3,11,3,'女生三分钟扫码任务','和客服拿码注册三分钟一次每个人的不同完成任务到平台领取奖励',NULL,'2020/5/1','2020/5/8',58,23,1173,'test','test','test','test');
INSERT INTO mission VALUES(0,151617,3,12,4,'简单好章鱼输入法','用章鱼输入法打字就可以赚钱，邀请一个赚32',NULL,'2020/5/1','2020/5/27',59,20,1038,'test','test','test','test');
INSERT INTO mission VALUES(0,181920,2,13,5,'在线审核简单小程序登录','这个小程序主要方便了拼多多和京东购物者',NULL,'2020/1/3','2020/1/27',60,21,1108,'test','test','test','test');
SELECT * FROM mission;
#创建订单记录表
CREATE TABLE trial_log(
trial_id INT  PRIMARY KEY AUTO_INCREMENT COMMENT'任务接受ID',#	主键、自增
mission_id INT COMMENT'任务ID',#	''
user_id INT COMMENT'接受人ID',#	外键（用户表）
trial_t NVARCHAR(65) COMMENT'接收时间',
trial_ct NVARCHAR(65)  COMMENT'完成时间',
audit_id INT COMMENT'任务状态',#（0：是未完成 1：是完成 2：是审核中）
trial_text NVARCHAR(256) COMMENT'备注',
trial_s NVARCHAR(256) COMMENT'完成结果',
mission_type_id INT COMMENT'任务类型'
)COMMENT='任务订单记录表';
INSERT INTO trial_log VALUES(0,1,1,'2020/4/5','2020/4/17',0,'未通过','test',1);
INSERT INTO trial_log VALUES(0,2,2,'2020/4/5','2020/4/13',2,'未通过','test',2);
INSERT INTO trial_log VALUES(0,3,3,'2020/2/5','2020/2/8',1,'通过','test',3);
INSERT INTO trial_log VALUES(0,4,4,'2020/5/5','2020/5/20',2,'未通过','test',4);
INSERT INTO trial_log VALUES(0,5,5,'2020/1/5','2020/1/15',2,'未通过','test',5);
INSERT INTO trial_log VALUES(0,6,6,'2020/3/1','2020/4/5',2,'未通过','test',6);
INSERT INTO trial_log VALUES(0,7,7,'2020/2/6','2020/4/5',1,'通过','test',7);
INSERT INTO trial_log VALUES(0,8,8,'2020/4/3','2020/4/5',0,'未通过','test',8);
INSERT INTO trial_log VALUES(0,9,1,'2020/6/1','2020/4/5',0,'未通过','test',9);
INSERT INTO trial_log VALUES(0,10,2,'2020/4/11','2020/4/5',1,'通过','test',11);
INSERT INTO trial_log VALUES(0,11,3,'2020/1/3','2020/4/5',1,'通过','test',12);
INSERT INTO trial_log VALUES(0,12,4,'2020/3/5','2020/4/5',0,'未通过','test',13);
INSERT INTO trial_log VALUES(0,13,5,'2020/5/4','2020/4/5',2,'未通过','test',1);
INSERT INTO trial_log VALUES(0,14,6,'2020/2/5','2020/4/5',1,'通过','test',3);
SELECT *FROM trial_log;
CREATE TABLE audit_type(
audit_id INT PRIMARY KEY AUTO_INCREMENT COMMENT'类型id',
audit_name NVARCHAR(20) NOT NULL COMMENT'类型名称'
);
INSERT INTO audit_type VALUES(1,'未审核');
INSERT INTO audit_type VALUES(2,'审核中');
INSERT INTO audit_type VALUES(3,'已审核');
INSERT INTO audit_type VALUES(4,'已通过');
INSERT INTO audit_type VALUES(5,'未通过');
SELECT * FROM audit_type;
#创建订单审核表
CREATE TABLE trial_audit(
 trial_audit_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'订单审核ID',
 trial_audit_mission INT COMMENT'任务订单ID',
 trial_audit_p 	INT COMMENT'审核人',
 trial_audit_time DATETIME COMMENT'审核时间',
 trial_audit_r 	INT COMMENT'审核结果'
);
INSERT INTO trial_audit VALUES(0,1,'1','2000/4/5','1');
INSERT INTO trial_audit VALUES(0,2,'2','2000/4/6','2');
SELECT * FROM trial_audit;
CREATE TABLE `send_notice`( 
notice_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '消息推送ID',#主键，自增
notice_time DATETIME    COMMENT '推送时间',
notice_little NVARCHAR(50)    COMMENT '消息标题',
notice_content  NVARCHAR(1024)     COMMENT '消息内容',
notice_user INT    COMMENT '接收人群',
notice_read_time DATETIME   COMMENT '失效时间'
)COMMENT='公告推送表';
INSERT INTO send_notice VALUES(0,'2020/4/5')
CREATE TABLE send_messagetu( 
send_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '消息推送ID',#主键，自增
send_type_id INT    COMMENT '消息类型  0公告  1通知 ',#当前系统时间
send_time DATETIME    COMMENT '推送时间',
send_little NVARCHAR(50)    COMMENT '消息标题',
send_content  NVARCHAR(1024)     COMMENT '消息内容',
send_p INT    COMMENT '推送人',
send_user INT    COMMENT '接收人',
send_isnot INT    COMMENT '是否查看',
send_read_time DATETIME   COMMENT '查看时间',
send_delete INT    COMMENT '是否删除'
)COMMENT='消息推送表';

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
123456678，842377556，572645362，575348227
SELECT * FROM trade;
#创建店铺表
CREATE TABLE store(
store_id   INT	 PRIMARY KEY  AUTO_INCREMENT COMMENT'店铺ID',#主键自增
store_user	INT NOT NULL COMMENT'所属用户',
store_no   INT	 COMMENT'店铺编号',#随机六位数
store_name NVARCHAR(20)	COMMENT'店铺名称'

)COMMENT='店铺表';于博恩，佘立伟，王军，刘万平，蒋勇，李仙，顾楚雄，毛扬坤
INSERT INTO store VALUES(0,1,363256,'于博恩的店铺');
INSERT INTO store VALUES(0,2,536347,'佘立伟的店铺');
INSERT INTO store VALUES(0,3,567264,'王军的店铺');
INSERT INTO store VALUES(0,4,108746,'刘万平的店铺');
INSERT INTO store VALUES(0,5,573836,'蒋勇的店铺');
INSERT INTO store VALUES(0,6,672826,'李仙的店铺');
INSERT INTO store VALUES(0,7,677635,'顾楚雄的店铺');
INSERT INTO store VALUES(0,8,746755,'毛扬坤的店铺');
SELECT * FROM store;
#创建处理类型表
CREATE TABLE after_type(
after_type_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'处理类型ID',#主键自增
after_type_name	NVARCHAR(20) COMMENT'处理类型名称'
)COMMENT='处理类型表';

#创建处理表
CREATE TABLE `after`(
	after_id	INT  PRIMARY KEY AUTO_INCREMENT	COMMENT'处理ID',#主键、自增
	after_type_id	INT	COMMENT'处理类型',#外键（类型表）
	after_store	INT	COMMENT'处理目标',#外键（用户表）
	after_mission	INT	COMMENT'处理目标任务',#外键（任务表）
	after_reason	NVARCHAR(256)	COMMENT'处理原因',
	after_p	        INT	 COMMENT'申请人',#外键（用户表）
	after_time	DATETIME	COMMENT'处理时间',#当前系统时间
	after_ct	DATETIME	COMMENT'处理时间',
	after_dp	INT       COMMENT'处理人',#	外键（用户表）
	after_result	INT	COMMENT'处理结果'

)COMMENT='处理表';

#创建反馈表
CREATE TABLE feedback(
feedback_id INT PRIMARY KEY AUTO_INCREMENT COMMENT'反馈ID',#	主键、自增
feedback_con	NVARCHAR(1024)	COMMENT'反馈内容',
Feedback_img	NVARCHAR(256)	COMMENT'反馈图片',
feedback_p	INT COMMENT'反馈人',#外键（用户表）
feedback_time	DATETIME COMMENT'反馈时间',#	当前系统时间
feedback_state	INT	COMMENT'反馈状态',
feedback_dp	INT	COMMENT'处理人'#外键（用户表）
)COMMENT='反馈表';
INSERT INTO `feedback` VALUES(0,'信息处理错误','','1','2020/4/6','1','4');
INSERT INTO `feedback` VALUES(0,'软件崩溃','','3','2020/3/6','2','1');
INSERT INTO `feedback` VALUES(0,'广告过多','','5','2020/5/5','3','8');
INSERT INTO `feedback` VALUES(0,'异常弹出','','2','2020/4/5','3','4');
INSERT INTO `feedback` VALUES(0,'信息处理不全','','3','2020/4/25','1','4');
INSERT INTO `feedback` VALUES(0,'软件自动关闭','','4','2020/4/11','1','1');
INSERT INTO `feedback` VALUES(0,'下载文件不全','','5','2020/4/1','2','1');
INSERT INTO `feedback` VALUES(0,'信息加载不出','','6','2020/3/26','2','5');
INSERT INTO `feedback` VALUES(0,'容易蓝屏','','7','2020/3/19','3','4');
INSERT INTO `feedback` VALUES(0,'软件自动打开','','4','2020/3/6','1','1');
INSERT INTO `feedback` VALUES(0,'文件容易乱码','','6','2020/3/1','1','4');
INSERT INTO `feedback` VALUES(0,'安装包不全','','6','2020/2/28','3','1');
INSERT INTO `feedback` VALUES(0,'软件安装过程容易出错','','5','2020/2/25','3','1');
INSERT INTO `feedback` VALUES(0,'下载文件容易丢失','','4','2020/2/23','2','3');
INSERT INTO `feedback` VALUES(0,'安装包不完整','','6','2020/2/20','1','4');
INSERT INTO `feedback` VALUES(0,'容易弹窗','','2','2020/2/18','1','3');
INSERT INTO `feedback` VALUES(0,'闪退','','2','2020/2/15','2','3');
INSERT INTO `feedback` VALUES(0,'容易被杀毒软件阻止安装','','6','2020/2/13','2','4');
INSERT INTO `feedback` VALUES(0,'容易卡死','','6','2020/2/10','2','1');
INSERT INTO `feedback` VALUES(0,'容易导致手机自动关机','','5','2020/2/6','3','4');


#用户状态表
CREATE TABLE user_state(
user_state_id	INT  PRIMARY KEY  AUTO_INCREMENT COMMENT'用户账户状态记录ID',#主键、自增
user_id	INT COMMENT'用户',#外键（用户表）
user_s	INT COMMENT'账户状态', #1：正常、2：封停、3：冻结
user_state_date	DATETIME  COMMENT'时间',	#当前系统时间
user_state_dt DATETIME COMMENT'解除时间',
user_state_reason	NVARCHAR(256)	NOT NULL  COMMENT'原因',
user_state_p	INT	COMMENT'操作人'#外键（用户表）
)COMMENT='用户状态记录表';