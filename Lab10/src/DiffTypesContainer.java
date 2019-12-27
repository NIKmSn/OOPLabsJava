public class DiffTypesContainer<E> {
    private E[] array;
    private int iterator = -1;
    public DiffTypesContainer(int numberOfElements) {
        array = (E[]) new Object[numberOfElements];
    }

    public void add(E element) {
        iterator++;
        array[iterator] = element;
    }

    public int getLength() {
        return array.length;
    }

    public E getElement(int index) {
        return array[index];
    }
}

class Task2 {
    public static void main(String[] args) {
        DiffTypesContainer arrayOfIntegers = new DiffTypesContainer(5);
        for (int i = 0; i < arrayOfIntegers.getLength(); i++)
            arrayOfIntegers.add(i);

        DiffTypesContainer arrayOfStrings = new DiffTypesContainer(5);

        for (int i = 0; i < arrayOfStrings.getLength(); i++)
            arrayOfStrings.add("element" + i);

        for (int i = 0; i < arrayOfIntegers.getLength(); i++) {
            System.out.print(arrayOfIntegers.getElement(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayOfStrings.getLength(); i++) {
            System.out.print(arrayOfStrings.getElement(i) + " ");
        }

        System.out.println("2й элемент массива строк: " + arrayOfStrings.getElement(1));
        System.out.println("3й элемент массива чисел: " + arrayOfIntegers.getElement(2));

    }
}
