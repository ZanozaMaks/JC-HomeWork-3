public abstract class Vehicles implements Service{

    private final String modelName;
    private final int wheelsCount;

    abstract void check();

    public String getModelName() {return modelName; }

    public int getWheelsCount() { return wheelsCount; }

    public Vehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void SetModelName(String newName) {
    }
}

