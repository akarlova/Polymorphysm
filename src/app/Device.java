package app;

abstract class Device {

    double parameterOne;
    double parameterTwo;

    public Device(double parameterOne, double parameterTwo) {
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
    }

    abstract double getResult();
}
