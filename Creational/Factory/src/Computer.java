public abstract class Computer {
    public Computer() {
    }

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    public String toString() {
        String var10000 = this.getRAM();
        return "RAM= " + var10000 + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
