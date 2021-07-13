public class Variable {
    public static void main(String[] args) {
        byte numberOfCores = 4;
        short amountOfRam = 16;
        int batteryChargePercent = 98;
        long totalVideoMemoryVRam = 4;
        float usbBusVersion = 3.1f;
        double hardDiskCapacity = 499.96;
        char firstLetterSerialNumber = 'C';
        boolean  usedForStudying = true;

    System.out.println(
        "Информация о компьютере:" + System.lineSeparator() +
        "\tчисло ядер: " + numberOfCores + System.lineSeparator() +
        "\tоперативная память: " + amountOfRam + " Гб" + System.lineSeparator() +
        "\tзаряд батареи: " + batteryChargePercent + "%" + System.lineSeparator() +
        "\tразмер памяти видеокарты: " + totalVideoMemoryVRam + " Гб" + System.lineSeparator() +
        "\tверсия USB: " + usbBusVersion  + System.lineSeparator() +
        "\tсвободное место на диске: " + hardDiskCapacity + " Гб" + System.lineSeparator() +
        "\tпервый символ серийного номера: " + firstLetterSerialNumber  + System.lineSeparator() +
        "\tиспользуется для учёбы: " + usedForStudying  + System.lineSeparator()
        );
    }
}