package org.example.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class JsonTest {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("./files/dirb/file2.txt")) {
            Scanner scanner = new Scanner(reader);
            // Прочитати заголовок
            String title = scanner.nextLine();
            String[] titles = title.split(" ");
            // Створити список пользователей
            List<User> users = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split(" ");
                users.add(new User(elements[0], Integer.parseInt(elements[1])));
            }
            // Записати список пользователей в файл user.json
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(users);
            FileWriter writer = new FileWriter("user.json");
            writer.write(json);
            System.out.println("json = " + json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
