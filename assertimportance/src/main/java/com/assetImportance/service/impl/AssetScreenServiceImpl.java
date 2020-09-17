package com.assetImportance.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.assetImportance.dao.mapper.AssetScreenMapper;
import com.assetImportance.model.dto.RatioResultDTO;
import com.assetImportance.model.dto.TrendResultDTO;
import com.assetImportance.model.dto.request.TrendInterfaceDTO;
import com.assetImportance.service.AssetScreenService;
import com.sun.deploy.security.CeilingPolicy;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: Yxf
 **/
@Service
@RequiredArgsConstructor
public class AssetScreenServiceImpl implements AssetScreenService {

    private final AssetScreenMapper assetScreenMapper;

    @Override
    public List<RatioResultDTO> queryRatioAssetImportance() {


        List<RatioResultDTO> mapList = assetScreenMapper.queryRatioAssetImportance();
        if (CollectionUtil.isEmpty(mapList)) {
            mapList = new ArrayList<>();
        }
        for (RatioResultDTO ratioResultDTO : mapList) {
            if (("1").equals(ratioResultDTO.getName())) {
                ratioResultDTO.setName("高");
            } else if ("2".equals(ratioResultDTO.getName())) {
                ratioResultDTO.setName("中");
            } else {
                ratioResultDTO.setName("低");
            }
        }
        return mapList;
    }

    @Override
    public List<TrendResultDTO> queryTrendAssetGroupAlarmEvent(@Param("startDate") Date startDate,
                                                               @Param("endDate") Date endDate,
                                                               @Param("points") Integer points) {

        List<TrendInterfaceDTO> trendInterfaceDTOList =
                assetScreenMapper.queryTrendAssetGroupAlarmEvent(startDate, endDate);
        if (CollectionUtil.isEmpty(trendInterfaceDTOList)) {
            trendInterfaceDTOList = new ArrayList<>();
        }
        Integer gapDay =
                (int) (endDate.getTime() - startDate.getTime()) / (24 * 60 * 60 * 1000);
        List<TrendResultDTO> trendResultDTOList = new ArrayList<>();
        int intervalListIteration =gapDay / points;
        for (int i = 0; i < trendInterfaceDTOList.size(); i =i +intervalListIteration ) {
            if(trendResultDTOList.size()==2*points){
                break;
            }
            TrendInterfaceDTO trendInterfaceDTO = trendInterfaceDTOList.get(i);
            TrendResultDTO trendResultDTO = new TrendResultDTO();
            trendResultDTO.setDate(trendInterfaceDTO.getDate()).setType("ics").setValue(trendInterfaceDTO.getIcsValue());
            trendResultDTOList.add(trendResultDTO);
            TrendResultDTO trendResultTotalDTO = new TrendResultDTO();
            trendResultTotalDTO.setDate(trendInterfaceDTO.getDate()).setType("total").setValue(trendInterfaceDTO.getTotalValue());
            trendResultDTOList.add(trendResultTotalDTO);
        }
        return trendResultDTOList;
    }

}

