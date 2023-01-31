import java.util.Scanner;

class cellphone { // Parent class

    public void call(long num) {
        System.out.printf("[Calling number %d ....]", num);
    }
}

interface camera { // Interface 1
    void photo();

    void video();
}

interface wifi { // Interface 2
    void connect(String pass);
}

interface musicplayer { // Interface 3
    void play();

    void record();
}

class smartphone extends cellphone implements camera, wifi, musicplayer { // Child class

    // Methods of Interface Camera
    public void photo() {
        System.out.println("[Taking photo in 4k....]");
    }

    public void video() {
        System.out.println("[Taking video in 4k....]");
    }

    // Methods of Interface wifi
    public void connect(String pass) {
        if (pass == "welldone") {
            System.out.println("[Connecting to network....]");
        }
    }

    // Methods of Interface musicplayer
    public void play() {
        System.out.println("[Playing a song....]");
    }

    public void record() {
        System.out.println("[Recording....]");
    }

}

public class polymorphism_using_interfaces {
    public static void main(String[] args) {
        int ch;
        long n;
        String p;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CHOICE OF FUNCTION");
        System.out.println("1. Take photo\n2. Take video\n3. Connect to wifi\n4. Play music\n5. Record\n6. Call");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                camera obj = new smartphone(); // Polymorphism using Dynamic dispatch
                obj.photo();
                break;
            }

            case 2: {
                camera obj = new smartphone(); // Polymorphism using Dynamic dispatch
                obj.video();
                break;
            }

            case 3: {
                wifi obj = new smartphone(); // Polymorphism using Dynamic dispatch
                System.out.println("Enter password to connect: ");
                p = sc.nextLine();
                obj.connect(p);
                break;
            }

            case 4: {
                musicplayer obj = new smartphone(); // Polymorphism using Dynamic dispatch
                obj.play();
                break;
            }

            case 5: {
                musicplayer obj = new smartphone(); // Polymorphism using Dynamic dispatch
                obj.record();
                break;
            }

            case 6: {
                cellphone obj = new smartphone(); // Polymorphism using Dynamic dispatch
                System.out.println("Enter number to call:");
                n = sc.nextLong();
                obj.call(n);
                break;
            }

            default: {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}