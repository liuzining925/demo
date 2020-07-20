package com.lzn.demo.http;

import rxhttp.wrapper.annotation.DefaultDomain;
import rxhttp.wrapper.annotation.Domain;

/**
 * Created by 哼哼
 * Date：2020/7/19 19:58
 * Desc:
 */
public class Url {
    @DefaultDomain
    public static String base_url = "https://www.wanandroid.com";

    //多域名配置  name 自定义名称  设置完成后rebuild    使用setDomainToBaseUrlbaiduIfAbsent()
//    @Domain(name = "baidu")
//    public static String baidu = "www.baidu.com";

}