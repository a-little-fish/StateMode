package com.net.second.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Work {

    private State current;

    public Work() {
        current = new ForenoonState();
    }

    private double hour;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    private boolean finish = false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
