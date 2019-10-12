package cn.wangyu.springcloud.weather.service;

import cn.wangyu.springcloud.weather.model.Weather;

/**
 * weather report service
 *
 * @Author wangyu
 * @Date 2019/10/12 13:41
 * @Version 1.0
 */
public interface WeatherReportService {

  /**
   * 根据城市ID查询天气信息
   */
  Weather getDataByCityId(String cityId);
}
