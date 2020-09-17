package com.assetImportance.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author CsyCore
 */
@Data
@Accessors(chain = true)
@TableName("imas_asset_info")
public class ImasAssetInfo {
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date foundTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String assetName;

    private String ip;

    private Long ipValue;

    private String vendor;

    private String product;

    private String category;

    private String type;

    private Integer importance;

    private Integer isAbnormal;

    private Integer isZombie;

    private Integer isIllegal;

    private String os;

    private String mac;

    private String version;

    private String osVersion;

    private Integer openPortCount;

    private Integer vulCount;

    private Integer alarmThreatAttackerCount;

    private Integer alarmThreatVictimCount;

    private Integer alarmAbnormalSrcCount;

    private Integer alarmAbnormalDstCount;

    private Integer alarmCount;

    private Integer useStatus;

    private String remark;

    private String describe;

    private Long groupId;

    private Integer source;

    private Double longitude;

    private Double latitude;

    private Integer isNetworkEquipment;

    private Integer isControlEquipment;

    private Double riskScore;

    private Integer riskLevel;

    private Integer principalId;

    private Integer assetValue;

    private String assetSn;

    private String assetVersion;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date activeTime;

    private String position;

    private Integer isIcs;
}