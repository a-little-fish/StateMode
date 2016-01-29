package com.net.second.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17) {
            System.out.println("当前时间:" + w.getHour() + "点，下午状态不错，继续努力");
        } else {
            w.setCurrent(new EveningState());
            w.writeProgram();
        }
    }
}
