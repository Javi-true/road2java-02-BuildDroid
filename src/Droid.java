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

    //main method.
    public static void main(String[] args){
        //new object.
        Droid Codey = new Droid("Codey");
        System.out.println(Codey.name);
        System.out.println(Codey.batteryLevel);
        System.out.println(Codey.performTask("Dancing"));
        System.out.println(Codey.batteryLevel);


    }
}
