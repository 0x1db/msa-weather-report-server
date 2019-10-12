package cn.wangyu.springcloud.weather.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @Author wangyu
 * @Date 2019/10/12 13:42
 * @Version 1.0
 */
public class Weather implements Serializable {

  private static final long serialVersionUID = -8062954922531114443L;

  //城市
  private String city;
  //
  private String aqi;
  //感冒
  private String ganmao;
  //温度
  private String wendu;
  //昨天天气
  private Yesterday yesterday;
  //未来预测
  private List<Forecast> forecast;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAqi() {
    return aqi;
  }

  public void setAqi(String aqi) {
    this.aqi = aqi;
  }

  public String getGanmao() {
    return ganmao;
  }

  public void setGanmao(String ganmao) {
    this.ganmao = ganmao;
  }

  public String getWendu() {
    return wendu;
  }

  public void setWendu(String wendu) {
    this.wendu = wendu;
  }

  public Yesterday getYesterday() {
    return yesterday;
  }

  public void setYesterday(Yesterday yesterday) {
    this.yesterday = yesterday;
  }

  public List<Forecast> getForecast() {
    return forecast;
  }

  public void setForecast(List<Forecast> forecast) {
    this.forecast = forecast;
  }
}
