public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(array, 3));
    }

    /* Алгоритм делит входную коллекцию на равные половины,
     и с каждой итерацией сравнивает целевой элемент с элементом в середине.
     Поиск заканчивается при нахождении элемента. Иначе продолжаем искать элемент,
     разделяя и выбирая соответствующий раздел массива. Целевой элемент сравнивается со средним.*/

    public static int binarySearch(int[] arr, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}