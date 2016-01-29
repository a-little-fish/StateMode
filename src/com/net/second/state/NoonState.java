package com.net.second.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            System.out.println("当前时间:" + w.getHour() + " 饿了，午饭，犯困，午休");
        } else {
            w.setCurrent(new AfternoonState());
            w.writeProgram();
        }
    }
}
