public class heapSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Исходный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        heapSort(arr);

        System.out.println("\nОтсортированный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Извлекаем элементы из кучи по одному
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Функция для перегруппировки поддерева с корнем i в кучу с n элементами
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Если правый потомок больше, чем самый большой элемент на данный момент
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно перегруппируем поддерево
            heapify(arr, n, largest);
        }
    }
}
