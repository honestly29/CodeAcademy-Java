//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Droid {
    int batteryLevel;
    String name;

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println("Codey is at " + batteryLevel + "% battery level");
    }

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        Droid amy = new Droid("Amy");


        System.out.println(codey);
        System.out.println(amy);

        codey.performTask("dancing");
        codey.energyReport();
    }

}