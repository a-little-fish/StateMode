package com.net.first.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态" + state.getClass().toString());
    }

    public void request(){
        state.handle(this);
    }
}
