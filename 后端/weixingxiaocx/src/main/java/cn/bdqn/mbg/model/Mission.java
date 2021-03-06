package cn.bdqn.mbg.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("/mission")
public class Mission implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer missionId;
    private Integer missionNo;
    private Integer missionSys;
    private Integer missionType;
    private Integer missionMana;
    private String missionHeadline;
    private String missionContent;
    private String missionStep;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date missionSt;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date missionCt;
    private Integer missionNum;
    private BigDecimal missionMoney;
    private BigDecimal missionAll;
    private String missionText;
    private String missionLink;
    private String missionVerify;
    private String missionPattern;

    private String missionTypeName;
    private String userName;
    private Integer userEx;
    private Integer userId;
    private String userHead;
    private String sysName;

    private String missionTypePicture;

    private static final long serialVersionUID = 1L;

    public Integer getUserEx() {
        return userEx;
    }

    public void setUserEx(Integer userEx) {
        this.userEx = userEx;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_id
     *
     * @return the value of mission.mission_id
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Integer getMissionId() {
        return missionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_id
     *
     * @param missionId the value for mission.mission_id
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_no
     *
     * @return the value of mission.mission_no
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Integer getMissionNo() {
        return missionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_no
     *
     * @param missionNo the value for mission.mission_no
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionNo(Integer missionNo) {
        this.missionNo = missionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_sys
     *
     * @return the value of mission.mission_sys
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Integer getMissionSys() {
        return missionSys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_sys
     *
     * @param missionSys the value for mission.mission_sys
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionSys(Integer missionSys) {
        this.missionSys = missionSys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_type
     *
     * @return the value of mission.mission_type
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Integer getMissionType() {
        return missionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_type
     *
     * @param missionType the value for mission.mission_type
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionType(Integer missionType) {
        this.missionType = missionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_mana
     *
     * @return the value of mission.mission_mana
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Integer getMissionMana() {
        return missionMana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_mana
     *
     * @param missionMana the value for mission.mission_mana
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionMana(Integer missionMana) {
        this.missionMana = missionMana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_headline
     *
     * @return the value of mission.mission_headline
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public String getMissionHeadline() {
        return missionHeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_headline
     *
     * @param missionHeadline the value for mission.mission_headline
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionHeadline(String missionHeadline) {
        this.missionHeadline = missionHeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_content
     *
     * @return the value of mission.mission_content
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public String getMissionContent() {
        return missionContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_content
     *
     * @param missionContent the value for mission.mission_content
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_step
     *
     * @return the value of mission.mission_step
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public String getMissionStep() {
        return missionStep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_step
     *
     * @param missionStep the value for mission.mission_step
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionStep(String missionStep) {
        this.missionStep = missionStep;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_st
     *
     * @return the value of mission.mission_st
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Date getMissionSt() {
        return missionSt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_st
     *
     * @param missionSt the value for mission.mission_st
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionSt(Date missionSt) {
        this.missionSt = missionSt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_ct
     *
     * @return the value of mission.mission_ct
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Date getMissionCt() {
        return missionCt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_ct
     *
     * @param missionCt the value for mission.mission_ct
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionCt(Date missionCt) {
        this.missionCt = missionCt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_num
     *
     * @return the value of mission.mission_num
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public Integer getMissionNum() {
        return missionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_num
     *
     * @param missionNum the value for mission.mission_num
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionNum(Integer missionNum) {
        this.missionNum = missionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_money
     *
     * @return the value of mission.mission_money
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public BigDecimal getMissionMoney() {
        return missionMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_money
     *
     * @param missionMoney the value for mission.mission_money
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionMoney(BigDecimal missionMoney) {
        this.missionMoney = missionMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_all
     *
     * @return the value of mission.mission_all
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public BigDecimal getMissionAll() {
        return missionAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_all
     *
     * @param missionAll the value for mission.mission_all
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionAll(BigDecimal missionAll) {
        this.missionAll = missionAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_link
     *
     * @return the value of mission.mission_link
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public String getMissionLink() {
        return missionLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_link
     *
     * @param missionLink the value for mission.mission_link
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionLink(String missionLink) {
        this.missionLink = missionLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mission.mission_verify
     *
     * @return the value of mission.mission_verify
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public String getMissionVerify() {
        return missionVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mission.mission_verify
     *
     * @param missionVerify the value for mission.mission_verify
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    public void setMissionVerify(String missionVerify) {
        this.missionVerify = missionVerify;
    }

    public String getMissionTypeName() {
        return missionTypeName;
    }

    public void setMissionTypeName(String missionTypeName) {
        this.missionTypeName = missionTypeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMissionTypePicture() {
        return missionTypePicture;
    }

    public void setMissionTypePicture(String missionTypePicture) {
        this.missionTypePicture = missionTypePicture;
    }

    public String getMissionPattern() {
        return missionPattern;
    }

    public void setMissionPattern(String missionPattern) {
        this.missionPattern = missionPattern;
    }

    public String getMissionText() {
        return missionText;
    }

    public void setMissionText(String missionText) {
        this.missionText = missionText;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mission
     *
     * @mbggenerated Thu Jun 04 10:14:51 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", missionId=").append(missionId);
        sb.append(", missionNo=").append(missionNo);
        sb.append(", missionSys=").append(missionSys);
        sb.append(", missionType=").append(missionType);
        sb.append(", missionMana=").append(missionMana);
        sb.append(", missionHeadline=").append(missionHeadline);
        sb.append(", missionContent=").append(missionContent);
        sb.append(", missionStep=").append(missionStep);
        sb.append(", missionSt=").append(missionSt);
        sb.append(", missionCt=").append(missionCt);
        sb.append(", missionNum=").append(missionNum);
        sb.append(", missionMoney=").append(missionMoney);
        sb.append(", missionAll=").append(missionAll);
        sb.append(", missionText=").append(missionText);
        sb.append(", missionLink=").append(missionLink);
        sb.append(", missionVerify=").append(missionVerify);
        sb.append(", missionText=").append(missionText);
        sb.append(", missionTypeName=").append(missionTypeName);
        sb.append(", missionTypePicture=").append(missionTypePicture);
        sb.append(", userName=").append(userName);
        sb.append(", userId=").append(userId);
        sb.append(", userEx=").append(userEx);
        sb.append(", userHead=").append(userHead);
        sb.append(", sysName=").append(sysName);
        sb.append(", missionPattern=").append(missionPattern);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}