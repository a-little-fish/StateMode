package com.net.second.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.isFinish()) {
            w.setCurrent(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() < 21) {
                System.out.println("当前时间:" + w.getHour() + "点加班哦，疲劳至极");
            } else {
                w.setCurrent(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
