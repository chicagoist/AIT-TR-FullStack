Input-Output Streams. File Handling

A distinguishing feature of many programming languages is their ability to work with files and streams. In Java, the core functionality for working with streams is concentrated in classes from the java.io package.

The key concept here is the concept of a stream. Although the term "stream" in programming is quite overloaded and can denote various concepts, in this context, related to file handling and input-output operations, we will refer to a stream as an abstraction used for reading or writing information (files, sockets, console text, etc.).

A stream is associated with a real physical device through Java's input-output system. We can define a stream that is associated with a file, and through it, we can perform reading or writing of the file. It can also be a stream associated with a network socket, through which data can be sent or received over the network. All these tasks: reading and writing different types of files, exchanging information over the network, input and output to the console, are solved in Java using streams.

An object from which you can read data is called an input stream, and an object to which you can write data is called an output stream. For example, if you need to read the contents of a file, you would use an input stream, and if you need to write to a file, you would use an output stream.

At the foundation of all classes managing byte streams are two abstract classes: InputStream (representing input streams) and OutputStream (representing output streams).

However, working with bytes is not very convenient, so abstract classes Reader (for reading character streams) and Writer (for writing character streams) were added to work with character streams.

All other classes working with streams are descendants of these abstract classes.

Потоки ввода-вывода. Работа с файлами

Отличительной чертой многих языков программирования является работа с файлами и потоками. В Java основной функционал работы с потоками сосредоточен в классах из пакета java.io.

Ключевым понятием здесь является понятие потока. Хотя понятие "поток" в программировании довольно перегружено и может обозначать множество различных концепций. В данном случае применительно к работе с файлами и вводом-выводом мы будем говорить о потоке (stream), как об абстракции, которая используется для чтения или записи информации (файлов, сокетов, текста консоли и т.д.).

Поток связан с реальным физическим устройством с помощью системы ввода-вывода Java. У нас может быть определен поток, который связан с файлом и через который мы можем вести чтение или запись файла. Это также может быть поток, связанный с сетевым сокетом, с помощью которого можно получить или отправить данные в сети. Все эти задачи: чтение и запись различных файлов, обмен информацией по сети, ввод-ввывод в консоли мы будем решать в Java с помощью потоков.

Объект, из которого можно считать данные, называется потоком ввода, а объект, в который можно записывать данные, - потоком вывода. Например, если надо считать содержание файла, то применяется поток ввода, а если надо записать в файл - то поток вывода.

В основе всех классов, управляющих потоками байтов, находятся два абстрактных класса: InputStream (представляющий потоки ввода) и OutputStream (представляющий потоки вывода)

Но поскольку работать с байтами не очень удобно, то для работы с потоками символов были добавлены абстрактные классы Reader (для чтения потоков символов) и Writer (для записи потоков символов).

Все остальные классы, работающие с потоками, являются наследниками этих абстрактных классов.

**Code:**

\
code/homework43/src/AnagramList.java

```java
import java.util.*;

public class AnagramList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("john");
        names.add("mary");
        names.add("jonh");
        names.add("bill");
        names.add("njoh");
        names.add("amry");

        AnagramList anagramList = new AnagramList();
        System.out.println(anagramList.findAnagrams("john",names));
        System.out.println(anagramList.findAnagrams("evg",names));
    }

    /*
    Написать метод, который принимает список имен и их анаграмм и имя, по которому
    он возвращает список всех его анаграмм, включая само имя.
     При решении использовать мапу.

Пример: [john, mary, ,jonh, bill, njoh, amry],
john -> [john,jonh,njoh] (все буквы в словах маленькие)

honj = [john,jonh,njoh]
amry = [mary,amry]
bill = [bill]
     */

   public List<String> findAnagrams( String name,List<String>strings){
        Map<String,List<String>>anagrams = new HashMap<>();

        for(String s : strings){
            String sortedKey = sortAnagram(s);
            if(anagrams.containsKey(sortedKey)){
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey,value);
            } else{
                List<String>value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey,value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(name),List.of());
    }

    private String sortAnagram(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}

```

\
code/io_streams/src/Main.java

```java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
    IO Streams   Ввод-вывод
    потоки ввода- вывода

    Абстрактное понятие "поток" в данном случае является ключевым.
    Обьект, из которого считываются данные - является потоком ввода.
    Обьект, в который записываются данные - поток вывода

    Все классы, работающие с вводом-выводом можно разделить на две большие группы:
    работающие с байтами и работающие с символами

    В основе всех классов, работающих с байтами находятся два абстрактных класса -
    InputStream и OutputStream
    В основе классов, работающих с символами тоже два абстрактных класса - Reader, Writer

    Потоки байтов

    InputStream -  базовый класс для всех классов, работающих с потоками ввода

    Основные методы:

    int read() - возвращает текущий байт из потока ( целочисленное представление).
    Когда байтов в потоке не остается, метод вернет -1

    int read( byte[] buffer) -  считывает байты из потока в буферный массив. Возвращает число прочитанных
                                байтов. Если ничего не прочитано, то вернет -1

     int read(byte[]buffer, int index, number)
                buffer - массив байтов, в которые записываются считанные байты
                index - индекс этого массива, начиная с которого записываются байты
                number -  количество байтов, которые необходимо считать

     available() -  возвращает количество доступных для чтения байтов
     close() - закрывает поток

     OutPutStream -  базовый класс для всех классов, работающих с потоками на запись

     void close()
     void flush() - сбрасывает содержимое буфера вывода
                в поток

      void write( int b) -  записывает в поток 1 байт
      void write(byte[] buffer) - записывает в выходной поток массив buffer
      void write(byte[]buffer, int index, number)

      FileOutputStream -  используется для записи байтов в файл. Дочерний класс по отношению к OutputStream
      FileOutputStream(String fileName)
      FileOutputStream(File file)
      FileOutputStream( String fileName, boolean append)
      FileOutputStream( File fileName, boolean append)
      если append = true, данные добавляются в конец файла
      false -  файл полностью перезаписывается
     */
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.exists());

        String  string = "Hello Java";

       try (FileOutputStream fos = new FileOutputStream(file)){
           byte[] buffer = string.getBytes();
           fos.write(buffer,0,buffer.length);
       }catch (IOException e){
           System.out.println(e.getMessage());
       }

       // FileInputStream - чтение файлов

       try(FileInputStream fis = new FileInputStream(file))
       {
           int i;
           while((i = fis.read()) != -1){
               System.out.print((char )i);
           }

       }catch (IOException e){
           System.out.println(e.getMessage());
       }

       // чтение в буферный массив
        System.out.println("reading in buffer array");

       try(FileInputStream fin = new FileInputStream(file)) {
           byte[] buffer = new byte[512];

           int counter;
           while((counter = fin.read(buffer)) != -1){
               for( int i = 0; i < counter; i++){
                   System.out.println((char)buffer[i]);
               }
           }

       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }

    }



}
```

\
code/io_streams/src/Main1.java

```java
import java.io.*;

public class Main1 {
    // ввод- вывод текстовой информации
    /*
    Reader, Writer -  абстрактные классы, находящиеся в основе классов работающих с вводом-выводом символьной информации

   Reader  отвечает за чтение
   int read() -  возвращает текущий символ потока и -1 если символов нет
   int read(char[] buffer)
   int read(char[] buffer, int index, int num)

   Writer - работает на вывод
    void write(int ch)
    void write( char[] chars)

    FileWriter -  запись в файл
    FileWriter(String fileName)
    FileWriter(String fileName, boolean append)
    FileWriter(File fileName)
    FileWriter(File fileName, boolean append)
     */
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("output.txt",true))
        {
            String word = "Hello Java !";
            writer.write(word);
            writer.append('\n');
            writer.append('!');

            writer.flush();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        /*
        класс FileReader -  чтение текстовых файлов
        FileReader( String fileName)
        FileReader( File fileName)
         */
        try( FileReader reader = new FileReader("output.txt"))
        {
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        /*
        BufferedReader
        BufferWriter
        - классы, используемые для буферизации символьных потоков

        BufferedWriter
        BufferedWriter(Writer out)

         */
       try( BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter("buffered.txt",true))){
           String sentence = " Hello Java  and everybody else!";
           bufferedWriter.write(sentence);

       }
       catch (IOException exception){
           exception.getMessage();
       }

       //BufferedReader -  чтение текста с буферизацией
        // BufferedReader( Reader in )

        System.out.println("Buffered reader");

       //  метод readLine() -  собственный метод класса  BufferedReader -  позволяет считывать информацию построчно
        try(BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {

            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);

            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}


```

\
**Homework:**

```text
Task 1

1.Пусть есть текстовый файл такого вида:
1
2
3
4
5
Нужно написать метод, принимающий файл и возвращающий сумму всех значений


Task 2
Написать метод, принимающий текстовый файл, состоящий из нескольких строчек разной длины и возвращающий самую длинную строчку.
Пример
файл:
aaa
bbbbbbbbbb
cc
вернет метод: bbbbbbbbbb

```
