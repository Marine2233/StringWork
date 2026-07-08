package HW;

import java.util.List;

public class StringWork {
    public static void main(String[] args) {
        List<Product> productList = List.of(new Product("p1",1800,1),new Product("p4",1000,1),new Product("p7",200,2));
        StringBuilder sb = new StringBuilder();
        sb.append("name; price; count\n");
        productList.forEach(product-> {
            sb.append(product.getName()).
                    append("; ").
                    append(product.getPrice()).
                    append("; ").
                    append(product.getCount()).
                    append(";\n");
        });
        System.out.println(sb);
        sb.delete(0,sb.length());

        System.out.println(isPalindrome("lvl"));

        sb.append("Jxava");
        sb.delete(1,2);
        System.out.println(sb);
        sb.delete(0,sb.length());

        List<String> names = List.of("Ann","Marg","Frank","Bob");
        sb.append("HTML\n<ul>\n");
        names.forEach(name -> sb.append("<li>").append(name).append("</li>\n"));
        sb.append("</ul>");
        System.out.println(sb);
        sb.delete(0,sb.length());

        sb.append("Программа запущена\n");
        sb.append("Входные данные:\n");

        String str = "Hello Python";
        sb.append(str);
        sb.append("\nДанные записаны.\n");

        int tab = str.indexOf(" ");
        sb.replace(tab + 1,str.length(),"Java");
        sb.append("Данные изменены.\n");
        System.out.println(sb);
        sb.delete(0,sb.length());

        StringBuilder stringBuilder2 = new StringBuilder();
        System.out.println(stringBuilder2.length());
        System.out.println(stringBuilder2.capacity());
        stringBuilder2.append("шестнадцать си-в");
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder2.length());
        System.out.println(stringBuilder2.capacity());
        stringBuilder2.insert(0,"не ");
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder2.length());
        System.out.println(stringBuilder2.capacity());


/**
 Задача 9.
 добавить строку длиной больше 16 символов;
 снова вывести длину и вместимость.
 Цель
 Понять разницу между length() и capacity()
 */
    }
    public static boolean isPalindrome(String line){
        StringBuilder sb = new StringBuilder();
        sb.append(line);
        return sb.toString().equalsIgnoreCase(line);
    }
}
