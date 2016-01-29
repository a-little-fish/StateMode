package com.net.second.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间" + w.getHour() + "点下班回家了");
    }
}
