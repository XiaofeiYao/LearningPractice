package com.assetImportance.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @description: 探针探到的威胁
 * @author: Yxf
 **/
@Data
@Accessors(chain = true)
@TableName("imas_alarm_event_details")
public class ImasAlarmEventDetails {
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accessTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date timestamp;

    private String skyeyeIndex;

    private String skyeyeType;

    private String skyeyeId;

    private Long type;

    private String ruleDesc;

    private String offenceType;

    private String offenceValue;

    private String sip;

    private String dip;

    private Integer hazardLevel;

    private Long state;

    private String nid;

    private String ruleId;

    private String ueid;

    private String serialNum;

    private String mid;

    private String ruleState;

    private Integer source;

    private String iocType;

    private String iocValue;

    private Integer dataType;

    private Integer subDataType;

    private Integer ueidCount;

    private String alarmDetail;

    private String alarmName;

    private String protocol;

    private String attackerIp;

    private String victimIp;

    private Double sPort;

    private Double dPort;

    private Double attackerPort;

    private Double victimPort;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date disposeTime;

    private String appName;

    private Long srcAssetId;

    private Long dstAssetId;

    private Long attackerAssetId;

    private Long victimAssetId;

    private String solution;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date zombieTime;

    private String baselineName;
}
