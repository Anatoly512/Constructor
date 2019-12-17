class NewClass {

    NewClass() {       //  Конструктор!!!

        System.out.println("\n CONSTRUCTOR   ");

    }

    int NewClass(int a) {       //  не Конструктор!!!  а обычный метод;  у конструктора нет возвращаемого типа

        int b;
        b = a;

        System.out.println("\n NOT CONSTRUCTOR,  BUT METHOD !   ");
        return b;

    }

    void printMyString() {

        System.out.println("\n My String  ");

        Cat kitty = new Cat();    //  вызов конструктора класса Cat

    }


}
