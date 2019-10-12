package cn.wangyu.springcloud.weather.service.impl;

import cn.wangyu.springcloud.weather.model.Forecast;
import cn.wangyu.springcloud.weather.model.Weather;
import cn.wangyu.springcloud.weather.service.WeatherReportService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @Author wangyu
 * @Date 2019/10/12 13:51
 * @Version 1.0
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

  @Override
  public Weather getDataByCityId(String cityId) {
    // TODO 改为由天气数据API微服务来提供
    Weather data = new Weather();
    data.setAqi("81");
    data.setCity("成都");
    data.setGanmao("容易感冒！多穿衣");
    data.setWendu("22");

    List<Forecast> forecastList = new ArrayList<>();

    Forecast forecast = new Forecast();
    forecast.setDate("25日星期天");
    forecast.setType("晴");
    forecast.setFengxiang("无风");
    forecast.setHigh("高温 11度");
    forecast.setLow("低温 1度");
    forecastList.add(forecast);

    forecast = new Forecast();
    forecast.setDate("26日星期天");
    forecast.setType("晴");
    forecast.setFengxiang("无风");
    forecast.setHigh("高温 11度");
    forecast.setLow("低温 1度");
    forecastList.add(forecast);

    forecast = new Forecast();
    forecast.setDate("27日星期天");
    forecast.setType("晴");
    forecast.setFengxiang("无风");
    forecast.setHigh("高温 11度");
    forecast.setLow("低温 1度");
    forecastList.add(forecast);

    forecast = new Forecast();
    forecast.setDate("28日星期天");
    forecast.setType("晴");
    forecast.setFengxiang("无风");
    forecast.setHigh("高温 11度");
    forecast.setLow("低温 1度");
    forecastList.add(forecast);

    forecast = new Forecast();
    forecast.setDate("29日星期天");
    forecast.setType("晴");
    forecast.setFengxiang("无风");
    forecast.setHigh("高温 11度");
    forecast.setLow("低温 1度");
    forecastList.add(forecast);

    data.setForecast(forecastList);
    return data;
  }
}
