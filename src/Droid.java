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

    //main method.
    public static void main(String[] args){
        //new object.
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);

    }
}
