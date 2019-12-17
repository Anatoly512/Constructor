public class Training {

    private static int a;

    NewClass newClass = new NewClass();

    public Training() {

        System.out.println("\n TRAINING CONSTRUCTOR  \n");

    }

    public static void main(String[] args) {

        NewClass myConstructor = new NewClass();
     // new NewClass();

        Training myO = new Training();

        myO.doMy();

    }

         private void doMy () {

         newClass.NewClass(a);
         newClass.printMyString();


         }

}
