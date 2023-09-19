import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Создание нового объекта HashMap
        HashMap<String, Integer> tools = new HashMap<>();
        
        // Добавление элементов в HashMap
        tools.put("Молоток", 3);
        tools.put("Гвозди", 50);
        tools.put("Отвёртка", 1);
            

        // Вывод всех ключей и значений
        for (String key : tools.keySet()) {
            System.out.println("Инструмент: " + key + ", Количество: " + tools.get(key));
        }

        // Поиск элемента по ключу
        if (tools.containsKey("Отвёртка")) {
            System.out.println("Отвёртка найдена, количество: " + tools.get("Отвёртка"));
        } else {
            System.out.println("Отвёртка не найдена.");
        }

        // Удаление элемента по ключу
        tools.remove("Гвозди");

        // Обновление значения по ключу
        tools.put("Молоток", 2);

        // Проверка наличия ключа
        if (tools.containsKey("Гвозди")) {
            System.out.println("Гвозди ещё есть.");
        } else {
            System.out.println("Гвоздей больше нет.");
        }
    }
}