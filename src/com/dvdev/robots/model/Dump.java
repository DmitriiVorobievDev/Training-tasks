package com.dvdev.robots.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dump {

    private final Object lock = new Object();
    private final List<RobotDetail> dump = new LinkedList<>();

    public Dump() {
    }

    public Dump(List<RobotDetail> initialRobotDetails) {
        dump.addAll(initialRobotDetails);
    }

    public void add(RobotDetail robotDetail) {
        dump.add(robotDetail);
    }

    public RobotDetail remove(int index) {
        return dump.remove(index);
    }

    public List<RobotDetail> removeAll() {
        List<RobotDetail> robobDetails = new ArrayList<>(dump);
        dump.clear();
        return robobDetails;
    }

    public int size() {
        return dump.size();
    }

    public boolean isNotempty() {
        return !dump.isEmpty();
    }

    public Object getLock() {
        return lock;
    }
}
