package cn.wangyu.springcloud.weather.model;

import java.io.Serializable;

/**
 * 预测
 * @Author wangyu
 * @Date 2019/10/12 13:44
 * @Version 1.0
 */
public class Forecast implements Serializable {

  private static final long serialVersionUID = -6959309568935426905L;

  //日期
  private String date;
  //最高温度
  private String high;
  //风力
  private String fengli;
  //最低温度
  private String low;
  //风向
  private String fengxiang;
  //类型（小雨，大雨，多云）
  private String type;

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getHigh() {
    return high;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public String getFengli() {
    return fengli;
  }

  public void setFengli(String fengli) {
    this.fengli = fengli;
  }

  public String getLow() {
    return low;
  }

  public void setLow(String low) {
    this.low = low;
  }

  public String getFengxiang() {
    return fengxiang;
  }

  public void setFengxiang(String fengxiang) {
    this.fengxiang = fengxiang;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
