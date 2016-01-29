package com.net.first;

import com.net.first.state.Context;
import com.net.first.state.ContreteStateA;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Context context = new Context(new ContreteStateA());

        context.request();
        context.request();
        context.request();
        context.request();
    }
}
