package cn.bdqn.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UserState implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_state.user_state_id
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private Integer userStateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_state.user_id
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_state.user_s
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private Integer userS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_state.user_state_date
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private Date userStateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_state.user_state_dt
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private Date userStateDt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_state.user_state_reason
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private String userStateReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_state.user_state_p
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private Integer userStateP;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_state.user_state_id
     *
     * @return the value of user_state.user_state_id
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Integer getUserStateId() {
        return userStateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_state.user_state_id
     *
     * @param userStateId the value for user_state.user_state_id
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setUserStateId(Integer userStateId) {
        this.userStateId = userStateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_state.user_id
     *
     * @return the value of user_state.user_id
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_state.user_id
     *
     * @param userId the value for user_state.user_id
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_state.user_s
     *
     * @return the value of user_state.user_s
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Integer getUserS() {
        return userS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_state.user_s
     *
     * @param userS the value for user_state.user_s
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setUserS(Integer userS) {
        this.userS = userS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_state.user_state_date
     *
     * @return the value of user_state.user_state_date
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Date getUserStateDate() {
        return userStateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_state.user_state_date
     *
     * @param userStateDate the value for user_state.user_state_date
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setUserStateDate(Date userStateDate) {
        this.userStateDate = userStateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_state.user_state_dt
     *
     * @return the value of user_state.user_state_dt
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Date getUserStateDt() {
        return userStateDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_state.user_state_dt
     *
     * @param userStateDt the value for user_state.user_state_dt
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setUserStateDt(Date userStateDt) {
        this.userStateDt = userStateDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_state.user_state_reason
     *
     * @return the value of user_state.user_state_reason
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public String getUserStateReason() {
        return userStateReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_state.user_state_reason
     *
     * @param userStateReason the value for user_state.user_state_reason
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setUserStateReason(String userStateReason) {
        this.userStateReason = userStateReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_state.user_state_p
     *
     * @return the value of user_state.user_state_p
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public Integer getUserStateP() {
        return userStateP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_state.user_state_p
     *
     * @param userStateP the value for user_state.user_state_p
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    public void setUserStateP(Integer userStateP) {
        this.userStateP = userStateP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_state
     *
     * @mbggenerated Tue May 26 14:32:04 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userStateId=").append(userStateId);
        sb.append(", userId=").append(userId);
        sb.append(", userS=").append(userS);
        sb.append(", userStateDate=").append(userStateDate);
        sb.append(", userStateDt=").append(userStateDt);
        sb.append(", userStateReason=").append(userStateReason);
        sb.append(", userStateP=").append(userStateP);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}