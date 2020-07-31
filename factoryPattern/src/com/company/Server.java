package com.company;

public abstract class Server {
    public abstract String getHDD();
    public abstract String getRAM();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "CPU = " + this.getCPU() + " | RAM = " + this.getRAM() + " | HDD = " + this.getHDD();
    }
}
