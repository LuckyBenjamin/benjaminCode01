package com.benjamin.common.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 
 * @author gs 2018年7月30日下午3:40:54
 */
@Data
@Component
public class QiNiuConfig {

  @Value("${qiniu.domain}")
  private String domain;
}
