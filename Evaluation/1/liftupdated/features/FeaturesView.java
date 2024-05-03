package features;

import java.util.Scanner;

public class FeaturesView {
    private FeatruesModel featruesModel;

    public FeaturesView() {
        this.featruesModel = new FeatruesModel(this);
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n1.Display Position of Lift\n2.Assign Lift to User\n3.Set Position\n4.Update Maiantanance Details\n0.exit\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    featruesModel.displayPosition();
                    break;
                case 2:
                    assign();
                    break;
                case 3:
                    setPosition();
                    break;
                case 4:
                    maintanance();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }

    private void setPosition() {
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
        }
        featruesModel.setPositon(arr);
        System.out.println("Position updated sucessfully");
    }

    private void assign() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Current Floor: ");
        int start=scanner.nextInt();
        System.out.print("Destination Floor: ");
        int end=scanner.nextInt();
        System.out.print("Capacity of People: ");
        int capacity=scanner.nextInt();
        featruesModel.assignLift(start,end,capacity);
    }

    private void maintanance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1.Set Lift to Maintanace\n2.Revoke from Maintanace\0.Exit\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter lift number 1-5");
                featruesModel.setMaintanance(scanner.nextInt());
                break;
            case 2:
                System.out.println("Enter lift number 1-5");
                featruesModel.revokeMaintanance(scanner.nextInt());
                break;
            case 0:
                return;
            default:
                System.out.println("Enter Valid Choice");
        }

    }

    public void displayPosition(int[] position) {
        System.out.println("Lift :L1 L2 L3 L4 L5");
        System.out.print("Floor:");
        for (int i = 0; i < position.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            if (position[i] == 10) {
                System.out.print(10);
                continue;
            }
            System.out.print(" " + position[i]);
        }
    }

    public void showSucessmsg(String s) {
        System.out.println(s);
    }

    public void showErrormsgForManintanance(String s) {
        System.out.println(s);
        maintanance();
    }
}
