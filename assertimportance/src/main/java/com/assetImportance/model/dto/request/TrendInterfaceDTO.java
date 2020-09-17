package com.assetImportance.model.dto.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Yxf
 */
@Data
@Accessors(chain = true)
public class TrendInterfaceDTO {
    private String date;
    private Long icsValue;
    private Long totalValue;
}
