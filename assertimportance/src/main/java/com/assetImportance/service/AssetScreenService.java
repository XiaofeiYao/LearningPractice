package com.assetImportance.service;

import com.assetImportance.model.dto.RatioResultDTO;
import com.assetImportance.model.dto.TrendResultDTO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author: Yxf
 **/
public interface AssetScreenService {
    /**
     * @Description: 资产重要性占比
     * @author: Yxf
     * @params:
     * @return:
     */
    List<RatioResultDTO> queryRatioAssetImportance();

    /**
     * 资产组告警趋势
     * @params: points，startDate，endDate
     * @return: List<TrendResultDTO>
     **/
    List<TrendResultDTO> queryTrendAssetGroupAlarmEvent(@Param("startDate") Date startDate,
                                                        @Param("endDate") Date endDate,
                                                        @Param("points") Integer points);
}
