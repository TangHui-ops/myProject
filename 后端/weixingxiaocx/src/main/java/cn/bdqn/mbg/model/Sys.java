package cn.bdqn.mbg.model;

import java.io.Serializable;

public class Sys implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys.sys_id
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private Integer sysId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys.sys_name
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private String sysName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys.sys_id
     *
     * @return the value of sys.sys_id
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public Integer getSysId() {
        return sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys.sys_id
     *
     * @param sysId the value for sys.sys_id
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys.sys_name
     *
     * @return the value of sys.sys_name
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys.sys_name
     *
     * @param sysName the value for sys.sys_name
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys
     *
     * @mbggenerated Mon May 25 11:08:02 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysId=").append(sysId);
        sb.append(", sysName=").append(sysName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}