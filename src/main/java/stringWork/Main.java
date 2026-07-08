package stringWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Нужно собрать одну строку через StringBuilder , где имена разделены запятой и
 пробелом.
 После последнего имени лишней запятой быть не должно.
 Входные данные
 Java
 ["Анна", "Иван", "Мария", "Олег"]
 */
public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        List<Student> names = List.of(new Student(5,"Анна"),new Student(3, "Иван"),
                new Student(4, "Мария"),new Student( 3,"Олег"));
        sb.append("отчет по ученикам: \n");
        sb.append("=".repeat(30));
        sb.append("\n");
        for (int i = 0; i < names.size(); i++) {
            sb.append(names.get(i));
            if (i < names.size() - 1) {
                sb.append(",\n");
            }
        }
        if (sb.length() > 0){
            sb.delete(sb.length()-2,sb.length());
        }
        System.out.println(sb);

    }
}