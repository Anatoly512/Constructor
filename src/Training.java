public class Training {

    private static int a;

    private NewClass newClass = new NewClass();     // вызывается конструктор для класса NewClass

    private Training() {                                         //  Конструктор для класса Training

        System.out.println("\n TRAINING CONSTRUCTOR  ");

    }

    public static void main(String[] args) {
     // NewClass myConstructor = new NewClass();
     // new NewClass();
        new Cat();         //  здесь вызывается конструктор для Cat

        Training myO = new Training();    //  здесь вызывается конструктор класса Training

        myO.doMy();

    }

         private void doMy () {

         newClass.NewClass(a);     //  вызов обычного метода, несмотря на похожесть названия
         newClass.printMyString();

             NewClass myConstructor = new NewClass();   //  а вот здесь вызывается конструктор для класса NewClass
             myConstructor.printMyString();

         }

}
