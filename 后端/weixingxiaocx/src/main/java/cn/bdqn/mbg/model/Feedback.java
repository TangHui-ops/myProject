package cn.bdqn.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.feedback_id
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private Integer feedbackId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.feedback_con
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private String feedbackCon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.feedback_p
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private Integer feedbackP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.feedback_time
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private Date feedbackTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.feedback_state
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private Integer feedbackState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.feedback_dp
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private Integer feedbackDp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table feedback
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.feedback_id
     *
     * @return the value of feedback.feedback_id
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public Integer getFeedbackId() {
        return feedbackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.feedback_id
     *
     * @param feedbackId the value for feedback.feedback_id
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.feedback_con
     *
     * @return the value of feedback.feedback_con
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public String getFeedbackCon() {
        return feedbackCon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.feedback_con
     *
     * @param feedbackCon the value for feedback.feedback_con
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setFeedbackCon(String feedbackCon) {
        this.feedbackCon = feedbackCon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.feedback_p
     *
     * @return the value of feedback.feedback_p
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public Integer getFeedbackP() {
        return feedbackP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.feedback_p
     *
     * @param feedbackP the value for feedback.feedback_p
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setFeedbackP(Integer feedbackP) {
        this.feedbackP = feedbackP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.feedback_time
     *
     * @return the value of feedback.feedback_time
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public Date getFeedbackTime() {
        return feedbackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.feedback_time
     *
     * @param feedbackTime the value for feedback.feedback_time
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.feedback_state
     *
     * @return the value of feedback.feedback_state
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public Integer getFeedbackState() {
        return feedbackState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.feedback_state
     *
     * @param feedbackState the value for feedback.feedback_state
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setFeedbackState(Integer feedbackState) {
        this.feedbackState = feedbackState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.feedback_dp
     *
     * @return the value of feedback.feedback_dp
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public Integer getFeedbackDp() {
        return feedbackDp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.feedback_dp
     *
     * @param feedbackDp the value for feedback.feedback_dp
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setFeedbackDp(Integer feedbackDp) {
        this.feedbackDp = feedbackDp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackId=").append(feedbackId);
        sb.append(", feedbackCon=").append(feedbackCon);
        sb.append(", feedbackP=").append(feedbackP);
        sb.append(", feedbackTime=").append(feedbackTime);
        sb.append(", feedbackState=").append(feedbackState);
        sb.append(", feedbackDp=").append(feedbackDp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}