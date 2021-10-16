public class JumpSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println(jumpSearch(array, 9));
    }

    /* От двоичного поиска этот алгоритм отличает движение исключительно вперёд.
 Мы прыгаем вперёд на интервал sqrt(arraylength), пока не достигнем элемента большего,
 чем текущий элемент или конца массива. При каждом прыжке записывается предыдущий шаг.
 Прыжки прекращаются, когда найден элемент больше искомого.
 Затем запускаем линейный поиск между предыдущим и текущим шагами.*/

    public static int jumpSearch(int[] integers, int elementToSearch) {
        int arrayLength = integers.length;
        int jumpStep = (int) Math.sqrt(integers.length);
        int previousStep = 0;

        while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (integers[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength))
                return -1;
        }

        if (integers[previousStep] == elementToSearch)
            return previousStep;
        return -1;
    }
}