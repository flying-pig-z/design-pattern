package com.flyingpig.behavioralPatterns.facade;

/*
    外观模式用于为子系统中的一组接口提供一个统一的接口。外观定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }
}
