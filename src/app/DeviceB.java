package app;


public class DeviceB extends Device {

    public DeviceB(double parameterOne, double parameterTwo) {
        super(parameterOne, parameterTwo);
    }

    private final static double CONSTANCE = 1.5;

    @Override
    double getResult() {
        return (parameterOne + parameterTwo) * CONSTANCE;
    }
}
