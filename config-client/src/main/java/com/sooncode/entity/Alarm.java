
package com.sooncode.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class Alarm implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 警报编号 */ 
	 private String alarmId; 
	 /** 业务系统编号 */
	 private String businessSystemId ;
	 /** 规则编号 */
	 private String ruleId ;
	 /** 规则类型 */
	 private String ruleType ;
	 /** 警报标题 */
	 private String alarmTitle ;
	 /** 创建时间 */
	 private java.util.Date createTime ;
	 /** 更新时间 */
	 private java.util.Date updateTime ;
	 /** 警报级别 */
	 private String alarmLevel ;

	 /** 警报编号 */
	 public String getAlarmId() { 
	 	 return alarmId;
	 }
	 /** 警报编号 */
	 public void setAlarmId(String alarmId) {
	 	 this.alarmId = alarmId;
	 }

	 /** 业务系统编号 */
	 public String getBusinessSystemId() { 
	 	 return businessSystemId;
	 }
	 /** 业务系统编号 */
	 public void setBusinessSystemId(String businessSystemId) {
	 	 this.businessSystemId = businessSystemId;
	 }

	 /** 规则编号 */
	 public String getRuleId() { 
	 	 return ruleId;
	 }
	 /** 规则编号 */
	 public void setRuleId(String ruleId) {
	 	 this.ruleId = ruleId;
	 }

	 /** 规则类型 */
	 public String getRuleType() { 
	 	 return ruleType;
	 }
	 /** 规则类型 */
	 public void setRuleType(String ruleType) {
	 	 this.ruleType = ruleType;
	 }

	 /** 警报标题 */
	 public String getAlarmTitle() { 
	 	 return alarmTitle;
	 }
	 /** 警报标题 */
	 public void setAlarmTitle(String alarmTitle) {
	 	 this.alarmTitle = alarmTitle;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreateTime() { 
	 	 return createTime;
	 }
	 /** 创建时间 */
	 public void setCreateTime(java.util.Date createTime) {
	 	 this.createTime = createTime;
	 }

	 /** 更新时间 */
	 public java.util.Date getUpdateTime() { 
	 	 return updateTime;
	 }
	 /** 更新时间 */
	 public void setUpdateTime(java.util.Date updateTime) {
	 	 this.updateTime = updateTime;
	 }

	 /** 警报级别 */
	 public String getAlarmLevel() { 
	 	 return alarmLevel;
	 }
	 /** 警报级别 */
	 public void setAlarmLevel(String alarmLevel) {
	 	 this.alarmLevel = alarmLevel;
	 }

}
