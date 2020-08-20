CREATE DATABASE make_money#创建库
USE make_money #选中库

#创建管理员表
CREATE TABLE `admin`(
admin_id	INT PRIMARY KEY  AUTO_INCREMENT COMMENT'管理员ID',
admin_username	INT NOT NULL COMMENT'管理员账号',
admin_pwd	NVARCHAR(16) NOT NULL COMMENT'管理员密码',
admin_name	INT NOT NULL COMMENT'管理员编号',
admin_n		NVARCHAR(20) NOT NULL COMMENT'管理员名称',
admin_id_card	NVARCHAR(18) NOT NULL COMMENT'管理员证件号码'
);
INSERT INTO `admin` VALUES(0,123,'cxz123',1,'张三','237462863746382225');







SELECT * FROM admin;
#创建用户表
CREATE TABLE `user`(
user_id	        INT PRIMARY KEY  AUTO_INCREMENT COMMENT'用户ID',	
user_name       NVARCHAR(20) NOT NULL COMMENT'用户名',
user_username	INT NOT NULL COMMENT'用户账号',
user_pwd	NVARCHAR(16) NOT NULL COMMENT'用户密码',
user_head	NVARCHAR(256) COMMENT'用户头像',
user_type       INT  COMMENT'用户角色id',
user_real_name	NVARCHAR(20) COMMENT'真实姓名',
user_id_card	NVARCHAR(18) COMMENT'证件号码',	
user_num	NVARCHAR(11) COMMENT'手机号',
user_create	DATETIME COMMENT'创建时间',
user_sf	        DECIMAL(10,2)   COMMENT'保证金',
user_balance	DECIMAL(10,2)	COMMENT'余额',
user_wd         DECIMAL(10,2)   COMMENT'提现金额',
user_ex	        INT	COMMENT'经验',
user_state 	INT COMMENT'用户状态'
)COMMENT='用户表';
SELECT * FROM `user`;
INSERT INTO `user` VALUES(0,'爱对方空间','1','于博恩','235407195106112745','18842466134','18842466134','2020/1/1','200','142','100','43465',1);

INSERT INTO `user` VALUES(0,'佘立伟','2','佘立伟','210203197503102721','13602939847','13602939847','2019/5/8','200','468','100','45635',2);
INSERT INTO `user` VALUES(0,'王军','2','王军','130102196303250459','13309407425','13309407425','2019/2/3','200','456','100','22456',3);
INSERT INTO `user` VALUES(0,'刘万平','1','刘万平','511502199103223189','13376258888','13376258888','2020/5/2','200','846','100','84638',3);
INSERT INTO `user` VALUES(0,'蒋勇','2','蒋勇','431202198811101720','15355239999','15355239999','2020/2/5','200','453','100','38454',1);
INSERT INTO `user` VALUES(0,'李仙','2','李仙','130821199103278829','13526891692','13526891692','2020/8/25','200','453','100','35757',1);
INSERT INTO `user` VALUES(0,'顾楚雄','2','顾楚雄','520323197806058856','15105829147','15105829147','2020/2/2','200','754','100','45783',1);
INSERT INTO `user` VALUES(0,'毛扬坤','2','毛扬坤','350105199506138487','15766737718','15766737718','2020/1/30','200','754','100','53567',2);
INSERT INTO `user` VALUES(0,'白澜馨','2','白澜馨','610729197408202551','13458849899','13458849899','2020/3/13','200','247','100','54785',1);
INSERT INTO `user` VALUES(0,'王静泽','2','王静泽','820000195008115837','13707404219','13707404219','2020/2/9','200','125','100','13683',3);
INSERT INTO `user` VALUES(0,'佘婉','2','佘婉','450101197405207446','13508440560','13508440560','2020/1/3','200','434','100','13464',2);
INSERT INTO `user` VALUES(0,'欧阳文靖','2','欧阳文靖','411626198204167401','13636150005','13636150005','2020/5/13','200','643','100','35673',1);
INSERT INTO `user` VALUES(0,'乔小德','1','乔小德','654022197901228286','13191519143','13191519143','2020/3/9','200','532','100','39586',1);
INSERT INTO `user` VALUES(0,'李兰','2','李兰','152224198908049211','15298479999','15298479999','2020/3/13','200','342','100','48576',1);
INSERT INTO `user` VALUES(0,'王珂','2','王珂','230822197201256034','15647551324','15647551324','2020/3/30','200','242','100','10238',1);
INSERT INTO `user` VALUES(0,'朱颜芩','2','朱颜芩','110101198808085638','15222939155','15222939155','2020/3/18','200','122','100','37485',1);
INSERT INTO `user` VALUES(0,'朱丽萍','2','朱丽萍','110101198808082111','13849717689','13849717689','2020/3/1','200','132','100','39435',1);
INSERT INTO `user` VALUES(0,'唐雨','2','唐雨','110101198808087975','13508440560','13508440560','2020/8/3','200','321','100','38475',1);
INSERT INTO `user` VALUES(0,'易亦艺','2','易亦艺','110101198808088812','13636150005','13636150005','2020/6/8','200','535','100','23233',1);
INSERT INTO `user` VALUES(0,'韩歆彤','2','韩歆彤','110101198808082007','15617558003','15617558003','2020/6/4','200','566','100','22334',1);
#创建任务类型表
CREATE TABLE mission_type(
mission_type_id	INT  PRIMARY  KEY  AUTO_INCREMENT COMMENT'任务类型ID',
mission_type_name  NVARCHAR(20)	NOT NULL COMMENT'类型名称'
)COMMENT='任务类型表';
SELECT * FROM mission_type;

INSERT INTO  mission_type VALUES(0,'注册');
INSERT INTO  mission_type VALUES(0,'投票');
INSERT INTO  mission_type VALUES(0,'关注');
INSERT INTO  mission_type VALUES(0,'浏览');
INSERT INTO  mission_type VALUES(0,'加粉');
INSERT INTO  mission_type VALUES(0,'转发');
INSERT INTO  mission_type VALUES(0,'发帖');
INSERT INTO  mission_type VALUES(0,'评论');
INSERT INTO  mission_type VALUES(0,'高价');
INSERT INTO  mission_type VALUES(0,'特单');
INSERT INTO  mission_type VALUES(0,'长单');
INSERT INTO  mission_type VALUES(0,'电商');
INSERT INTO  mission_type VALUES(0,'其他');
#创建任务设备表
CREATE TABLE sys(
sys_id	INT PRIMARY KEY AUTO_INCREMENT 	COMMENT'设备ID',
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
mission_all	DECIMAL(10,2)   COMMENT'合计'#	>=1
)COMMENT='任务表';
SELECT * FROM mission;

INSERT INTO mission VALUES(0,432454,1,1,1,'秘乐视频注册','短视频红利来了，每天看5分钟得秘豆，一个秘豆20块','','2020/5/19','2020/5/31',66,10,580);
INSERT INTO mission VALUES(0,123456,2,2,2,'番茄自提2元','下载番茄软件小说，下载完了注册福利填写邀请码，可领红包','','2020/8/1','2020/08/14',50,11,484);
INSERT INTO mission VALUES(0,234567,3,3,3,'淘宝茅台助力','逛天猫超市，强一起抢53度飞天茅台吧','','2020/5/1','2020/5/20',51,12,538);
INSERT INTO mission VALUES(0,345678,1,4,4,'公众号搜索关注','微信公众号搜索关注，回复就ok截图，3-7天不取消','','2020/11.1','2020/11.12',52,13,594);
INSERT INTO mission VALUES(0,456789,2,5,5,'简单微信阅读文章任务','每人只能做一次，取消公众号任务无效哦','','2020/1/1','2020/4/20',53,14,653);
INSERT INTO mission VALUES(0,567891,3,6,6,'悦动购物商场','买东西之前把链接发给省钱助手为你省一大笔钱','','2020/1/1','2020/5/10',53,15,700);
INSERT INTO mission VALUES(0,678910,3,7,7,'转发粉像生活','填写完整的个人信息扫二维码点击右上角转发','','2020/4/1','2020/5/20',54,16,760);
INSERT INTO mission VALUES(0,789101,2,8,8,'一秒发帖','顺丰骑士抢单软件，只要坑吃亏一个月挣1w还是很轻松的','','2020/1/11','2020/1/20',55,17,822);
INSERT INTO mission VALUES(0,891011,1,9,9,'华为应用商店评论','看清图标正确下载带2020的好字样，请不要用无卡手机','','2020/11/7','2020/11/25',56,18,887);
INSERT INTO mission VALUES(0,910111,1,10,10,'高佣联盟激活','下载安装注册高佣联盟APP，可0元购,购物卷先领劵在购物','','2020/5/2','2020/5/19',57,19,953);
INSERT INTO mission VALUES(0,121314,3,11,11,'女生三分钟扫码任务','和客服拿码注册三分钟一次每个人的不同完成任务到平台领取奖励','','2020/5/1','2020/5/8',58,23,1173);
INSERT INTO mission VALUES(0,151617,3,12,12,'简单好章鱼输入法','用章鱼输入法打字就可以赚钱，邀请一个赚32','','2020/5/1','2020/5/27',59,20,1038);
INSERT INTO mission VALUES(0,181920,2,13,13,'在线审核简单小程序登录','这个小程序主要方便了拼多多和京东购物者','','2020/1/3','2020/1/27',60,21,1108);

DROP TABLE  mission;
#创建订单记录表
CREATE TABLE trial_log(
trial_id INT  PRIMARY KEY AUTO_INCREMENT COMMENT'任务接受ID',#	主键、自增
mission_id INT COMMENT'任务ID',#	外键（任务表）
user_id INT COMMENT'接受人ID',#	外键（用户表）
trial_t DATETIME COMMENT'接收时间',	
trial_state INT COMMENT'任务状态',#（0：是未完成 1：是完成 2：是审核中）
trial_text NVARCHAR(256) COMMENT'备注'
)COMMENT='任务订单记录表';

INSERT INTO trial_log VALUES(0,1,1,'2020/4/5',0,'通过');
INSERT INTO trial_log VALUES(0,2,2,'2020/4/5',2,'未通过');
INSERT INTO trial_log VALUES(0,3,3,'2020/2/5',1,'通过');
INSERT INTO trial_log VALUES(0,4,4,'2020/5/5',2,'通过');
INSERT INTO trial_log VALUES(0,5,5,'2020/1/5',2,'未通过');
INSERT INTO trial_log VALUES(0,6,6,'2020/3/1',2,'通过');
INSERT INTO trial_log VALUES(0,7,7,'2020/2/6',1,'未通过');
INSERT INTO trial_log VALUES(0,8,8,'2020/4/3',0,'未通过');
INSERT INTO trial_log VALUES(0,9,9,'2020/6/1',0,'未通过');
INSERT INTO trial_log VALUES(0,10,10,'2020/4/11',1,'通过');
INSERT INTO trial_log VALUES(0,11,11,'2020/1/3',1,'通过');
INSERT INTO trial_log VALUES(0,12,12,'2020/3/5',0,'未通过');
INSERT INTO trial_log VALUES(0,13,13,'2020/5/4',2,'通过');
INSERT INTO trial_log VALUES(0,14,14,'2020/2/5',1,'未通过');
SELECT * FROM trial_log;
CREATE TABLE audit_type(
audit_id INT PRIMARY KEY AUTO_INCREMENT COMMENT'类型id',
audit_name NVARCHAR(20) NOT NULL COMMENT'类型名称'
);
INSERT INTO audit_type VALUES(0,'审核中');
INSERT INTO audit_type VALUES(0,'已通过');
INSERT INTO audit_type VALUES(0,'未通过');
SELECT * FROM audit_type;
#创建订单审核表
CREATE TABLE trial_audit(
 trial_audit_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'订单审核ID',
 trial_audit_mission INT COMMENT'任务订单ID',
 trial_audit_p 	INT COMMENT'审核人',
 trial_audit_time DATETIME COMMENT'审核时间',
 trial_audit_r 	INT COMMENT'审核结果'
);
INSERT INTO trial_audit VALUES(0,1,1,'2020/6/2',1);
INSERT INTO trial_audit VALUES(0,2,1,'2020/6/2',2);
INSERT INTO trial_audit VALUES(0,3,1,'2020/6/2',3);
SELECT * FROM trial_audit;

#创建交易类型表
CREATE TABLE trade_type(
trade_type_id	INT  PRIMARY KEY AUTO_INCREMENT COMMENT'交易类型ID',#	主键、自增
trade_type_name	NVARCHAR(20)	COMMENT'交易类型名称'
)COMMENT='交易类型表';
SELECT * FROM trade_type;
INSERT INTO trade_type VALUES(0,'第三方软件交易');
#创建交易方式类型表
CREATE TABLE trade_pattern(
trade_pattern_ID INT  PRIMARY KEY AUTO_INCREMENT COMMENT'交易方式ID',#主键、自增
trade_pattern_name NVARCHAR(20)	COMMENT'交易方式名称'
)COMMENT='交易方式类型表';
  INSERT INTO trade_pattern VALUES(0,'支付宝交易');
  SELECT * FROM trade_pattern;
#创建交易表
CREATE TABLE trade(
 	trade_ID	INT  PRIMARY KEY AUTO_INCREMENT COMMENT'交易ID',#主键、自增
	trade_type	INT	COMMENT'交易类型',#外键（交易类型表）
	trade_pattern	INT	COMMENT'交易方式',#外键（交易方式表）
	trade_money  DECIMAL(10,2)	COMMENT'交易金额',
	trade_p	        INT     COMMENT'交易人',# 外键（用户表）
	trade_time    DATETIME  COMMENT'交易时间'#当前系统时间
)COMMENT='交易表';


INSERT INTO trade VALUES(0,'1','2','123','1','2020/12/28');
INSERT INTO trade VALUES(0,'1','1','234','2','2021/1/1');
INSERT INTO trade VALUES(0,'1','2','345','3','2022/2/3');
INSERT INTO trade VALUES(0,'1','2','456','4','2018/11/30');
INSERT INTO trade VALUES(0,'1','2','456','5','2023/10/7');
INSERT INTO trade VALUES(0,'1','2','23','6','2021/10/23');
INSERT INTO trade VALUES(0,'1','2','24','7','2017/11/13');
INSERT INTO trade VALUES(0,'1','2','435','8','2016/3/23');
INSERT INTO trade VALUES(0,'1','2','368','9','2021/4/11');
INSERT INTO trade VALUES(0,'1','2','6573','10','2018/9/5');
INSERT INTO trade VALUES(0,'1','2','7258','11','2015/11/16');

SELECT * FROM trade;
#创建店铺表
CREATE TABLE store(
store_id   INT	 PRIMARY KEY  AUTO_INCREMENT COMMENT'店铺ID',#主键自增
store_user	INT NOT NULL COMMENT'所属用户',
store_no   INT	 COMMENT'店铺编号',#随机六位数
store_name NVARCHAR(20)	COMMENT'店铺名称'

)COMMENT='店铺表';
SELECT * FROM store;

INSERT INTO store VALUES(0,'123470','1','番茄');
INSERT INTO store VALUES(0,'985465','12','天街');
INSERT INTO store VALUES(0,'854253','4','咕咕乐');
INSERT INTO store VALUES(0,'227254','3','拼多多');
INSERT INTO store VALUES(0,'537533','6','知乎');
INSERT INTO store VALUES(0,'437373','7','闲鱼');
INSERT INTO store VALUES(0,'916915','14','神猫侠侣');
INSERT INTO store VALUES(0,'886877','17','蜜蜂');
INSERT INTO store VALUES(0,'142426','13','微聚宝');
INSERT INTO store VALUES(0,'533553','4','祥云');
INSERT INTO store VALUES(0,'881552','9','绿洲');
INSERT INTO store VALUES(0,'363673','19','秘乐');

#创建处理类型表
CREATE TABLE after_type(
after_type_id	INT PRIMARY KEY AUTO_INCREMENT COMMENT'处理类型ID',#主键自增
after_type_name	NVARCHAR(20) COMMENT'处理类型名称'
)COMMENT='处理类型表';

SELECT * FROM after_type;
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
SELECT * FROM `after`;
INSERT INTO `after` VALUES(0,2,1,1,'申请新的账号',1,'2020/5/18','2020/5/18',1,1);
INSERT INTO `after` VALUES(0,3,2,2,'投诉其他用户不良行为',2,'2020/5/6','2020/5/6',2,1);
INSERT INTO `after` VALUES(0,'3','3','003','申诉解封账号','3','2020/5/1','2020/5/1','3',1);
INSERT INTO `after` VALUES(0,'1','2','004','申请大额度充值','4','2020/4/25','2020/4/25','4',1);
INSERT INTO `after` VALUES(0,'2','3','005','申诉解封账号','5','2020/4/10','2020/4/10','5',1);
INSERT INTO `after` VALUES(0,'1','1','006','申请大额度充值','6','2020/4/1','2020/4/1','6',1);
INSERT INTO `after` VALUES(0,'1','1','007','申请大额度充值','7','2020/3/21','2020/3/21','7',1);
INSERT INTO `after` VALUES(0,'2','3','008','投诉其他用户不良行为','8','2020/3/18','2020/3/18','8',1);
INSERT INTO `after` VALUES(0,'3','3','009','投诉其他用户不良行为','9','2020/3/5','2020/3/5','9',1);
INSERT INTO `after` VALUES(0,'2','1','010','投诉其他用户不良行为','10','2020/2/18','2020/2/18','10',1);
INSERT INTO `after` VALUES(0,'2','2','011','投诉其他用户不良行为','11','2020/2/1','2020/5/1','11',1);
INSERT INTO `after` VALUES(0,'3','2','012','申诉解封账号','12','2020/1/15','2020/1/15','12',1);
INSERT INTO `after` VALUES(0,'1','1','013','申诉解封账号','13','2020/1/3','2020/1/3','13',1);
INSERT INTO `after` VALUES(0,'1','3','014','申诉解封账号','14','2019/11/18','2019/11/18','14',1);
INSERT INTO `after` VALUES(0,'2','1','015','申诉解封账号','15','2019/1/11','2019/11/11','15',1);
INSERT INTO `after` VALUES(0,'1','2','016','申请大额度充值','16','2019/10/1','2019/10/1','16',1);
INSERT INTO `after` VALUES(0,'3','3','017','申请大额度充值','17','2019/8/18','2019/8/18','17',1);
INSERT INTO `after` VALUES(0,'3','3','018','投诉其他用户不良行为','18','2019/7/17','2019/7/17','18',1);
INSERT INTO `after` VALUES(0,'3','1','019','投诉其他用户不良行为','19','2019/6/25','2019/6/25','19',1);
INSERT INTO `after` VALUES(0,'2','2','020','申诉解封账号','20','2019/6/10','2019/6/10','20',1);
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
SELECT * FROM feedback;
INSERT INTO `feedback` VALUES(0,'信息处理错误','','1','2020/4/6','1','4');
INSERT INTO `feedback` VALUES(0,'软件崩溃','','3','2020/3/6','2','1');
INSERT INTO `feedback` VALUES(0,'广告过多','','5','2020/5/5','3','13');
INSERT INTO `feedback` VALUES(0,'异常弹出','','17','2020/4/5','3','4');
INSERT INTO `feedback` VALUES(0,'信息处理不全','','18','2020/4/25','1','4');
INSERT INTO `feedback` VALUES(0,'软件自动关闭','','16','2020/4/11','1','1');
INSERT INTO `feedback` VALUES(0,'下载文件不全','','11','2020/4/1','2','1');
INSERT INTO `feedback` VALUES(0,'信息加载不出','','10','2020/3/26','2','13');
INSERT INTO `feedback` VALUES(0,'容易蓝屏','','7','2020/3/19','3','4');
INSERT INTO `feedback` VALUES(0,'软件自动打开','','12','2020/3/6','1','1');
INSERT INTO `feedback` VALUES(0,'文件容易乱码','','1','2020/3/1','1','4');
INSERT INTO `feedback` VALUES(0,'安装包不全','','2','2020/2/28','3','1');
INSERT INTO `feedback` VALUES(0,'软件安装过程容易出错','','7','2020/2/25','3','1');
INSERT INTO `feedback` VALUES(0,'下载文件容易丢失','','18','2020/2/23','2','3');
INSERT INTO `feedback` VALUES(0,'安装包不完整','','19','2020/2/20','1','4');
INSERT INTO `feedback` VALUES(0,'容易弹窗','','13','2020/2/18','1','3');
INSERT INTO `feedback` VALUES(0,'闪退','','15','2020/2/15','2','3');
INSERT INTO `feedback` VALUES(0,'容易被杀毒软件阻止安装','','10','2020/2/13','2','4');
INSERT INTO `feedback` VALUES(0,'容易卡死','','6','2020/2/10','2','1');
INSERT INTO `feedback` VALUES(0,'容易导致手机自动关机','','5','2020/2/6','3','4');
CREATE TABLE `user_state_type`(
user_st_id 	INT PRIMARY KEY  AUTO_INCREMENT COMMENT'用户状态类型ID',
user_st_name 	NVARCHAR(20) NOT NULL COMMENT'用户状态类型名称'
);
INSERT INTO `user_state_type` VALUES(0,'正常');
INSERT INTO `user_state_type` VALUES(0,'冻结');
INSERT INTO `user_state_type` VALUES(0,'封号');
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

INSERT INTO user_state VALUES(0,1,1,'2020-5-18','2020-5-18','无',1);
INSERT INTO user_state VALUES(0,1,2,'2020-5-18','2030-5-18','涉嫌色情传播',2);
INSERT INTO user_state VALUES(0,1,3,'2020-5-18','2020-5-25','账号密码遗忘',3);


