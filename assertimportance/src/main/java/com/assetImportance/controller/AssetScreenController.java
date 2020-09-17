package com.assetImportance.controller;

import com.assetImportance.dao.mapper.AssetScreenMapper;
import com.assetImportance.model.dto.RatioResultDTO;
import com.assetImportance.model.dto.TrendResultDTO;
import com.assetImportance.service.AssetScreenService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: Yxf
 **/
@RestController
@RequestMapping("/isoc/asset")
@RequiredArgsConstructor
public class AssetScreenController {

    private final AssetScreenService assetScreenService;
    private final AssetScreenMapper assetScreenMapper;

    @PostMapping("/ratio/assetImportance")
    public List<RatioResultDTO> queryRatioAssetImportance() {
        return assetScreenService.queryRatioAssetImportance();
    }

    @PostMapping("/trend/assetGroupAlarmEvent")
    public List<TrendResultDTO> queryTrendAssetGroupAlarmEvent(@DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                               @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate, Integer points) {
        return assetScreenService.queryTrendAssetGroupAlarmEvent(startDate, endDate, points);
    }
}
