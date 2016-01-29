package com.net.first.state;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class ContreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ContreteStateA());
    }
}
