import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {

    private String name;

    private int amountRAM;
    private String operatingSystem;
    private int hd;
    private String color;

    public Notebook(String name, int amountRAM, String operatingSystem, int hd, String color) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.hd = hd;
        this.color = color;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("hd");
        list.add("color");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", обьем ЖД: " + hd +
                ", цвет: " + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return hd;
    }

    public void setPrice(int hd) {
        this.hd = hd;
    }

    public String getModel() {
        return color;
    }

    public void setModel(String color) {
        this.color = color;
    }
}