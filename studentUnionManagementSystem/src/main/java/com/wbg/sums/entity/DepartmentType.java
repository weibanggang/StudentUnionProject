package com.wbg.sums.entity;

public class DepartmentType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_type.d_id
     *
     * @mbg.generated
     */
    private Integer dId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_type.d_name
     *
     * @mbg.generated
     */
    private String dName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_type.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_type.d_remarks
     *
     * @mbg.generated
     */
    private String dRemarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_type.d_sort
     *
     * @mbg.generated
     */
    private Integer dSort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_type.d_synopsis
     *
     * @mbg.generated
     */
    private String dSynopsis;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.d_id
     *
     * @return the value of department_type.d_id
     *
     * @mbg.generated
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.d_id
     *
     * @param dId the value for department_type.d_id
     *
     * @mbg.generated
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.d_name
     *
     * @return the value of department_type.d_name
     *
     * @mbg.generated
     */
    public String getdName() {
        return dName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.d_name
     *
     * @param dName the value for department_type.d_name
     *
     * @mbg.generated
     */
    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.status
     *
     * @return the value of department_type.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.status
     *
     * @param status the value for department_type.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.d_remarks
     *
     * @return the value of department_type.d_remarks
     *
     * @mbg.generated
     */
    public String getdRemarks() {
        return dRemarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.d_remarks
     *
     * @param dRemarks the value for department_type.d_remarks
     *
     * @mbg.generated
     */
    public void setdRemarks(String dRemarks) {
        this.dRemarks = dRemarks == null ? null : dRemarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.d_sort
     *
     * @return the value of department_type.d_sort
     *
     * @mbg.generated
     */
    public Integer getdSort() {
        return dSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.d_sort
     *
     * @param dSort the value for department_type.d_sort
     *
     * @mbg.generated
     */
    public void setdSort(Integer dSort) {
        this.dSort = dSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_type.d_synopsis
     *
     * @return the value of department_type.d_synopsis
     *
     * @mbg.generated
     */
    public String getdSynopsis() {
        return dSynopsis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_type.d_synopsis
     *
     * @param dSynopsis the value for department_type.d_synopsis
     *
     * @mbg.generated
     */
    public void setdSynopsis(String dSynopsis) {
        this.dSynopsis = dSynopsis == null ? null : dSynopsis.trim();
    }
}