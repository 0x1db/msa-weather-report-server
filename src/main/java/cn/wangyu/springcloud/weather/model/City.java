package cn.wangyu.springcloud.weather.model;

/**
 * @Author wangyu
 * @Date 2019/10/12 13:46
 * @Version 1.0
 */
public class City {

  //城市ID
  private String cityId;

  //城市名称
  private String cityName;

  //城市编码
  private String cityCode;

  //省
  private String province;

  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }
}
