package app;

public class Main {

    public static void main(String[] args) {

        handleDevice();
    }

    private static void handleDevice() {
        View view = new View();
        String[] data = view.getData();
        double parameterOne = Double.parseDouble(data[0]);
        double parameterTwo = Double.parseDouble(data[1]);


        Device deviceA = new DeviceA(parameterOne, parameterTwo);
        String resultOne = Rounder.roundValue(deviceA.getResult());
        Device deviceB = new DeviceB(parameterOne, parameterTwo);
        String resultTwo = Rounder.roundValue(deviceB.getResult());

        String output = "1.Result of device A is " + resultOne +
                "\n2.Result of device B is " + resultTwo;
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
