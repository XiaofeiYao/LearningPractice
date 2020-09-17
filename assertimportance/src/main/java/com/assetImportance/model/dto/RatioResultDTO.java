package com.assetImportance.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description: 占比传输对象
 * @author: Yxf
 **/
@Data
@Accessors(chain = true)
public class RatioResultDTO {

    String name;
    Long value;
    String percent;
}
