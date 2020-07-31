package com.company;

public class CloudManagerServer extends Server {
    private String HDD;
    private String RAM;
    private String CPU;

    public CloudManagerServer(String HDD, String RAM, String CPU) {
        this.HDD = HDD;
        this.RAM = RAM;
        this.CPU = CPU;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
