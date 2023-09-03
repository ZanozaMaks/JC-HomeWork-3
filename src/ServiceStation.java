public class ServiceStation {
    public void check(Service service) {
        service.doService();
    }
        public void check(Vehicles vehicles) {
        vehicles.SetModelName("new name");
        vehicles.doService();
    }
}
