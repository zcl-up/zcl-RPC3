package com.lxl.loadbalance;

import java.net.InetSocketAddress;

/**
 * @Author ZhangChengliang
 * @Description lxl-rpc
 * @DateTime 2023/8/18  21:18
 **/
public interface Selector {

    InetSocketAddress nextServiceAddr();

}
