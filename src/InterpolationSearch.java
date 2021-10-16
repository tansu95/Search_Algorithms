public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println(interpolationSearch(array, 5));
    }

    /*Интерполяционный поиск используется для поиска элементов в отсортированном массиве.
    Он полезен для равномерно распределенных структур данных.При равномерно распределенных данных
    местонахождение элемента определяется точнее.
   */

    public static int interpolationSearch(int[] integers, int elementToSearch) {
        int startIndex = 0;
        int lastIndex = (integers.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
                (elementToSearch <= integers[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex + (((lastIndex - startIndex) /
                    (integers[lastIndex] - integers[startIndex])) *
                    (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch)
                return pos;

            if (integers[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        return -1;
    }
}