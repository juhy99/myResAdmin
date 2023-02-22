package com.catchmind.resadmin.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BistroInfoApiResponse {
    private Long bisIdx;
    private String resaBisName;
    private String bisDesc;
    private String bisCategory;
    private String bisRegion;
    private String bisLunch;
    private String bisDinner;
    private LocalDateTime regDate;

}