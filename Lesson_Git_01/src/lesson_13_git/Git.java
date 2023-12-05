package lesson_13_git;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Git {
  public static void main(String[] args) throws IOException {

    System.out.println("Hello, Git!");
    FileReader fr = new FileReader("Lesson_13/src/lesson_13_git/HowToIgnoreIdea.txt");
    Scanner scan = new Scanner(fr);

    int i = 1;

    while (scan.hasNextLine()) {
      System.out.println(i + "   " + scan.nextLine());
      i++;
    }

    fr.close();
  }
}

/*
Как удалить любую папку, в т.ч. и .idea, и лишние файлы из Git

Создаем файл .gitignore в корне репозитария с содержимым:

echo ".idea" > .gitignore


------------------------------------------------------------------
Подробнее можно ознакомиться на странице: https://git-scm
.com/book/ru/v1/Основы-Git-Запись-изменений-в-репозиторий
Удаляем ненужные папки и файлы при синхронизации в Git репозиторий

Удалим все проиндексированные файлы:

git rm -r -f --cached .

Запустим индексацию заново:

git add .

Добавляем коммит и пушим:

git commit -m "Remove .idea from index"
git push -u origin main


-----------------------------------------------------------------------------------

 */
