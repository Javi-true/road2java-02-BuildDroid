public class Droid {

    //Field declaration
    int batteryLevel = 100;
    String name;

    //constructor method.
    public Droid(String droidName){
        name = droidName;
    }

    //toString method.
    public String toString(){
        return "Hello, I'm the droid: " + name;
    }

    //method 1.
    public String performTask(String task){
        batteryLevel -= 10;
        return name + " is performing task: " + task;
    }

    //method 2.
    public String energyReport(){
        return name+"'s energy level is at: "+batteryLevel+"%";
    }

    //Energy transfer method.
    public String energyTransfer(Droid droid){
        batteryLevel -= 10;
        droid.batteryLevel +=10;
        return "Energy transferred";
    }

    //main method.
    public static void main(String[] args){
        //new object.
        Droid Codey = new Droid("Codey");

        //new object.
        Droid R2D2 = new Droid("R2D2");

        System.out.println(Codey.energyReport());
        System.out.println(Codey.performTask("Battle"));
        System.out.println(Codey.energyReport());
        System.out.println(R2D2.energyReport());
        //control
        System.out.println("-----------------------------------------------");
        //test transfer.
        System.out.println(Codey.energyTransfer(R2D2));
        System.out.println(Codey.energyReport());
        System.out.println(R2D2.energyReport());
    }
}
