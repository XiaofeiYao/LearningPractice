package com.assetImportance.dao.mapper;

import com.assetImportance.dao.entity.ImasAssetInfo;
import com.assetImportance.model.dto.RatioResultDTO;
import com.assetImportance.model.dto.TrendResultDTO;
import com.assetImportance.model.dto.request.TrendInterfaceDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;


import java.util.Date;
import java.util.List;

/**
 * @description: 大屏展示
 * @author: Yxf
 **/
public interface AssetScreenMapper extends BaseMapper<ImasAssetInfo> {

     /**
       * @Description: 资产重要性占比
       * @Author: Yxf
       */
    List<RatioResultDTO> queryRatioAssetImportance();
    
    
     /** 
       * @Description: 资产组告警趋势
       * @Author: Yxf
       * @params: startDate, endDate
       * @return: TrendResultDTO
       */
     List<TrendInterfaceDTO> queryTrendAssetGroupAlarmEvent(@Param("startDate") Date startDate, @Param(
             "endDate") Date endDate);

}
