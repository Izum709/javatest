package ProjectLaptop;

public class Laptop {
    private String brand;
    private String name;
    private String color;
    private String operationSystem;
    private String monitorDiagonal;
    private String cores;
    private String ramMemory;
    private String ssdMemory;
    private String videoRam;

    public Laptop(String brand, String name, String color, String operationSystem,
                  String monitorDiagonal, String cores, String ramMemory, String ssdMemory,
                  String videoRam) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.operationSystem = operationSystem;
        this.monitorDiagonal = monitorDiagonal;
        this.cores = cores;
        this.ramMemory = ramMemory;
        this.ssdMemory = ssdMemory;
        this.videoRam = videoRam;
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(String monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getSsdMemory() {
        return ssdMemory;
    }

    public void setSsdMemory(String ssdMemory) {
        this.ssdMemory = ssdMemory;
    }

    public String getVideoRam() {
        return videoRam;
    }

    public void setVideoRam(String videoRam) {
        this.videoRam = videoRam;
    }



    @Override
    public String toString() {
        return
                "Бренд = '" + brand + '\'' +
                        ", Название = '" + name + '\'' +
                        ", Цвет = '" + color + '\'' +
                        ", Операционная система = '" + operationSystem + '\'' +
                        ", Диагональ Экрана = '" + monitorDiagonal + '\'' +
                        ", Количество ядер = '" + cores + '\'' +
                        ", Оперативная память = '" + ramMemory + '\'' +
                        ", Объем памяти накопителя = '" + ssdMemory + '\'' +
                        ", Объем видеопамяти = '" + videoRam + '\'';
    }
}
