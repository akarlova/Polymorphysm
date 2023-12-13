package app;

public class DeviceA extends Device {

    public DeviceA(double parameterOne, double parameterTwo) {
        super(parameterOne, parameterTwo);
    }

    @Override
    double getResult() {
        return parameterOne * parameterTwo;
    }
}

