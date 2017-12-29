
package com.sooncode.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class AlarmElement implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 警报因素编号 */ 
	 private String alarmElementId; 
	 /** 支付类型(指一个银行的不同接口，如代扣，网络必传) 通道接口 */
	 private String payType ;
	 /** 全局订单号 */
	 private String orderNo ;
	 /** 内部系统标识(如：outpay bpm 超时给) 业务系统存 */
	 private String internalSystemTag ;
	 /** 系统标识 */
	 private String systemId ;
	 /** 签约主体号(响应、网络、超时都给) 通道存 */
	 private String bankChannel ;
	 /** 状态描述 */
	 private String statusMsg ;
	 /** 拆分后的小批次号 */
	 private String splitBatchNo ;
	 /** 付款方银行编号 */
	 private String dbtrBankId ;
	 /** 总金额 */
	 private String amount ;
	 /** 响应码信息 */
	 private String respMsg ;
	 /** 跨行标识(0:跨行;1:同行) */
	 private String interBankFlag ;
	 /** 外部业务订单号 */
	 private String outOrderNo ;
	 /** 创建时间 */
	 private java.util.Date createTime ;
	 /** 外部业务批次号 */
	 private String outBatchNo ;
	 /** 埋点时间节点 */
	 private String timeCode ;
	 /** 批次标记(0：单笔 1：批次) */
	 private String batchFlag ;
	 /** 拆分后的小批次的订单条数 */
	 private String splitBatchCount ;
	 /** 响应码 */
	 private String respCode ;
	 /** 子订单号集合 */
	 private String orderNoList ;
	 /** 付款方银行名称 */
	 private String dbtrBankName ;
	 /** 外部系统标识(如：oa scf nf 超时给) 业务系统存 */
	 private String systemTag ;
	 /** IP地址 */
	 private String ip ;
	 /** 批次中订单总条数 */
	 private String batchTotalCount ;
	 /** 全局批次号 */
	 private String batchNo ;
	 /** 交易状态 */
	 private String statusCode ;
	 /** 更新时间 */
	 private java.util.Date updateTime ;
	 /** 结算方式( N:普通 ; Y:快速) */
	 private String settleType ;
	 /** 警报编号 */
	 private String alarmId ;
	 /** 错误描述 */
	 private String errorDescribe ;
	 /** 付款方客户名称 */
	 private String dbtrName ;

	 /** 支付类型(指一个银行的不同接口，如代扣，网络必传) 通道接口 */
	 public String getPayType() { 
	 	 return payType;
	 }
	 /** 支付类型(指一个银行的不同接口，如代扣，网络必传) 通道接口 */
	 public void setPayType(String payType) {
	 	 this.payType = payType;
	 }

	 /** 全局订单号 */
	 public String getOrderNo() { 
	 	 return orderNo;
	 }
	 /** 全局订单号 */
	 public void setOrderNo(String orderNo) {
	 	 this.orderNo = orderNo;
	 }

	 /** 内部系统标识(如：outpay bpm 超时给) 业务系统存 */
	 public String getInternalSystemTag() { 
	 	 return internalSystemTag;
	 }
	 /** 内部系统标识(如：outpay bpm 超时给) 业务系统存 */
	 public void setInternalSystemTag(String internalSystemTag) {
	 	 this.internalSystemTag = internalSystemTag;
	 }

	 /** 系统标识 */
	 public String getSystemId() { 
	 	 return systemId;
	 }
	 /** 系统标识 */
	 public void setSystemId(String systemId) {
	 	 this.systemId = systemId;
	 }

	 /** 签约主体号(响应、网络、超时都给) 通道存 */
	 public String getBankChannel() { 
	 	 return bankChannel;
	 }
	 /** 签约主体号(响应、网络、超时都给) 通道存 */
	 public void setBankChannel(String bankChannel) {
	 	 this.bankChannel = bankChannel;
	 }

	 /** 状态描述 */
	 public String getStatusMsg() { 
	 	 return statusMsg;
	 }
	 /** 状态描述 */
	 public void setStatusMsg(String statusMsg) {
	 	 this.statusMsg = statusMsg;
	 }

	 /** 拆分后的小批次号 */
	 public String getSplitBatchNo() { 
	 	 return splitBatchNo;
	 }
	 /** 拆分后的小批次号 */
	 public void setSplitBatchNo(String splitBatchNo) {
	 	 this.splitBatchNo = splitBatchNo;
	 }

	 /** 付款方银行编号 */
	 public String getDbtrBankId() { 
	 	 return dbtrBankId;
	 }
	 /** 付款方银行编号 */
	 public void setDbtrBankId(String dbtrBankId) {
	 	 this.dbtrBankId = dbtrBankId;
	 }

	 /** 总金额 */
	 public String getAmount() { 
	 	 return amount;
	 }
	 /** 总金额 */
	 public void setAmount(String amount) {
	 	 this.amount = amount;
	 }

	 /** 响应码信息 */
	 public String getRespMsg() { 
	 	 return respMsg;
	 }
	 /** 响应码信息 */
	 public void setRespMsg(String respMsg) {
	 	 this.respMsg = respMsg;
	 }

	 /** 跨行标识(0:跨行;1:同行) */
	 public String getInterBankFlag() { 
	 	 return interBankFlag;
	 }
	 /** 跨行标识(0:跨行;1:同行) */
	 public void setInterBankFlag(String interBankFlag) {
	 	 this.interBankFlag = interBankFlag;
	 }

	 /** 外部业务订单号 */
	 public String getOutOrderNo() { 
	 	 return outOrderNo;
	 }
	 /** 外部业务订单号 */
	 public void setOutOrderNo(String outOrderNo) {
	 	 this.outOrderNo = outOrderNo;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreateTime() { 
	 	 return createTime;
	 }
	 /** 创建时间 */
	 public void setCreateTime(java.util.Date createTime) {
	 	 this.createTime = createTime;
	 }

	 /** 外部业务批次号 */
	 public String getOutBatchNo() { 
	 	 return outBatchNo;
	 }
	 /** 外部业务批次号 */
	 public void setOutBatchNo(String outBatchNo) {
	 	 this.outBatchNo = outBatchNo;
	 }

	 /** 埋点时间节点 */
	 public String getTimeCode() { 
	 	 return timeCode;
	 }
	 /** 埋点时间节点 */
	 public void setTimeCode(String timeCode) {
	 	 this.timeCode = timeCode;
	 }

	 /** 批次标记(0：单笔 1：批次) */
	 public String getBatchFlag() { 
	 	 return batchFlag;
	 }
	 /** 批次标记(0：单笔 1：批次) */
	 public void setBatchFlag(String batchFlag) {
	 	 this.batchFlag = batchFlag;
	 }

	 /** 拆分后的小批次的订单条数 */
	 public String getSplitBatchCount() { 
	 	 return splitBatchCount;
	 }
	 /** 拆分后的小批次的订单条数 */
	 public void setSplitBatchCount(String splitBatchCount) {
	 	 this.splitBatchCount = splitBatchCount;
	 }

	 /** 响应码 */
	 public String getRespCode() { 
	 	 return respCode;
	 }
	 /** 响应码 */
	 public void setRespCode(String respCode) {
	 	 this.respCode = respCode;
	 }

	 /** 子订单号集合 */
	 public String getOrderNoList() { 
	 	 return orderNoList;
	 }
	 /** 子订单号集合 */
	 public void setOrderNoList(String orderNoList) {
	 	 this.orderNoList = orderNoList;
	 }

	 /** 付款方银行名称 */
	 public String getDbtrBankName() { 
	 	 return dbtrBankName;
	 }
	 /** 付款方银行名称 */
	 public void setDbtrBankName(String dbtrBankName) {
	 	 this.dbtrBankName = dbtrBankName;
	 }

	 /** 外部系统标识(如：oa scf nf 超时给) 业务系统存 */
	 public String getSystemTag() { 
	 	 return systemTag;
	 }
	 /** 外部系统标识(如：oa scf nf 超时给) 业务系统存 */
	 public void setSystemTag(String systemTag) {
	 	 this.systemTag = systemTag;
	 }

	 /** IP地址 */
	 public String getIp() { 
	 	 return ip;
	 }
	 /** IP地址 */
	 public void setIp(String ip) {
	 	 this.ip = ip;
	 }

	 /** 批次中订单总条数 */
	 public String getBatchTotalCount() { 
	 	 return batchTotalCount;
	 }
	 /** 批次中订单总条数 */
	 public void setBatchTotalCount(String batchTotalCount) {
	 	 this.batchTotalCount = batchTotalCount;
	 }

	 /** 全局批次号 */
	 public String getBatchNo() { 
	 	 return batchNo;
	 }
	 /** 全局批次号 */
	 public void setBatchNo(String batchNo) {
	 	 this.batchNo = batchNo;
	 }

	 /** 交易状态 */
	 public String getStatusCode() { 
	 	 return statusCode;
	 }
	 /** 交易状态 */
	 public void setStatusCode(String statusCode) {
	 	 this.statusCode = statusCode;
	 }

	 /** 更新时间 */
	 public java.util.Date getUpdateTime() { 
	 	 return updateTime;
	 }
	 /** 更新时间 */
	 public void setUpdateTime(java.util.Date updateTime) {
	 	 this.updateTime = updateTime;
	 }

	 /** 警报因素编号 */
	 public String getAlarmElementId() { 
	 	 return alarmElementId;
	 }
	 /** 警报因素编号 */
	 public void setAlarmElementId(String alarmElementId) {
	 	 this.alarmElementId = alarmElementId;
	 }

	 /** 结算方式( N:普通 ; Y:快速) */
	 public String getSettleType() { 
	 	 return settleType;
	 }
	 /** 结算方式( N:普通 ; Y:快速) */
	 public void setSettleType(String settleType) {
	 	 this.settleType = settleType;
	 }

	 /** 警报编号 */
	 public String getAlarmId() { 
	 	 return alarmId;
	 }
	 /** 警报编号 */
	 public void setAlarmId(String alarmId) {
	 	 this.alarmId = alarmId;
	 }

	 /** 错误描述 */
	 public String getErrorDescribe() { 
	 	 return errorDescribe;
	 }
	 /** 错误描述 */
	 public void setErrorDescribe(String errorDescribe) {
	 	 this.errorDescribe = errorDescribe;
	 }

	 /** 付款方客户名称 */
	 public String getDbtrName() { 
	 	 return dbtrName;
	 }
	 /** 付款方客户名称 */
	 public void setDbtrName(String dbtrName) {
	 	 this.dbtrName = dbtrName;
	 }

}
