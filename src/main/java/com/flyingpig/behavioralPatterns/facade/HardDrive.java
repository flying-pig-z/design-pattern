package com.flyingpig.behavioralPatterns.facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from hard drive at LBA: " + lba);
        return new byte[size]; // 返回空字节数组，模拟数据读取
    }
}