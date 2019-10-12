package cn.wangyu.springcloud.weather.controller;

import cn.wangyu.springcloud.weather.model.City;
import cn.wangyu.springcloud.weather.service.WeatherReportService;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author wangyu
 * @Date 2019/10/12 13:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

  private final static Logger LOG = LoggerFactory.getLogger(WeatherReportController.class);

  @Autowired
  private WeatherReportService weatherReportService;

  @GetMapping("/cityId/{cityId}")
  public ModelAndView getReportByCityId(@PathVariable("cityId")String cityId, Model model){
    // 获取城市ID列表
    // TODO 改为由城市数据API微服务来提供数据
    List<City> cityList = null;
    try {

      // TODO 改为由城市数据API微服务提供数据
      cityList = new ArrayList<>();
      City city = new City();
      city.setCityId("101280601");
      city.setCityName("成都");
      cityList.add(city);

    } catch (Exception e) {
      LOG.error("Exception!", e);
    }

    model.addAttribute("title", "天气预报微服务");
    model.addAttribute("cityId", cityId);
    model.addAttribute("cityList", cityList);
    model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
    return new ModelAndView("weather/report", "reportModel", model);
  }
}
