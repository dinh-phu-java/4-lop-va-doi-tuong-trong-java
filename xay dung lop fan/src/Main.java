public class Main {
    public static void main(String[] args) {
        Fan fan1= new Fan();
        Fan fan2= new Fan();

        fan1.setOn();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(6.2);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5.7);

        String str1= fan1.toString();
        String str2= fan2.toString();
        System.out.println(str1);
        System.out.println(str2);
    }
}
