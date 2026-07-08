package stringWork;

import java.util.List;
import java.util.Locale;
//добавить проверку на -1(выход за пределы)
public class  StringWork {
    public static void main(String[] args) {
        String image = "home.Work .png";
        String text = " Java очень популярный язык. Java используют во многих компаниях.";
        System.out.println(chekFormat(image));
        reformatText(text,"Java","JAVA","SF");
        String absPath = "C:\\Users\\MaiBen\\Pictures\\testImage.jpeg";
        getNameFileAndFormatFile(absPath);
        String email = "marine.marcinkus@yandex.ru";
        System.out.println(chekEmail(email));
        System.out.println(censoredWord("Ты дурак и лох в одном лице"));
        System.out.println(printHead("Заголовок"));
        firstWordAndLastWord("Ты дурак и лох в одном лице");
        normalizedLogin("ma Ri      Ne");

    }

    public static void normalizedLogin(String login){
        String normalizeStrip = login.strip().replaceAll(" ","");
        if (normalizeStrip.isEmpty())return;
        String firstLatter = normalizeStrip.substring(0,1).toUpperCase();
        String fullName = firstLatter + normalizeStrip.substring(1).toLowerCase();
        System.out.println(fullName);
    }

    public static void firstWordAndLastWord(String text){
        String firstWord = text.substring(0,text.indexOf(" "));
        String lastWord = text.substring(text.lastIndexOf(" "));
        System.out.println("first word: " + firstWord +"\nlast word: " + lastWord);
    }

    public static String printHead(String head){
        return "=".repeat(30) + "\n"+head.toUpperCase(Locale.ROOT)+"\n" + "=".repeat(30);
    }


    public static String censoredWord(String message) {
        List<String> censoredWords = List.of("дурак", "идиот", "лох");
        for (String badWord: censoredWords){
            while (message.contains(badWord)){
                message = message.replaceFirst(badWord,"***");
                message = message.replace(badWord,"***");
                message = message.replaceAll(badWord,"***");
            }
        }
        return message;
    }
        public static String censoredWords(String message) {
        List<String> censoredWords = List.of("дурак", "идиот", "лох");

        return censoredWords.stream().
                reduce(message, (text, badWord) ->
                        text.replaceAll(badWord,"***"));

    }

    private static String chekEmail(String email) {
        if (email.trim().isEmpty())return "Адрес не может быть пустым";
        String regex = "^[A-Za-z\\d]{3,}[._-][A-Za-z\\d]{3,}@[a-z]{3,}\\.[a-z]{2,}$";
        return email.matches(regex)? email + ": адрес корректен" : "Адрес не корректен";

    }


    public static void getNameFileAndFormatFile(String absPath){
        if (absPath.trim().isEmpty())return;
        int beginIndex = absPath.lastIndexOf("\\");
        int endIndex = absPath.lastIndexOf(".");
        String nameFile = absPath.substring(beginIndex+1,endIndex);
        String formatFile = absPath.substring(endIndex);
        System.out.println(nameFile + " " + formatFile);
    }

    public static List<String> formatFiles = List.of("jpeg", "jpg", "png", "gif");

    public static String chekFormat(String file) {
        String trim = file.trim();
        if (trim.isEmpty()) return "Пустой файл";
        String toLowCase = file.toLowerCase();
        String replaceAll = toLowCase.replaceAll(" ", "");
        int idx = replaceAll.lastIndexOf(".");
        String format = file.substring(idx +2);
        return formatFiles.contains(format) ? replaceAll : "формат не подходит для скачивания." ;
    }

    public static void reformatText(String text,String oldWord,String newWord,String existWord){
        String deleteTab = text.trim();
        String replaceWord = deleteTab.replaceAll(oldWord,newWord);
        boolean contains = text.contains(existWord);
        System.out.println(replaceWord +" \nword "+existWord+" contains: "+ contains);

    }
}
