package com.bytatech.ayoos.doctor.apigateway.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.Doctor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DoctorSessionInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-23T16:09:16.109+05:30[Asia/Kolkata]")

public class DoctorSessionInfo   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("doctor")
  private Doctor doctor = null;

  @JsonProperty("endTime")
  private ZonedDateTime endTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interval")
  private ZonedDateTime interval = null;

  @JsonProperty("sessionName")
  private String sessionName = null;

  @JsonProperty("startTime")
  private ZonedDateTime startTime = null;

  public DoctorSessionInfo date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public DoctorSessionInfo doctor(Doctor doctor) {
    this.doctor = doctor;
    return this;
  }

  /**
   * Get doctor
   * @return doctor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Doctor getDoctor() {
    return doctor;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public DoctorSessionInfo endTime(ZonedDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  public DoctorSessionInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DoctorSessionInfo interval(ZonedDateTime interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getInterval() {
    return interval;
  }

  public void setInterval(ZonedDateTime interval) {
    this.interval = interval;
  }

  public DoctorSessionInfo sessionName(String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

  /**
   * Get sessionName
   * @return sessionName
  **/
  @ApiModelProperty(value = "")


  public String getSessionName() {
    return sessionName;
  }

  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }

  public DoctorSessionInfo startTime(ZonedDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoctorSessionInfo doctorSessionInfo = (DoctorSessionInfo) o;
    return Objects.equals(this.date, doctorSessionInfo.date) &&
        Objects.equals(this.doctor, doctorSessionInfo.doctor) &&
        Objects.equals(this.endTime, doctorSessionInfo.endTime) &&
        Objects.equals(this.id, doctorSessionInfo.id) &&
        Objects.equals(this.interval, doctorSessionInfo.interval) &&
        Objects.equals(this.sessionName, doctorSessionInfo.sessionName) &&
        Objects.equals(this.startTime, doctorSessionInfo.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, doctor, endTime, id, interval, sessionName, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoctorSessionInfo {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    doctor: ").append(toIndentedString(doctor)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

