package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "The black person wanted to say Hello";
        String[] bannedWords = {"Hello", "black"};
        processText(text, bannedWords);

        StringBuilder sb = new StringBuilder("Hello World");
        processStringBuilder(sb);

        System.out.println(isStrongPassword("Test_123"));
        System.out.println(isStrongPassword("weak"));

        checkPattern("Situation: Motivation, Action! Obligation.");

        String emails = "user1@gmail.com, user2@mail.ru, user3@yahoo.com, user4@yandex.ru";
        System.out.println(removeRuEmails(emails));
    }

    public static void processText(String text, String[] bannedWords) {
        int wordCount = text.split("\\s+").length;
        int sentenceCount = text.split("[.!?]").length;
        System.out.println("Words: " + wordCount + ", Sentences: " + sentenceCount);

        for (String word : bannedWords) {
            text = text.replaceAll("\\b" + word + "\\b", "***");
        }
        System.out.println("Filtered text: " + text);
    }

    public static void processStringBuilder(StringBuilder sb) {
        System.out.println("Substring: " + sb.substring(0, 5));

        sb.append("!!!");
        System.out.println("Appended: " + sb);
        sb.insert(5, " INSERTED ");
        System.out.println("Inserted: " + sb);

        sb.delete(5, 14);
        System.out.println("Deleted: " + sb);
    }

    public static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!*_].*");
    }

    public static void checkPattern(String text) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{1,8}tion[,.!:;]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Matched word: " + matcher.group());
        }
    }

    public static String removeRuEmails(String text) {
        return text.replaceAll("\\S+@\\S+\\.ru", "");
    }

}