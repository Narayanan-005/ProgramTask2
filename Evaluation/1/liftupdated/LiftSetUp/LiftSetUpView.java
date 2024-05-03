package LiftSetUp;

import features.FeaturesView;

import java.util.Scanner;

public class LiftSetUpView {
    private LiftSetUpModel liftSetUpModel;

    public LiftSetUpView() {
        liftSetUpModel=new LiftSetUpModel(this);
    }

    public void setUp() {
        System.out.println("---Welcome to Lift System---\n");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the capacity of the Lift");
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
        }
        liftSetUpModel.setUpCapacity(arr);
        System.out.println("Capacity initialised Sucessfully");
        new FeaturesView().init();
    }
}
