package com.assetImportance.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description: 趋势传输对象
 * @author: Yxf
 **/
@Data
@Accessors(chain = true)
public class TrendResultDTO {


    private String date;

    private String type;

    private Long value;

}
