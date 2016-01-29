package com.net.second.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12) {
            System.out.println("当前时间:" + w.getHour() + "点工作，精神百倍");
        } else {
            w.setCurrent(new NoonState());
            w.writeProgram();
        }
    }
}
