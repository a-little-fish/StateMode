package com.net.second;

import com.net.second.state.Work;

/**
 * Created by daidaijie on 2016/1/29.
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();

        int[] hourList = {9, 10, 12, 13, 14, 17, 19, 22};

        for (int hour : hourList) {
            work.setHour(hour);
            work.writeProgram();

            if (hour == 17) work.setFinish(false);


        }

    }
}
