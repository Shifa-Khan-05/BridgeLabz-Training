public class SmartHomeApp {

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(120);
        Appliance ac = new AC();

        UserController controller = new UserController();

        controller.operateDevice(light);
        controller.operateDevice(fan);
        controller.operateDevice(ac);

        System.out.println();
        controller.compareEnergy(light, ac);
    }
}
