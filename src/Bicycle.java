public class Bicycle extends Vehicles {

    @Override
    void check() {

    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
